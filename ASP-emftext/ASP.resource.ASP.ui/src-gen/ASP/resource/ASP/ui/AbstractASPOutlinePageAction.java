/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package ASP.resource.ASP.ui;

public abstract class AbstractASPOutlinePageAction extends org.eclipse.jface.action.Action {
	
	private String preferenceKey = this.getClass().getSimpleName() + ".isChecked";
	
	private ASP.resource.ASP.ui.ASPOutlinePageTreeViewer treeViewer;
	
	public AbstractASPOutlinePageAction(ASP.resource.ASP.ui.ASPOutlinePageTreeViewer treeViewer, String text, int style) {
		super(text, style);
		this.treeViewer = treeViewer;
	}
	
	public void initialize(String imagePath) {
		org.eclipse.jface.resource.ImageDescriptor descriptor = ASP.resource.ASP.ui.ASPImageProvider.INSTANCE.getImageDescriptor(imagePath);
		setDisabledImageDescriptor(descriptor);
		setImageDescriptor(descriptor);
		setHoverImageDescriptor(descriptor);
		boolean checked = ASP.resource.ASP.ui.ASPUIPlugin.getDefault().getPreferenceStore().getBoolean(preferenceKey);
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
			ASP.resource.ASP.ui.ASPUIPlugin.getDefault().getPreferenceStore().setValue(preferenceKey, on);
		}
	}
	
	public boolean keepState() {
		return true;
	}
	
	public ASP.resource.ASP.ui.ASPOutlinePageTreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public ASP.resource.ASP.ui.ASPOutlinePageTreeViewerComparator getTreeViewerComparator() {
		return (ASP.resource.ASP.ui.ASPOutlinePageTreeViewerComparator) treeViewer.getComparator();
	}
	
}
