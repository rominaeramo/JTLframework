/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.grammar;

/**
 * A ASPContainmentTrace represents a specific path to a structural feature by
 * navigating over a set of a structural feature from a start class.
 * ASPContainmentTraces are used during code completion to reconstruct containment
 * trees that are not created by the parser, for example, if the first character
 * of the contained object has not been typed yet.
 */
public class ASPContainmentTrace {
	
	/**
	 * The class where the trace starts.
	 */
	private org.eclipse.emf.ecore.EClass startClass;
	
	/**
	 * The path of contained features.
	 */
	private ASP.resource.ASP.mopp.ASPContainedFeature[] path;
	
	public ASPContainmentTrace(org.eclipse.emf.ecore.EClass startClass, ASP.resource.ASP.mopp.ASPContainedFeature[] path) {
		super();
		// Verify arguments
		if (startClass != null) {
			if (path.length > 0) {
				org.eclipse.emf.ecore.EStructuralFeature feature = path[path.length - 1].getFeature();
				if (!startClass.getEAllStructuralFeatures().contains(feature)) {
					throw new RuntimeException("Metaclass " + startClass.getName() + " must contain feature " + feature.getName());
				}
			}
		}
		this.startClass = startClass;
		this.path = path;
	}
	
	public org.eclipse.emf.ecore.EClass getStartClass() {
		return startClass;
	}
	
	public ASP.resource.ASP.mopp.ASPContainedFeature[] getPath() {
		return path;
	}
	
	public String toString() {
		return (startClass == null ? "null" : startClass.getName()) + "->" + ASP.resource.ASP.util.ASPStringUtil.explode(path, "->");
	}
	
}
