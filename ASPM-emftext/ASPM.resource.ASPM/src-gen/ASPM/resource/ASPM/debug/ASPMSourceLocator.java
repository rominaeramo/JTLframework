/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.debug;

public class ASPMSourceLocator extends org.eclipse.debug.core.sourcelookup.AbstractSourceLookupDirector {
	
	public void initializeParticipants() {
		addParticipants(new org.eclipse.debug.core.sourcelookup.ISourceLookupParticipant[]{new ASPM.resource.ASPM.debug.ASPMSourceLookupParticipant()});
	}
	
}
