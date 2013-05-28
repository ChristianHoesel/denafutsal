package hu.bme.mit.inf.mdsd.one.app.commands;

import java.io.FileNotFoundException;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;
import hu.bme.mit.inf.mdsd.one.app.management.ManageModelHelper;
import hu.bme.mit.inf.mdsd.one.app.management.ViewData;
import hu.bme.mit.inf.mdsd.one.rest.MDSDClient;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

public class UploadHTML extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// IPreferenceStore preferenceStore = PlatformUI.getPreferenceStore();
		// System.out.println("FRDF " +
		// preferenceStore.getString(PreferencesPage.OUT_FOLD));
		// generator.generateDataModelToOutputFolder(model,
		// preferenceStore.getString(PreferencesPage.OUT_FOLD));
		
		FileDialog fd = new FileDialog(HandlerUtil.getActiveShell(event),
				SWT.OPEN);
		fd.setText("Select model file");
		String[] filterExt = { "*.html" ,"*.htm", "*.*" };
		fd.setFilterExtensions(filterExt);
		String selected = fd.open();

		if (selected == null)
			return null;

		ViewData.instance().setModel(
				ManageModelHelper.readModelFromFile(selected));

		IWorkbenchPage activePage = HandlerUtil.getActiveWorkbenchWindow(event)
				.getActivePage();
		activePage.hideView(activePage.findView(MainView.ID));
		try {
			activePage.showView(MainView.ID);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String htmlId = "";
		
		MDSDClient mdsdClient = new MDSDClient();
		try {
			htmlId = mdsdClient.uploadHTML(selected);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(htmlId);
		
		return null;
	}

}
