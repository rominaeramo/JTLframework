/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class JTLMMDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private JTLMM.resource.JTLMM.debug.JTLMMDebugTarget debugTarget;
	
	private JTLMM.resource.JTLMM.debug.JTLMMDebugCommunicationHelper communicationHelper = new JTLMM.resource.JTLMM.debug.JTLMMDebugCommunicationHelper();
	
	public JTLMMDebugProxy(JTLMM.resource.JTLMM.debug.JTLMMDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
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
		sendCommand(JTLMM.resource.JTLMM.debug.EJTLMMDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(JTLMM.resource.JTLMM.debug.EJTLMMDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(JTLMM.resource.JTLMM.debug.EJTLMMDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(JTLMM.resource.JTLMM.debug.EJTLMMDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(JTLMM.resource.JTLMM.debug.EJTLMMDebugMessageTypes.EXIT);
	}
	
	public JTLMM.resource.JTLMM.debug.JTLMMDebugMessage getStack() {
		return sendCommandAndRead(JTLMM.resource.JTLMM.debug.EJTLMMDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		JTLMM.resource.JTLMM.debug.JTLMMDebugMessage message = new JTLMM.resource.JTLMM.debug.JTLMMDebugMessage(JTLMM.resource.JTLMM.debug.EJTLMMDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		JTLMM.resource.JTLMM.debug.JTLMMDebugMessage message = new JTLMM.resource.JTLMM.debug.JTLMMDebugMessage(JTLMM.resource.JTLMM.debug.EJTLMMDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		JTLMM.resource.JTLMM.debug.JTLMMDebugMessage response = sendCommandAndRead(JTLMM.resource.JTLMM.debug.EJTLMMDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		JTLMM.resource.JTLMM.debug.JTLMMDebugMessage response = sendCommandAndRead(JTLMM.resource.JTLMM.debug.EJTLMMDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		JTLMM.resource.JTLMM.debug.JTLMMDebugVariable[] variables  = new JTLMM.resource.JTLMM.debug.JTLMMDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = JTLMM.resource.JTLMM.util.JTLMMStringUtil.convertFromString(varString);
			
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
			org.eclipse.debug.core.model.IValue value = new JTLMM.resource.JTLMM.debug.JTLMMDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			JTLMM.resource.JTLMM.debug.JTLMMDebugVariable variable = new JTLMM.resource.JTLMM.debug.JTLMMDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(JTLMM.resource.JTLMM.debug.EJTLMMDebugMessageTypes command, String... parameters) {
		JTLMM.resource.JTLMM.debug.JTLMMDebugMessage message = new JTLMM.resource.JTLMM.debug.JTLMMDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private JTLMM.resource.JTLMM.debug.JTLMMDebugMessage sendCommandAndRead(JTLMM.resource.JTLMM.debug.EJTLMMDebugMessageTypes command, String... parameters) {
		JTLMM.resource.JTLMM.debug.JTLMMDebugMessage message = new JTLMM.resource.JTLMM.debug.JTLMMDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
