/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.grammar;

public class ASPGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static ASPGrammarInformationProvider INSTANCE = new ASPGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static ASP.resource.ASP.grammar.ASPContainment ASP_0_0_0_0 = new ASP.resource.ASP.grammar.ASPContainment(ASP.ASPPackage.eINSTANCE.getTransformation().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__ELEMENTS), ASP.resource.ASP.grammar.ASPCardinality.PLUS, new org.eclipse.emf.ecore.EClass[] {ASP.ASPPackage.eINSTANCE.getElement(), }, 0);
	public final static ASP.resource.ASP.grammar.ASPLineBreak ASP_0_0_0_1 = new ASP.resource.ASP.grammar.ASPLineBreak(ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPContainment ASP_0_0_0_2 = new ASP.resource.ASP.grammar.ASPContainment(ASP.ASPPackage.eINSTANCE.getTransformation().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__RELATIONS), ASP.resource.ASP.grammar.ASPCardinality.PLUS, new org.eclipse.emf.ecore.EClass[] {ASP.ASPPackage.eINSTANCE.getRelation(), }, 0);
	public final static ASP.resource.ASP.grammar.ASPLineBreak ASP_0_0_0_3 = new ASP.resource.ASP.grammar.ASPLineBreak(ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPContainment ASP_0_0_0_4 = new ASP.resource.ASP.grammar.ASPContainment(ASP.ASPPackage.eINSTANCE.getTransformation().getEStructuralFeature(ASP.ASPPackage.TRANSFORMATION__CONSTRAINTS), ASP.resource.ASP.grammar.ASPCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {ASP.ASPPackage.eINSTANCE.getConstraint(), }, 0);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_0_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_0_0_0_0, ASP_0_0_0_1, ASP_0_0_0_2, ASP_0_0_0_3, ASP_0_0_0_4);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_0_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_0_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_0 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getTransformation(), ASP_0_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPContainment ASP_1_0_0_0 = new ASP.resource.ASP.grammar.ASPContainment(ASP.ASPPackage.eINSTANCE.getRelation().getEStructuralFeature(ASP.ASPPackage.RELATION__PATTERNS), ASP.resource.ASP.grammar.ASPCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {ASP.ASPPackage.eINSTANCE.getPattern(), }, 1);
	public final static ASP.resource.ASP.grammar.ASPLineBreak ASP_1_0_0_1 = new ASP.resource.ASP.grammar.ASPLineBreak(ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPContainment ASP_1_0_0_2 = new ASP.resource.ASP.grammar.ASPContainment(ASP.ASPPackage.eINSTANCE.getRelation().getEStructuralFeature(ASP.ASPPackage.RELATION__PATTERNS), ASP.resource.ASP.grammar.ASPCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {ASP.ASPPackage.eINSTANCE.getRightPattern(), }, 0);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_1_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_1_0_0_0, ASP_1_0_0_1, ASP_1_0_0_2);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_1_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_1_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_1 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getRelation(), ASP_1_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_2_0_0_0_0_0_0 = new ASP.resource.ASP.grammar.ASPKeyword("relation_node", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_2_0_0_0_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_2_0_0_0_0_0_0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_2_0_0_0_0_1_0 = new ASP.resource.ASP.grammar.ASPKeyword("relation_prop", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_2_0_0_0_0_1 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_2_0_0_0_0_1_0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_2_0_0_0_0_2_0 = new ASP.resource.ASP.grammar.ASPKeyword("relation_edge", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_2_0_0_0_0_2 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_2_0_0_0_0_2_0);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_2_0_0_0_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_2_0_0_0_0_0, ASP_2_0_0_0_0_1, ASP_2_0_0_0_0_2);
	public final static ASP.resource.ASP.grammar.ASPCompound ASP_2_0_0_0 = new ASP.resource.ASP.grammar.ASPCompound(ASP_2_0_0_0_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_2_0_0_1 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getLeftPattern().getEStructuralFeature(ASP.ASPPackage.LEFT_PATTERN__ELEMENT), "QUOTED_40_41", ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_2_0_0_2 = new ASP.resource.ASP.grammar.ASPKeyword(".", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_2_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_2_0_0_0, ASP_2_0_0_1, ASP_2_0_0_2);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_2_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_2_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_2 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getLeftPattern(), ASP_2_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_3_0_0_0_0_0_0 = new ASP.resource.ASP.grammar.ASPKeyword("relation_node", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_3_0_0_0_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_3_0_0_0_0_0_0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_3_0_0_0_0_1_0 = new ASP.resource.ASP.grammar.ASPKeyword("relation_prop", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_3_0_0_0_0_1 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_3_0_0_0_0_1_0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_3_0_0_0_0_2_0 = new ASP.resource.ASP.grammar.ASPKeyword("relation_edge", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_3_0_0_0_0_2 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_3_0_0_0_0_2_0);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_3_0_0_0_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_3_0_0_0_0_0, ASP_3_0_0_0_0_1, ASP_3_0_0_0_0_2);
	public final static ASP.resource.ASP.grammar.ASPCompound ASP_3_0_0_0 = new ASP.resource.ASP.grammar.ASPCompound(ASP_3_0_0_0_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_3_0_0_1 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getRightPattern().getEStructuralFeature(ASP.ASPPackage.RIGHT_PATTERN__ELEMENT), "QUOTED_40_41", ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_3_0_0_2 = new ASP.resource.ASP.grammar.ASPKeyword(".", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_3_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_3_0_0_0, ASP_3_0_0_1, ASP_3_0_0_2);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_3_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_3_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_3 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getRightPattern(), ASP_3_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_4_0_0_0 = new ASP.resource.ASP.grammar.ASPKeyword("metanode(", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_4_0_0_1 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getMetanode().getEStructuralFeature(ASP.ASPPackage.METANODE__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 1);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_4_0_0_2 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_4_0_0_3 = new ASP.resource.ASP.grammar.ASPWhiteSpace(1, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_4_0_0_4 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getMetanode().getEStructuralFeature(ASP.ASPPackage.METANODE__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_4_0_0_5 = new ASP.resource.ASP.grammar.ASPKeyword(").", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPLineBreak ASP_4_0_0_6 = new ASP.resource.ASP.grammar.ASPLineBreak(ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_4_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_4_0_0_0, ASP_4_0_0_1, ASP_4_0_0_2, ASP_4_0_0_3, ASP_4_0_0_4, ASP_4_0_0_5, ASP_4_0_0_6);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_4_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_4_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_4 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getMetanode(), ASP_4_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_5_0_0_0 = new ASP.resource.ASP.grammar.ASPKeyword("metaprop(", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_5_0_0_1 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getMetaprop().getEStructuralFeature(ASP.ASPPackage.METAPROP__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 2);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_5_0_0_2 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_5_0_0_3 = new ASP.resource.ASP.grammar.ASPWhiteSpace(1, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_5_0_0_4 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getMetaprop().getEStructuralFeature(ASP.ASPPackage.METAPROP__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 1);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_5_0_0_5 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_5_0_0_6 = new ASP.resource.ASP.grammar.ASPWhiteSpace(1, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_5_0_0_7 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getMetaprop().getEStructuralFeature(ASP.ASPPackage.METAPROP__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_5_0_0_8 = new ASP.resource.ASP.grammar.ASPKeyword(").", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPLineBreak ASP_5_0_0_9 = new ASP.resource.ASP.grammar.ASPLineBreak(ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_5_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_5_0_0_0, ASP_5_0_0_1, ASP_5_0_0_2, ASP_5_0_0_3, ASP_5_0_0_4, ASP_5_0_0_5, ASP_5_0_0_6, ASP_5_0_0_7, ASP_5_0_0_8, ASP_5_0_0_9);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_5_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_5_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_5 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getMetaprop(), ASP_5_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_6_0_0_0 = new ASP.resource.ASP.grammar.ASPKeyword("metaedge(", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_6_0_0_1 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getMetaedge().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 3);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_6_0_0_2 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_6_0_0_3 = new ASP.resource.ASP.grammar.ASPWhiteSpace(1, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_6_0_0_4 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getMetaedge().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 2);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_6_0_0_5 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_6_0_0_6 = new ASP.resource.ASP.grammar.ASPWhiteSpace(1, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_6_0_0_7 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getMetaedge().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 1);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_6_0_0_8 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_6_0_0_9 = new ASP.resource.ASP.grammar.ASPWhiteSpace(1, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_6_0_0_10 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getMetaedge().getEStructuralFeature(ASP.ASPPackage.METAEDGE__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_6_0_0_11 = new ASP.resource.ASP.grammar.ASPKeyword(").", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPLineBreak ASP_6_0_0_12 = new ASP.resource.ASP.grammar.ASPLineBreak(ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_6_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_6_0_0_0, ASP_6_0_0_1, ASP_6_0_0_2, ASP_6_0_0_3, ASP_6_0_0_4, ASP_6_0_0_5, ASP_6_0_0_6, ASP_6_0_0_7, ASP_6_0_0_8, ASP_6_0_0_9, ASP_6_0_0_10, ASP_6_0_0_11, ASP_6_0_0_12);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_6_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_6_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_6 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getMetaedge(), ASP_6_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_7_0_0_0 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getLiteral().getEStructuralFeature(ASP.ASPPackage.LITERAL__NAME), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_7_0_0_1_0_0_0 = new ASP.resource.ASP.grammar.ASPWhiteSpace(0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_7_0_0_1_0_0_1 = new ASP.resource.ASP.grammar.ASPKeyword(".", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_7_0_0_1_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_7_0_0_1_0_0_0, ASP_7_0_0_1_0_0_1);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_7_0_0_1_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_7_0_0_1_0_0);
	public final static ASP.resource.ASP.grammar.ASPCompound ASP_7_0_0_1 = new ASP.resource.ASP.grammar.ASPCompound(ASP_7_0_0_1_0, ASP.resource.ASP.grammar.ASPCardinality.QUESTIONMARK);
	public final static ASP.resource.ASP.grammar.ASPLineBreak ASP_7_0_0_2 = new ASP.resource.ASP.grammar.ASPLineBreak(ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_7_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_7_0_0_0, ASP_7_0_0_1, ASP_7_0_0_2);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_7_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_7_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_7 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getLiteral(), ASP_7_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_8_0_0_0 = new ASP.resource.ASP.grammar.ASPKeyword(":-", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPContainment ASP_8_0_0_1 = new ASP.resource.ASP.grammar.ASPContainment(ASP.ASPPackage.eINSTANCE.getConstraint().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__EXPRESSIONS), ASP.resource.ASP.grammar.ASPCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {ASP.ASPPackage.eINSTANCE.getExpression(), }, 0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_8_0_0_2_0_0_0 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPContainment ASP_8_0_0_2_0_0_1 = new ASP.resource.ASP.grammar.ASPContainment(ASP.ASPPackage.eINSTANCE.getConstraint().getEStructuralFeature(ASP.ASPPackage.CONSTRAINT__EXPRESSIONS), ASP.resource.ASP.grammar.ASPCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {ASP.ASPPackage.eINSTANCE.getExpression(), }, 0);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_8_0_0_2_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_8_0_0_2_0_0_0, ASP_8_0_0_2_0_0_1);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_8_0_0_2_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_8_0_0_2_0_0);
	public final static ASP.resource.ASP.grammar.ASPCompound ASP_8_0_0_2 = new ASP.resource.ASP.grammar.ASPCompound(ASP_8_0_0_2_0, ASP.resource.ASP.grammar.ASPCardinality.STAR);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_8_0_0_3 = new ASP.resource.ASP.grammar.ASPKeyword(".", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPLineBreak ASP_8_0_0_4 = new ASP.resource.ASP.grammar.ASPLineBreak(ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_8_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_8_0_0_0, ASP_8_0_0_1, ASP_8_0_0_2, ASP_8_0_0_3, ASP_8_0_0_4);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_8_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_8_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_8 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getConstraint(), ASP_8_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_9_0_0_0 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getTerminal().getEStructuralFeature(ASP.ASPPackage.TERMINAL__ELEMENT), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_9_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_9_0_0_0);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_9_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_9_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_9 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getTerminal(), ASP_9_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_10_0_0_0_0_0_0 = new ASP.resource.ASP.grammar.ASPKeyword("node(", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_10_0_0_0_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_10_0_0_0_0_0_0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_10_0_0_0_0_1_0 = new ASP.resource.ASP.grammar.ASPKeyword("nodex(", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_10_0_0_0_0_1 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_10_0_0_0_0_1_0);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_10_0_0_0_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_10_0_0_0_0_0, ASP_10_0_0_0_0_1);
	public final static ASP.resource.ASP.grammar.ASPCompound ASP_10_0_0_0 = new ASP.resource.ASP.grammar.ASPCompound(ASP_10_0_0_0_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_10_0_0_1 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getNode().getEStructuralFeature(ASP.ASPPackage.NODE__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 2);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_10_0_0_2 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_10_0_0_3 = new ASP.resource.ASP.grammar.ASPWhiteSpace(1, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_10_0_0_4 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getNode().getEStructuralFeature(ASP.ASPPackage.NODE__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 1);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_10_0_0_5 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_10_0_0_6 = new ASP.resource.ASP.grammar.ASPWhiteSpace(1, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_10_0_0_7 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getNode().getEStructuralFeature(ASP.ASPPackage.NODE__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_10_0_0_8 = new ASP.resource.ASP.grammar.ASPKeyword(").", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPLineBreak ASP_10_0_0_9 = new ASP.resource.ASP.grammar.ASPLineBreak(ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_10_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_10_0_0_0, ASP_10_0_0_1, ASP_10_0_0_2, ASP_10_0_0_3, ASP_10_0_0_4, ASP_10_0_0_5, ASP_10_0_0_6, ASP_10_0_0_7, ASP_10_0_0_8, ASP_10_0_0_9);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_10_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_10_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_10 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getNode(), ASP_10_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_11_0_0_0_0_0_0 = new ASP.resource.ASP.grammar.ASPKeyword("prop(", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_11_0_0_0_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_11_0_0_0_0_0_0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_11_0_0_0_0_1_0 = new ASP.resource.ASP.grammar.ASPKeyword("propx(", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_11_0_0_0_0_1 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_11_0_0_0_0_1_0);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_11_0_0_0_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_11_0_0_0_0_0, ASP_11_0_0_0_0_1);
	public final static ASP.resource.ASP.grammar.ASPCompound ASP_11_0_0_0 = new ASP.resource.ASP.grammar.ASPCompound(ASP_11_0_0_0_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_11_0_0_1 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getProp().getEStructuralFeature(ASP.ASPPackage.PROP__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 3);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_11_0_0_2 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_11_0_0_3 = new ASP.resource.ASP.grammar.ASPWhiteSpace(1, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_11_0_0_4 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getProp().getEStructuralFeature(ASP.ASPPackage.PROP__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 2);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_11_0_0_5 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_11_0_0_6 = new ASP.resource.ASP.grammar.ASPWhiteSpace(1, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_11_0_0_7 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getProp().getEStructuralFeature(ASP.ASPPackage.PROP__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 1);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_11_0_0_8 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_11_0_0_9 = new ASP.resource.ASP.grammar.ASPWhiteSpace(1, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_11_0_0_10 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getProp().getEStructuralFeature(ASP.ASPPackage.PROP__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_11_0_0_11 = new ASP.resource.ASP.grammar.ASPKeyword(").", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPLineBreak ASP_11_0_0_12 = new ASP.resource.ASP.grammar.ASPLineBreak(ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_11_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_11_0_0_0, ASP_11_0_0_1, ASP_11_0_0_2, ASP_11_0_0_3, ASP_11_0_0_4, ASP_11_0_0_5, ASP_11_0_0_6, ASP_11_0_0_7, ASP_11_0_0_8, ASP_11_0_0_9, ASP_11_0_0_10, ASP_11_0_0_11, ASP_11_0_0_12);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_11_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_11_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_11 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getProp(), ASP_11_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_12_0_0_0_0_0_0 = new ASP.resource.ASP.grammar.ASPKeyword("edge(", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_12_0_0_0_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_12_0_0_0_0_0_0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_12_0_0_0_0_1_0 = new ASP.resource.ASP.grammar.ASPKeyword("edgex(", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_12_0_0_0_0_1 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_12_0_0_0_0_1_0);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_12_0_0_0_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_12_0_0_0_0_0, ASP_12_0_0_0_0_1);
	public final static ASP.resource.ASP.grammar.ASPCompound ASP_12_0_0_0 = new ASP.resource.ASP.grammar.ASPCompound(ASP_12_0_0_0_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_12_0_0_1 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getEdge().getEStructuralFeature(ASP.ASPPackage.EDGE__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 4);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_12_0_0_2 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_12_0_0_3 = new ASP.resource.ASP.grammar.ASPWhiteSpace(1, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_12_0_0_4 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getEdge().getEStructuralFeature(ASP.ASPPackage.EDGE__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 3);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_12_0_0_5 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_12_0_0_6 = new ASP.resource.ASP.grammar.ASPWhiteSpace(1, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_12_0_0_7 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getEdge().getEStructuralFeature(ASP.ASPPackage.EDGE__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 2);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_12_0_0_8 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_12_0_0_9 = new ASP.resource.ASP.grammar.ASPWhiteSpace(1, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_12_0_0_10 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getEdge().getEStructuralFeature(ASP.ASPPackage.EDGE__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 1);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_12_0_0_11 = new ASP.resource.ASP.grammar.ASPKeyword(",", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPWhiteSpace ASP_12_0_0_12 = new ASP.resource.ASP.grammar.ASPWhiteSpace(1, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_12_0_0_13 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getEdge().getEStructuralFeature(ASP.ASPPackage.EDGE__LITERALS), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_12_0_0_14 = new ASP.resource.ASP.grammar.ASPKeyword(").", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPLineBreak ASP_12_0_0_15 = new ASP.resource.ASP.grammar.ASPLineBreak(ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_12_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_12_0_0_0, ASP_12_0_0_1, ASP_12_0_0_2, ASP_12_0_0_3, ASP_12_0_0_4, ASP_12_0_0_5, ASP_12_0_0_6, ASP_12_0_0_7, ASP_12_0_0_8, ASP_12_0_0_9, ASP_12_0_0_10, ASP_12_0_0_11, ASP_12_0_0_12, ASP_12_0_0_13, ASP_12_0_0_14, ASP_12_0_0_15);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_12_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_12_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_12 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getEdge(), ASP_12_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_13_0_0_0 = new ASP.resource.ASP.grammar.ASPKeyword("not", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_13_0_0_1 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getNot().getEStructuralFeature(ASP.ASPPackage.NOT__ELEMENT), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_13_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_13_0_0_0, ASP_13_0_0_1);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_13_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_13_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_13 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getNot(), ASP_13_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_14_0_0_0 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getEq().getEStructuralFeature(ASP.ASPPackage.EQ__LEFT), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_14_0_0_1 = new ASP.resource.ASP.grammar.ASPKeyword("==", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_14_0_0_2 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getEq().getEStructuralFeature(ASP.ASPPackage.EQ__RIGHT), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_14_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_14_0_0_0, ASP_14_0_0_1, ASP_14_0_0_2);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_14_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_14_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_14 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getEq(), ASP_14_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_15_0_0_0 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getNotEq().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__LEFT), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPKeyword ASP_15_0_0_1 = new ASP.resource.ASP.grammar.ASPKeyword("!=", ASP.resource.ASP.grammar.ASPCardinality.ONE);
	public final static ASP.resource.ASP.grammar.ASPPlaceholder ASP_15_0_0_2 = new ASP.resource.ASP.grammar.ASPPlaceholder(ASP.ASPPackage.eINSTANCE.getNotEq().getEStructuralFeature(ASP.ASPPackage.NOT_EQ__RIGHT), "TEXT", ASP.resource.ASP.grammar.ASPCardinality.ONE, 0);
	public final static ASP.resource.ASP.grammar.ASPSequence ASP_15_0_0 = new ASP.resource.ASP.grammar.ASPSequence(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_15_0_0_0, ASP_15_0_0_1, ASP_15_0_0_2);
	public final static ASP.resource.ASP.grammar.ASPChoice ASP_15_0 = new ASP.resource.ASP.grammar.ASPChoice(ASP.resource.ASP.grammar.ASPCardinality.ONE, ASP_15_0_0);
	public final static ASP.resource.ASP.grammar.ASPRule ASP_15 = new ASP.resource.ASP.grammar.ASPRule(ASP.ASPPackage.eINSTANCE.getNotEq(), ASP_15_0, ASP.resource.ASP.grammar.ASPCardinality.ONE);
	
	public static String getSyntaxElementID(ASP.resource.ASP.grammar.ASPSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : ASP.resource.ASP.grammar.ASPGrammarInformationProvider.class.getFields()) {
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
	
	public static ASP.resource.ASP.grammar.ASPSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (ASP.resource.ASP.grammar.ASPSyntaxElement) ASP.resource.ASP.grammar.ASPGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static ASP.resource.ASP.grammar.ASPRule[] RULES = new ASP.resource.ASP.grammar.ASPRule[] {
		ASP_0,
		ASP_1,
		ASP_2,
		ASP_3,
		ASP_4,
		ASP_5,
		ASP_6,
		ASP_7,
		ASP_8,
		ASP_9,
		ASP_10,
		ASP_11,
		ASP_12,
		ASP_13,
		ASP_14,
		ASP_15,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (ASP.resource.ASP.grammar.ASPRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(ASP.resource.ASP.grammar.ASPSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof ASP.resource.ASP.grammar.ASPKeyword) {
			keywords.add(((ASP.resource.ASP.grammar.ASPKeyword) element).getValue());
		} else if (element instanceof ASP.resource.ASP.grammar.ASPBooleanTerminal) {
			keywords.add(((ASP.resource.ASP.grammar.ASPBooleanTerminal) element).getTrueLiteral());
			keywords.add(((ASP.resource.ASP.grammar.ASPBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof ASP.resource.ASP.grammar.ASPEnumerationTerminal) {
			ASP.resource.ASP.grammar.ASPEnumerationTerminal terminal = (ASP.resource.ASP.grammar.ASPEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (ASP.resource.ASP.grammar.ASPSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
