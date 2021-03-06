/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see ASPMM.resource.ASPMM.IASPMMOptions.RESOURCE_CONTENT_TYPE
 */
public class ASPMMUnexpectedContentTypeException extends org.antlr.runtime3_4_0.RecognitionException {
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  ASPMMUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
