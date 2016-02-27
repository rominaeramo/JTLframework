/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.mopp;

/**
 * The JTLMMTaskItemBuilder is used to find task items in text documents. The
 * current implementation uses the generated lexer and the TaskItemDetector to
 * detect task items. This class is called by the BuilderAdapter, which runs both
 * this builder and the default builder that is intended to be customized.
 */
public class JTLMMTaskItemBuilder {
	
	public void build(org.eclipse.core.resources.IFile resource, org.eclipse.emf.ecore.resource.ResourceSet resourceSet, org.eclipse.core.runtime.IProgressMonitor monitor) {
		monitor.setTaskName("Searching for task items");
		new JTLMM.resource.JTLMM.mopp.JTLMMMarkerHelper().removeAllMarkers(resource, org.eclipse.core.resources.IMarker.TASK);
		if (isInBinFolder(resource)) {
			return;
		}
		java.util.List<JTLMM.resource.JTLMM.mopp.JTLMMTaskItem> taskItems = new java.util.ArrayList<JTLMM.resource.JTLMM.mopp.JTLMMTaskItem>();
		JTLMM.resource.JTLMM.mopp.JTLMMTaskItemDetector taskItemDetector = new JTLMM.resource.JTLMM.mopp.JTLMMTaskItemDetector();
		try {
			java.io.InputStream inputStream = resource.getContents();
			String content = JTLMM.resource.JTLMM.util.JTLMMStreamUtil.getContent(inputStream);
			JTLMM.resource.JTLMM.IJTLMMTextScanner lexer = new JTLMM.resource.JTLMM.mopp.JTLMMMetaInformation().createLexer();
			lexer.setText(content);
			
			JTLMM.resource.JTLMM.IJTLMMTextToken nextToken = lexer.getNextToken();
			while (nextToken != null) {
				String text = nextToken.getText();
				taskItems.addAll(taskItemDetector.findTaskItems(text, nextToken.getLine(), nextToken.getOffset()));
				nextToken = lexer.getNextToken();
			}
		} catch (java.io.IOException e) {
			JTLMM.resource.JTLMM.mopp.JTLMMPlugin.logError("Exception while searching for task items", e);
		} catch (org.eclipse.core.runtime.CoreException e) {
			JTLMM.resource.JTLMM.mopp.JTLMMPlugin.logError("Exception while searching for task items", e);
		}
		
		for (JTLMM.resource.JTLMM.mopp.JTLMMTaskItem taskItem : taskItems) {
			java.util.Map<String, Object> markerAttributes = new java.util.LinkedHashMap<String, Object>();
			markerAttributes.put(org.eclipse.core.resources.IMarker.USER_EDITABLE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.DONE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.LINE_NUMBER, taskItem.getLine());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_START, taskItem.getCharStart());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_END, taskItem.getCharEnd());
			markerAttributes.put(org.eclipse.core.resources.IMarker.MESSAGE, taskItem.getMessage());
			new JTLMM.resource.JTLMM.mopp.JTLMMMarkerHelper().createMarker(resource, org.eclipse.core.resources.IMarker.TASK, markerAttributes);
		}
	}
	
	public String getBuilderMarkerId() {
		return org.eclipse.core.resources.IMarker.TASK;
	}
	
	public boolean isInBinFolder(org.eclipse.core.resources.IFile resource) {
		org.eclipse.core.resources.IContainer parent = resource.getParent();
		while (parent != null) {
			if ("bin".equals(parent.getName())) {
				return true;
			}
			parent = parent.getParent();
		}
		return false;
	}
	
}
