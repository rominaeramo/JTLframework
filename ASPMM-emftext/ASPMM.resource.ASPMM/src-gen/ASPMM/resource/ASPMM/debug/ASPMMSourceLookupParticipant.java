/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.debug;

public class ASPMMSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof ASPMM.resource.ASPMM.debug.ASPMMStackFrame) {
			ASPMM.resource.ASPMM.debug.ASPMMStackFrame frame = (ASPMM.resource.ASPMM.debug.ASPMMStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
