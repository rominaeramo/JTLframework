/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.grammar;

public class JTLMMGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static JTLMMGrammarInformationProvider INSTANCE = new JTLMMGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_0_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("transformation", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder JTLMM_0_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation().getEStructuralFeature(JTLMM.JTL.JTLPackage.TRANSFORMATION__NAME), "TEXT", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace JTLMM_0_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace(1, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_0_0_0_3 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("(", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_0_0_0_4_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation().getEStructuralFeature(JTLMM.JTL.JTLPackage.TRANSFORMATION__MODEL_PARAMETER), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.JTL.JTLPackage.eINSTANCE.getModel(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_0_0_0_4_0_0_1_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword(",", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace JTLMM_0_0_0_4_0_0_1_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace(1, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_0_0_0_4_0_0_1_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation().getEStructuralFeature(JTLMM.JTL.JTLPackage.TRANSFORMATION__MODEL_PARAMETER), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.JTL.JTLPackage.eINSTANCE.getModel(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_0_0_0_4_0_0_1_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_0_0_0_4_0_0_1_0_0_0, JTLMM_0_0_0_4_0_0_1_0_0_1, JTLMM_0_0_0_4_0_0_1_0_0_2);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_0_0_0_4_0_0_1_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_0_0_0_4_0_0_1_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_0_0_0_4_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_0_0_0_4_0_0_1_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.STAR);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_0_0_0_4_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_0_0_0_4_0_0_0, JTLMM_0_0_0_4_0_0_1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_0_0_0_4_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_0_0_0_4_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_0_0_0_4 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_0_0_0_4_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.QUESTIONMARK);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_0_0_0_5 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword(")", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace JTLMM_0_0_0_6 = new JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace(1, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_0_0_0_7 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("{", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_0_0_0_8_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_0_0_0_8_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation().getEStructuralFeature(JTLMM.JTL.JTLPackage.TRANSFORMATION__RELATION), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_0_0_0_8_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_0_0_0_8_0_0_0, JTLMM_0_0_0_8_0_0_1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_0_0_0_8_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_0_0_0_8_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_0_0_0_8 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_0_0_0_8_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.PLUS);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_0_0_0_9 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_0_0_0_10 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("}", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_0_0_0_0, JTLMM_0_0_0_1, JTLMM_0_0_0_2, JTLMM_0_0_0_3, JTLMM_0_0_0_4, JTLMM_0_0_0_5, JTLMM_0_0_0_6, JTLMM_0_0_0_7, JTLMM_0_0_0_8, JTLMM_0_0_0_9, JTLMM_0_0_0_10);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_0_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMRule JTLMM_0 = new JTLMM.resource.JTLMM.grammar.JTLMMRule(JTLMM.JTL.JTLPackage.eINSTANCE.getTransformation(), JTLMM_0_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder JTLMM_1_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder(JTLMM.JTL.JTLPackage.eINSTANCE.getModel().getEStructuralFeature(JTLMM.JTL.JTLPackage.MODEL__NAME), "TEXT", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_1_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword(":", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder JTLMM_1_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder(JTLMM.JTL.JTLPackage.eINSTANCE.getModel().getEStructuralFeature(JTLMM.JTL.JTLPackage.MODEL__USED_PACKAGE), "TEXT", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_1_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_1_0_0_0, JTLMM_1_0_0_1, JTLMM_1_0_0_2);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_1_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_1_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMRule JTLMM_1 = new JTLMM.resource.JTLMM.grammar.JTLMMRule(JTLMM.JTL.JTLPackage.eINSTANCE.getModel(), JTLMM_1_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMBooleanTerminal JTLMM_2_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMBooleanTerminal(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__IS_TOP_LEVEL), "top", "", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_2_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("relation", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder JTLMM_2_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__NAME), "TEXT", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace JTLMM_2_0_0_3 = new JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace(1, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_2_0_0_4 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("{", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_2_0_0_5_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_2_0_0_5_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__VARIABLE), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getVariable(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_2_0_0_5_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_2_0_0_5_0_0_0, JTLMM_2_0_0_5_0_0_1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_2_0_0_5_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_2_0_0_5_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_2_0_0_5 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_2_0_0_5_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.STAR);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_2_0_0_6_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_2_0_0_6_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__DOMAIN), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.JTL.JTLPackage.eINSTANCE.getDomain(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_2_0_0_6_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_2_0_0_6_0_0_0, JTLMM_2_0_0_6_0_0_1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_2_0_0_6_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_2_0_0_6_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_2_0_0_6 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_2_0_0_6_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.STAR);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_2_0_0_7_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_2_0_0_7_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__WHEN), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_2_0_0_7_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_2_0_0_7_0_0_0, JTLMM_2_0_0_7_0_0_1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_2_0_0_7_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_2_0_0_7_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_2_0_0_7 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_2_0_0_7_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.QUESTIONMARK);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_2_0_0_8_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_2_0_0_8_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation().getEStructuralFeature(JTLMM.JTL.JTLPackage.RELATION__WHERE), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_2_0_0_8_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_2_0_0_8_0_0_0, JTLMM_2_0_0_8_0_0_1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_2_0_0_8_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_2_0_0_8_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_2_0_0_8 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_2_0_0_8_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.QUESTIONMARK);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_2_0_0_9 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_2_0_0_10 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("}", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_2_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_2_0_0_0, JTLMM_2_0_0_1, JTLMM_2_0_0_2, JTLMM_2_0_0_3, JTLMM_2_0_0_4, JTLMM_2_0_0_5, JTLMM_2_0_0_6, JTLMM_2_0_0_7, JTLMM_2_0_0_8, JTLMM_2_0_0_9, JTLMM_2_0_0_10);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_2_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_2_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMRule JTLMM_2 = new JTLMM.resource.JTLMM.grammar.JTLMMRule(JTLMM.JTL.JTLPackage.eINSTANCE.getRelation(), JTLMM_2_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMBooleanTerminal JTLMM_3_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMBooleanTerminal(JTLMM.JTL.JTLPackage.eINSTANCE.getDomain().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__IS_CHECKABLE), "checkonly", "", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMBooleanTerminal JTLMM_3_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMBooleanTerminal(JTLMM.JTL.JTLPackage.eINSTANCE.getDomain().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__IS_ENFORCEABLE), "enforce", "", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_3_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("domain", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder JTLMM_3_0_0_3 = new JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder(JTLMM.JTL.JTLPackage.eINSTANCE.getDomain().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__NAME), "TEXT", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_3_0_0_4 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.JTL.JTLPackage.eINSTANCE.getDomain().getEStructuralFeature(JTLMM.JTL.JTLPackage.DOMAIN__PATTERN), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_3_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_3_0_0_0, JTLMM_3_0_0_1, JTLMM_3_0_0_2, JTLMM_3_0_0_3, JTLMM_3_0_0_4);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_3_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_3_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMRule JTLMM_3 = new JTLMM.resource.JTLMM.grammar.JTLMMRule(JTLMM.JTL.JTLPackage.eINSTANCE.getDomain(), JTLMM_3_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_4_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("when", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace JTLMM_4_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace(1, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_4_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("{", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_4_0_0_3_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_4_0_0_3_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern().getEStructuralFeature(JTLMM.JTL.JTLPackage.PATTERN__PREDICATE), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.JTL.JTLPackage.eINSTANCE.getPredicate(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_4_0_0_3_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword(";", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_4_0_0_3_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_4_0_0_3_0_0_0, JTLMM_4_0_0_3_0_0_1, JTLMM_4_0_0_3_0_0_2);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_4_0_0_3_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_4_0_0_3_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_4_0_0_3 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_4_0_0_3_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.STAR);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_4_0_0_4 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_4_0_0_5 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("}", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_4_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_4_0_0_0, JTLMM_4_0_0_1, JTLMM_4_0_0_2, JTLMM_4_0_0_3, JTLMM_4_0_0_4, JTLMM_4_0_0_5);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_4_0_1_0 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("where", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace JTLMM_4_0_1_1 = new JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace(1, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_4_0_1_2 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("{", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_4_0_1_3_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_4_0_1_3_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern().getEStructuralFeature(JTLMM.JTL.JTLPackage.PATTERN__PREDICATE), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.JTL.JTLPackage.eINSTANCE.getPredicate(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_4_0_1_3_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword(";", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_4_0_1_3_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_4_0_1_3_0_0_0, JTLMM_4_0_1_3_0_0_1, JTLMM_4_0_1_3_0_0_2);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_4_0_1_3_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_4_0_1_3_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_4_0_1_3 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_4_0_1_3_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.STAR);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_4_0_1_4 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_4_0_1_5 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("}", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_4_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_4_0_1_0, JTLMM_4_0_1_1, JTLMM_4_0_1_2, JTLMM_4_0_1_3, JTLMM_4_0_1_4, JTLMM_4_0_1_5);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_4_0_2_0 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern().getEStructuralFeature(JTLMM.JTL.JTLPackage.PATTERN__TEMPLATE_EXPRESSION), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.template.TemplatePackage.eINSTANCE.getTemplateExp(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace JTLMM_4_0_2_1 = new JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace(1, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_4_0_2_2 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("{", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_4_0_2_3_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_4_0_2_3_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern().getEStructuralFeature(JTLMM.JTL.JTLPackage.PATTERN__PREDICATE), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.JTL.JTLPackage.eINSTANCE.getPredicate(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_4_0_2_3_0_0_2_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword(",", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_4_0_2_3_0_0_2_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_4_0_2_3_0_0_2_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern().getEStructuralFeature(JTLMM.JTL.JTLPackage.PATTERN__PREDICATE), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.JTL.JTLPackage.eINSTANCE.getPredicate(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_4_0_2_3_0_0_2_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_4_0_2_3_0_0_2_0_0_0, JTLMM_4_0_2_3_0_0_2_0_0_1, JTLMM_4_0_2_3_0_0_2_0_0_2);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_4_0_2_3_0_0_2_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_4_0_2_3_0_0_2_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_4_0_2_3_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_4_0_2_3_0_0_2_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.STAR);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_4_0_2_3_0_0_3 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_4_0_2_3_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_4_0_2_3_0_0_0, JTLMM_4_0_2_3_0_0_1, JTLMM_4_0_2_3_0_0_2, JTLMM_4_0_2_3_0_0_3);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_4_0_2_3_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_4_0_2_3_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_4_0_2_3 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_4_0_2_3_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.QUESTIONMARK);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_4_0_2_4 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("};", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_4_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_4_0_2_0, JTLMM_4_0_2_1, JTLMM_4_0_2_2, JTLMM_4_0_2_3, JTLMM_4_0_2_4);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_4_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_4_0_0, JTLMM_4_0_1, JTLMM_4_0_2);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMRule JTLMM_4 = new JTLMM.resource.JTLMM.grammar.JTLMMRule(JTLMM.JTL.JTLPackage.eINSTANCE.getPattern(), JTLMM_4_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_5_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.JTL.JTLPackage.eINSTANCE.getPredicate().getEStructuralFeature(JTLMM.JTL.JTLPackage.PREDICATE__CONDITION_EXPRESSION), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOclExpression(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_5_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_5_0_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_5_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_5_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMRule JTLMM_5 = new JTLMM.resource.JTLMM.grammar.JTLMMRule(JTLMM.JTL.JTLPackage.eINSTANCE.getPredicate(), JTLMM_5_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder JTLMM_6_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder(JTLMM.template.TemplatePackage.eINSTANCE.getObjectTemplateExp().getEStructuralFeature(JTLMM.template.TemplatePackage.OBJECT_TEMPLATE_EXP__NAME), "TEXT", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace JTLMM_6_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace(1, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_6_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword(":", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace JTLMM_6_0_0_3_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace(1, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder JTLMM_6_0_0_3_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder(JTLMM.template.TemplatePackage.eINSTANCE.getObjectTemplateExp().getEStructuralFeature(JTLMM.template.TemplatePackage.OBJECT_TEMPLATE_EXP__TYPE), "TEXT", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_6_0_0_3_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_6_0_0_3_0_0_0, JTLMM_6_0_0_3_0_0_1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_6_0_0_3_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_6_0_0_3_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_6_0_0_3 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_6_0_0_3_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.QUESTIONMARK);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_6_0_0_4_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("::", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder JTLMM_6_0_0_4_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder(JTLMM.template.TemplatePackage.eINSTANCE.getObjectTemplateExp().getEStructuralFeature(JTLMM.template.TemplatePackage.OBJECT_TEMPLATE_EXP__REFERRED_CLASS), "TEXT", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_6_0_0_4_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_6_0_0_4_0_0_0, JTLMM_6_0_0_4_0_0_1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_6_0_0_4_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_6_0_0_4_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_6_0_0_4 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_6_0_0_4_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.QUESTIONMARK);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace JTLMM_6_0_0_5_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace(1, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_6_0_0_5_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("{", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_6_0_0_5_0_0_2_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_6_0_0_5_0_0_2_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.template.TemplatePackage.eINSTANCE.getObjectTemplateExp().getEStructuralFeature(JTLMM.template.TemplatePackage.OBJECT_TEMPLATE_EXP__INSIDE), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_6_0_0_5_0_0_2_0_0_2_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword(",", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_6_0_0_5_0_0_2_0_0_2_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_6_0_0_5_0_0_2_0_0_2_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.template.TemplatePackage.eINSTANCE.getObjectTemplateExp().getEStructuralFeature(JTLMM.template.TemplatePackage.OBJECT_TEMPLATE_EXP__INSIDE), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_6_0_0_5_0_0_2_0_0_2_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_6_0_0_5_0_0_2_0_0_2_0_0_0, JTLMM_6_0_0_5_0_0_2_0_0_2_0_0_1, JTLMM_6_0_0_5_0_0_2_0_0_2_0_0_2);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_6_0_0_5_0_0_2_0_0_2_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_6_0_0_5_0_0_2_0_0_2_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_6_0_0_5_0_0_2_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_6_0_0_5_0_0_2_0_0_2_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.STAR);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_6_0_0_5_0_0_2_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_6_0_0_5_0_0_2_0_0_0, JTLMM_6_0_0_5_0_0_2_0_0_1, JTLMM_6_0_0_5_0_0_2_0_0_2);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_6_0_0_5_0_0_2_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_6_0_0_5_0_0_2_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_6_0_0_5_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_6_0_0_5_0_0_2_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.QUESTIONMARK);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMLineBreak JTLMM_6_0_0_5_0_0_3 = new JTLMM.resource.JTLMM.grammar.JTLMMLineBreak(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_6_0_0_5_0_0_4 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("}", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_6_0_0_5_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_6_0_0_5_0_0_0, JTLMM_6_0_0_5_0_0_1, JTLMM_6_0_0_5_0_0_2, JTLMM_6_0_0_5_0_0_3, JTLMM_6_0_0_5_0_0_4);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_6_0_0_5_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_6_0_0_5_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_6_0_0_5 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_6_0_0_5_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.QUESTIONMARK);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_6_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_6_0_0_0, JTLMM_6_0_0_1, JTLMM_6_0_0_2, JTLMM_6_0_0_3, JTLMM_6_0_0_4, JTLMM_6_0_0_5);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_6_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_6_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMRule JTLMM_6 = new JTLMM.resource.JTLMM.grammar.JTLMMRule(JTLMM.template.TemplatePackage.eINSTANCE.getObjectTemplateExp(), JTLMM_6_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder JTLMM_7_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp().getEStructuralFeature(JTLMM.imperativeocl.ImperativeoclPackage.ASSIGN_EXP__NAME), "TEXT", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace JTLMM_7_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace(1, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_7_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("=", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace JTLMM_7_0_0_3 = new JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace(1, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_7_0_0_4 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp().getEStructuralFeature(JTLMM.imperativeocl.ImperativeoclPackage.ASSIGN_EXP__VALUE), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOclExpression(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_7_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_7_0_0_0, JTLMM_7_0_0_1, JTLMM_7_0_0_2, JTLMM_7_0_0_3, JTLMM_7_0_0_4);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_7_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_7_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMRule JTLMM_7 = new JTLMM.resource.JTLMM.grammar.JTLMMRule(JTLMM.imperativeocl.ImperativeoclPackage.eINSTANCE.getAssignExp(), JTLMM_7_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder JTLMM_8_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.OPERATION_CALL_EXP__NAME), "TEXT", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_8_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("(", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_8_0_0_2_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.OPERATION_CALL_EXP__ARGUMENT), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOclExpression(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_8_0_0_2_0_0_1_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword(",", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMContainment JTLMM_8_0_0_2_0_0_1_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMContainment(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.OPERATION_CALL_EXP__ARGUMENT), JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOclExpression(), }, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_8_0_0_2_0_0_1_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_8_0_0_2_0_0_1_0_0_0, JTLMM_8_0_0_2_0_0_1_0_0_1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_8_0_0_2_0_0_1_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_8_0_0_2_0_0_1_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_8_0_0_2_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_8_0_0_2_0_0_1_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.STAR);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_8_0_0_2_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_8_0_0_2_0_0_0, JTLMM_8_0_0_2_0_0_1);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_8_0_0_2_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_8_0_0_2_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_8_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_8_0_0_2_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.QUESTIONMARK);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_8_0_0_3 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword(")", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_8_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_8_0_0_0, JTLMM_8_0_0_1, JTLMM_8_0_0_2, JTLMM_8_0_0_3);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_8_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_8_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMRule JTLMM_8 = new JTLMM.resource.JTLMM.grammar.JTLMMRule(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getOperationCallExp(), JTLMM_8_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMBooleanTerminal JTLMM_9_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMBooleanTerminal(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getBooleanLiteralExp().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.BOOLEAN_LITERAL_EXP__BOOLEAN_SYMBOL), "true", "false", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_9_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_9_0_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_9_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_9_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMRule JTLMM_9 = new JTLMM.resource.JTLMM.grammar.JTLMMRule(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getBooleanLiteralExp(), JTLMM_9_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder JTLMM_10_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getVariableExp().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.VARIABLE_EXP__NAME), "TEXT", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_10_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_10_0_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_10_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_10_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMRule JTLMM_10 = new JTLMM.resource.JTLMM.grammar.JTLMMRule(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getVariableExp(), JTLMM_10_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_11_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("|", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder JTLMM_11_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getStringLiteralExp().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.STRING_LITERAL_EXP__NAME), "TEXT", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_11_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword("|", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_11_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_11_0_0_0, JTLMM_11_0_0_1, JTLMM_11_0_0_2);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_11_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_11_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMRule JTLMM_11 = new JTLMM.resource.JTLMM.grammar.JTLMMRule(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getStringLiteralExp(), JTLMM_11_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder JTLMM_12_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getVariable().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.VARIABLE__NAME), "TEXT", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace JTLMM_12_0_0_1_0_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace(1, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_12_0_0_1_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword(":", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace JTLMM_12_0_0_1_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMWhiteSpace(1, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder JTLMM_12_0_0_1_0_0_3 = new JTLMM.resource.JTLMM.grammar.JTLMMPlaceholder(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getVariable().getEStructuralFeature(JTLMM.essentialocl.EssentialoclPackage.VARIABLE__TYPE), "TEXT", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, 0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_12_0_0_1_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_12_0_0_1_0_0_0, JTLMM_12_0_0_1_0_0_1, JTLMM_12_0_0_1_0_0_2, JTLMM_12_0_0_1_0_0_3);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_12_0_0_1_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_12_0_0_1_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMCompound JTLMM_12_0_0_1 = new JTLMM.resource.JTLMM.grammar.JTLMMCompound(JTLMM_12_0_0_1_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.QUESTIONMARK);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMKeyword JTLMM_12_0_0_2 = new JTLMM.resource.JTLMM.grammar.JTLMMKeyword(";", JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMSequence JTLMM_12_0_0 = new JTLMM.resource.JTLMM.grammar.JTLMMSequence(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_12_0_0_0, JTLMM_12_0_0_1, JTLMM_12_0_0_2);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMChoice JTLMM_12_0 = new JTLMM.resource.JTLMM.grammar.JTLMMChoice(JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE, JTLMM_12_0_0);
	public final static JTLMM.resource.JTLMM.grammar.JTLMMRule JTLMM_12 = new JTLMM.resource.JTLMM.grammar.JTLMMRule(JTLMM.essentialocl.EssentialoclPackage.eINSTANCE.getVariable(), JTLMM_12_0, JTLMM.resource.JTLMM.grammar.JTLMMCardinality.ONE);
	
	public static String getSyntaxElementID(JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement) JTLMM.resource.JTLMM.grammar.JTLMMGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static JTLMM.resource.JTLMM.grammar.JTLMMRule[] RULES = new JTLMM.resource.JTLMM.grammar.JTLMMRule[] {
		JTLMM_0,
		JTLMM_1,
		JTLMM_2,
		JTLMM_3,
		JTLMM_4,
		JTLMM_5,
		JTLMM_6,
		JTLMM_7,
		JTLMM_8,
		JTLMM_9,
		JTLMM_10,
		JTLMM_11,
		JTLMM_12,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (JTLMM.resource.JTLMM.grammar.JTLMMRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof JTLMM.resource.JTLMM.grammar.JTLMMKeyword) {
			keywords.add(((JTLMM.resource.JTLMM.grammar.JTLMMKeyword) element).getValue());
		} else if (element instanceof JTLMM.resource.JTLMM.grammar.JTLMMBooleanTerminal) {
			keywords.add(((JTLMM.resource.JTLMM.grammar.JTLMMBooleanTerminal) element).getTrueLiteral());
			keywords.add(((JTLMM.resource.JTLMM.grammar.JTLMMBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof JTLMM.resource.JTLMM.grammar.JTLMMEnumerationTerminal) {
			JTLMM.resource.JTLMM.grammar.JTLMMEnumerationTerminal terminal = (JTLMM.resource.JTLMM.grammar.JTLMMEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (JTLMM.resource.JTLMM.grammar.JTLMMSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
