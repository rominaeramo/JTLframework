package org.eclipse.m2m.atl.jtl2asp.multirelation.popup.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.m2m.atl.jtl2asp.multirelation.files.Jtl2asp_main;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

public class GenerateAspAction implements IObjectActionDelegate {

	private Shell shell;
	
	/**
	 * Constructor for Action1.
	 */
	public GenerateAspAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

		ISelectionService service =  window.getSelectionService();
		ISelection selection =service.getSelection();
		
		String [] fileList= new String[2]; /*array to send as input to main(),containing input and output paths*/
		String input_model= null;
		String output_model=null;
		
		
		/*identify file input path*/
		input_model= selection.toString(); /*get file selected in new workbench*/
		input_model=input_model.substring(2,input_model.length()-1);/*clean up file string*/
		
		/*generate output file path : same as input file path, but extension changed from "jtl" to ".asp"*/
		int lastTokenIndex=input_model.lastIndexOf(".jtl.ecore") ;
		output_model=input_model.substring(0,lastTokenIndex)+ ".asp.ecore";

		
		/* associate files to array*/
		fileList[0]= input_model;
		fileList[1]= output_model;
		
		
	    /*call main function giving the input and output model paths */
		Jtl2asp_main.main(fileList);
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
