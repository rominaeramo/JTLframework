/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.grammar;

public class ASPMMGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static ASPMMGrammarInformationProvider INSTANCE = new ASPMMGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_0_0_0_0 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword("metamodel", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_0_0_0_1 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword("(", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder ASPMM_0_0_0_2 = new ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder(ASPMM.ASPMMPackage.eINSTANCE.getMetamodel().getEStructuralFeature(ASPMM.ASPMMPackage.METAMODEL__NAME), "TEXT", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, 0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_0_0_0_3 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword(")", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_0_0_0_4 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword(".", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMContainment ASPMM_0_0_0_5 = new ASPMM.resource.ASPMM.grammar.ASPMMContainment(ASPMM.ASPMMPackage.eINSTANCE.getMetamodel().getEStructuralFeature(ASPMM.ASPMMPackage.METAMODEL__METANODES), ASPMM.resource.ASPMM.grammar.ASPMMCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {ASPMM.ASPMMPackage.eINSTANCE.getMetanode(), }, 0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMContainment ASPMM_0_0_0_6 = new ASPMM.resource.ASPMM.grammar.ASPMMContainment(ASPMM.ASPMMPackage.eINSTANCE.getMetamodel().getEStructuralFeature(ASPMM.ASPMMPackage.METAMODEL__METAPROPS), ASPMM.resource.ASPMM.grammar.ASPMMCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {ASPMM.ASPMMPackage.eINSTANCE.getMetaprop(), }, 0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMContainment ASPMM_0_0_0_7 = new ASPMM.resource.ASPMM.grammar.ASPMMContainment(ASPMM.ASPMMPackage.eINSTANCE.getMetamodel().getEStructuralFeature(ASPMM.ASPMMPackage.METAMODEL__METAEDGES), ASPMM.resource.ASPMM.grammar.ASPMMCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {ASPMM.ASPMMPackage.eINSTANCE.getMetaedge(), }, 0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMSequence ASPMM_0_0_0 = new ASPMM.resource.ASPMM.grammar.ASPMMSequence(ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, ASPMM_0_0_0_0, ASPMM_0_0_0_1, ASPMM_0_0_0_2, ASPMM_0_0_0_3, ASPMM_0_0_0_4, ASPMM_0_0_0_5, ASPMM_0_0_0_6, ASPMM_0_0_0_7);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMChoice ASPMM_0_0 = new ASPMM.resource.ASPMM.grammar.ASPMMChoice(ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, ASPMM_0_0_0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMRule ASPMM_0 = new ASPMM.resource.ASPMM.grammar.ASPMMRule(ASPMM.ASPMMPackage.eINSTANCE.getMetamodel(), ASPMM_0_0, ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_1_0_0_0 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword("metanode", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_1_0_0_1 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword("(", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder ASPMM_1_0_0_2 = new ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder(ASPMM.ASPMMPackage.eINSTANCE.getMetanode().getEStructuralFeature(ASPMM.ASPMMPackage.METANODE__METAMODEL), "TEXT", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, 0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_1_0_0_3 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword(",", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder ASPMM_1_0_0_4 = new ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder(ASPMM.ASPMMPackage.eINSTANCE.getMetanode().getEStructuralFeature(ASPMM.ASPMMPackage.METANODE__NAME), "TEXT", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, 0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_1_0_0_5 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword(")", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_1_0_0_6 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword(".", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMSequence ASPMM_1_0_0 = new ASPMM.resource.ASPMM.grammar.ASPMMSequence(ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, ASPMM_1_0_0_0, ASPMM_1_0_0_1, ASPMM_1_0_0_2, ASPMM_1_0_0_3, ASPMM_1_0_0_4, ASPMM_1_0_0_5, ASPMM_1_0_0_6);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMChoice ASPMM_1_0 = new ASPMM.resource.ASPMM.grammar.ASPMMChoice(ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, ASPMM_1_0_0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMRule ASPMM_1 = new ASPMM.resource.ASPMM.grammar.ASPMMRule(ASPMM.ASPMMPackage.eINSTANCE.getMetanode(), ASPMM_1_0, ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_2_0_0_0 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword("metaprop", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_2_0_0_1 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword("(", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder ASPMM_2_0_0_2 = new ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder(ASPMM.ASPMMPackage.eINSTANCE.getMetaprop().getEStructuralFeature(ASPMM.ASPMMPackage.METAPROP__METAMODEL), "TEXT", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, 0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_2_0_0_3 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword(",", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder ASPMM_2_0_0_4 = new ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder(ASPMM.ASPMMPackage.eINSTANCE.getMetaprop().getEStructuralFeature(ASPMM.ASPMMPackage.METAPROP__NAME), "TEXT", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, 0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_2_0_0_5 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword(",", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder ASPMM_2_0_0_6 = new ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder(ASPMM.ASPMMPackage.eINSTANCE.getMetaprop().getEStructuralFeature(ASPMM.ASPMMPackage.METAPROP__METANODE), "TEXT", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, 0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_2_0_0_7 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword(")", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_2_0_0_8 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword(".", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMSequence ASPMM_2_0_0 = new ASPMM.resource.ASPMM.grammar.ASPMMSequence(ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, ASPMM_2_0_0_0, ASPMM_2_0_0_1, ASPMM_2_0_0_2, ASPMM_2_0_0_3, ASPMM_2_0_0_4, ASPMM_2_0_0_5, ASPMM_2_0_0_6, ASPMM_2_0_0_7, ASPMM_2_0_0_8);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMChoice ASPMM_2_0 = new ASPMM.resource.ASPMM.grammar.ASPMMChoice(ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, ASPMM_2_0_0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMRule ASPMM_2 = new ASPMM.resource.ASPMM.grammar.ASPMMRule(ASPMM.ASPMMPackage.eINSTANCE.getMetaprop(), ASPMM_2_0, ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_3_0_0_0 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword("metaedge", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_3_0_0_1 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword("(", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder ASPMM_3_0_0_2 = new ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder(ASPMM.ASPMMPackage.eINSTANCE.getMetaedge().getEStructuralFeature(ASPMM.ASPMMPackage.METAEDGE__METAMODEL), "TEXT", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, 0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_3_0_0_3 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword(",", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMEnumerationTerminal ASPMM_3_0_0_4 = new ASPMM.resource.ASPMM.grammar.ASPMMEnumerationTerminal(ASPMM.ASPMMPackage.eINSTANCE.getMetaedge().getEStructuralFeature(ASPMM.ASPMMPackage.METAEDGE__TYPE), new String[] {"association", "association", "generalization", "generalization", "composition", "composition", }, ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, 0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_3_0_0_5 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword(",", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder ASPMM_3_0_0_6 = new ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder(ASPMM.ASPMMPackage.eINSTANCE.getMetaedge().getEStructuralFeature(ASPMM.ASPMMPackage.METAEDGE__NAME), "TEXT", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, 0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_3_0_0_7 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword(",", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder ASPMM_3_0_0_8 = new ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder(ASPMM.ASPMMPackage.eINSTANCE.getMetaedge().getEStructuralFeature(ASPMM.ASPMMPackage.METAEDGE__SOURCE), "TEXT", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, 0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_3_0_0_9 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword(",", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder ASPMM_3_0_0_10 = new ASPMM.resource.ASPMM.grammar.ASPMMPlaceholder(ASPMM.ASPMMPackage.eINSTANCE.getMetaedge().getEStructuralFeature(ASPMM.ASPMMPackage.METAEDGE__TARGET), "TEXT", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, 0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_3_0_0_11 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword(")", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMKeyword ASPMM_3_0_0_12 = new ASPMM.resource.ASPMM.grammar.ASPMMKeyword(".", ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMSequence ASPMM_3_0_0 = new ASPMM.resource.ASPMM.grammar.ASPMMSequence(ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, ASPMM_3_0_0_0, ASPMM_3_0_0_1, ASPMM_3_0_0_2, ASPMM_3_0_0_3, ASPMM_3_0_0_4, ASPMM_3_0_0_5, ASPMM_3_0_0_6, ASPMM_3_0_0_7, ASPMM_3_0_0_8, ASPMM_3_0_0_9, ASPMM_3_0_0_10, ASPMM_3_0_0_11, ASPMM_3_0_0_12);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMChoice ASPMM_3_0 = new ASPMM.resource.ASPMM.grammar.ASPMMChoice(ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE, ASPMM_3_0_0);
	public final static ASPMM.resource.ASPMM.grammar.ASPMMRule ASPMM_3 = new ASPMM.resource.ASPMM.grammar.ASPMMRule(ASPMM.ASPMMPackage.eINSTANCE.getMetaedge(), ASPMM_3_0, ASPMM.resource.ASPMM.grammar.ASPMMCardinality.ONE);
	
	public static String getSyntaxElementID(ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : ASPMM.resource.ASPMM.grammar.ASPMMGrammarInformationProvider.class.getFields()) {
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
	
	public static ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement) ASPMM.resource.ASPMM.grammar.ASPMMGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static ASPMM.resource.ASPMM.grammar.ASPMMRule[] RULES = new ASPMM.resource.ASPMM.grammar.ASPMMRule[] {
		ASPMM_0,
		ASPMM_1,
		ASPMM_2,
		ASPMM_3,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (ASPMM.resource.ASPMM.grammar.ASPMMRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof ASPMM.resource.ASPMM.grammar.ASPMMKeyword) {
			keywords.add(((ASPMM.resource.ASPMM.grammar.ASPMMKeyword) element).getValue());
		} else if (element instanceof ASPMM.resource.ASPMM.grammar.ASPMMBooleanTerminal) {
			keywords.add(((ASPMM.resource.ASPMM.grammar.ASPMMBooleanTerminal) element).getTrueLiteral());
			keywords.add(((ASPMM.resource.ASPMM.grammar.ASPMMBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof ASPMM.resource.ASPMM.grammar.ASPMMEnumerationTerminal) {
			ASPMM.resource.ASPMM.grammar.ASPMMEnumerationTerminal terminal = (ASPMM.resource.ASPMM.grammar.ASPMMEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (ASPMM.resource.ASPMM.grammar.ASPMMSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
