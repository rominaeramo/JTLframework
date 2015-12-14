/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.util;

/**
 * Class ASPTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * ASP.resource.ASP.util.ASPResourceUtil.
 */
public class ASPTextResourceUtil {
	
	/**
	 * Use ASP.resource.ASP.util.ASPResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static ASP.resource.ASP.mopp.ASPResource getResource(org.eclipse.core.resources.IFile file) {
		return new ASP.resource.ASP.util.ASPEclipseProxy().getResource(file);
	}
	
	/**
	 * Use ASP.resource.ASP.util.ASPResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static ASP.resource.ASP.mopp.ASPResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return ASP.resource.ASP.util.ASPResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use ASP.resource.ASP.util.ASPResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static ASP.resource.ASP.mopp.ASPResource getResource(org.eclipse.emf.common.util.URI uri) {
		return ASP.resource.ASP.util.ASPResourceUtil.getResource(uri);
	}
	
	/**
	 * Use ASP.resource.ASP.util.ASPResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static ASP.resource.ASP.mopp.ASPResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return ASP.resource.ASP.util.ASPResourceUtil.getResource(uri, options);
	}
	
}
