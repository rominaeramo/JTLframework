/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPM.resource.ASPM.ui;

public abstract class AbstractASPMOutlinePageAction extends org.eclipse.jface.action.Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private ASPM.resource.ASPM.ui.ASPMOutlinePageTreeViewer treeViewer;
	
	public AbstractASPMOutlinePageAction(ASPM.resource.ASPM.ui.ASPMOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		org.eclipse.jface.resource.ImageDescriptor descriptor = ASPM.resource.ASPM.ui.ASPMImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = ASPM.resource.ASPM.ui.ASPMUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
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
			ASPM.resource.ASPM.ui.ASPMUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public ASPM.resource.ASPM.ui.ASPMOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public ASPM.resource.ASPM.ui.ASPMOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (ASPM.resource.ASPM.ui.ASPMOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
