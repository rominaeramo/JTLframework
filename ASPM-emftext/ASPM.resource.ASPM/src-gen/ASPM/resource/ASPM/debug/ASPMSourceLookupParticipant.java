/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.debug;

public class ASPMSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof ASPM.resource.ASPM.debug.ASPMStackFrame) {
			ASPM.resource.ASPM.debug.ASPMStackFrame frame = (ASPM.resource.ASPM.debug.ASPMStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
