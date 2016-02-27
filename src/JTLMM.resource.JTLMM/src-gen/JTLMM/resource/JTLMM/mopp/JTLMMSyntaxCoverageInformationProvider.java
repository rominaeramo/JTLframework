/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

public class JTLMMSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(),
			JTLMM.JTL.JTLPackage.eINSTANCE.getModel(),
			JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(),
			JTLMM.JTL.JTLPackage.eINSTANCE.getDomain(),
			JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(),
			JTLMM.JTL.JTLPackage.eINSTANCE.getPredicate(),
			JTLMM.template.TemplatePackage.eINSTANCE.getObjectTemplateExp(),
			JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(),
			JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(),
			JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getBooleanLiteralExp(),
			JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getVariableExp(),
			JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getStringLiteralExp(),
			JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getVariable(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(),
		};
	}
	
}
