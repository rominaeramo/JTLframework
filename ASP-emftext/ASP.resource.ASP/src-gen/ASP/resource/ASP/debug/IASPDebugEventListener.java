/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.debug;

public interface IASPDebugEventListener {
	
	/**
	 * Notification that the given event occurred in the while debugging.
	 */
	public void handleMessage(ASP.resource.ASP.debug.ASPDebugMessage message);
}
