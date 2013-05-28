package hu.bme.mit.inf.mdsd.one.app.commands;

import hu.bme.mit.inf.mdsd.one.rest.MDSDClient;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class DownloadPDF extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// IPreferenceStore preferenceStore = PlatformUI.getPreferenceStore();
		// System.out.println("FRDF " +
		// preferenceStore.getString(PreferencesPage.OUT_FOLD));
		// generator.generateDataModelToOutputFolder(model,
		// preferenceStore.getString(PreferencesPage.OUT_FOLD));

		MDSDClient mdsdClient = new MDSDClient();
		
		String pdfId = "6de7894f9c77115e62935ed673a51999";
		mdsdClient.getPDF(pdfId, "E:\\futsal+"+pdfId+".pdf");
		
		return null;
	}

}