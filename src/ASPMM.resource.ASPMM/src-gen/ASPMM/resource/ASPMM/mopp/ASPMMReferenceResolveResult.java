/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

/**
 * A basic implementation of the ASPMM.resource.ASPMM.IASPMMReferenceResolveResult
 * interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class ASPMMReferenceResolveResult<ReferenceType> implements ASPMM.resource.ASPMM.IASPMMReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<ASPMM.resource.ASPMM.IASPMMReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<ASPMM.resource.ASPMM.IASPMMQuickFix> quickFixes;
	
	public ASPMMReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<ASPMM.resource.ASPMM.IASPMMQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<ASPMM.resource.ASPMM.IASPMMQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(ASPMM.resource.ASPMM.IASPMMQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<ASPMM.resource.ASPMM.IASPMMQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<ASPMM.resource.ASPMM.IASPMMReferenceMapping<ReferenceType>> getMappings() {
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
			mappings = new java.util.ArrayList<ASPMM.resource.ASPMM.IASPMMReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new ASPMM.resource.ASPMM.mopp.ASPMMElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<ASPMM.resource.ASPMM.IASPMMReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new ASPMM.resource.ASPMM.mopp.ASPMMURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
