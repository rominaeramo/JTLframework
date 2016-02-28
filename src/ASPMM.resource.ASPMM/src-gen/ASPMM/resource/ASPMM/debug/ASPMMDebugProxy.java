/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class ASPMMDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private ASPMM.resource.ASPMM.debug.ASPMMDebugTarget debugTarget;
	
	private ASPMM.resource.ASPMM.debug.ASPMMDebugCommunicationHelper communicationHelper = new ASPMM.resource.ASPMM.debug.ASPMMDebugCommunicationHelper();
	
	public ASPMMDebugProxy(ASPMM.resource.ASPMM.debug.ASPMMDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
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
		sendCommand(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes.EXIT);
	}
	
	public ASPMM.resource.ASPMM.debug.ASPMMDebugMessage getStack() {
		return sendCommandAndRead(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		ASPMM.resource.ASPMM.debug.ASPMMDebugMessage message = new ASPMM.resource.ASPMM.debug.ASPMMDebugMessage(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		ASPMM.resource.ASPMM.debug.ASPMMDebugMessage message = new ASPMM.resource.ASPMM.debug.ASPMMDebugMessage(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		ASPMM.resource.ASPMM.debug.ASPMMDebugMessage response = sendCommandAndRead(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		ASPMM.resource.ASPMM.debug.ASPMMDebugMessage response = sendCommandAndRead(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		ASPMM.resource.ASPMM.debug.ASPMMDebugVariable[] variables  = new ASPMM.resource.ASPMM.debug.ASPMMDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = ASPMM.resource.ASPMM.util.ASPMMStringUtil.convertFromString(varString);
			
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
			org.eclipse.debug.core.model.IValue value = new ASPMM.resource.ASPMM.debug.ASPMMDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			ASPMM.resource.ASPMM.debug.ASPMMDebugVariable variable = new ASPMM.resource.ASPMM.debug.ASPMMDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes command, String... parameters) {
		ASPMM.resource.ASPMM.debug.ASPMMDebugMessage message = new ASPMM.resource.ASPMM.debug.ASPMMDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private ASPMM.resource.ASPMM.debug.ASPMMDebugMessage sendCommandAndRead(ASPMM.resource.ASPMM.debug.EASPMMDebugMessageTypes command, String... parameters) {
		ASPMM.resource.ASPMM.debug.ASPMMDebugMessage message = new ASPMM.resource.ASPMM.debug.ASPMMDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
