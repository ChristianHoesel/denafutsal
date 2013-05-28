package hu.bme.mit.inf.mdsd.one.app.commands;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import hu.bme.mit.inf.mdsd.one.rest.MDSDClient;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.handlers.HandlerUtil;

public class DownloadPDF extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		FileDialog fd = new FileDialog (HandlerUtil.getActiveShell(event),
				SWT.SAVE);
		fd.setText("Select folder to save PDF");
		String[] filterExt = { "*.pdf" };
		fd.setFilterExtensions(filterExt);
		String selected = fd.open();

		if (selected == null)
			return null;

		MDSDClient mdsdClient = new MDSDClient();
		
		String pdfId = "6de7894f9c77115e62935ed673a51999";
		
		try {
			pdfId = (String) Toolkit.getDefaultToolkit()
			        .getSystemClipboard().getData(DataFlavor.stringFlavor);
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedFlavorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		mdsdClient.getPDF(pdfId, selected);
		
		return null;
	}

}