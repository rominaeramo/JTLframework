/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class ASPMDebugMessage {
	
	private static final char DELIMITER = ':';
	private ASPM.resource.ASPM.debug.EASPMDebugMessageTypes messageType;
	private String[] arguments;
	
	public ASPMDebugMessage(ASPM.resource.ASPM.debug.EASPMDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public ASPMDebugMessage(ASPM.resource.ASPM.debug.EASPMDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public ASPM.resource.ASPM.debug.EASPMDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return ASPM.resource.ASPM.util.ASPMStringUtil.encode(DELIMITER, parts);
	}
	
	public static ASPMDebugMessage deserialize(String response) {
		java.util.List<String> parts = ASPM.resource.ASPM.util.ASPMStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		ASPM.resource.ASPM.debug.EASPMDebugMessageTypes type = ASPM.resource.ASPM.debug.EASPMDebugMessageTypes.valueOf(messageType);
		ASPMDebugMessage message = new ASPMDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(ASPM.resource.ASPM.debug.EASPMDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + ASPM.resource.ASPM.util.ASPMStringUtil.explode(arguments, ", ") + "]";
	}
	
}
