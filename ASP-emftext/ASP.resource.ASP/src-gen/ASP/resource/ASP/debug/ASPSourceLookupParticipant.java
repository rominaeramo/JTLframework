/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.debug;

public class ASPSourceLookupParticipant extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant {
	
	public String getSourceName(Object object) throws org.eclipse.core.runtime.CoreException {
		if (object instanceof ASP.resource.ASP.debug.ASPStackFrame) {
			ASP.resource.ASP.debug.ASPStackFrame frame = (ASP.resource.ASP.debug.ASPStackFrame) object;
			return frame.getResourceURI();
		}
		return null;
	}
	
}
