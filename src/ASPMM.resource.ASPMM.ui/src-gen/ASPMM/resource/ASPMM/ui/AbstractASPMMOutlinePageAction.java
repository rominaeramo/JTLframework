/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASPMM.resource.ASPMM.ui;

public abstract class AbstractASPMMOutlinePageAction extends org.eclipse.jface.action.Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private ASPMM.resource.ASPMM.ui.ASPMMOutlinePageTreeViewer treeViewer;
	
	public AbstractASPMMOutlinePageAction(ASPMM.resource.ASPMM.ui.ASPMMOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		org.eclipse.jface.resource.ImageDescriptor descriptor = ASPMM.resource.ASPMM.ui.ASPMMImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = ASPMM.resource.ASPMM.ui.ASPMMUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
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
			ASPMM.resource.ASPMM.ui.ASPMMUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public ASPMM.resource.ASPMM.ui.ASPMMOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public ASPMM.resource.ASPMM.ui.ASPMMOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (ASPMM.resource.ASPMM.ui.ASPMMOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
