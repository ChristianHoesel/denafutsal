package hu.bme.mit.inf.mdsd.one.app.composites;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.RowData;

public class Penalties extends Dialog {

	private Composite visitor;
	private Composite home;
	private ScrolledComposite scrolledComposite;
	private Composite composite;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public Penalties(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new FormLayout());
		
		Label label = new Label(container, SWT.NONE);
		label.setFont(SWTResourceManager.getFont("Score Board", 66, SWT.NORMAL));
		label.setForeground(SWTResourceManager.getColor(255, 140, 0));
		label.setBackground(SWTResourceManager.getColor(0, 0, 0));
		label.setAlignment(SWT.CENTER);
		FormData fd_label = new FormData();
		fd_label.top = new FormAttachment(0);
		fd_label.left = new FormAttachment(0, 0);
		fd_label.right = new FormAttachment(100, 0);
		fd_label.height = 100;
		label.setLayoutData(fd_label);
		label.setText("0:0");
		
		Button homeValid = new Button(container, SWT.NONE);
		homeValid.setImage(SWTResourceManager.getImage(Penalties.class, "/icons/valid.png"));
		FormData fd_homeValid = new FormData();
		fd_homeValid.height = 45;
		fd_homeValid.width = 100;
		fd_homeValid.top = new FormAttachment(label, 6);
		fd_homeValid.left = new FormAttachment(label, 10, SWT.LEFT);
		homeValid.setLayoutData(fd_homeValid);
		
		Button homeWrong = new Button(container, SWT.NONE);
		homeWrong.setImage(SWTResourceManager.getImage(Penalties.class, "/icons/wrong.png"));
		FormData fd_homeWrong = new FormData();
		fd_homeWrong.height = 45;
		fd_homeWrong.width = 100;
		fd_homeWrong.top = new FormAttachment(label, 6);
		fd_homeWrong.left = new FormAttachment(homeValid, 6);
		homeWrong.setLayoutData(fd_homeWrong);
		homeWrong.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseUp(MouseEvent e) {
				Label lbl = new Label(home, SWT.None);
				lbl.setImage(SWTResourceManager.getImage(Penalties.class, "/icons/wrong.png"));
				home.update();
				home.redraw();
			}
			
			@Override
			public void mouseDown(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		Button visitorWrong = new Button(container, SWT.NONE);
		visitorWrong.setImage(SWTResourceManager.getImage(Penalties.class, "/icons/wrong.png"));
		FormData fd_visitorWrong = new FormData();
		fd_visitorWrong.height = 45;
		fd_visitorWrong.width = 100;
		fd_visitorWrong.top = new FormAttachment(label, 6);
		fd_visitorWrong.right = new FormAttachment(100, -10);
		visitorWrong.setLayoutData(fd_visitorWrong);
		
		Button visitorValid = new Button(container, SWT.NONE);
		visitorValid.setImage(SWTResourceManager.getImage(Penalties.class, "/icons/valid.png"));
		FormData fd_visitorValid = new FormData();
		fd_visitorValid.height = 45;
		fd_visitorValid.width = 100;
		fd_visitorValid.top = new FormAttachment(label, 6);
		fd_visitorValid.right = new FormAttachment(visitorWrong, -6);
		visitorValid.setLayoutData(fd_visitorValid);
		
		scrolledComposite = new ScrolledComposite(container, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		FormData fd_scrolledComposite = new FormData();
		fd_scrolledComposite.top = new FormAttachment(homeValid, 6);
		fd_scrolledComposite.left = new FormAttachment(0, 10);
		fd_scrolledComposite.right = new FormAttachment(100, -10);
		fd_scrolledComposite.bottom = new FormAttachment(100, -6);
		scrolledComposite.setLayoutData(fd_scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		composite = new Composite(scrolledComposite, SWT.NONE);
		composite.setLayout(new FormLayout());
		
		home = new Composite(composite, SWT.NONE);
		RowLayout rl_home = new RowLayout(SWT.VERTICAL);
		rl_home.center = true;
		rl_home.fill = true;
		home.setLayout(rl_home);
		FormData fd_home = new FormData();
		fd_home.top = new FormAttachment(0);
		fd_home.left = new FormAttachment(0);
		fd_home.right = new FormAttachment(50,0);
		home.setLayoutData(fd_home);
		
		visitor = new Composite(composite, SWT.NONE);
		visitor.setLayout(new RowLayout(SWT.HORIZONTAL));
		FormData fd_visitor = new FormData();
		fd_visitor.top = new FormAttachment(home, 0, SWT.TOP);
		fd_visitor.left = new FormAttachment(50);
		fd_visitor.right = new FormAttachment(100);
		visitor.setLayoutData(fd_visitor);
		scrolledComposite.setContent(composite);
		scrolledComposite.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(482, 471);
	}
}
