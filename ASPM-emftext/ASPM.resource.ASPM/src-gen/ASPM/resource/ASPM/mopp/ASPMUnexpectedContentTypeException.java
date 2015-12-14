/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see ASPM.resource.ASPM.IASPMOptions.RESOURCE_CONTENT_TYPE
 */
public class ASPMUnexpectedContentTypeException extends org.antlr.runtime3_4_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  ASPMUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
