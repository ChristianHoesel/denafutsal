package hu.bme.mit.inf.mdsd.one.app.commands;

import hu.bme.mit.inf.mdsd.one.app.composites.MainView;
import hu.bme.mit.inf.mdsd.one.app.management.ManageModelHelper;
import hu.bme.mit.inf.mdsd.one.app.management.ViewData;
import hu.bme.mit.inf.mdsd.one.rest.MDSDClient;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.FileNotFoundException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

public class UploadTex extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		Shell sh = HandlerUtil.getActiveShell(event);
		
		FileDialog fd = new FileDialog(HandlerUtil.getActiveShell(event),
				SWT.OPEN);
		fd.setText("Select TeX file");
		String[] filterExt = { "*.tex", "*.*" };
		fd.setFilterExtensions(filterExt);
		String selected = fd.open();

		if (selected == null)
			return null;

		IWorkbenchPage activePage = HandlerUtil.getActiveWorkbenchWindow(event)
				.getActivePage();
		//activePage.hideView(activePage.findView(MainView.ID));
		try {
			activePage.showView(MainView.ID);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String texId = "";
		
		MDSDClient mdsdClient = new MDSDClient();
		try {
			texId = mdsdClient.uploadHTML(selected);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(texId);

		MessageBox dialog = new MessageBox(sh, SWT.ICON_QUESTION | SWT.OK);
		dialog.setText("TeX uploaded");
		dialog.setMessage("The ID: " + texId);

		dialog.open();

		StringSelection stringSelection = new StringSelection(texId);
		Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
		clpbrd.setContents(stringSelection, null);
		
		return null;
	}
}
