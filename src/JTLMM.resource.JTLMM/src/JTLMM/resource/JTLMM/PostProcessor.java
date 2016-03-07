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

import JTLMM.JTL.impl.DomainImpl;
import JTLMM.JTL.impl.ModelImpl;
import JTLMM.JTL.impl.PatternImpl;
import JTLMM.JTL.impl.RelationImpl;
import JTLMM.emof.impl.ElementImpl;
import JTLMM.essentialocl.impl.BooleanLiteralExpImpl;
import JTLMM.essentialocl.impl.OperationCallExpImpl;
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
				EObject modelimpl = findSingle(root, ModelImpl.class, "name", domain.eGet(f));
				if (modelimpl != null) {
					EStructuralFeature model = domain.eClass().getEStructuralFeature("model");
					domain.eSet(model, modelimpl);
				}
			}
		}
		
		// Set the value of Transformation->Relation->Domain->Pattern.domain
		ListIterator<EObject> patterns = find(root, PatternImpl.class).listIterator();
		while (patterns.hasNext()) {
			EObject pattern = patterns.next();
			EStructuralFeature domain = pattern.eClass().getEStructuralFeature("domain");
			// If the Pattern has a Domain container use it
			if (DomainImpl.class.isInstance(pattern.eContainer())) {
				pattern.eSet(domain, pattern.eContainer());
			// Otherwise use the first Domain in the current Relation
			// FIXME Does this make any sense?
			} else {
				EObject relation = findInPath(root, pattern, RelationImpl.class);
				ListIterator<EObject> l = relation.eContents().listIterator();
				while (l.hasNext()) {
					EObject child = l.next();
					if (DomainImpl.class.isInstance(child)) {
						pattern.eSet(domain, child);
					}
				}
			}
		}

		// Set the value of BooleanLiteralExp.name
		ListIterator<EObject> boolexps = find(root, BooleanLiteralExpImpl.class).listIterator();
		while (boolexps.hasNext()) {
			EObject boolexp = boolexps.next();
			EStructuralFeature name = boolexp.eClass().getEStructuralFeature("name");
			EStructuralFeature value = boolexp.eClass().getEStructuralFeature("booleanSymbol");
			EStructuralFeature pname = boolexp.eContainer().eClass().getEStructuralFeature("name");
			boolexp.eSet(name, boolexp.eContainer().eGet(pname).toString() + "=" + boolexp.eGet(value));
		}

		// Replace VariableExp with ObjectTemplateExp in the context of an OperationCallExp
		ExtendedMetaData modelMetaData = new BasicExtendedMetaData(resource.getResourceSet().getPackageRegistry());
		EClass objTemplateExpEClass = (EClass) modelMetaData.getType("http:///template.ecore", "ObjectTemplateExp");
		ListIterator<EObject> opcallexps = find(root, OperationCallExpImpl.class).listIterator();
		while (opcallexps.hasNext()) {
			EObject opcallexp = opcallexps.next();

			// Set the missing OperationCallExp.referredOperation attribute
			// to the Relation with the corresponding name
			EStructuralFeature oceName = opcallexp.eClass().getEStructuralFeature("name");
			EStructuralFeature oceRefOp = opcallexp.eClass().getEStructuralFeature("referredOperation");
			EObject relation = findSingle(root, RelationImpl.class, "name", opcallexp.eGet(oceName));
			if (relation != null) {
				opcallexp.eSet(oceRefOp, relation);
			}
			
			EStructuralFeature argument = opcallexp.eClass().getEStructuralFeature("argument");
			if (opcallexp.eIsSet(argument)) {
				ListIterator<EObject> t = opcallexp.eContents().listIterator();
				EStructuralFeature oteName = objTemplateExpEClass.getEStructuralFeature("name");
				while (t.hasNext()) {
					EObject varexp = t.next();
					EStructuralFeature veName = varexp.eClass().getEStructuralFeature("name");
					if (VariableExpImpl.class.isInstance(varexp)) {
						// Replace the VariableExp object with the ObjectTemplateExp one
						EObject objtplexp = EcoreUtil.create(objTemplateExpEClass);
						objtplexp.eSet(oteName, varexp.eGet(veName));
						// TODO missing ObjectTemplateExp.referredClass
						EcoreUtil.replace(varexp, objtplexp);
					}
				}
			}
		}
		
		// Set the value of VariableExp.referredVariable
		ListIterator<EObject> varexps = find(root, VariableExpImpl.class).listIterator();
		while (varexps.hasNext()) {
			EObject varexp = varexps.next();
			EStructuralFeature f = varexp.eClass().getEStructuralFeature("name");
			if (varexp.eIsSet(f)) {
				EObject relation = findInPath(root, varexp, RelationImpl.class);
				EObject varimpl = findSingle(relation, VariableImpl.class, "name", varexp.eGet(f));
				if (varimpl != null) {
					EStructuralFeature refvar = varexp.eClass().getEStructuralFeature("referredVariable");
					varexp.eSet(refvar, varimpl);
				}
			}
		}

		// Create the PropertyCallExp element as AssignExp.left
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
	 * Find a single instance of a specific class having a provided feature.
	 * 
	 * @param root - Model root.
	 * @param implClass - Class to find.
	 * @param feature - Feature to look for.
	 * @param value - Value of the feature to look for.
	 * @return The found instance only if it is the single one in the model.
	 */
	private EObject findSingle(EObject root, Class<? extends ElementImpl> implClass, String feature, Object value) {
		EList<EObject> l = find(root, implClass, feature, value);
		switch (l.size()) {
			case 0:
				System.out.format("No %s element named '%s' found.\n", implClass.toString(), value);
				break;
			case 1:
				return l.get(0);
			default:
				System.out.format("More than one %s element named '%s'.\n", implClass.toString(), value);
				break;
		}
		return null;

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
