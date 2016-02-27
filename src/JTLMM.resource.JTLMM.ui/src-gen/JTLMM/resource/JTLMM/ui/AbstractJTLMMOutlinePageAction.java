/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package JTLMM.resource.JTLMM.ui;

public abstract class AbstractJTLMMOutlinePageAction extends org.eclipse.jface.action.Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private JTLMM.resource.JTLMM.ui.JTLMMOutlinePageTreeViewer treeViewer;
	
	public AbstractJTLMMOutlinePageAction(JTLMM.resource.JTLMM.ui.JTLMMOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		org.eclipse.jface.resource.ImageDescriptor descriptor = JTLMM.resource.JTLMM.ui.JTLMMImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = JTLMM.resource.JTLMM.ui.JTLMMUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
		valueChanged(checked, false);
	}
	
	@Override	
	public void run() {
		if (keepState()) {
			valueChanged(isChecked(), true);
		} else {
			runBusy(true);
		}
	}
	
	public void runBusy(final boolean on) {
		org.eclipse.swt.custom.BusyIndicator.showWhile(org.eclipse.swt.widgets.Display.getCurrent(), new Runnable() {
			public void run() {
				runInternal(on);
			}
		});
	}
	
	public abstract void runInternal(boolean on);
	
	private void valueChanged(boolean on, boolean store) {
		setChecked(on);
		runBusy(on);
		if (store) {
			JTLMM.resource.JTLMM.ui.JTLMMUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public JTLMM.resource.JTLMM.ui.JTLMMOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public JTLMM.resource.JTLMM.ui.JTLMMOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (JTLMM.resource.JTLMM.ui.JTLMMOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
