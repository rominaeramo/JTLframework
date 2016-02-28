/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.grammar;

/**
 * A class to represent an enumeration terminal in the grammar.
 */
public class ASPMEnumerationTerminal extends ASPM.resource.ASPM.grammar.ASPMTerminal {
	
	private java.util.Map<String, String> mapping = new java.util.LinkedHashMap<String, String>();
	
	public ASPMEnumerationTerminal(org.eclipse.emf.ecore.EStructuralFeature attribute, String[] literalMappings, ASPM.resource.ASPM.grammar.ASPMCardinality cardinality, int mandatoryOccurrencesAfter) {
		super(attribute, cardinality, mandatoryOccurrencesAfter);
		assert attribute instanceof org.eclipse.emf.ecore.EAttribute;
		assert literalMappings.length % 2 == 0;
		for (int i = 0; i < literalMappings.length; i += 2) {
			String literalName = literalMappings[i];
			String text = literalMappings[i + 1];
			this.mapping.put(literalName, text);
		}
	}
	
	public java.util.Map<String, String> getLiteralMapping() {
		return this.mapping;
	}
	
	public org.eclipse.emf.ecore.EAttribute getAttribute() {
		return (org.eclipse.emf.ecore.EAttribute) getFeature();
	}
	
	public String getText(String literalName) {
		return this.mapping.get(literalName);
	}
	
}
