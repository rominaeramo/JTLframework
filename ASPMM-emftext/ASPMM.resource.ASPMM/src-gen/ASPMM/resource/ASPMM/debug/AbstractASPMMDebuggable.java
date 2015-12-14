/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.debug;

public abstract class AbstractASPMMDebuggable {
	
	/**
	 * The list of breakpoints, where each breakpoint is represented by its location
	 * (a string) and the line number
	 */
	private java.util.List<ASPMM.resource.ASPMM.util.ASPMMPair<String, Integer>> lineBreakpoints = new java.util.ArrayList<ASPMM.resource.ASPMM.util.ASPMMPair<String, Integer>>();
	private java.io.PrintStream outputStream;
	private java.net.ServerSocket server;
	private boolean debugMode;
	private boolean suspend;
	
	private ASPMM.resource.ASPMM.debug.ASPMMDebugCommunicationHelper communicationHelper = new ASPMM.resource.ASPMM.debug.ASPMMDebugCommunicationHelper();
	
	public void startEventSocket(int eventPort) {
		try {
			// starting event server socket (waiting for connection)...
			server = new java.net.ServerSocket(eventPort);
			java.net.Socket accept = server.accept();
			// starting event server socket done (connection established).
			outputStream = new java.io.PrintStream(accept.getOutputStream());
		} catch (Exception e) {
			new ASPMM.resource.ASPMM.util.ASPMMRuntimeUtil().logError("Can't create socket connection while launching.", e);
		}
	}
	
	public void stopEventSocket() {
		try {
			server.close();
		} catch (java.io.IOException e) {
			new ASPMM.resource.ASPMM.util.ASPMMRuntimeUtil().logError("Exception while closing socket.", e);
		}
	}
	
	public void sendEvent(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes command, boolean sendOnlyInDebugMode, String... arguments) {
		if (isDebugMode() || !sendOnlyInDebugMode) {
			ASPMM.resource.ASPMM.debug.ASPMMDebugMessage message = new ASPMM.resource.ASPMM.debug.ASPMMDebugMessage(command, arguments);
			communicationHelper.sendEvent(message, outputStream);
		}
	}
	
	public void evaluateLineBreakpoint(org.eclipse.emf.common.util.URI uri, int currentLine) {
		if (isDebugMode()) {
			String platformString = uri.toPlatformString(true);
			org.eclipse.core.resources.IResource member = org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
			if (member == null) {
				return;
			}
			String location = member.getRawLocation().toPortableString();
			for (int i = 0; i < lineBreakpoints.size(); i++) {
				ASPMM.resource.ASPMM.util.ASPMMPair<String, Integer> breakpointLocationAndLine = lineBreakpoints.get(i);
				String breakpointLocation = breakpointLocationAndLine.getLeft();
				Integer breakpointLine = breakpointLocationAndLine.getRight();
				if (breakpointLine.intValue() == currentLine && breakpointLocation.equals(location)) {
					// suspending...
					setSuspend(true);
					sendEvent(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes.SUSPENDED, true, new String[] {"breakpoint", "" + currentLine});
					break;
				}
			}
			waitIfSuspended();
		}
	}
	
	public void waitIfSuspended() {
		try {
			while (isSuspend()) {
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
		}
		sendEvent(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes.RESUMED, true);
	}
	
	public void addLineBreakpoint(String location, int line) {
		lineBreakpoints.add(new ASPMM.resource.ASPMM.util.ASPMMPair<String, Integer>(location, new Integer(line)));
	}
	
	public void removeLineBreakpoint(String location, int line) {
		lineBreakpoints.remove(new ASPMM.resource.ASPMM.util.ASPMMPair<String, Integer>(location, new Integer(line)));
	}
	
	public void resume() {
		setSuspend(false);
	}
	
	public void terminate() {
		sendEvent(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes.TERMINATED, false);
		stopEventSocket();
	}
	
	public boolean isDebugMode() {
		return debugMode;
	}
	
	public void setDebugMode(boolean debugMode) {
		this.debugMode = debugMode;
	}
	
	public boolean isSuspend() {
		return suspend;
	}
	
	public void setSuspend(boolean suspend) {
		this.suspend = suspend;
	}
	
	/**
	 * This method must be called before the actual execution of the interpreter or
	 * generated code. Its purpose is to send an event to the debug server to signal
	 * that the debuggable has started and wait until the server has installed all
	 * breakpoints and signals to resume (i.e., to start the actual execution).
	 */
	public void startUpAndWait() {
		// suspend here after startup to wait for the installation of deferred breakpoints
		if (isDebugMode()) {
			sendEvent(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes.STARTED, true);
			setSuspend(true);
			// wait until server sends the RESUME event
			while (isSuspend()) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					throw new RuntimeException(e.getMessage());
				}
			}
			// confirm that the debuggable was resumed
			sendEvent(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes.RESUMED, true);
		}
	}
	
	public abstract void stepOver();
	public abstract void stepInto();
	public abstract void stepReturn();
	public abstract String[] getStack();
	public abstract java.util.Map<String, Object> getFrameVariables(String stackFrame);
}
