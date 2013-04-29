package hu.bme.mit.inf.mdsd.compilecommandhandler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import model.Match;

import hu.bme.mit.inf.mdsd.reportgenerator.templates.*;

public class ModelDataGenerateCommandHandler extends AbstractHandler implements IHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Getting the active window
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (window != null) {
			//Checking the selection
			ISelection selection = window.getSelectionService().getSelection();
			if (window.getSelectionService().getSelection() instanceof IStructuredSelection) {
				// Getting the selection
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				// Getting the single selected element
				if (structuredSelection.size() == 1) {
					Object firstElement = structuredSelection.getFirstElement();
					
					// Check if it is the right element
					if (firstElement instanceof Match) {
						// We have the dataModel
						Match dataModel = (Match) firstElement;
						
						//System.out.println(dataModel.eResource().getURI());
						
						// Let's generate the project with the template
						MatchGenerator generator = new MatchGenerator();
						generator.generateDataModel(dataModel);
					}
					else showErrorMessage("The selected element isn't the instance of " + Match.class.getCanonicalName()+
						"\n(Got: " + firstElement.getClass().getCanonicalName()+")");
				}
				else showErrorMessage("Select exactly one element!");
			}
		}
		else showErrorMessage("There isn't any active window!");
		
		return null;
	}
	
	/**
	 * Static method that shows an error message to the user
	 * @param errorMessage
	 */
	public static void showErrorMessage(String errorMessage) {
		MessageDialog messageDialog = new MessageDialog(
			null,
			"Error during code generation",
			null,
			errorMessage,
			MessageDialog.ERROR,
			new String[]{"Ok"}, 0);
		messageDialog.open();
	}

}
