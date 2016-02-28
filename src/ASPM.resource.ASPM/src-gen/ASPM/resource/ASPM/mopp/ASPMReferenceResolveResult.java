/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.mopp;

/**
 * A basic implementation of the ASPM.resource.ASPM.IASPMReferenceResolveResult
 * interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class ASPMReferenceResolveResult<ReferenceType> implements ASPM.resource.ASPM.IASPMReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<ASPM.resource.ASPM.IASPMReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<ASPM.resource.ASPM.IASPMQuickFix> quickFixes;
	
	public ASPMReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<ASPM.resource.ASPM.IASPMQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<ASPM.resource.ASPM.IASPMQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(ASPM.resource.ASPM.IASPMQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<ASPM.resource.ASPM.IASPMQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<ASPM.resource.ASPM.IASPMReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<ASPM.resource.ASPM.IASPMReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new ASPM.resource.ASPM.mopp.ASPMElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<ASPM.resource.ASPM.IASPMReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new ASPM.resource.ASPM.mopp.ASPMURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
