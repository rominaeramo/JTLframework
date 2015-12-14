/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class ASPDebugMessage {
	
	private static final char DELIMITER = ':';
	private ASP.resource.ASP.debug.EASPDebugMessageTypes messageType;
	private String[] arguments;
	
	public ASPDebugMessage(ASP.resource.ASP.debug.EASPDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public ASPDebugMessage(ASP.resource.ASP.debug.EASPDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public ASP.resource.ASP.debug.EASPDebugMessageTypes getMessageType() {
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
		return ASP.resource.ASP.util.ASPStringUtil.encode(DELIMITER, parts);
	}
	
	public static ASPDebugMessage deserialize(String response) {
		java.util.List<String> parts = ASP.resource.ASP.util.ASPStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		ASP.resource.ASP.debug.EASPDebugMessageTypes type = ASP.resource.ASP.debug.EASPDebugMessageTypes.valueOf(messageType);
		ASPDebugMessage message = new ASPDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(ASP.resource.ASP.debug.EASPDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + ASP.resource.ASP.util.ASPStringUtil.explode(arguments, ", ") + "]";
	}
	
}
