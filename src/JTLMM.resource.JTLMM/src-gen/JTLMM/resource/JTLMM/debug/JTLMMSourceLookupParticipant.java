/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.debug;

public class JTLMMSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof JTLMM.resource.JTLMM.debug.JTLMMStackFrame) {
			JTLMM.resource.JTLMM.debug.JTLMMStackFrame frame = (JTLMM.resource.JTLMM.debug.JTLMMStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
