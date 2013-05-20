package hu.bme.mit.inf.mdsd.app.windows;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.ExpandBar;
import swing2swt.layout.BorderLayout;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Table;

public class FutsalScoreBoardApp {

	protected Shell shlFustalScoreboard;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_4;
	private Text text_3;
	private Text text_5;
	private Text text_6;
	private Text text_7;
	private Text text_8;
	private Text text_9;
	private Text text_10;
	private Text text_11;
	private Text text_12;
	private Text text_13;
	private Text text_14;
	private Text text_15;
	private Text text_16;
	private Text text_17;
	private Text text_18;
	private Text text_19;
	private Text text_20;
	private Text text_21;
	private Text text_22;
	private Text text_23;
	private Text text_24;
	private Text text_25;
	private Text text_26;
	private Text text_27;
	private Text text_28;
	private Text text_29;
	private Button button_5;
	private Button button_6;
	private Button button_7;
	private Button button_8;
	private Button button_9;
	private Button button_10;
	private Button button_11;
	private Text text_30;
	private Text text_31;
	private Text text_32;
	private Text text_33;
	private Text text_34;
	private Text text_35;
	private Text text_36;
	private Label lblStaff;
	private Text text_37;
	private Text text_38;
	private Text text_39;
	private Text text_40;
	private Text text_41;
	private Text text_42;
	private Text text_43;
	private Text text_44;
	private Text text_45;
	private Text text_46;
	private Text text_47;
	private Text text_48;
	private Text text_49;
	private Text text_50;
	private Text text_51;
	private Text text_52;
	private Combo combo;
	private Combo combo_1;
	private Combo combo_2;
	private Combo combo_3;
	private Combo combo_4;
	private Combo combo_5;
	private Combo combo_6;
	private Combo combo_7;
	private Composite composite_1;
	private Text text_53;
	private Label label;
	private Text text_54;
	private Text text_55;
	private Text text_56;
	private Text text_57;
	private Text text_58;
	private Text text_59;
	private Text text_60;
	private Text text_61;
	private Text text_62;
	private Text text_63;
	private Text text_64;
	private Text text_65;
	private Text text_66;
	private Text text_67;
	private Text text_68;
	private Button button_12;
	private Button button_13;
	private Button button_14;
	private Button button_15;
	private Button button_16;
	private Label label_1;
	private Text text_69;
	private Text text_70;
	private Text text_71;
	private Text text_72;
	private Text text_73;
	private Text text_74;
	private Text text_75;
	private Text text_76;
	private Text text_77;
	private Text text_78;
	private Text text_79;
	private Text text_80;
	private Text text_81;
	private Text text_82;
	private Button button_17;
	private Button button_18;
	private Button button_19;
	private Button button_20;
	private Button button_21;
	private Button button_22;
	private Button button_23;
	private Text text_83;
	private Text text_84;
	private Text text_85;
	private Text text_86;
	private Text text_87;
	private Text text_88;
	private Text text_89;
	private Label label_2;
	private Text text_90;
	private Text text_91;
	private Text text_92;
	private Text text_93;
	private Text text_94;
	private Text text_95;
	private Text text_96;
	private Text text_97;
	private Text text_98;
	private Text text_99;
	private Text text_100;
	private Text text_101;
	private Text text_102;
	private Text text_103;
	private Text text_104;
	private Text text_105;
	private Combo combo_8;
	private Combo combo_9;
	private Combo combo_10;
	private Combo combo_11;
	private Combo combo_12;
	private Combo combo_13;
	private Combo combo_14;
	private Combo combo_15;
	private ExpandBar expandBar_2;
	private ExpandItem xpndtmMatchDetails;
	private Composite composite_2;
	private Text text_106;
	private Label lblType;
	private Text text_107;
	private Text text_108;
	private Text text_109;
	private Text text_110;
	private Text text_111;
	private Table table;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			FutsalScoreBoardApp window = new FutsalScoreBoardApp();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlFustalScoreboard.open();
		shlFustalScoreboard.layout();
		while (!shlFustalScoreboard.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlFustalScoreboard = new Shell(SWT.CLOSE | SWT.TITLE | SWT.MIN | SWT.MAX);
		shlFustalScoreboard.setImage(SWTResourceManager.getImage(FutsalScoreBoardApp.class, "/hu/bme/mit/inf/mdsd/app/icons/1369093447_aerow_winter.png"));
		shlFustalScoreboard.setMinimumSize(new Point(1280, 920));
		shlFustalScoreboard.setSize(661, 620);
		shlFustalScoreboard.setText("Fustal Scoreboard");
		shlFustalScoreboard.setLayout(new BorderLayout(0, 0));
		
		Menu menu = new Menu(shlFustalScoreboard, SWT.BAR);
		shlFustalScoreboard.setMenuBar(menu);
		
		MenuItem mntmFile = new MenuItem(menu, SWT.CASCADE);
		mntmFile.setText("File");
		
		Menu menu_1 = new Menu(mntmFile);
		mntmFile.setMenu(menu_1);
		
		MenuItem mntmOpen = new MenuItem(menu_1, SWT.NONE);
		mntmOpen.setText("Open");
		
		MenuItem mntmSave = new MenuItem(menu_1, SWT.NONE);
		mntmSave.setText("Save");
		
		new MenuItem(menu_1, SWT.SEPARATOR);
		
		MenuItem mntmQuit = new MenuItem(menu_1, SWT.NONE);
		mntmQuit.setText("Quit");
		
		MenuItem mntmView = new MenuItem(menu, SWT.CASCADE);
		mntmView.setText("View");
		
		Menu menu_2 = new Menu(mntmView);
		mntmView.setMenu(menu_2);
		
		new MenuItem(menu_2, SWT.SEPARATOR);
		
		MenuItem mntmPreferences = new MenuItem(menu_2, SWT.NONE);
		mntmPreferences.setText("Preferences");
		
		MenuItem mntmHelp = new MenuItem(menu, SWT.CASCADE);
		mntmHelp.setText("Help");
		
		Menu menu_3 = new Menu(mntmHelp);
		mntmHelp.setMenu(menu_3);
		
		MenuItem mntmHelpContents = new MenuItem(menu_3, SWT.NONE);
		mntmHelpContents.setText("Help Contents");
		
		new MenuItem(menu_3, SWT.SEPARATOR);
		
		MenuItem mntmAboutUs = new MenuItem(menu_3, SWT.NONE);
		mntmAboutUs.setText("About Us");
		
		Composite mainComposite = new Composite(shlFustalScoreboard, SWT.NONE);
		mainComposite.setLayoutData(BorderLayout.CENTER);
		mainComposite.setLayout(new FormLayout());
		
		ExpandBar expandBar = new ExpandBar(mainComposite, SWT.NONE);
		FormData fd_expandBar = new FormData();
		fd_expandBar.top = new FormAttachment(0);
		fd_expandBar.left = new FormAttachment(0);
		fd_expandBar.right = new FormAttachment(0, 332);
		expandBar.setLayoutData(fd_expandBar);
		
		ExpandItem xpndtmHome = new ExpandItem(expandBar, SWT.NONE);
		xpndtmHome.setExpanded(true);
		xpndtmHome.setText("Home");
		
		Composite composite = new Composite(expandBar, SWT.NONE);
		xpndtmHome.setControl(composite);
		xpndtmHome.setHeight(640);
		composite.setLayout(new FormLayout());
		
		text = new Text(composite, SWT.BORDER);
		FormData fd_text = new FormData();
		fd_text.left = new FormAttachment(0, 10);
		fd_text.right = new FormAttachment(100, -10);
		text.setLayoutData(fd_text);
		
		Label lblStartingLine = new Label(composite, SWT.NONE);
		fd_text.bottom = new FormAttachment(lblStartingLine, -8);
		FormData fd_lblStartingLine = new FormData();
		fd_lblStartingLine.right = new FormAttachment(0, 142);
		fd_lblStartingLine.top = new FormAttachment(0, 39);
		fd_lblStartingLine.left = new FormAttachment(0, 10);
		lblStartingLine.setLayoutData(fd_lblStartingLine);
		lblStartingLine.setText("Starting line");
		
		text_1 = new Text(composite, SWT.BORDER);
		FormData fd_text_1 = new FormData();
		fd_text_1.left = new FormAttachment(0, 10);
		fd_text_1.top = new FormAttachment(lblStartingLine, 6);
		text_1.setLayoutData(fd_text_1);
		
		text_2 = new Text(composite, SWT.BORDER);
		FormData fd_text_2 = new FormData();
		fd_text_2.top = new FormAttachment(text_1, 0, SWT.TOP);
		text_2.setLayoutData(fd_text_2);
		
		text_4 = new Text(composite, SWT.BORDER);
		FormData fd_text_4 = new FormData();
		fd_text_4.left = new FormAttachment(0, 10);
		text_4.setLayoutData(fd_text_4);
		
		text_3 = new Text(composite, SWT.BORDER);
		FormData fd_text_3 = new FormData();
		fd_text_3.top = new FormAttachment(text_4, 0, SWT.TOP);
		fd_text_3.left = new FormAttachment(text_2, 0, SWT.LEFT);
		text_3.setLayoutData(fd_text_3);
		
		text_5 = new Text(composite, SWT.BORDER);
		fd_text_4.bottom = new FormAttachment(text_5, -6);
		FormData fd_text_5 = new FormData();
		fd_text_5.left = new FormAttachment(0, 10);
		fd_text_5.top = new FormAttachment(0, 114);
		text_5.setLayoutData(fd_text_5);
		
		text_6 = new Text(composite, SWT.BORDER);
		FormData fd_text_6 = new FormData();
		fd_text_6.top = new FormAttachment(text_3, 6);
		fd_text_6.right = new FormAttachment(text_2, 0, SWT.RIGHT);
		text_6.setLayoutData(fd_text_6);
		
		text_7 = new Text(composite, SWT.BORDER);
		FormData fd_text_7 = new FormData();
		fd_text_7.top = new FormAttachment(text_5, 6);
		fd_text_7.right = new FormAttachment(lblStartingLine, 0, SWT.RIGHT);
		fd_text_7.left = new FormAttachment(0, 10);
		text_7.setLayoutData(fd_text_7);
		
		text_8 = new Text(composite, SWT.BORDER);
		FormData fd_text_8 = new FormData();
		fd_text_8.top = new FormAttachment(text_6, 6);
		fd_text_8.right = new FormAttachment(text_2, 0, SWT.RIGHT);
		text_8.setLayoutData(fd_text_8);
		
		text_9 = new Text(composite, SWT.BORDER);
		FormData fd_text_9 = new FormData();
		fd_text_9.right = new FormAttachment(text, 0, SWT.RIGHT);
		text_9.setLayoutData(fd_text_9);
		
		text_10 = new Text(composite, SWT.BORDER);
		fd_text_9.bottom = new FormAttachment(text_10, -6);
		fd_text_9.left = new FormAttachment(0, 279);
		FormData fd_text_10 = new FormData();
		fd_text_10.top = new FormAttachment(0, 87);
		fd_text_10.right = new FormAttachment(text, 0, SWT.RIGHT);
		text_10.setLayoutData(fd_text_10);
		
		text_11 = new Text(composite, SWT.BORDER);
		fd_text_10.left = new FormAttachment(0, 279);
		FormData fd_text_11 = new FormData();
		fd_text_11.top = new FormAttachment(text_10, 6);
		fd_text_11.right = new FormAttachment(text, 0, SWT.RIGHT);
		text_11.setLayoutData(fd_text_11);
		
		text_12 = new Text(composite, SWT.BORDER);
		fd_text_11.left = new FormAttachment(0, 279);
		FormData fd_text_12 = new FormData();
		fd_text_12.top = new FormAttachment(text_11, 6);
		fd_text_12.right = new FormAttachment(text, 0, SWT.RIGHT);
		text_12.setLayoutData(fd_text_12);
		
		text_13 = new Text(composite, SWT.BORDER);
		FormData fd_text_13 = new FormData();
		fd_text_13.right = new FormAttachment(100, -62);
		text_13.setLayoutData(fd_text_13);
		
		text_14 = new Text(composite, SWT.BORDER);
		fd_text_13.top = new FormAttachment(text_14, 0, SWT.TOP);
		fd_text_12.left = new FormAttachment(0, 279);
		FormData fd_text_14 = new FormData();
		fd_text_14.left = new FormAttachment(0, 279);
		fd_text_14.right = new FormAttachment(100, -10);
		fd_text_14.top = new FormAttachment(text_12, 6);
		text_14.setLayoutData(fd_text_14);
		
		text_15 = new Text(composite, SWT.BORDER);
		FormData fd_text_15 = new FormData();
		fd_text_15.left = new FormAttachment(0, 10);
		fd_text_15.top = new FormAttachment(text_7, 6);
		text_15.setLayoutData(fd_text_15);
		
		Button button = new Button(composite, SWT.CHECK);
		button.setSelection(true);
		button.setEnabled(false);
		fd_text_1.right = new FormAttachment(button, -6);
		FormData fd_button = new FormData();
		fd_button.top = new FormAttachment(text_1, 2, SWT.TOP);
		fd_button.left = new FormAttachment(0, 148);
		button.setLayoutData(fd_button);
		
		Button button_1 = new Button(composite, SWT.CHECK);
		button_1.setEnabled(false);
		fd_text_4.right = new FormAttachment(button_1, -6);
		FormData fd_button_1 = new FormData();
		fd_button_1.top = new FormAttachment(text_4, 2, SWT.TOP);
		fd_button_1.left = new FormAttachment(0, 148);
		button_1.setLayoutData(fd_button_1);
		
		Button button_2 = new Button(composite, SWT.CHECK);
		button_2.setEnabled(false);
		fd_text_5.right = new FormAttachment(button_2, -6);
		FormData fd_button_2 = new FormData();
		fd_button_2.top = new FormAttachment(text_5, 2, SWT.TOP);
		fd_button_2.left = new FormAttachment(0, 148);
		button_2.setLayoutData(fd_button_2);
		
		Button button_3 = new Button(composite, SWT.CHECK);
		button_3.setEnabled(false);
		FormData fd_button_3 = new FormData();
		fd_button_3.top = new FormAttachment(text_7, 2, SWT.TOP);
		fd_button_3.left = new FormAttachment(text_7, 6);
		button_3.setLayoutData(fd_button_3);
		
		Button button_4 = new Button(composite, SWT.CHECK);
		button_4.setEnabled(false);
		fd_text_15.right = new FormAttachment(button_4, -6);
		FormData fd_button_4 = new FormData();
		fd_button_4.top = new FormAttachment(button_3, 11);
		fd_button_4.left = new FormAttachment(0, 148);
		button_4.setLayoutData(fd_button_4);
		
		Label lblSubstitutes = new Label(composite, SWT.NONE);
		FormData fd_lblSubstitutes = new FormData();
		fd_lblSubstitutes.left = new FormAttachment(0, 10);
		fd_lblSubstitutes.top = new FormAttachment(text_15, 6);
		lblSubstitutes.setLayoutData(fd_lblSubstitutes);
		lblSubstitutes.setText("Substitutes");
		
		text_16 = new Text(composite, SWT.BORDER);
		FormData fd_text_16 = new FormData();
		fd_text_16.left = new FormAttachment(0, 10);
		fd_text_16.top = new FormAttachment(lblSubstitutes, 6);
		text_16.setLayoutData(fd_text_16);
		
		text_17 = new Text(composite, SWT.BORDER);
		FormData fd_text_17 = new FormData();
		fd_text_17.left = new FormAttachment(0, 10);
		fd_text_17.top = new FormAttachment(text_16, 6);
		text_17.setLayoutData(fd_text_17);
		
		text_18 = new Text(composite, SWT.BORDER);
		FormData fd_text_18 = new FormData();
		fd_text_18.left = new FormAttachment(0, 10);
		fd_text_18.top = new FormAttachment(text_17, 6);
		text_18.setLayoutData(fd_text_18);
		
		text_19 = new Text(composite, SWT.BORDER);
		FormData fd_text_19 = new FormData();
		fd_text_19.left = new FormAttachment(0, 10);
		fd_text_19.top = new FormAttachment(text_18, 6);
		text_19.setLayoutData(fd_text_19);
		
		text_20 = new Text(composite, SWT.BORDER);
		FormData fd_text_20 = new FormData();
		fd_text_20.right = new FormAttachment(lblStartingLine, 0, SWT.RIGHT);
		fd_text_20.top = new FormAttachment(text_19, 6);
		fd_text_20.left = new FormAttachment(0, 10);
		text_20.setLayoutData(fd_text_20);
		
		text_21 = new Text(composite, SWT.BORDER);
		FormData fd_text_21 = new FormData();
		fd_text_21.right = new FormAttachment(lblStartingLine, 0, SWT.RIGHT);
		fd_text_21.top = new FormAttachment(text_20, 6);
		fd_text_21.left = new FormAttachment(0, 10);
		text_21.setLayoutData(fd_text_21);
		
		text_22 = new Text(composite, SWT.BORDER);
		FormData fd_text_22 = new FormData();
		fd_text_22.right = new FormAttachment(lblStartingLine, 0, SWT.RIGHT);
		fd_text_22.top = new FormAttachment(text_21, 6);
		fd_text_22.left = new FormAttachment(0, 10);
		text_22.setLayoutData(fd_text_22);
		
		text_23 = new Text(composite, SWT.BORDER);
		fd_text_2.right = new FormAttachment(100, -62);
		FormData fd_text_23 = new FormData();
		fd_text_23.top = new FormAttachment(text_16, 0, SWT.TOP);
		text_23.setLayoutData(fd_text_23);
		
		text_24 = new Text(composite, SWT.BORDER);
		FormData fd_text_24 = new FormData();
		fd_text_24.top = new FormAttachment(text_17, 0, SWT.TOP);
		fd_text_24.left = new FormAttachment(text_23, 0, SWT.LEFT);
		text_24.setLayoutData(fd_text_24);
		
		text_25 = new Text(composite, SWT.BORDER);
		FormData fd_text_25 = new FormData();
		fd_text_25.top = new FormAttachment(text_18, 0, SWT.TOP);
		fd_text_25.right = new FormAttachment(text_23, 0, SWT.RIGHT);
		text_25.setLayoutData(fd_text_25);
		
		text_26 = new Text(composite, SWT.BORDER);
		FormData fd_text_26 = new FormData();
		fd_text_26.top = new FormAttachment(text_19, 0, SWT.TOP);
		fd_text_26.right = new FormAttachment(text_23, 0, SWT.RIGHT);
		text_26.setLayoutData(fd_text_26);
		
		text_27 = new Text(composite, SWT.BORDER);
		FormData fd_text_27 = new FormData();
		fd_text_27.top = new FormAttachment(text_20, 0, SWT.TOP);
		fd_text_27.right = new FormAttachment(text_23, 0, SWT.RIGHT);
		text_27.setLayoutData(fd_text_27);
		
		text_28 = new Text(composite, SWT.BORDER);
		FormData fd_text_28 = new FormData();
		fd_text_28.top = new FormAttachment(text_21, 0, SWT.TOP);
		fd_text_28.right = new FormAttachment(text_23, 0, SWT.RIGHT);
		text_28.setLayoutData(fd_text_28);
		
		text_29 = new Text(composite, SWT.BORDER);
		FormData fd_text_29 = new FormData();
		fd_text_29.top = new FormAttachment(text_22, 0, SWT.TOP);
		fd_text_29.right = new FormAttachment(text_23, 0, SWT.RIGHT);
		text_29.setLayoutData(fd_text_29);
		
		button_5 = new Button(composite, SWT.CHECK);
		fd_text_16.right = new FormAttachment(button_5, -6);
		FormData fd_button_5 = new FormData();
		fd_button_5.top = new FormAttachment(text_16, 2, SWT.TOP);
		fd_button_5.left = new FormAttachment(button, 0, SWT.LEFT);
		button_5.setLayoutData(fd_button_5);
		
		button_6 = new Button(composite, SWT.CHECK);
		fd_text_17.right = new FormAttachment(button_6, -6);
		FormData fd_button_6 = new FormData();
		fd_button_6.top = new FormAttachment(text_17, 2, SWT.TOP);
		fd_button_6.left = new FormAttachment(button, 0, SWT.LEFT);
		button_6.setLayoutData(fd_button_6);
		
		button_7 = new Button(composite, SWT.CHECK);
		fd_text_18.right = new FormAttachment(button_7, -6);
		FormData fd_button_7 = new FormData();
		fd_button_7.top = new FormAttachment(text_18, 2, SWT.TOP);
		fd_button_7.left = new FormAttachment(button, 0, SWT.LEFT);
		button_7.setLayoutData(fd_button_7);
		
		button_8 = new Button(composite, SWT.CHECK);
		fd_text_19.right = new FormAttachment(button_8, -6);
		FormData fd_button_8 = new FormData();
		fd_button_8.top = new FormAttachment(text_19, 2, SWT.TOP);
		fd_button_8.left = new FormAttachment(button, 0, SWT.LEFT);
		button_8.setLayoutData(fd_button_8);
		
		button_9 = new Button(composite, SWT.CHECK);
		FormData fd_button_9 = new FormData();
		fd_button_9.top = new FormAttachment(text_20, 2, SWT.TOP);
		fd_button_9.left = new FormAttachment(button, 0, SWT.LEFT);
		button_9.setLayoutData(fd_button_9);
		
		button_10 = new Button(composite, SWT.CHECK);
		FormData fd_button_10 = new FormData();
		fd_button_10.top = new FormAttachment(text_21, 2, SWT.TOP);
		fd_button_10.left = new FormAttachment(button, 0, SWT.LEFT);
		button_10.setLayoutData(fd_button_10);
		
		button_11 = new Button(composite, SWT.CHECK);
		FormData fd_button_11 = new FormData();
		fd_button_11.top = new FormAttachment(text_22, 2, SWT.TOP);
		fd_button_11.left = new FormAttachment(button, 0, SWT.LEFT);
		button_11.setLayoutData(fd_button_11);
		
		text_30 = new Text(composite, SWT.BORDER);
		fd_text_23.right = new FormAttachment(100, -62);
		FormData fd_text_30 = new FormData();
		fd_text_30.top = new FormAttachment(text_16, 0, SWT.TOP);
		fd_text_30.left = new FormAttachment(text_9, 0, SWT.LEFT);
		fd_text_30.right = new FormAttachment(100, -10);
		text_30.setLayoutData(fd_text_30);
		
		text_31 = new Text(composite, SWT.BORDER);
		FormData fd_text_31 = new FormData();
		fd_text_31.top = new FormAttachment(text_17, 0, SWT.TOP);
		fd_text_31.right = new FormAttachment(text, 0, SWT.RIGHT);
		fd_text_31.left = new FormAttachment(text_9, 0, SWT.LEFT);
		text_31.setLayoutData(fd_text_31);
		
		text_32 = new Text(composite, SWT.BORDER);
		FormData fd_text_32 = new FormData();
		fd_text_32.top = new FormAttachment(text_18, 0, SWT.TOP);
		fd_text_32.right = new FormAttachment(text, 0, SWT.RIGHT);
		fd_text_32.left = new FormAttachment(text_9, 0, SWT.LEFT);
		text_32.setLayoutData(fd_text_32);
		
		text_33 = new Text(composite, SWT.BORDER);
		FormData fd_text_33 = new FormData();
		fd_text_33.top = new FormAttachment(text_19, 0, SWT.TOP);
		fd_text_33.right = new FormAttachment(text, 0, SWT.RIGHT);
		fd_text_33.left = new FormAttachment(text_9, 0, SWT.LEFT);
		text_33.setLayoutData(fd_text_33);
		
		text_34 = new Text(composite, SWT.BORDER);
		FormData fd_text_34 = new FormData();
		fd_text_34.left = new FormAttachment(text_27, 17);
		fd_text_34.right = new FormAttachment(100, -10);
		fd_text_34.top = new FormAttachment(text_20, 0, SWT.TOP);
		text_34.setLayoutData(fd_text_34);
		
		text_35 = new Text(composite, SWT.BORDER);
		FormData fd_text_35 = new FormData();
		fd_text_35.left = new FormAttachment(text_28, 17);
		fd_text_35.right = new FormAttachment(100, -10);
		fd_text_35.top = new FormAttachment(text_21, 0, SWT.TOP);
		text_35.setLayoutData(fd_text_35);
		
		text_36 = new Text(composite, SWT.BORDER);
		FormData fd_text_36 = new FormData();
		fd_text_36.left = new FormAttachment(text_29, 17);
		fd_text_36.right = new FormAttachment(100, -10);
		fd_text_36.top = new FormAttachment(text_22, 0, SWT.TOP);
		text_36.setLayoutData(fd_text_36);
		
		lblStaff = new Label(composite, SWT.NONE);
		FormData fd_lblStaff = new FormData();
		fd_lblStaff.top = new FormAttachment(text_22, 3);
		fd_lblStaff.left = new FormAttachment(0, 10);
		lblStaff.setLayoutData(fd_lblStaff);
		lblStaff.setText("Staff");
		
		text_37 = new Text(composite, SWT.BORDER);
		FormData fd_text_37 = new FormData();
		fd_text_37.right = new FormAttachment(lblStartingLine, 0, SWT.RIGHT);
		fd_text_37.top = new FormAttachment(lblStaff, 6);
		fd_text_37.left = new FormAttachment(text, 0, SWT.LEFT);
		text_37.setLayoutData(fd_text_37);
		
		text_38 = new Text(composite, SWT.BORDER);
		FormData fd_text_38 = new FormData();
		fd_text_38.right = new FormAttachment(lblStartingLine, 0, SWT.RIGHT);
		fd_text_38.top = new FormAttachment(text_37, 6);
		fd_text_38.left = new FormAttachment(text, 0, SWT.LEFT);
		text_38.setLayoutData(fd_text_38);
		
		text_39 = new Text(composite, SWT.BORDER);
		FormData fd_text_39 = new FormData();
		fd_text_39.right = new FormAttachment(lblStartingLine, 0, SWT.RIGHT);
		fd_text_39.top = new FormAttachment(text_38, 6);
		fd_text_39.left = new FormAttachment(text, 0, SWT.LEFT);
		text_39.setLayoutData(fd_text_39);
		
		text_40 = new Text(composite, SWT.BORDER);
		FormData fd_text_40 = new FormData();
		fd_text_40.right = new FormAttachment(lblStartingLine, 0, SWT.RIGHT);
		fd_text_40.top = new FormAttachment(text_39, 6);
		fd_text_40.left = new FormAttachment(text, 0, SWT.LEFT);
		text_40.setLayoutData(fd_text_40);
		
		text_41 = new Text(composite, SWT.BORDER);
		FormData fd_text_41 = new FormData();
		fd_text_41.right = new FormAttachment(lblStartingLine, 0, SWT.RIGHT);
		fd_text_41.top = new FormAttachment(text_40, 6);
		fd_text_41.left = new FormAttachment(text, 0, SWT.LEFT);
		text_41.setLayoutData(fd_text_41);
		
		text_42 = new Text(composite, SWT.BORDER);
		FormData fd_text_42 = new FormData();
		fd_text_42.right = new FormAttachment(lblStartingLine, 0, SWT.RIGHT);
		fd_text_42.top = new FormAttachment(text_41, 6);
		fd_text_42.left = new FormAttachment(text, 0, SWT.LEFT);
		text_42.setLayoutData(fd_text_42);
		
		text_43 = new Text(composite, SWT.BORDER);
		FormData fd_text_43 = new FormData();
		fd_text_43.right = new FormAttachment(lblStartingLine, 0, SWT.RIGHT);
		fd_text_43.top = new FormAttachment(text_42, 6);
		fd_text_43.left = new FormAttachment(text, 0, SWT.LEFT);
		text_43.setLayoutData(fd_text_43);
		
		text_44 = new Text(composite, SWT.BORDER);
		FormData fd_text_44 = new FormData();
		fd_text_44.right = new FormAttachment(lblStartingLine, 0, SWT.RIGHT);
		fd_text_44.top = new FormAttachment(text_43, 6);
		fd_text_44.left = new FormAttachment(text, 0, SWT.LEFT);
		text_44.setLayoutData(fd_text_44);
		
		text_45 = new Text(composite, SWT.BORDER);
		FormData fd_text_45 = new FormData();
		fd_text_45.top = new FormAttachment(text_37, 0, SWT.TOP);
		fd_text_45.left = new FormAttachment(button, 0, SWT.LEFT);
		text_45.setLayoutData(fd_text_45);
		
		text_46 = new Text(composite, SWT.BORDER);
		FormData fd_text_46 = new FormData();
		fd_text_46.top = new FormAttachment(text_37, 6);
		fd_text_46.left = new FormAttachment(button, 0, SWT.LEFT);
		text_46.setLayoutData(fd_text_46);
		
		text_47 = new Text(composite, SWT.BORDER);
		FormData fd_text_47 = new FormData();
		fd_text_47.top = new FormAttachment(text_39, 0, SWT.TOP);
		fd_text_47.left = new FormAttachment(button, 0, SWT.LEFT);
		text_47.setLayoutData(fd_text_47);
		
		text_48 = new Text(composite, SWT.BORDER);
		FormData fd_text_48 = new FormData();
		fd_text_48.top = new FormAttachment(text_40, 0, SWT.TOP);
		fd_text_48.left = new FormAttachment(button, 0, SWT.LEFT);
		text_48.setLayoutData(fd_text_48);
		
		text_49 = new Text(composite, SWT.BORDER);
		FormData fd_text_49 = new FormData();
		fd_text_49.top = new FormAttachment(text_41, 0, SWT.TOP);
		fd_text_49.left = new FormAttachment(button, 0, SWT.LEFT);
		text_49.setLayoutData(fd_text_49);
		
		text_50 = new Text(composite, SWT.BORDER);
		FormData fd_text_50 = new FormData();
		fd_text_50.top = new FormAttachment(text_41, 6);
		fd_text_50.left = new FormAttachment(button, 0, SWT.LEFT);
		text_50.setLayoutData(fd_text_50);
		
		text_51 = new Text(composite, SWT.BORDER);
		FormData fd_text_51 = new FormData();
		fd_text_51.top = new FormAttachment(text_43, 0, SWT.TOP);
		fd_text_51.left = new FormAttachment(button, 0, SWT.LEFT);
		text_51.setLayoutData(fd_text_51);
		
		text_52 = new Text(composite, SWT.BORDER);
		FormData fd_text_52 = new FormData();
		fd_text_52.top = new FormAttachment(text_44, 0, SWT.TOP);
		fd_text_52.left = new FormAttachment(button, 0, SWT.LEFT);
		text_52.setLayoutData(fd_text_52);
		
		combo = new Combo(composite, SWT.NONE);
		FormData fd_combo = new FormData();
		fd_combo.top = new FormAttachment(text_29, 24);
		fd_combo.left = new FormAttachment(text_45, 6);
		combo.setLayoutData(fd_combo);
		
		combo_1 = new Combo(composite, SWT.NONE);
		fd_combo.bottom = new FormAttachment(combo_1, -4);
		FormData fd_combo_1 = new FormData();
		fd_combo_1.top = new FormAttachment(text_38, 0, SWT.TOP);
		fd_combo_1.left = new FormAttachment(text_46, 6);
		combo_1.setLayoutData(fd_combo_1);
		
		combo_2 = new Combo(composite, SWT.NONE);
		FormData fd_combo_2 = new FormData();
		fd_combo_2.top = new FormAttachment(text_39, 0, SWT.TOP);
		fd_combo_2.left = new FormAttachment(text_47, 6);
		combo_2.setLayoutData(fd_combo_2);
		
		combo_3 = new Combo(composite, SWT.NONE);
		FormData fd_combo_3 = new FormData();
		fd_combo_3.top = new FormAttachment(text_40, 0, SWT.TOP);
		fd_combo_3.left = new FormAttachment(text_48, 6);
		combo_3.setLayoutData(fd_combo_3);
		
		combo_4 = new Combo(composite, SWT.NONE);
		FormData fd_combo_4 = new FormData();
		fd_combo_4.left = new FormAttachment(text_41, 88);
		fd_combo_4.top = new FormAttachment(text_41, 0, SWT.TOP);
		combo_4.setLayoutData(fd_combo_4);
		
		combo_5 = new Combo(composite, SWT.NONE);
		FormData fd_combo_5 = new FormData();
		fd_combo_5.top = new FormAttachment(text_42, 0, SWT.TOP);
		fd_combo_5.left = new FormAttachment(text_50, 6);
		combo_5.setLayoutData(fd_combo_5);
		
		combo_6 = new Combo(composite, SWT.NONE);
		FormData fd_combo_6 = new FormData();
		fd_combo_6.top = new FormAttachment(text_43, 0, SWT.TOP);
		fd_combo_6.left = new FormAttachment(text_51, 6);
		combo_6.setLayoutData(fd_combo_6);
		
		combo_7 = new Combo(composite, SWT.NONE);
		FormData fd_combo_7 = new FormData();
		fd_combo_7.top = new FormAttachment(text_44, 0, SWT.TOP);
		fd_combo_7.left = new FormAttachment(text_52, 6);
		combo_7.setLayoutData(fd_combo_7);
		
		ExpandBar expandBar_1 = new ExpandBar(mainComposite, SWT.NONE);
		FormData fd_expandBar_1 = new FormData();
		fd_expandBar_1.bottom = new FormAttachment(expandBar, 0, SWT.BOTTOM);
		fd_expandBar_1.top = new FormAttachment(0);
		fd_expandBar_1.left = new FormAttachment(100, -332);
		fd_expandBar_1.right = new FormAttachment(100);
		expandBar_1.setLayoutData(fd_expandBar_1);
		
		ExpandItem xpndtmVisitor = new ExpandItem(expandBar_1, SWT.NONE);
		xpndtmVisitor.setExpanded(true);
		xpndtmVisitor.setText("Visitor");
		
		composite_1 = new Composite(expandBar_1, SWT.NONE);
		xpndtmVisitor.setControl(composite_1);
		composite_1.setLayout(new FormLayout());
		
		text_53 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_53 = new FormData();
		fd_text_53.right = new FormAttachment(100, -10);
		fd_text_53.left = new FormAttachment(0, 10);
		text_53.setLayoutData(fd_text_53);
		
		label = new Label(composite_1, SWT.NONE);
		fd_text_53.bottom = new FormAttachment(label, -8);
		label.setText("Starting line");
		FormData fd_label = new FormData();
		fd_label.top = new FormAttachment(0, 39);
		fd_label.right = new FormAttachment(0, 142);
		fd_label.left = new FormAttachment(0, 10);
		label.setLayoutData(fd_label);
		
		text_54 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_54 = new FormData();
		fd_text_54.top = new FormAttachment(label, 6);
		fd_text_54.left = new FormAttachment(0, 10);
		text_54.setLayoutData(fd_text_54);
		
		text_55 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_55 = new FormData();
		fd_text_55.top = new FormAttachment(text_54, 0, SWT.TOP);
		text_55.setLayoutData(fd_text_55);
		
		text_56 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_56 = new FormData();
		fd_text_56.left = new FormAttachment(0, 10);
		text_56.setLayoutData(fd_text_56);
		
		text_57 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_57 = new FormData();
		fd_text_57.top = new FormAttachment(text_56, 0, SWT.TOP);
		fd_text_57.left = new FormAttachment(text_55, 0, SWT.LEFT);
		text_57.setLayoutData(fd_text_57);
		
		text_58 = new Text(composite_1, SWT.BORDER);
		fd_text_56.bottom = new FormAttachment(text_58, -6);
		FormData fd_text_58 = new FormData();
		fd_text_58.top = new FormAttachment(0, 114);
		fd_text_58.left = new FormAttachment(0, 10);
		text_58.setLayoutData(fd_text_58);
		
		text_59 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_59 = new FormData();
		fd_text_59.top = new FormAttachment(text_57, 6);
		fd_text_59.right = new FormAttachment(text_55, 0, SWT.RIGHT);
		text_59.setLayoutData(fd_text_59);
		
		text_60 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_60 = new FormData();
		fd_text_60.top = new FormAttachment(text_58, 6);
		fd_text_60.right = new FormAttachment(label, 0, SWT.RIGHT);
		fd_text_60.left = new FormAttachment(0, 10);
		text_60.setLayoutData(fd_text_60);
		
		text_61 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_61 = new FormData();
		fd_text_61.top = new FormAttachment(text_59, 6);
		fd_text_61.right = new FormAttachment(text_55, 0, SWT.RIGHT);
		text_61.setLayoutData(fd_text_61);
		
		text_62 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_62 = new FormData();
		fd_text_62.right = new FormAttachment(text_53, 0, SWT.RIGHT);
		text_62.setLayoutData(fd_text_62);
		
		text_63 = new Text(composite_1, SWT.BORDER);
		fd_text_62.bottom = new FormAttachment(text_63, -6);
		fd_text_62.left = new FormAttachment(text_63, 0, SWT.LEFT);
		FormData fd_text_63 = new FormData();
		fd_text_63.top = new FormAttachment(0, 87);
		fd_text_63.right = new FormAttachment(text_53, 0, SWT.RIGHT);
		text_63.setLayoutData(fd_text_63);
		
		text_64 = new Text(composite_1, SWT.BORDER);
		fd_text_63.left = new FormAttachment(text_64, 0, SWT.LEFT);
		FormData fd_text_64 = new FormData();
		fd_text_64.top = new FormAttachment(text_63, 6);
		fd_text_64.right = new FormAttachment(text_53, 0, SWT.RIGHT);
		text_64.setLayoutData(fd_text_64);
		
		text_65 = new Text(composite_1, SWT.BORDER);
		fd_text_64.left = new FormAttachment(text_65, 0, SWT.LEFT);
		FormData fd_text_65 = new FormData();
		fd_text_65.top = new FormAttachment(text_64, 6);
		fd_text_65.right = new FormAttachment(text_53, 0, SWT.RIGHT);
		text_65.setLayoutData(fd_text_65);
		
		text_66 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_66 = new FormData();
		fd_text_66.right = new FormAttachment(text_55, 0, SWT.RIGHT);
		text_66.setLayoutData(fd_text_66);
		
		text_67 = new Text(composite_1, SWT.BORDER);
		fd_text_66.top = new FormAttachment(text_67, 0, SWT.TOP);
		fd_text_65.left = new FormAttachment(text_67, 0, SWT.LEFT);
		FormData fd_text_67 = new FormData();
		fd_text_67.left = new FormAttachment(text_66, 17);
		fd_text_67.right = new FormAttachment(100, -10);
		fd_text_67.top = new FormAttachment(text_65, 6);
		text_67.setLayoutData(fd_text_67);
		
		text_68 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_68 = new FormData();
		fd_text_68.top = new FormAttachment(text_60, 6);
		fd_text_68.left = new FormAttachment(0, 10);
		text_68.setLayoutData(fd_text_68);
		
		button_12 = new Button(composite_1, SWT.CHECK);
		fd_text_54.right = new FormAttachment(button_12, -6);
		button_12.setSelection(true);
		button_12.setEnabled(false);
		FormData fd_button_12 = new FormData();
		fd_button_12.top = new FormAttachment(text_54, 2, SWT.TOP);
		fd_button_12.left = new FormAttachment(0, 148);
		button_12.setLayoutData(fd_button_12);
		
		button_13 = new Button(composite_1, SWT.CHECK);
		fd_text_56.right = new FormAttachment(button_13, -6);
		button_13.setEnabled(false);
		FormData fd_button_13 = new FormData();
		fd_button_13.top = new FormAttachment(text_56, 2, SWT.TOP);
		fd_button_13.left = new FormAttachment(0, 148);
		button_13.setLayoutData(fd_button_13);
		
		button_14 = new Button(composite_1, SWT.CHECK);
		fd_text_58.right = new FormAttachment(button_14, -6);
		button_14.setEnabled(false);
		FormData fd_button_14 = new FormData();
		fd_button_14.top = new FormAttachment(text_58, 2, SWT.TOP);
		fd_button_14.left = new FormAttachment(0, 148);
		button_14.setLayoutData(fd_button_14);
		
		button_15 = new Button(composite_1, SWT.CHECK);
		button_15.setEnabled(false);
		FormData fd_button_15 = new FormData();
		fd_button_15.top = new FormAttachment(text_60, 2, SWT.TOP);
		fd_button_15.left = new FormAttachment(text_60, 6);
		button_15.setLayoutData(fd_button_15);
		
		button_16 = new Button(composite_1, SWT.CHECK);
		fd_text_68.right = new FormAttachment(button_16, -6);
		button_16.setEnabled(false);
		FormData fd_button_16 = new FormData();
		fd_button_16.top = new FormAttachment(button_15, 11);
		fd_button_16.left = new FormAttachment(0, 148);
		button_16.setLayoutData(fd_button_16);
		
		label_1 = new Label(composite_1, SWT.NONE);
		label_1.setText("Substitutes");
		FormData fd_label_1 = new FormData();
		fd_label_1.top = new FormAttachment(text_68, 6);
		fd_label_1.left = new FormAttachment(0, 10);
		label_1.setLayoutData(fd_label_1);
		
		text_69 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_69 = new FormData();
		fd_text_69.top = new FormAttachment(label_1, 6);
		fd_text_69.left = new FormAttachment(0, 10);
		text_69.setLayoutData(fd_text_69);
		
		text_70 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_70 = new FormData();
		fd_text_70.top = new FormAttachment(text_69, 6);
		fd_text_70.left = new FormAttachment(0, 10);
		text_70.setLayoutData(fd_text_70);
		
		text_71 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_71 = new FormData();
		fd_text_71.top = new FormAttachment(text_70, 6);
		fd_text_71.left = new FormAttachment(0, 10);
		text_71.setLayoutData(fd_text_71);
		
		text_72 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_72 = new FormData();
		fd_text_72.top = new FormAttachment(text_71, 6);
		fd_text_72.left = new FormAttachment(0, 10);
		text_72.setLayoutData(fd_text_72);
		
		text_73 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_73 = new FormData();
		fd_text_73.top = new FormAttachment(text_72, 6);
		fd_text_73.right = new FormAttachment(label, 0, SWT.RIGHT);
		fd_text_73.left = new FormAttachment(0, 10);
		text_73.setLayoutData(fd_text_73);
		
		text_74 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_74 = new FormData();
		fd_text_74.top = new FormAttachment(text_73, 6);
		fd_text_74.right = new FormAttachment(label, 0, SWT.RIGHT);
		fd_text_74.left = new FormAttachment(0, 10);
		text_74.setLayoutData(fd_text_74);
		
		text_75 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_75 = new FormData();
		fd_text_75.top = new FormAttachment(text_74, 6);
		fd_text_75.right = new FormAttachment(label, 0, SWT.RIGHT);
		fd_text_75.left = new FormAttachment(0, 10);
		text_75.setLayoutData(fd_text_75);
		
		text_76 = new Text(composite_1, SWT.BORDER);
		fd_text_55.right = new FormAttachment(text_76, 0, SWT.RIGHT);
		FormData fd_text_76 = new FormData();
		fd_text_76.top = new FormAttachment(text_69, 0, SWT.TOP);
		text_76.setLayoutData(fd_text_76);
		
		text_77 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_77 = new FormData();
		fd_text_77.top = new FormAttachment(text_70, 0, SWT.TOP);
		fd_text_77.left = new FormAttachment(text_76, 0, SWT.LEFT);
		text_77.setLayoutData(fd_text_77);
		
		text_78 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_78 = new FormData();
		fd_text_78.top = new FormAttachment(text_71, 0, SWT.TOP);
		fd_text_78.right = new FormAttachment(text_76, 0, SWT.RIGHT);
		text_78.setLayoutData(fd_text_78);
		
		text_79 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_79 = new FormData();
		fd_text_79.top = new FormAttachment(text_72, 0, SWT.TOP);
		fd_text_79.right = new FormAttachment(text_76, 0, SWT.RIGHT);
		text_79.setLayoutData(fd_text_79);
		
		text_80 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_80 = new FormData();
		fd_text_80.top = new FormAttachment(text_73, 0, SWT.TOP);
		fd_text_80.right = new FormAttachment(text_76, 0, SWT.RIGHT);
		text_80.setLayoutData(fd_text_80);
		
		text_81 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_81 = new FormData();
		fd_text_81.top = new FormAttachment(text_74, 0, SWT.TOP);
		fd_text_81.right = new FormAttachment(text_76, 0, SWT.RIGHT);
		text_81.setLayoutData(fd_text_81);
		
		text_82 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_82 = new FormData();
		fd_text_82.top = new FormAttachment(text_75, 0, SWT.TOP);
		fd_text_82.right = new FormAttachment(text_76, 0, SWT.RIGHT);
		text_82.setLayoutData(fd_text_82);
		
		button_17 = new Button(composite_1, SWT.CHECK);
		fd_text_69.right = new FormAttachment(button_17, -6);
		FormData fd_button_17 = new FormData();
		fd_button_17.top = new FormAttachment(text_69, 2, SWT.TOP);
		fd_button_17.left = new FormAttachment(button_12, 0, SWT.LEFT);
		button_17.setLayoutData(fd_button_17);
		
		button_18 = new Button(composite_1, SWT.CHECK);
		fd_text_70.right = new FormAttachment(button_18, -6);
		FormData fd_button_18 = new FormData();
		fd_button_18.top = new FormAttachment(text_70, 2, SWT.TOP);
		fd_button_18.left = new FormAttachment(button_12, 0, SWT.LEFT);
		button_18.setLayoutData(fd_button_18);
		
		button_19 = new Button(composite_1, SWT.CHECK);
		fd_text_71.right = new FormAttachment(button_19, -6);
		FormData fd_button_19 = new FormData();
		fd_button_19.top = new FormAttachment(text_71, 2, SWT.TOP);
		fd_button_19.left = new FormAttachment(button_12, 0, SWT.LEFT);
		button_19.setLayoutData(fd_button_19);
		
		button_20 = new Button(composite_1, SWT.CHECK);
		fd_text_72.right = new FormAttachment(button_20, -6);
		FormData fd_button_20 = new FormData();
		fd_button_20.top = new FormAttachment(text_72, 2, SWT.TOP);
		fd_button_20.left = new FormAttachment(button_12, 0, SWT.LEFT);
		button_20.setLayoutData(fd_button_20);
		
		button_21 = new Button(composite_1, SWT.CHECK);
		FormData fd_button_21 = new FormData();
		fd_button_21.top = new FormAttachment(text_73, 2, SWT.TOP);
		fd_button_21.left = new FormAttachment(button_12, 0, SWT.LEFT);
		button_21.setLayoutData(fd_button_21);
		
		button_22 = new Button(composite_1, SWT.CHECK);
		FormData fd_button_22 = new FormData();
		fd_button_22.top = new FormAttachment(text_74, 2, SWT.TOP);
		fd_button_22.left = new FormAttachment(button_12, 0, SWT.LEFT);
		button_22.setLayoutData(fd_button_22);
		
		button_23 = new Button(composite_1, SWT.CHECK);
		FormData fd_button_23 = new FormData();
		fd_button_23.top = new FormAttachment(text_75, 2, SWT.TOP);
		fd_button_23.left = new FormAttachment(button_12, 0, SWT.LEFT);
		button_23.setLayoutData(fd_button_23);
		
		text_83 = new Text(composite_1, SWT.BORDER);
		fd_text_76.right = new FormAttachment(text_83, -17);
		FormData fd_text_83 = new FormData();
		fd_text_83.top = new FormAttachment(text_69, 0, SWT.TOP);
		fd_text_83.right = new FormAttachment(text_53, 0, SWT.RIGHT);
		fd_text_83.left = new FormAttachment(0, 279);
		text_83.setLayoutData(fd_text_83);
		
		text_84 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_84 = new FormData();
		fd_text_84.top = new FormAttachment(text_70, 0, SWT.TOP);
		fd_text_84.right = new FormAttachment(text_53, 0, SWT.RIGHT);
		fd_text_84.left = new FormAttachment(text_62, 0, SWT.LEFT);
		text_84.setLayoutData(fd_text_84);
		
		text_85 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_85 = new FormData();
		fd_text_85.left = new FormAttachment(text_78, 17);
		fd_text_85.right = new FormAttachment(100, -10);
		fd_text_85.top = new FormAttachment(text_71, 0, SWT.TOP);
		text_85.setLayoutData(fd_text_85);
		
		text_86 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_86 = new FormData();
		fd_text_86.top = new FormAttachment(text_72, 0, SWT.TOP);
		fd_text_86.right = new FormAttachment(text_53, 0, SWT.RIGHT);
		fd_text_86.left = new FormAttachment(text_62, 0, SWT.LEFT);
		text_86.setLayoutData(fd_text_86);
		
		text_87 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_87 = new FormData();
		fd_text_87.left = new FormAttachment(text_80, 17);
		fd_text_87.right = new FormAttachment(100, -10);
		fd_text_87.top = new FormAttachment(text_73, 0, SWT.TOP);
		text_87.setLayoutData(fd_text_87);
		
		text_88 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_88 = new FormData();
		fd_text_88.top = new FormAttachment(text_74, 0, SWT.TOP);
		fd_text_88.right = new FormAttachment(text_53, 0, SWT.RIGHT);
		fd_text_88.left = new FormAttachment(text_62, 0, SWT.LEFT);
		text_88.setLayoutData(fd_text_88);
		
		text_89 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_89 = new FormData();
		fd_text_89.top = new FormAttachment(text_75, 0, SWT.TOP);
		fd_text_89.right = new FormAttachment(text_53, 0, SWT.RIGHT);
		fd_text_89.left = new FormAttachment(text_62, 0, SWT.LEFT);
		text_89.setLayoutData(fd_text_89);
		
		label_2 = new Label(composite_1, SWT.NONE);
		label_2.setText("Staff");
		FormData fd_label_2 = new FormData();
		fd_label_2.top = new FormAttachment(text_75, 3);
		fd_label_2.left = new FormAttachment(0, 10);
		label_2.setLayoutData(fd_label_2);
		
		text_90 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_90 = new FormData();
		fd_text_90.top = new FormAttachment(label_2, 6);
		fd_text_90.right = new FormAttachment(label, 0, SWT.RIGHT);
		fd_text_90.left = new FormAttachment(text_53, 0, SWT.LEFT);
		text_90.setLayoutData(fd_text_90);
		
		text_91 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_91 = new FormData();
		fd_text_91.top = new FormAttachment(text_90, 6);
		fd_text_91.right = new FormAttachment(label, 0, SWT.RIGHT);
		fd_text_91.left = new FormAttachment(text_53, 0, SWT.LEFT);
		text_91.setLayoutData(fd_text_91);
		
		text_92 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_92 = new FormData();
		fd_text_92.top = new FormAttachment(text_91, 6);
		fd_text_92.right = new FormAttachment(label, 0, SWT.RIGHT);
		fd_text_92.left = new FormAttachment(text_53, 0, SWT.LEFT);
		text_92.setLayoutData(fd_text_92);
		
		text_93 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_93 = new FormData();
		fd_text_93.top = new FormAttachment(text_92, 6);
		fd_text_93.right = new FormAttachment(label, 0, SWT.RIGHT);
		fd_text_93.left = new FormAttachment(text_53, 0, SWT.LEFT);
		text_93.setLayoutData(fd_text_93);
		
		text_94 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_94 = new FormData();
		fd_text_94.top = new FormAttachment(text_93, 6);
		fd_text_94.right = new FormAttachment(label, 0, SWT.RIGHT);
		fd_text_94.left = new FormAttachment(text_53, 0, SWT.LEFT);
		text_94.setLayoutData(fd_text_94);
		
		text_95 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_95 = new FormData();
		fd_text_95.top = new FormAttachment(text_94, 6);
		fd_text_95.right = new FormAttachment(label, 0, SWT.RIGHT);
		fd_text_95.left = new FormAttachment(text_53, 0, SWT.LEFT);
		text_95.setLayoutData(fd_text_95);
		
		text_96 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_96 = new FormData();
		fd_text_96.top = new FormAttachment(text_95, 6);
		fd_text_96.right = new FormAttachment(label, 0, SWT.RIGHT);
		fd_text_96.left = new FormAttachment(text_53, 0, SWT.LEFT);
		text_96.setLayoutData(fd_text_96);
		
		text_97 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_97 = new FormData();
		fd_text_97.top = new FormAttachment(text_96, 6);
		fd_text_97.right = new FormAttachment(label, 0, SWT.RIGHT);
		fd_text_97.left = new FormAttachment(text_53, 0, SWT.LEFT);
		text_97.setLayoutData(fd_text_97);
		
		text_98 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_98 = new FormData();
		fd_text_98.top = new FormAttachment(text_90, 0, SWT.TOP);
		fd_text_98.left = new FormAttachment(button_12, 0, SWT.LEFT);
		text_98.setLayoutData(fd_text_98);
		
		text_99 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_99 = new FormData();
		fd_text_99.top = new FormAttachment(text_90, 6);
		fd_text_99.left = new FormAttachment(button_12, 0, SWT.LEFT);
		text_99.setLayoutData(fd_text_99);
		
		text_100 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_100 = new FormData();
		fd_text_100.top = new FormAttachment(text_92, 0, SWT.TOP);
		fd_text_100.left = new FormAttachment(button_12, 0, SWT.LEFT);
		text_100.setLayoutData(fd_text_100);
		
		text_101 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_101 = new FormData();
		fd_text_101.top = new FormAttachment(text_93, 0, SWT.TOP);
		fd_text_101.left = new FormAttachment(button_12, 0, SWT.LEFT);
		text_101.setLayoutData(fd_text_101);
		
		text_102 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_102 = new FormData();
		fd_text_102.top = new FormAttachment(text_94, 0, SWT.TOP);
		fd_text_102.left = new FormAttachment(button_12, 0, SWT.LEFT);
		text_102.setLayoutData(fd_text_102);
		
		text_103 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_103 = new FormData();
		fd_text_103.top = new FormAttachment(text_94, 6);
		fd_text_103.left = new FormAttachment(button_12, 0, SWT.LEFT);
		text_103.setLayoutData(fd_text_103);
		
		text_104 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_104 = new FormData();
		fd_text_104.top = new FormAttachment(text_96, 0, SWT.TOP);
		fd_text_104.left = new FormAttachment(button_12, 0, SWT.LEFT);
		text_104.setLayoutData(fd_text_104);
		
		text_105 = new Text(composite_1, SWT.BORDER);
		FormData fd_text_105 = new FormData();
		fd_text_105.top = new FormAttachment(text_97, 0, SWT.TOP);
		fd_text_105.left = new FormAttachment(button_12, 0, SWT.LEFT);
		text_105.setLayoutData(fd_text_105);
		
		combo_8 = new Combo(composite_1, SWT.NONE);
		FormData fd_combo_8 = new FormData();
		fd_combo_8.top = new FormAttachment(text_82, 24);
		fd_combo_8.left = new FormAttachment(text_98, 6);
		combo_8.setLayoutData(fd_combo_8);
		
		combo_9 = new Combo(composite_1, SWT.NONE);
		fd_combo_8.bottom = new FormAttachment(combo_9, -4);
		FormData fd_combo_9 = new FormData();
		fd_combo_9.top = new FormAttachment(text_91, 0, SWT.TOP);
		fd_combo_9.left = new FormAttachment(text_99, 6);
		combo_9.setLayoutData(fd_combo_9);
		
		combo_10 = new Combo(composite_1, SWT.NONE);
		FormData fd_combo_10 = new FormData();
		fd_combo_10.top = new FormAttachment(text_92, 0, SWT.TOP);
		fd_combo_10.left = new FormAttachment(text_100, 6);
		combo_10.setLayoutData(fd_combo_10);
		
		combo_11 = new Combo(composite_1, SWT.NONE);
		FormData fd_combo_11 = new FormData();
		fd_combo_11.top = new FormAttachment(text_93, 0, SWT.TOP);
		fd_combo_11.left = new FormAttachment(text_101, 6);
		combo_11.setLayoutData(fd_combo_11);
		
		combo_12 = new Combo(composite_1, SWT.NONE);
		FormData fd_combo_12 = new FormData();
		fd_combo_12.top = new FormAttachment(text_94, 0, SWT.TOP);
		fd_combo_12.left = new FormAttachment(text_102, 6);
		combo_12.setLayoutData(fd_combo_12);
		
		combo_13 = new Combo(composite_1, SWT.NONE);
		FormData fd_combo_13 = new FormData();
		fd_combo_13.top = new FormAttachment(text_95, 0, SWT.TOP);
		fd_combo_13.left = new FormAttachment(text_103, 6);
		combo_13.setLayoutData(fd_combo_13);
		
		combo_14 = new Combo(composite_1, SWT.NONE);
		FormData fd_combo_14 = new FormData();
		fd_combo_14.top = new FormAttachment(text_96, 0, SWT.TOP);
		fd_combo_14.left = new FormAttachment(text_104, 6);
		combo_14.setLayoutData(fd_combo_14);
		
		combo_15 = new Combo(composite_1, SWT.NONE);
		FormData fd_combo_15 = new FormData();
		fd_combo_15.top = new FormAttachment(text_97, 0, SWT.TOP);
		fd_combo_15.left = new FormAttachment(text_105, 6);
		combo_15.setLayoutData(fd_combo_15);
		xpndtmVisitor.setHeight(640);
		
		Composite composite_4 = new Composite(mainComposite, SWT.NONE);
		fd_expandBar.bottom = new FormAttachment(composite_4, 0, SWT.BOTTOM);
		composite_4.setLayout(new FormLayout());
		FormData fd_composite_4 = new FormData();
		fd_composite_4.left = new FormAttachment(expandBar);
		fd_composite_4.right = new FormAttachment(expandBar_1);
		fd_composite_4.bottom = new FormAttachment(100);
		fd_composite_4.top = new FormAttachment(0);
		composite_4.setLayoutData(fd_composite_4);
		
		Label label_3 = new Label(composite_4, SWT.CENTER);
		FormData fd_label_3 = new FormData();
		fd_label_3.top = new FormAttachment(0);
		fd_label_3.left = new FormAttachment(0);
		fd_label_3.right = new FormAttachment(100);
		label_3.setLayoutData(fd_label_3);
		label_3.setBackground(SWTResourceManager.getColor(0, 0, 0));
		label_3.setForeground(SWTResourceManager.getColor(255, 204, 0));
		label_3.setAlignment(SWT.CENTER);
		label_3.setFont(SWTResourceManager.getFont("Score Board", 90, SWT.NORMAL));
		label_3.setText("00:00");
		
		Label label_4 = new Label(composite_4, SWT.NONE);
		fd_label_3.bottom = new FormAttachment(label_4);
		FormData fd_label_4 = new FormData();
		fd_label_4.top = new FormAttachment(0, 113);
		fd_label_4.left = new FormAttachment(0);
		fd_label_4.right = new FormAttachment(100);
		label_4.setLayoutData(fd_label_4);
		label_4.setFont(SWTResourceManager.getFont("Score Board", 43, SWT.NORMAL));
		label_4.setAlignment(SWT.CENTER);
		label_4.setBackground(SWTResourceManager.getColor(0, 0, 0));
		label_4.setForeground(SWTResourceManager.getColor(255, 204, 0));
		label_4.setText("0:0");
		
		Button btnNewButton = new Button(composite_4, SWT.NONE);
		btnNewButton.setFont(SWTResourceManager.getFont("Arial Black", 20, SWT.NORMAL));
		btnNewButton.setText("0");
		btnNewButton.setImage(SWTResourceManager.getImage(FutsalScoreBoardApp.class, "/hu/bme/mit/inf/mdsd/app/icons/whistle.png"));
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		FormData fd_btnNewButton = new FormData();
		fd_btnNewButton.top = new FormAttachment(0, 255);
		fd_btnNewButton.left = new FormAttachment(0, 10);
		btnNewButton.setLayoutData(fd_btnNewButton);
		
		Button btnNewButton_1 = new Button(composite_4, SWT.NONE);
		btnNewButton_1.setFont(SWTResourceManager.getFont("Arial Black", 20, SWT.NORMAL));
		btnNewButton_1.setImage(SWTResourceManager.getImage(FutsalScoreBoardApp.class, "/hu/bme/mit/inf/mdsd/app/icons/whistle.png"));
		FormData fd_btnNewButton_1 = new FormData();
		fd_btnNewButton_1.bottom = new FormAttachment(btnNewButton, 0, SWT.BOTTOM);
		fd_btnNewButton_1.top = new FormAttachment(btnNewButton, 0, SWT.TOP);
		fd_btnNewButton_1.left = new FormAttachment(btnNewButton, 112);
		fd_btnNewButton_1.right = new FormAttachment(100, -10);
		btnNewButton_1.setLayoutData(fd_btnNewButton_1);
		btnNewButton_1.setText("0");
		
		Button btnNewButton_2 = new Button(composite_4, SWT.NONE);
		fd_btnNewButton.bottom = new FormAttachment(btnNewButton_2, -6);
		btnNewButton_2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_2.setImage(SWTResourceManager.getImage(FutsalScoreBoardApp.class, "/hu/bme/mit/inf/mdsd/app/icons/1369093953_Box_Yellow.png"));
		FormData fd_btnNewButton_2 = new FormData();
		fd_btnNewButton_2.left = new FormAttachment(0, 10);
		btnNewButton_2.setLayoutData(fd_btnNewButton_2);
		
		Button btnNewButton_3 = new Button(composite_4, SWT.NONE);
		fd_btnNewButton.right = new FormAttachment(100, -361);
		fd_btnNewButton_2.right = new FormAttachment(btnNewButton_3, -6);
		btnNewButton_3.setImage(SWTResourceManager.getImage(FutsalScoreBoardApp.class, "/hu/bme/mit/inf/mdsd/app/icons/1369093352_stop-red.png"));
		FormData fd_btnNewButton_3 = new FormData();
		fd_btnNewButton_3.left = new FormAttachment(0, 132);
		fd_btnNewButton_3.top = new FormAttachment(btnNewButton_2, -1, SWT.TOP);
		btnNewButton_3.setLayoutData(fd_btnNewButton_3);
		
		Button btnNewButton_4 = new Button(composite_4, SWT.NONE);
		fd_btnNewButton_3.right = new FormAttachment(100, -361);
		btnNewButton_4.setImage(SWTResourceManager.getImage(FutsalScoreBoardApp.class, "/hu/bme/mit/inf/mdsd/app/icons/1369093352_stop-red.png"));
		FormData fd_btnNewButton_4 = new FormData();
		fd_btnNewButton_4.bottom = new FormAttachment(btnNewButton_2, 0, SWT.BOTTOM);
		fd_btnNewButton_4.left = new FormAttachment(0, 361);
		btnNewButton_4.setLayoutData(fd_btnNewButton_4);
		
		Button btnNewButton_5 = new Button(composite_4, SWT.NONE);
		fd_btnNewButton_4.right = new FormAttachment(btnNewButton_5, -6);
		btnNewButton_5.setImage(SWTResourceManager.getImage(FutsalScoreBoardApp.class, "/hu/bme/mit/inf/mdsd/app/icons/1369093953_Box_Yellow.png"));
		FormData fd_btnNewButton_5 = new FormData();
		fd_btnNewButton_5.right = new FormAttachment(100, -9);
		fd_btnNewButton_5.left = new FormAttachment(0, 484);
		fd_btnNewButton_5.top = new FormAttachment(btnNewButton_2, 0, SWT.TOP);
		btnNewButton_5.setLayoutData(fd_btnNewButton_5);
		
		Button btnNewButton_6 = new Button(composite_4, SWT.NONE);
		fd_btnNewButton_2.bottom = new FormAttachment(100, -295);
		btnNewButton_6.setImage(SWTResourceManager.getImage(FutsalScoreBoardApp.class, "/hu/bme/mit/inf/mdsd/app/icons/1369093397_time_frame.png"));
		FormData fd_btnNewButton_6 = new FormData();
		fd_btnNewButton_6.top = new FormAttachment(btnNewButton_2, 6);
		fd_btnNewButton_6.left = new FormAttachment(0, 10);
		btnNewButton_6.setLayoutData(fd_btnNewButton_6);
		
		Button btnNewButton_7 = new Button(composite_4, SWT.NONE);
		fd_btnNewButton_6.right = new FormAttachment(btnNewButton_7, -7);
		btnNewButton_7.setImage(SWTResourceManager.getImage(FutsalScoreBoardApp.class, "/hu/bme/mit/inf/mdsd/app/icons/1369093447_aerow_winter.png"));
		FormData fd_btnNewButton_7 = new FormData();
		fd_btnNewButton_7.top = new FormAttachment(btnNewButton_3, 3);
		fd_btnNewButton_7.left = new FormAttachment(0, 133);
		btnNewButton_7.setLayoutData(fd_btnNewButton_7);
		
		Button btnNewButton_8 = new Button(composite_4, SWT.NONE);
		fd_btnNewButton_7.right = new FormAttachment(btnNewButton_8, -112);
		btnNewButton_8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton_8.setImage(SWTResourceManager.getImage(FutsalScoreBoardApp.class, "/hu/bme/mit/inf/mdsd/app/icons/1369093447_aerow_winter.png"));
		FormData fd_btnNewButton_8 = new FormData();
		fd_btnNewButton_8.left = new FormAttachment(0, 361);
		fd_btnNewButton_8.bottom = new FormAttachment(btnNewButton_6, 0, SWT.BOTTOM);
		fd_btnNewButton_8.top = new FormAttachment(btnNewButton_6, -2, SWT.TOP);
		btnNewButton_8.setLayoutData(fd_btnNewButton_8);
		
		Button btnNewButton_9 = new Button(composite_4, SWT.NONE);
		fd_btnNewButton_8.right = new FormAttachment(100, -132);
		btnNewButton_9.setImage(SWTResourceManager.getImage(FutsalScoreBoardApp.class, "/hu/bme/mit/inf/mdsd/app/icons/1369093397_time_frame.png"));
		FormData fd_btnNewButton_9 = new FormData();
		fd_btnNewButton_9.bottom = new FormAttachment(btnNewButton_6, 0, SWT.BOTTOM);
		fd_btnNewButton_9.top = new FormAttachment(btnNewButton_6, 0, SWT.TOP);
		fd_btnNewButton_9.left = new FormAttachment(btnNewButton_8, 6);
		fd_btnNewButton_9.right = new FormAttachment(100, -9);
		btnNewButton_9.setLayoutData(fd_btnNewButton_9);
		
		table = new Table(composite_4, SWT.BORDER | SWT.FULL_SELECTION);
		fd_btnNewButton_7.bottom = new FormAttachment(table, -5);
		fd_btnNewButton_6.bottom = new FormAttachment(100, -228);
		FormData fd_table = new FormData();
		fd_table.top = new FormAttachment(btnNewButton_6, 6);
		fd_table.bottom = new FormAttachment(100, -10);
		fd_table.left = new FormAttachment(0, 10);
		fd_table.right = new FormAttachment(100, -10);
		table.setLayoutData(fd_table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		Button btnNewButton_10 = new Button(composite_4, SWT.NONE);
		btnNewButton_10.setFont(SWTResourceManager.getFont("Score Board", 22, SWT.NORMAL));
		fd_label_4.bottom = new FormAttachment(100, -506);
		FormData fd_btnNewButton_10 = new FormData();
		fd_btnNewButton_10.bottom = new FormAttachment(btnNewButton, -6);
		fd_btnNewButton_10.right = new FormAttachment(label_3, -10, SWT.RIGHT);
		fd_btnNewButton_10.top = new FormAttachment(label_4, 6);
		fd_btnNewButton_10.left = new FormAttachment(btnNewButton, 0, SWT.LEFT);
		btnNewButton_10.setLayoutData(fd_btnNewButton_10);
		btnNewButton_10.setText("Start First Half");
		
		expandBar_2 = new ExpandBar(shlFustalScoreboard, SWT.NONE);
		expandBar_2.setLayoutData(BorderLayout.NORTH);
		
		xpndtmMatchDetails = new ExpandItem(expandBar_2, SWT.NONE);
		xpndtmMatchDetails.setExpanded(true);
		xpndtmMatchDetails.setText("Match Details");
		
		composite_2 = new Composite(expandBar_2, SWT.NONE);
		xpndtmMatchDetails.setControl(composite_2);
		xpndtmMatchDetails.setHeight(xpndtmMatchDetails.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		
		Label lblDate = new Label(composite_2, SWT.NONE);
		lblDate.setBounds(975, 42, 32, 15);
		lblDate.setText("Date");
		
		DateTime dateTime = new DateTime(composite_2, SWT.BORDER);
		dateTime.setBounds(1013, 38, 79, 24);
		
		Label lblAddress = new Label(composite_2, SWT.NONE);
		lblAddress.setBounds(958, 12, 49, 15);
		lblAddress.setText("Address");
		
		text_106 = new Text(composite_2, SWT.BORDER);
		text_106.setBounds(1013, 9, 233, 21);
		
		lblType = new Label(composite_2, SWT.NONE);
		lblType.setBounds(1105, 42, 32, 15);
		lblType.setText("Type");
		
		Combo combo_16 = new Combo(composite_2, SWT.NONE);
		combo_16.setBounds(1143, 39, 103, 23);
		
		text_107 = new Text(composite_2, SWT.BORDER);
		text_107.setBounds(67, 12, 140, 21);
		
		text_108 = new Text(composite_2, SWT.BORDER);
		text_108.setBounds(67, 40, 140, 21);
		
		text_109 = new Text(composite_2, SWT.BORDER);
		text_109.setBounds(280, 12, 140, 21);
		
		Label lblReferee = new Label(composite_2, SWT.NONE);
		lblReferee.setBounds(10, 12, 55, 15);
		lblReferee.setText("Referee");
		
		Label lblAssistant = new Label(composite_2, SWT.NONE);
		lblAssistant.setBounds(10, 43, 55, 15);
		lblAssistant.setText("Assistant");
		
		Label lblrdReferee = new Label(composite_2, SWT.NONE);
		lblrdReferee.setBounds(213, 12, 61, 15);
		lblrdReferee.setText("3rd referee");
		
		Label lblSupervisor = new Label(composite_2, SWT.NONE);
		lblSupervisor.setBounds(219, 43, 55, 15);
		lblSupervisor.setText("Supervisor");
		
		text_110 = new Text(composite_2, SWT.BORDER);
		text_110.setBounds(280, 40, 140, 21);
		
		ExpandBar expandBar_3 = new ExpandBar(shlFustalScoreboard, SWT.NONE);
		expandBar_3.setLayoutData(BorderLayout.SOUTH);
		
		ExpandItem xpndtmLogging = new ExpandItem(expandBar_3, SWT.NONE);
		xpndtmLogging.setExpanded(true);
		xpndtmLogging.setText("Logging");
		
		Composite composite_3 = new Composite(expandBar_3, SWT.NONE);
		xpndtmLogging.setControl(composite_3);
		xpndtmLogging.setHeight(xpndtmLogging.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		
		text_111 = new Text(composite_3, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		text_111.setEditable(false);
		text_111.setBounds(10, 10, 1236, 44);

	}
}
