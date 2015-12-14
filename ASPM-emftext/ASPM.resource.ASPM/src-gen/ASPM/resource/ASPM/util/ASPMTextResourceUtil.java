/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.util;

/**
 * Class ASPMTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * ASPM.resource.ASPM.util.ASPMResourceUtil.
 */
public class ASPMTextResourceUtil {
	
	/**
	 * Use ASPM.resource.ASPM.util.ASPMResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static ASPM.resource.ASPM.mopp.ASPMResource getResource(org.eclipse.core.resources.IFile file) {
		return new ASPM.resource.ASPM.util.ASPMEclipseProxy().getResource(file);
	}
	
	/**
	 * Use ASPM.resource.ASPM.util.ASPMResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static ASPM.resource.ASPM.mopp.ASPMResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return ASPM.resource.ASPM.util.ASPMResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use ASPM.resource.ASPM.util.ASPMResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static ASPM.resource.ASPM.mopp.ASPMResource getResource(org.eclipse.emf.common.util.URI uri) {
		return ASPM.resource.ASPM.util.ASPMResourceUtil.getResource(uri);
	}
	
	/**
	 * Use ASPM.resource.ASPM.util.ASPMResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static ASPM.resource.ASPM.mopp.ASPMResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return ASPM.resource.ASPM.util.ASPMResourceUtil.getResource(uri, options);
	}
	
}
