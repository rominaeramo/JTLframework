/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.util;

/**
 * Class ASPMMTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * ASPMM.resource.ASPMM.util.ASPMMResourceUtil.
 */
public class ASPMMTextResourceUtil {
	
	/**
	 * Use ASPMM.resource.ASPMM.util.ASPMMResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static ASPMM.resource.ASPMM.mopp.ASPMMResource getResource(org.eclipse.core.resources.IFile file) {
		return new ASPMM.resource.ASPMM.util.ASPMMEclipseProxy().getResource(file);
	}
	
	/**
	 * Use ASPMM.resource.ASPMM.util.ASPMMResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static ASPMM.resource.ASPMM.mopp.ASPMMResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return ASPMM.resource.ASPMM.util.ASPMMResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use ASPMM.resource.ASPMM.util.ASPMMResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static ASPMM.resource.ASPMM.mopp.ASPMMResource getResource(org.eclipse.emf.common.util.URI uri) {
		return ASPMM.resource.ASPMM.util.ASPMMResourceUtil.getResource(uri);
	}
	
	/**
	 * Use ASPMM.resource.ASPMM.util.ASPMMResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static ASPMM.resource.ASPMM.mopp.ASPMMResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return ASPMM.resource.ASPMM.util.ASPMMResourceUtil.getResource(uri, options);
	}
	
}
