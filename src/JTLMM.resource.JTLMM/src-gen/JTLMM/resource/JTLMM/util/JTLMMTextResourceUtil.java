/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.util;

/**
 * Class JTLMMTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * JTLMM.resource.JTLMM.util.JTLMMResourceUtil.
 */
public class JTLMMTextResourceUtil {
	
	/**
	 * Use JTLMM.resource.JTLMM.util.JTLMMResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static JTLMM.resource.JTLMM.mopp.JTLMMResource getResource(org.eclipse.core.resources.IFile file) {
		return new JTLMM.resource.JTLMM.util.JTLMMEclipseProxy().getResource(file);
	}
	
	/**
	 * Use JTLMM.resource.JTLMM.util.JTLMMResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static JTLMM.resource.JTLMM.mopp.JTLMMResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return JTLMM.resource.JTLMM.util.JTLMMResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use JTLMM.resource.JTLMM.util.JTLMMResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static JTLMM.resource.JTLMM.mopp.JTLMMResource getResource(org.eclipse.emf.common.util.URI uri) {
		return JTLMM.resource.JTLMM.util.JTLMMResourceUtil.getResource(uri);
	}
	
	/**
	 * Use JTLMM.resource.JTLMM.util.JTLMMResourceUtil.getResource() instead.
	 */
	@Deprecated	
	public static JTLMM.resource.JTLMM.mopp.JTLMMResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return JTLMM.resource.JTLMM.util.JTLMMResourceUtil.getResource(uri, options);
	}
	
}
