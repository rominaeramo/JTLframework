/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

public class ASPMMSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			ASPMM.ASPMMPackage.eINSTANCE.getMetamodel(),
			ASPMM.ASPMMPackage.eINSTANCE.getMetanode(),
			ASPMM.ASPMMPackage.eINSTANCE.getMetaprop(),
			ASPMM.ASPMMPackage.eINSTANCE.getMetaedge(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			ASPMM.ASPMMPackage.eINSTANCE.getMetamodel(),
		};
	}
	
}
