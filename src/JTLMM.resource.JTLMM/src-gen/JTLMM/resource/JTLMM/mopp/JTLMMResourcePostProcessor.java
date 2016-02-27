/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

public class JTLMMResourcePostProcessor implements JTLMM.resource.JTLMM.IJTLMMResourcePostProcessor {
	
	public void process(JTLMM.resource.JTLMM.mopp.JTLMMResource resource) {
		// Set the overrideResourcePostProcessor option to false to customize resource
		// post processing.
	}
	
	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
}
