/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.mopp;

public class ASPMSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			ASPM.ASPMPackage.eINSTANCE.getModel(),
			ASPM.ASPMPackage.eINSTANCE.getNode(),
			ASPM.ASPMPackage.eINSTANCE.getProp(),
			ASPM.ASPMPackage.eINSTANCE.getEdge(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			ASPM.ASPMPackage.eINSTANCE.getModel(),
		};
	}
	
}
