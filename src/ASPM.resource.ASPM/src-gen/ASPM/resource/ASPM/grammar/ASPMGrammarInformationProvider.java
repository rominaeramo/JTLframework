/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.grammar;

public class ASPMGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static ASPMGrammarInformationProvider INSTANCE = new ASPMGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_0_0_0_0 = new ASPM.resource.ASPM.grammar.ASPMKeyword("model", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_0_0_0_1 = new ASPM.resource.ASPM.grammar.ASPMKeyword("(", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_0_0_0_2 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getModel().getEStructuralFeature(ASPM.ASPMPackage.MODEL__ID), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_0_0_0_3 = new ASPM.resource.ASPM.grammar.ASPMKeyword(",", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_0_0_0_4 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getModel().getEStructuralFeature(ASPM.ASPMPackage.MODEL__NAME), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_0_0_0_5 = new ASPM.resource.ASPM.grammar.ASPMKeyword(")", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_0_0_0_6 = new ASPM.resource.ASPM.grammar.ASPMKeyword(".", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMLineBreak ASPM_0_0_0_7 = new ASPM.resource.ASPM.grammar.ASPMLineBreak(ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMContainment ASPM_0_0_0_8 = new ASPM.resource.ASPM.grammar.ASPMContainment(ASPM.ASPMPackage.eINSTANCE.getModel().getEStructuralFeature(ASPM.ASPMPackage.MODEL__NODES), ASPM.resource.ASPM.grammar.ASPMCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {ASPM.ASPMPackage.eINSTANCE.getNode(), }, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMContainment ASPM_0_0_0_9 = new ASPM.resource.ASPM.grammar.ASPMContainment(ASPM.ASPMPackage.eINSTANCE.getModel().getEStructuralFeature(ASPM.ASPMPackage.MODEL__PROPS), ASPM.resource.ASPM.grammar.ASPMCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {ASPM.ASPMPackage.eINSTANCE.getProp(), }, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMContainment ASPM_0_0_0_10 = new ASPM.resource.ASPM.grammar.ASPMContainment(ASPM.ASPMPackage.eINSTANCE.getModel().getEStructuralFeature(ASPM.ASPMPackage.MODEL__EDGES), ASPM.resource.ASPM.grammar.ASPMCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {ASPM.ASPMPackage.eINSTANCE.getEdge(), }, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMSequence ASPM_0_0_0 = new ASPM.resource.ASPM.grammar.ASPMSequence(ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, ASPM_0_0_0_0, ASPM_0_0_0_1, ASPM_0_0_0_2, ASPM_0_0_0_3, ASPM_0_0_0_4, ASPM_0_0_0_5, ASPM_0_0_0_6, ASPM_0_0_0_7, ASPM_0_0_0_8, ASPM_0_0_0_9, ASPM_0_0_0_10);
	public final static ASPM.resource.ASPM.grammar.ASPMChoice ASPM_0_0 = new ASPM.resource.ASPM.grammar.ASPMChoice(ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, ASPM_0_0_0);
	public final static ASPM.resource.ASPM.grammar.ASPMRule ASPM_0 = new ASPM.resource.ASPM.grammar.ASPMRule(ASPM.ASPMPackage.eINSTANCE.getModel(), ASPM_0_0, ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_1_0_0_0 = new ASPM.resource.ASPM.grammar.ASPMKeyword("node", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_1_0_0_1 = new ASPM.resource.ASPM.grammar.ASPMKeyword("(", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_1_0_0_2 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getNode().getEStructuralFeature(ASPM.ASPMPackage.NODE__MODEL), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_1_0_0_3 = new ASPM.resource.ASPM.grammar.ASPMKeyword(",", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_1_0_0_4 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getNode().getEStructuralFeature(ASPM.ASPMPackage.NODE__ID), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_1_0_0_5 = new ASPM.resource.ASPM.grammar.ASPMKeyword(",", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_1_0_0_6 = new ASPM.resource.ASPM.grammar.ASPMKeyword("\"", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_1_0_0_7 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getNode().getEStructuralFeature(ASPM.ASPMPackage.NODE__IDTRACE), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_1_0_0_8 = new ASPM.resource.ASPM.grammar.ASPMKeyword("\"", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_1_0_0_9 = new ASPM.resource.ASPM.grammar.ASPMKeyword(",", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_1_0_0_10 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getNode().getEStructuralFeature(ASPM.ASPMPackage.NODE__NAME), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_1_0_0_11 = new ASPM.resource.ASPM.grammar.ASPMKeyword(")", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_1_0_0_12 = new ASPM.resource.ASPM.grammar.ASPMKeyword(".", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMLineBreak ASPM_1_0_0_13 = new ASPM.resource.ASPM.grammar.ASPMLineBreak(ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMSequence ASPM_1_0_0 = new ASPM.resource.ASPM.grammar.ASPMSequence(ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, ASPM_1_0_0_0, ASPM_1_0_0_1, ASPM_1_0_0_2, ASPM_1_0_0_3, ASPM_1_0_0_4, ASPM_1_0_0_5, ASPM_1_0_0_6, ASPM_1_0_0_7, ASPM_1_0_0_8, ASPM_1_0_0_9, ASPM_1_0_0_10, ASPM_1_0_0_11, ASPM_1_0_0_12, ASPM_1_0_0_13);
	public final static ASPM.resource.ASPM.grammar.ASPMChoice ASPM_1_0 = new ASPM.resource.ASPM.grammar.ASPMChoice(ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, ASPM_1_0_0);
	public final static ASPM.resource.ASPM.grammar.ASPMRule ASPM_1 = new ASPM.resource.ASPM.grammar.ASPMRule(ASPM.ASPMPackage.eINSTANCE.getNode(), ASPM_1_0, ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_2_0_0_0 = new ASPM.resource.ASPM.grammar.ASPMKeyword("prop", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_2_0_0_1 = new ASPM.resource.ASPM.grammar.ASPMKeyword("(", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_2_0_0_2 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getProp().getEStructuralFeature(ASPM.ASPMPackage.PROP__MODEL), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_2_0_0_3 = new ASPM.resource.ASPM.grammar.ASPMKeyword(",", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_2_0_0_4 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getProp().getEStructuralFeature(ASPM.ASPMPackage.PROP__ID), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_2_0_0_5 = new ASPM.resource.ASPM.grammar.ASPMKeyword(",", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_2_0_0_6 = new ASPM.resource.ASPM.grammar.ASPMKeyword("\"", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_2_0_0_7 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getProp().getEStructuralFeature(ASPM.ASPMPackage.PROP__IDTRACE), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_2_0_0_8 = new ASPM.resource.ASPM.grammar.ASPMKeyword("\"", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_2_0_0_9 = new ASPM.resource.ASPM.grammar.ASPMKeyword(",", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_2_0_0_10 = new ASPM.resource.ASPM.grammar.ASPMKeyword("\"", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_2_0_0_11 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getProp().getEStructuralFeature(ASPM.ASPMPackage.PROP__OWNER), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_2_0_0_12 = new ASPM.resource.ASPM.grammar.ASPMKeyword("\"", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_2_0_0_13 = new ASPM.resource.ASPM.grammar.ASPMKeyword(",", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_2_0_0_14 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getProp().getEStructuralFeature(ASPM.ASPMPackage.PROP__NAME), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_2_0_0_15 = new ASPM.resource.ASPM.grammar.ASPMKeyword(",", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_2_0_0_16 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getProp().getEStructuralFeature(ASPM.ASPMPackage.PROP__VALUE), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_2_0_0_17 = new ASPM.resource.ASPM.grammar.ASPMKeyword(")", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_2_0_0_18 = new ASPM.resource.ASPM.grammar.ASPMKeyword(".", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMLineBreak ASPM_2_0_0_19 = new ASPM.resource.ASPM.grammar.ASPMLineBreak(ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMSequence ASPM_2_0_0 = new ASPM.resource.ASPM.grammar.ASPMSequence(ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, ASPM_2_0_0_0, ASPM_2_0_0_1, ASPM_2_0_0_2, ASPM_2_0_0_3, ASPM_2_0_0_4, ASPM_2_0_0_5, ASPM_2_0_0_6, ASPM_2_0_0_7, ASPM_2_0_0_8, ASPM_2_0_0_9, ASPM_2_0_0_10, ASPM_2_0_0_11, ASPM_2_0_0_12, ASPM_2_0_0_13, ASPM_2_0_0_14, ASPM_2_0_0_15, ASPM_2_0_0_16, ASPM_2_0_0_17, ASPM_2_0_0_18, ASPM_2_0_0_19);
	public final static ASPM.resource.ASPM.grammar.ASPMChoice ASPM_2_0 = new ASPM.resource.ASPM.grammar.ASPMChoice(ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, ASPM_2_0_0);
	public final static ASPM.resource.ASPM.grammar.ASPMRule ASPM_2 = new ASPM.resource.ASPM.grammar.ASPMRule(ASPM.ASPMPackage.eINSTANCE.getProp(), ASPM_2_0, ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_3_0_0_0 = new ASPM.resource.ASPM.grammar.ASPMKeyword("edge", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_3_0_0_1 = new ASPM.resource.ASPM.grammar.ASPMKeyword("(", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_3_0_0_2 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getEdge().getEStructuralFeature(ASPM.ASPMPackage.EDGE__MODEL), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_3_0_0_3 = new ASPM.resource.ASPM.grammar.ASPMKeyword(",", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_3_0_0_4 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getEdge().getEStructuralFeature(ASPM.ASPMPackage.EDGE__ID), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_3_0_0_5 = new ASPM.resource.ASPM.grammar.ASPMKeyword(",", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_3_0_0_6 = new ASPM.resource.ASPM.grammar.ASPMKeyword("\"", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_3_0_0_7 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getEdge().getEStructuralFeature(ASPM.ASPMPackage.EDGE__IDTRACE), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_3_0_0_8 = new ASPM.resource.ASPM.grammar.ASPMKeyword("\"", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_3_0_0_9 = new ASPM.resource.ASPM.grammar.ASPMKeyword(",", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_3_0_0_10 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getEdge().getEStructuralFeature(ASPM.ASPMPackage.EDGE__NAME), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_3_0_0_11 = new ASPM.resource.ASPM.grammar.ASPMKeyword(",", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_3_0_0_12 = new ASPM.resource.ASPM.grammar.ASPMKeyword("\"", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_3_0_0_13 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getEdge().getEStructuralFeature(ASPM.ASPMPackage.EDGE__SOURCE), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_3_0_0_14 = new ASPM.resource.ASPM.grammar.ASPMKeyword("\"", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_3_0_0_15 = new ASPM.resource.ASPM.grammar.ASPMKeyword(",", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_3_0_0_16 = new ASPM.resource.ASPM.grammar.ASPMKeyword("\"", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMPlaceholder ASPM_3_0_0_17 = new ASPM.resource.ASPM.grammar.ASPMPlaceholder(ASPM.ASPMPackage.eINSTANCE.getEdge().getEStructuralFeature(ASPM.ASPMPackage.EDGE__TARGET), "TEXT", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_3_0_0_18 = new ASPM.resource.ASPM.grammar.ASPMKeyword("\"", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_3_0_0_19 = new ASPM.resource.ASPM.grammar.ASPMKeyword(")", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMKeyword ASPM_3_0_0_20 = new ASPM.resource.ASPM.grammar.ASPMKeyword(".", ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	public final static ASPM.resource.ASPM.grammar.ASPMLineBreak ASPM_3_0_0_21 = new ASPM.resource.ASPM.grammar.ASPMLineBreak(ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, 0);
	public final static ASPM.resource.ASPM.grammar.ASPMSequence ASPM_3_0_0 = new ASPM.resource.ASPM.grammar.ASPMSequence(ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, ASPM_3_0_0_0, ASPM_3_0_0_1, ASPM_3_0_0_2, ASPM_3_0_0_3, ASPM_3_0_0_4, ASPM_3_0_0_5, ASPM_3_0_0_6, ASPM_3_0_0_7, ASPM_3_0_0_8, ASPM_3_0_0_9, ASPM_3_0_0_10, ASPM_3_0_0_11, ASPM_3_0_0_12, ASPM_3_0_0_13, ASPM_3_0_0_14, ASPM_3_0_0_15, ASPM_3_0_0_16, ASPM_3_0_0_17, ASPM_3_0_0_18, ASPM_3_0_0_19, ASPM_3_0_0_20, ASPM_3_0_0_21);
	public final static ASPM.resource.ASPM.grammar.ASPMChoice ASPM_3_0 = new ASPM.resource.ASPM.grammar.ASPMChoice(ASPM.resource.ASPM.grammar.ASPMCardinality.ONE, ASPM_3_0_0);
	public final static ASPM.resource.ASPM.grammar.ASPMRule ASPM_3 = new ASPM.resource.ASPM.grammar.ASPMRule(ASPM.ASPMPackage.eINSTANCE.getEdge(), ASPM_3_0, ASPM.resource.ASPM.grammar.ASPMCardinality.ONE);
	
	public static String getSyntaxElementID(ASPM.resource.ASPM.grammar.ASPMSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.class.getFields()) {
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
	
	public static ASPM.resource.ASPM.grammar.ASPMSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (ASPM.resource.ASPM.grammar.ASPMSyntaxElement) ASPM.resource.ASPM.grammar.ASPMGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static ASPM.resource.ASPM.grammar.ASPMRule[] RULES = new ASPM.resource.ASPM.grammar.ASPMRule[] {
		ASPM_0,
		ASPM_1,
		ASPM_2,
		ASPM_3,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (ASPM.resource.ASPM.grammar.ASPMRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(ASPM.resource.ASPM.grammar.ASPMSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof ASPM.resource.ASPM.grammar.ASPMKeyword) {
			keywords.add(((ASPM.resource.ASPM.grammar.ASPMKeyword) element).getValue());
		} else if (element instanceof ASPM.resource.ASPM.grammar.ASPMBooleanTerminal) {
			keywords.add(((ASPM.resource.ASPM.grammar.ASPMBooleanTerminal) element).getTrueLiteral());
			keywords.add(((ASPM.resource.ASPM.grammar.ASPMBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof ASPM.resource.ASPM.grammar.ASPMEnumerationTerminal) {
			ASPM.resource.ASPM.grammar.ASPMEnumerationTerminal terminal = (ASPM.resource.ASPM.grammar.ASPMEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (ASPM.resource.ASPM.grammar.ASPMSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
