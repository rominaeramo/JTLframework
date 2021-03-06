package ASP.resource.ASP.analysis;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import ASP.impl.EdgeImpl;
import ASP.impl.NodeImpl;
import ASP.impl.PropImpl;

class ElementPrinter {

	public static String printElement(ASP.Element element) {
		// Implode the list of literals in a comma separated string
		EStructuralFeature l = element.eClass().getEStructuralFeature("literals");

		String elementPrint = "";
		if (NodeImpl.class.isInstance(element)) {
			elementPrint += "node(";
		} else if (PropImpl.class.isInstance(element)) {
			elementPrint += "prop(";
		} else if (EdgeImpl.class.isInstance(element)) {
			elementPrint += "edge(";
		}

		@SuppressWarnings("unchecked")
		EList<EObject> literals = (EList<EObject>) element.eGet(l);
		for (Iterator<EObject> it = literals.iterator(); it.hasNext();) {
			EObject lit = it.next();
			EStructuralFeature name = lit.eClass().getEStructuralFeature("name");
			elementPrint += lit.eGet(name);
			if (it.hasNext()) {
				elementPrint += ", ";
			}
		}
		return elementPrint + ")";
	}
}
