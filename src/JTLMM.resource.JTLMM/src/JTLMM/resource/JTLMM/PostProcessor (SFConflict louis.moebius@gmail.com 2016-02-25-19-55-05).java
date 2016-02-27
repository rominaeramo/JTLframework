package JTLMM.resource.JTLMM;

import java.util.Collections;
import java.util.ListIterator;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;

import JTLMM.JTL.Domain;
import JTLMM.JTL.impl.DomainImpl;
import JTLMM.JTL.impl.ModelImpl;
import JTLMM.JTL.impl.PatternImpl;
import JTLMM.JTL.impl.RelationImpl;
import JTLMM.emof.impl.ElementImpl;
import JTLMM.essentialocl.impl.BooleanLiteralExpImpl;
import JTLMM.essentialocl.impl.VariableExpImpl;
import JTLMM.essentialocl.impl.VariableImpl;
import JTLMM.imperativeocl.impl.AssignExpImpl;
import JTLMM.resource.JTLMM.mopp.JTLMMResource;

public class PostProcessor implements IJTLMMOptionProvider, IJTLMMResourcePostProcessor, IJTLMMResourcePostProcessorProvider {

	@Override
	public Map<?, ?> getOptions() {
		return Collections.singletonMap(IJTLMMOptions.RESOURCE_POSTPROCESSOR_PROVIDER, this);
	}
	
	@Override
	public IJTLMMResourcePostProcessor getResourcePostProcessor() {
		return this;
	}

	@Override
	public void process(JTLMMResource resource) {
		EObject root = resource.getContents().get(0);
		// perform model modifications here
		
		// Set the value of Transformation->Relation->Domain.model
		ListIterator<EObject> domains = find(root, DomainImpl.class).listIterator();
		while (domains.hasNext()) {
			EObject domain = domains.next();
			EStructuralFeature f = domain.eClass().getEStructuralFeature("name");
			if (domain.eIsSet(f)) {
				EList<EObject> l = find(root, ModelImpl.class, "name", domain.eGet(f));
				if (l.size() == 1) {
					EStructuralFeature model = domain.eClass().getEStructuralFeature("model");
					domain.eSet(model, l.get(0));
				} else {
					System.out.format("More than one Model element named '%s'.\n", domain.eGet(f));
				}
			}
		}
		
		// Set the value of Transformation->Relation->Domain->Pattern.domain
		ListIterator<EObject> patterns = find(root, PatternImpl.class).listIterator();
		while (patterns.hasNext()) {
			EObject pattern = patterns.next();
			EStructuralFeature domain = pattern.eClass().getEStructuralFeature("domain");
			if (DomainImpl.class.isInstance(pattern.eContainer())) {
				pattern.eSet(domain, pattern.eContainer());
			}
		}

		// Set the value of Boolean Literal Exp.name
		ListIterator<EObject> boolexps = find(root, BooleanLiteralExpImpl.class).listIterator();
		while (boolexps.hasNext()) {
			EObject boolexp = boolexps.next();
			EStructuralFeature name = boolexp.eClass().getEStructuralFeature("name");
			EStructuralFeature value = boolexp.eClass().getEStructuralFeature("booleanSymbol");
			EStructuralFeature pname = boolexp.eContainer().eClass().getEStructuralFeature("name");
			boolexp.eSet(name, boolexp.eContainer().eGet(pname).toString() + "=" + boolexp.eGet(value));
		}
		
		// Set the value of Variable Exp.referredVariable
		ListIterator<EObject> varexps = find(root, VariableExpImpl.class).listIterator();
		while (varexps.hasNext()) {
			EObject varexp = varexps.next();
			EStructuralFeature f = varexp.eClass().getEStructuralFeature("name");
			if (varexp.eIsSet(f)) {
				EObject relation = findInPath(root, varexp, RelationImpl.class);
				EList<EObject> l = find(relation, VariableImpl.class, "name", varexp.eGet(f));
				if (l.size() == 1) {
					EStructuralFeature refvar = varexp.eClass().getEStructuralFeature("referredVariable");
					varexp.eSet(refvar, l.get(0));
				} else {
					System.out.format("More than one Variable element named '%s'.\n", varexp.eGet(f));
				}
			}
		}

		// Create the Property Call Exp element as Assign Exp.left
		ExtendedMetaData modelMetaData = new BasicExtendedMetaData(resource.getResourceSet().getPackageRegistry());
		EClass propertyCallExpEClass = (EClass) modelMetaData.getType("http:///essentialocl.ecore", "PropertyCallExp");
		ListIterator<EObject> assignexps = find(root, AssignExpImpl.class).listIterator();
		while (assignexps.hasNext()) {
			EObject assignexp = assignexps.next();
			EStructuralFeature f = assignexp.eClass().getEStructuralFeature("name");
			if (assignexp.eIsSet(f)) {
				EObject propertyCallExp = EcoreUtil.create(propertyCallExpEClass);
				propertyCallExp.eSet(f, assignexp.eGet(f));
				EStructuralFeature left = assignexp.eClass().getEStructuralFeature("left");
				assignexp.eSet(left, propertyCallExp);
			}
		}
		
		// Replace Variable Exp with Object Template Exp in the context of an Operation Call Exp
		
	}

	@Override
	public void terminate() { }
	
	/**
	 * Find instances of a specific class in the model.
	 * @param root - Model root.
	 * @param implClass - Class to find.
	 * @return A list of found instances (if any).
	 */
	private EList<EObject> find(EObject root, Class<? extends ElementImpl> implClass) {
		EList<EObject> found = new BasicEList<EObject>();
		TreeIterator<EObject> t = root.eAllContents();
		while (t.hasNext()) {
			EObject next = t.next();
			if (implClass.isInstance(next)) {
				found.add(next);
			}
		}
		return found;
	}
	
	/**
	 * Find instances of a specific class in the model having a provided feature.
	 * @param root - Model root.
	 * @param implClass - Class to find.
	 * @param feature - Feature to look for.
	 * @param value - Value of the feature to look for.
	 * @return A list of found instances (if any).
	 */
	private EList<EObject> find(EObject root, Class<? extends ElementImpl> implClass, String feature, Object value) {
		EList<EObject> found = new BasicEList<EObject>();
		TreeIterator<EObject> t = root.eAllContents();
		while (t.hasNext()) {
			EObject next = t.next();
			if (implClass.isInstance(next)) {
				EStructuralFeature f = next.eClass().getEStructuralFeature(feature);
				if (next.eIsSet(f) && next.eGet(f).equals(value)) {
					found.add(next);
				}
			}
		}
		return found;
	}
	
	/**
	 * Find the first istance of a specific class along the path to root.
	 * 
	 * @param root - Model root.
	 * @param currentObj - Model starting point.
	 * @param implClass - Class to find.
	 * @return EObject reference to the found class.
	 */
	private EObject findInPath(EObject root, EObject currentObj, Class<? extends ElementImpl> implClass) {
		if (implClass.isInstance(currentObj)) {
			return currentObj;
		} else if (currentObj != root) {
			return findInPath(root, currentObj.eContainer(), implClass);
		}
		return null;
	}
}
