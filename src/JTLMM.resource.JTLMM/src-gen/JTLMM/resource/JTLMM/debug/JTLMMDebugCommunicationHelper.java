/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.debug;

public class JTLMMDebugCommunicationHelper {
	
	public void sendEvent(JTLMM.resource.JTLMM.debug.JTLMMDebugMessage message, java.io.PrintStream stream) {
		synchronized (stream) {
			stream.println(message.serialize());
		}
	}
	
	/**
	 * Sends a message using the given stream and waits for an answer.
	 * 
	 * @param messageType the type of message to send
	 * @param stream the stream to send the message to
	 * @param reader the reader to obtain the answer from
	 * @param parameters additional parameter to send
	 * 
	 * @return the answer that is received
	 */
	public JTLMM.resource.JTLMM.debug.JTLMMDebugMessage sendAndReceive(JTLMM.resource.JTLMM.debug.JTLMMDebugMessage message, java.io.PrintStream stream, java.io.BufferedReader reader) {
		synchronized (stream) {
			sendEvent(message, stream);
			JTLMM.resource.JTLMM.debug.JTLMMDebugMessage response = receive(reader);
			return response;
		}
	}
	
	/**
	 * Receives a message from the given reader. This method block until a message has
	 * arrived.
	 * 
	 * @param reader the read to obtain the message from
	 * 
	 * @return the received message
	 */
	public JTLMM.resource.JTLMM.debug.JTLMMDebugMessage receive(java.io.BufferedReader reader) {
		try {
			String response = reader.readLine();
			if (response == null) {
				return null;
			}
			JTLMM.resource.JTLMM.debug.JTLMMDebugMessage receivedMessage = JTLMM.resource.JTLMM.debug.JTLMMDebugMessage.deserialize(response);
			return receivedMessage;
		} catch (java.io.IOException e) {
			return null;
		}
	}
	
}
