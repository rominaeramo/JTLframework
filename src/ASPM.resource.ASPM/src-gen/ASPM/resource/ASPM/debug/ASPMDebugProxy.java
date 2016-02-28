/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class ASPMDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private ASPM.resource.ASPM.debug.ASPMDebugTarget debugTarget;
	
	private ASPM.resource.ASPM.debug.ASPMDebugCommunicationHelper communicationHelper = new ASPM.resource.ASPM.debug.ASPMDebugCommunicationHelper();
	
	public ASPMDebugProxy(ASPM.resource.ASPM.debug.ASPMDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(ASPM.resource.ASPM.debug.EASPMDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(ASPM.resource.ASPM.debug.EASPMDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(ASPM.resource.ASPM.debug.EASPMDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(ASPM.resource.ASPM.debug.EASPMDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(ASPM.resource.ASPM.debug.EASPMDebugMessageTypes.EXIT);
	}
	
	public ASPM.resource.ASPM.debug.ASPMDebugMessage getStack() {
		return sendCommandAndRead(ASPM.resource.ASPM.debug.EASPMDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		ASPM.resource.ASPM.debug.ASPMDebugMessage message = new ASPM.resource.ASPM.debug.ASPMDebugMessage(ASPM.resource.ASPM.debug.EASPMDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		ASPM.resource.ASPM.debug.ASPMDebugMessage message = new ASPM.resource.ASPM.debug.ASPMDebugMessage(ASPM.resource.ASPM.debug.EASPMDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		ASPM.resource.ASPM.debug.ASPMDebugMessage response = sendCommandAndRead(ASPM.resource.ASPM.debug.EASPMDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		ASPM.resource.ASPM.debug.ASPMDebugMessage response = sendCommandAndRead(ASPM.resource.ASPM.debug.EASPMDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		ASPM.resource.ASPM.debug.ASPMDebugVariable[] variables  = new ASPM.resource.ASPM.debug.ASPMDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = ASPM.resource.ASPM.util.ASPMStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new ASPM.resource.ASPM.debug.ASPMDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			ASPM.resource.ASPM.debug.ASPMDebugVariable variable = new ASPM.resource.ASPM.debug.ASPMDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(ASPM.resource.ASPM.debug.EASPMDebugMessageTypes command, String... parameters) {
		ASPM.resource.ASPM.debug.ASPMDebugMessage message = new ASPM.resource.ASPM.debug.ASPMDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private ASPM.resource.ASPM.debug.ASPMDebugMessage sendCommandAndRead(ASPM.resource.ASPM.debug.EASPMDebugMessageTypes command, String... parameters) {
		ASPM.resource.ASPM.debug.ASPMDebugMessage message = new ASPM.resource.ASPM.debug.ASPMDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
