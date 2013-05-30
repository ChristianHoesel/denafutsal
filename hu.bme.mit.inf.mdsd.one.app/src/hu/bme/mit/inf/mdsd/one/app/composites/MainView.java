package hu.bme.mit.inf.mdsd.one.app.composites;

import hu.bme.mit.inf.mdsd.one.app.management.IManageModel;
import hu.bme.mit.inf.mdsd.one.app.management.IManageStateChart;
import hu.bme.mit.inf.mdsd.one.app.management.ManageModel;
import hu.bme.mit.inf.mdsd.one.app.management.ManageStateChart;
import hu.bme.mit.inf.mdsd.one.app.management.ViewData;
import model.Match;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPartReference;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.wb.swt.SWTResourceManager;
//import org.eclipse.jface.action.IMenuManager;
//import org.eclipse.jface.action.IToolBarManager;

public class MainView extends ViewPart implements IPartListener2 {

	public static final String ID = "hu.bme.mit.inf.mdsd.one.app.composites.MainView"; //$NON-NLS-1$

	private IManageStateChart manageST;
	private IManageModel manageModel;

	private Text referee;
	private Text assistant;
	private Text supervisor;
	private Text third_referee;
	private Text address;
	private Text logging;
	private Text teamHome;
	private Text teamVisitor;

	private Text startH1N;
	private Text startH2N;
	private Text startH3N;
	private Text startH4N;
	private Text startH5N;
	private Text subH1N;
	private Text subH2N;
	private Text subH3N;
	private Text subH4N;
	private Text subH5N;
	private Text subH6N;
	private Text subH7N;
	private Text idH1Start;
	private Text idH2Start;
	private Text idH3Start;
	private Text idH4Start;
	private Text idH5Start;
	private Text idH1Sub;
	private Text idH2Sub;
	private Text idH3Sub;
	private Text idH4Sub;
	private Text idH5Sub;
	private Text idH6Sub;
	private Text idH7Sub;
	private Text shirtH1Start;
	private Text shirtH2Start;
	private Text shirtH3Start;
	private Text shirtH4Start;
	private Text shirtH5Start;
	private Text shirtH1Sub;
	private Text shirtH2Sub;
	private Text shirtH3Sub;
	private Text shirtH4Sub;
	private Text shirtH5Sub;
	private Text shirtH6Sub;
	private Text shirtH7Sub;

	private Text startV1N;
	private Text startV2N;
	private Text startV3N;
	private Text startV4N;
	private Text startV5N;
	private Text subV1N;
	private Text subV2N;
	private Text subV3N;
	private Text subV4N;
	private Text subV5N;
	private Text subV6N;
	private Text subV7N;
	private Text idV1Start;
	private Text idV2Start;
	private Text idV3Start;
	private Text idV4Start;
	private Text idV5Start;
	private Text idV1Sub;
	private Text idV2Sub;
	private Text idV3Sub;
	private Text idV4Sub;
	private Text idV5Sub;
	private Text idV6Sub;
	private Text idV7Sub;
	private Text shirtV1Start;
	private Text shirtV2Start;
	private Text shirtV3Start;
	private Text shirtV4Start;
	private Text shirtV5Start;
	private Text shirtV1Sub;
	private Text shirtV2Sub;
	private Text shirtV3Sub;
	private Text shirtV4Sub;
	private Text shirtV5Sub;
	private Text shirtV6Sub;
	private Text shirtV7Sub;

	private Label lblStaffHome;
	private Text staffH1N;
	private Text staffH2N;
	private Text staffH3N;
	private Text staffH4N;
	private Text staffH5N;
	private Text staffH6N;
	private Text staffH7N;
	private Text staffH8N;
	private Text idH1Staff;
	private Text idH2Staff;
	private Text idH3Staff;
	private Text idH4Staff;
	private Text idH5Staff;
	private Text idH6Staff;
	private Text idH7Staff;
	private Text idH8Staff;
	private Combo staffT1H;
	private Combo staffT2H;
	private Combo staffT3H;
	private Combo staffT4H;
	private Combo staffT5H;
	private Combo staffT6H;
	private Combo staffT7H;
	private Combo staffT8H;

	private Label lblStaffVisitor;
	private Text staffV1N;
	private Text staffV2N;
	private Text staffV3N;
	private Text staffV4N;
	private Text staffV5N;
	private Text staffV6N;
	private Text staffV7N;
	private Text staffV8N;
	private Text idV1Staff;
	private Text idV2Staff;
	private Text idV3Staff;
	private Text idV4Staff;
	private Text idV5Staff;
	private Text idV6Staff;
	private Text idV7Staff;
	private Text idV8Staff;
	private Combo staffT1V;
	private Combo staffT2V;
	private Combo staffT3V;
	private Combo staffT4V;
	private Combo staffT5V;
	private Combo staffT6V;
	private Combo staffT7V;
	private Combo staffT8V;
	private Label time;
	private Label score;
	private Button manageTimeBtn;
	private Button btnFaultHome;
	private Button btnFaultVisitor;
	private Button btnYellowHome;
	private Button btnRedHome;
	private Button btnYellowVisitor;
	private Button btnRedVisitor;
	private Button btnGoalVisitor;
	private Button btnTOVisitor;
	private Button btnGoalHome;
	private Button btnTOHome;
	private Table table;
	private Text matchId;
	private Composite compositeMiddle;

	private ScrolledComposite sc;

	private ExpandBar expandBarVisitor;

	private Combo agegroup;
	private Combo matchtype;

	private DateTime date;

	private Composite parent;

	private Label pHome;
	private Label pVisitor;

	public void disableManageBtn() {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				manageTimeBtn.setEnabled(false);
			}
		});
	}

	public void setBanTimes(final String home, final String visitor) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				pHome.setText(home);
				pVisitor.setText(visitor);
			}
		});
	}
	
	public void updateHomeFaultBtnText(final String text) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				btnFaultHome.setText(text);
			}
		});
	}

	public void updateVisitorFaultBtnText(final String text) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				btnFaultVisitor.setText(text);
			}
		});
	}

	public void modifyHomeTOs(final boolean isEnabled) {

		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				btnTOHome.setEnabled(isEnabled);
			}
		});
	}

	public void modifyVisitorTOs(final boolean isEnabled) {

		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				btnTOVisitor.setEnabled(isEnabled);
			}
		});
	}

	public void setTime(final int sec, final int ms) {

		Display.getDefault().syncExec(new Runnable() {
			public void run() {

				String sec_s = Integer.toString(sec);
				if (sec < 10)
					sec_s = "0" + sec_s;
				String ms_s = Integer.toString(ms);
				if (ms < 10)
					ms_s = "0" + ms_s;

				time.setText(sec_s + ":" + ms_s);

			}
		});
	}

	public void setScore(final int home, final int visitor) {

		Display.getDefault().syncExec(new Runnable() {
			public void run() {				
				score.setText(home + ":" + visitor);
			}
		});
	}

	public void setManageTimeButtonText(final String calculateManageTimeBtnText) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				if (!manageTimeBtn.getText().equals(calculateManageTimeBtnText))
					manageTimeBtn.setText(calculateManageTimeBtnText);
				manageTimeBtn.update();
				manageTimeBtn.redraw();
			}
		});
	}

	public void defaultHomeToBtnImage() {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				if (btnTOHome.getImage() == null) {
					btnTOHome.setImage(SWTResourceManager.getImage(
							MainView.class, "/icons/to.png"));
				}
				btnTOHome.update();
				btnTOHome.redraw();
			}
		});
	}

	public void defaultVisitorToBtnImage() {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				if (btnTOVisitor.getImage() == null) {
					btnTOVisitor.setImage(SWTResourceManager.getImage(
							MainView.class, "/icons/to.png"));
				}
				btnTOVisitor.update();
				btnTOVisitor.redraw();
			}
		});
	}

	public void changeHomeToBtnImage() {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				if (btnTOHome.getImage() == null) {
					btnTOHome.setImage(SWTResourceManager.getImage(
							MainView.class, "/icons/to.png"));
				} else {
					btnTOHome.setImage(null);
				}
				btnTOHome.update();
				btnTOHome.redraw();
			}
		});
	}

	public void changeVisitorToBtnImage() {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				if (btnTOVisitor.getImage() == null) {
					btnTOVisitor.setImage(SWTResourceManager.getImage(
							MainView.class, "/icons/to.png"));
				} else {
					btnTOVisitor.setImage(null);
				}
				btnTOVisitor.update();
				btnTOVisitor.redraw();
			}
		});
	}

	public void appendTextToLogging(final String text) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {

				logging.append("\n" + text);

			}
		});

	}

	public void setTextFromModel(final Text text, final String modelText) {
		Display.getDefault().syncExec(new Runnable() {
			public void run() {

				text.setText(modelText);

			}
		});
	}
	
	public void updateTable() {

		Display.getDefault().syncExec(new Runnable() {
			public void run() {
				table.removeAll();
				String[] titles = { "Perc", "Esemény", "Csapat", "Játékos" };
				for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
					TableColumn column = new TableColumn(table, SWT.NULL);
					column.setText(titles[loopIndex]);
				}

				for (int loopIndex = 0; loopIndex < manageModel.getEventList()
						.size(); loopIndex++) {
					TableItem item = new TableItem(table, SWT.NULL);
					item.setText(0,
							manageModel.getEventList().get(loopIndex)[0]);
					item.setText(1,
							manageModel.getEventList().get(loopIndex)[1]);
					item.setText(2,
							manageModel.getEventList().get(loopIndex)[2]);
					item.setText(3,
							manageModel.getEventList().get(loopIndex)[3]);

				}

				for (int loopIndex = 0; loopIndex < titles.length; loopIndex++) {
					table.getColumn(loopIndex).pack();
				}
			}
		});
	}

	public MainView() {
	}

	/**
	 * Create contents of the view part.
	 * 
	 * @param parent
	 */
	@Override
	public void createPartControl(Composite parent) {

		this.parent = parent;

		getSite().getPage().addPartListener(this);

		if (ViewData.instance().useModel())
			manageModel = new ManageModel(this, ViewData.instance().getModel());
		else
			manageModel = new ManageModel(this);

		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FormLayout());

		ExpandBar expandBarMatchData = new ExpandBar(container, SWT.NONE);
		FormData fd_expandBarMatchData = new FormData();
		fd_expandBarMatchData.height = 100;
		fd_expandBarMatchData.right = new FormAttachment(100, 0);
		fd_expandBarMatchData.top = new FormAttachment(0);
		fd_expandBarMatchData.left = new FormAttachment(0);
		expandBarMatchData.setLayoutData(fd_expandBarMatchData);
		{
			ExpandItem xpndtmMatchData = new ExpandItem(expandBarMatchData,
					SWT.NONE);
			xpndtmMatchData.setExpanded(true);
			xpndtmMatchData.setText(" Match Data");

			Composite composite = new Composite(expandBarMatchData, SWT.NONE);
			xpndtmMatchData.setControl(composite);
			xpndtmMatchData.setHeight(xpndtmMatchData.getControl().computeSize(
					SWT.DEFAULT, SWT.DEFAULT).y);
			composite.setLayout(new FormLayout());

			referee = new Text(composite, SWT.BORDER);
			referee.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					manageModel.setRefereeText(referee,
							"The referee's name is not valid!");
					appendTextToLogging(manageModel.getRefereeText());
				}
			});
			referee.setText(manageModel.getRefereeText());
			FormData fd_referee = new FormData();
			fd_referee.top = new FormAttachment(0, 10);
			fd_referee.left = new FormAttachment(0, 10);
			fd_referee.width = 100;
			referee.setLayoutData(fd_referee);

			assistant = new Text(composite, SWT.BORDER);
			assistant.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					manageModel.setAssistantText(assistant,
							"The assistant's name is not valid!");
					appendTextToLogging(manageModel.getAssistantText());
				}
			});
			assistant.setText(manageModel.getAssistantText());
			FormData fd_assistant = new FormData();
			fd_assistant.width = 100;
			fd_assistant.top = new FormAttachment(referee, 2);
			fd_assistant.left = new FormAttachment(referee, 0, SWT.LEFT);
			assistant.setLayoutData(fd_assistant);

			Label lblReferee = new Label(composite, SWT.NONE);
			FormData fd_lblReferee = new FormData();
			fd_lblReferee.top = new FormAttachment(referee, 2, SWT.TOP);
			fd_lblReferee.left = new FormAttachment(referee, 6);
			lblReferee.setLayoutData(fd_lblReferee);
			lblReferee.setText("Referee");

			Label lblAssistant = new Label(composite, SWT.NONE);
			FormData fd_lblAssistant = new FormData();
			fd_lblAssistant.top = new FormAttachment(assistant, 2, SWT.TOP);
			fd_lblAssistant.left = new FormAttachment(assistant, 6);
			lblAssistant.setLayoutData(fd_lblAssistant);
			lblAssistant.setText("Assistant");

			supervisor = new Text(composite, SWT.BORDER);
			supervisor.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					manageModel.setSupervisorText(supervisor, "TODO: ERROR");
					appendTextToLogging(manageModel.getSupervisorText());
				}
			});
			supervisor.setText(manageModel.getSupervisorText());

			FormData fd_supervisor = new FormData();
			fd_supervisor.width = 100;
			fd_supervisor.bottom = new FormAttachment(assistant, 0, SWT.BOTTOM);
			fd_supervisor.left = new FormAttachment(lblAssistant, 6);
			supervisor.setLayoutData(fd_supervisor);

			third_referee = new Text(composite, SWT.BORDER);
			third_referee.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					manageModel.setThirdRefereeRefereeText(third_referee,
							"TODO: ERROR");
					appendTextToLogging(manageModel
							.getThirdRefereeRefereeText());
				}
			});
			third_referee.setText(manageModel.getThirdRefereeRefereeText());
			FormData fd_third_referee = new FormData();
			fd_third_referee.width = 100;
			fd_third_referee.bottom = new FormAttachment(referee, 0, SWT.BOTTOM);
			fd_third_referee.left = new FormAttachment(supervisor, 0, SWT.LEFT);
			third_referee.setLayoutData(fd_third_referee);

			Label lblSupervisor = new Label(composite, SWT.NONE);
			FormData fd_lblSupervisor = new FormData();
			fd_lblSupervisor.top = new FormAttachment(lblAssistant, 2, SWT.TOP);
			fd_lblSupervisor.left = new FormAttachment(supervisor, 6);
			lblSupervisor.setLayoutData(fd_lblSupervisor);
			lblSupervisor.setText("Supervisor");

			Label lblThirdReferee = new Label(composite, SWT.NONE);
			FormData fd_lblThirdReferee = new FormData();
			fd_lblThirdReferee.top = new FormAttachment(referee, 2, SWT.TOP);
			fd_lblThirdReferee.left = new FormAttachment(third_referee, 6);
			lblThirdReferee.setLayoutData(fd_lblThirdReferee);
			lblThirdReferee.setText("Third Referee");

			address = new Text(composite, SWT.BORDER);
			address.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					manageModel.setAddressText(address, "TODO: ERROR");
					appendTextToLogging(manageModel.getAddressText());
				}
			});
			address.setText(manageModel.getAddressText());
			FormData fd_address = new FormData();
			fd_address.width = 164;
			fd_address.top = new FormAttachment(referee, 0, SWT.TOP);
			fd_address.right = new FormAttachment(100, -10);
			address.setLayoutData(fd_address);

			date = new DateTime(composite, SWT.BORDER);

			date.setDate(manageModel.getYearOfDate(),
					manageModel.getMonthOfDate(), manageModel.getDayOfDate());
			date.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					manageModel.setDateDateTime(date, "TODO: ERROR");
					appendTextToLogging(manageModel.getDateDateTime());
				}
			});

			FormData fd_date = new FormData();
			fd_date.top = new FormAttachment(assistant, 0, SWT.TOP);
			fd_date.right = new FormAttachment(address, 0, SWT.RIGHT);
			date.setLayoutData(fd_date);

			matchtype = new Combo(composite, SWT.NONE);
			matchtype.setItems(manageModel.getMatchTypeItems());

			matchtype.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					manageModel.setMatchTypeCombo(matchtype, "TODO: ERROR");
					appendTextToLogging(manageModel.getMatchTypeCombo());
				}
			});
			matchtype.select(manageModel.getMatchTypeSelection());

			FormData fd_matchtype = new FormData();
			fd_matchtype.left = new FormAttachment(address, 0, SWT.LEFT);
			fd_matchtype.top = new FormAttachment(assistant, 0, SWT.TOP);
			fd_matchtype.right = new FormAttachment(date, -6);
			matchtype.setLayoutData(fd_matchtype);

			Label lblAddress = new Label(composite, SWT.NONE);
			FormData fd_lblAddress = new FormData();
			fd_lblAddress.top = new FormAttachment(referee, 2, SWT.TOP);
			fd_lblAddress.right = new FormAttachment(address, -6);
			lblAddress.setLayoutData(fd_lblAddress);
			lblAddress.setText("Address");

			Label lblType = new Label(composite, SWT.NONE);
			FormData fd_lblType = new FormData();
			fd_lblType.top = new FormAttachment(assistant, 3, SWT.TOP);
			fd_lblType.right = new FormAttachment(matchtype, -6);
			lblType.setLayoutData(fd_lblType);
			lblType.setText("Type");

			agegroup = new Combo(composite, SWT.NONE);
			agegroup.setItems(manageModel.getAgeGroupItems());

			agegroup.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					manageModel.setAgeGroupCombo(agegroup, "TODO: ERROR");
					appendTextToLogging(manageModel.getAgeGroupCombo());
				}
			});
			agegroup.select(manageModel.getAgeGroupSelection());

			FormData fd_agegroup = new FormData();
			fd_agegroup.top = new FormAttachment(assistant, 0, SWT.TOP);
			agegroup.setLayoutData(fd_agegroup);

			Label lblAgeGroup = new Label(composite, SWT.NONE);
			fd_agegroup.left = new FormAttachment(lblAgeGroup, 6);
			FormData fd_lblAgeGroup = new FormData();
			fd_lblAgeGroup.right = new FormAttachment(100, -334);
			fd_lblAgeGroup.top = new FormAttachment(assistant, 3, SWT.TOP);
			lblAgeGroup.setLayoutData(fd_lblAgeGroup);
			lblAgeGroup.setText("Age Group");

			matchId = new Text(composite, SWT.BORDER);
			matchId.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					manageModel.setMatchIDText(matchId, "TODO: ERROR");
					appendTextToLogging(manageModel.getMatchIDText());
				}
			});
			matchId.setText(manageModel.getMatchIDText());
			fd_agegroup.right = new FormAttachment(100, -240);
			FormData fd_matchId = new FormData();
			fd_matchId.right = new FormAttachment(lblAddress, -6);
			fd_matchId.top = new FormAttachment(referee, 0, SWT.TOP);
			fd_matchId.width = 123;
			matchId.setLayoutData(fd_matchId);

			Label lblId = new Label(composite, SWT.NONE);
			FormData fd_lblId = new FormData();
			fd_lblId.top = new FormAttachment(referee, 3, SWT.TOP);
			fd_lblId.left = new FormAttachment(lblAgeGroup, 0, SWT.LEFT);
			lblId.setLayoutData(fd_lblId);
			lblId.setText("ID");
		}

		ExpandBar expandBarLogging = new ExpandBar(container, SWT.NONE);
		FormData fd_expandBarLogging = new FormData();
		fd_expandBarLogging.bottom = new FormAttachment(100);
		fd_expandBarLogging.left = new FormAttachment(0);
		fd_expandBarLogging.right = new FormAttachment(100);
		fd_expandBarLogging.height = 120;
		expandBarLogging.setLayoutData(fd_expandBarLogging);

		ExpandItem xpndtmLogging = new ExpandItem(expandBarLogging, SWT.NONE);
		xpndtmLogging.setExpanded(true);
		xpndtmLogging.setText("Logging");

		Composite compositeLogging = new Composite(expandBarLogging, SWT.NONE);
		xpndtmLogging.setControl(compositeLogging);
		xpndtmLogging.setHeight(90);
		compositeLogging.setLayout(new FormLayout());

		logging = new Text(compositeLogging, SWT.BORDER | SWT.READ_ONLY
				| SWT.V_SCROLL | SWT.MULTI);

		FormData fd_logging = new FormData();
		fd_logging.top = new FormAttachment(0, 10);
		fd_logging.left = new FormAttachment(0, 10);
		fd_logging.right = new FormAttachment(100, -10);
		fd_logging.bottom = new FormAttachment(100, -10);
		logging.setLayoutData(fd_logging);

		sc = new ScrolledComposite(container, SWT.V_SCROLL);
		sc.setLayout(new FormLayout());
		FormData fd_sCompositeMiddle = new FormData();
		fd_sCompositeMiddle.left = new FormAttachment(0);
		fd_sCompositeMiddle.right = new FormAttachment(100, 0);
		fd_sCompositeMiddle.top = new FormAttachment(expandBarMatchData, 0);
		fd_sCompositeMiddle.bottom = new FormAttachment(expandBarLogging, 0);
		sc.setLayoutData(fd_sCompositeMiddle);

		compositeMiddle = new Composite(sc, SWT.NONE);
		sc.setLayout(new FormLayout());
		sc.setContent(compositeMiddle);

		compositeMiddle.setLayout(new FormLayout());
		FormData fd_compositeMiddle = new FormData();
		fd_compositeMiddle.left = new FormAttachment(0);
		fd_compositeMiddle.right = new FormAttachment(100, 0);
		fd_compositeMiddle.top = new FormAttachment(0, 0);
		compositeMiddle.setLayoutData(fd_compositeMiddle);

		ExpandBar expandBarHome = new ExpandBar(compositeMiddle, SWT.NONE);
		FormData fd_expandBarHome = new FormData();
		fd_expandBarHome.top = new FormAttachment(0);
		fd_expandBarHome.left = new FormAttachment(0);
		fd_expandBarHome.bottom = new FormAttachment(100, 0);
		fd_expandBarHome.width = 290;
		expandBarHome.setLayoutData(fd_expandBarHome);

		ExpandItem xpndtmHome = new ExpandItem(expandBarHome, SWT.NONE);
		xpndtmHome.setExpanded(true);
		xpndtmHome.setText("Home");

		Composite compositeHome = new Composite(expandBarHome, SWT.NONE);
		xpndtmHome.setControl(compositeHome);
		compositeHome.setLayout(new FormLayout());

		Label lblTeamHome = new Label(compositeHome, SWT.NONE);
		FormData fd_lblTeamHome = new FormData();
		fd_lblTeamHome.top = new FormAttachment(0, 10);
		fd_lblTeamHome.left = new FormAttachment(0, 10);
		lblTeamHome.setLayoutData(fd_lblTeamHome);
		lblTeamHome.setText("Team");

		teamHome = new Text(compositeHome, SWT.BORDER);
		teamHome.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				manageModel.setTeamHomeText(teamHome, "TODO: ERROR");
				appendTextToLogging(manageModel.getTeamHomeText());
			}
		});
		teamHome.setText(manageModel.getTeamHomeText());
		FormData fd_teamHome = new FormData();
		fd_teamHome.top = new FormAttachment(lblTeamHome, -2, SWT.TOP);
		fd_teamHome.left = new FormAttachment(lblTeamHome, 6);
		fd_teamHome.right = new FormAttachment(100, -6);
		teamHome.setLayoutData(fd_teamHome);

		Label lblStartinglineHome = new Label(compositeHome, SWT.NONE);
		FormData fd_lblStartinglineHome = new FormData();
		fd_lblStartinglineHome.top = new FormAttachment(teamHome, 6);
		fd_lblStartinglineHome.left = new FormAttachment(lblTeamHome, 0,
				SWT.LEFT);
		lblStartinglineHome.setLayoutData(fd_lblStartinglineHome);
		lblStartinglineHome.setText("Starting line");

		startH1N = new Text(compositeHome, SWT.BORDER);
		startH1N.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setHNText(0, startH1N, "TODO: ERROR");
						appendTextToLogging(manageModel.getHNText(0));
					}
				});

			}
		});
		setTextFromModel(startH1N, manageModel.getHNText(0));
		
		FormData fd_startH1N = new FormData();
		fd_startH1N.width = 120;
		fd_startH1N.top = new FormAttachment(lblStartinglineHome, 6);
		fd_startH1N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		startH1N.setLayoutData(fd_startH1N);

		startH2N = new Text(compositeHome, SWT.BORDER);
		startH2N.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setHNText(1, startH2N, "TODO: ERROR");
						appendTextToLogging(manageModel.getHNText(1));
					}
				});

			}
		});
		setTextFromModel(startH2N, manageModel.getHNText(1));
		
		FormData fd_startH2N = new FormData();
		fd_startH2N.width = 120;
		fd_startH2N.top = new FormAttachment(startH1N, 6);
		fd_startH2N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		startH2N.setLayoutData(fd_startH2N);

		startH3N = new Text(compositeHome, SWT.BORDER);
		startH3N.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setHNText(2, startH3N, "TODO: ERROR");
						appendTextToLogging(manageModel.getHNText(2));
					}
				});

			}
		});
		setTextFromModel(startH3N, manageModel.getHNText(2));
		
		FormData fd_startH3N = new FormData();
		fd_startH3N.width = 120;
		fd_startH3N.top = new FormAttachment(startH2N, 6);
		fd_startH3N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		startH3N.setLayoutData(fd_startH3N);

		startH4N = new Text(compositeHome, SWT.BORDER);
		startH4N.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setHNText(3, startH4N, "TODO: ERROR");
						appendTextToLogging(manageModel.getHNText(3));
					}
				});

			}
		});
		setTextFromModel(startH4N, manageModel.getHNText(3));
		
		FormData fd_startH4N = new FormData();
		fd_startH4N.width = 120;
		fd_startH4N.top = new FormAttachment(startH3N, 6);
		fd_startH4N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		startH4N.setLayoutData(fd_startH4N);

		startH5N = new Text(compositeHome, SWT.BORDER);
		startH5N.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setHNText(4, startH5N, "TODO: ERROR");
						appendTextToLogging(manageModel.getHNText(4));
					}
				});

			}
		});
		setTextFromModel(startH5N, manageModel.getHNText(4));
		
		FormData fd_startH5N = new FormData();
		fd_startH5N.width = 120;
		fd_startH5N.top = new FormAttachment(startH4N, 6);
		fd_startH5N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		startH5N.setLayoutData(fd_startH5N);

		Button startGkH1 = new Button(compositeHome, SWT.CHECK);
		startGkH1.setSelection(true);
		startGkH1.setEnabled(false);
		FormData fd_startGkH1 = new FormData();
		fd_startGkH1.top = new FormAttachment(startH1N, 2, SWT.TOP);
		fd_startGkH1.left = new FormAttachment(startH1N, 6);
		startGkH1.setLayoutData(fd_startGkH1);

		Button startGkH2 = new Button(compositeHome, SWT.CHECK);
		startGkH2.setEnabled(false);
		FormData fd_startGkH2 = new FormData();
		fd_startGkH2.top = new FormAttachment(startH2N, 2, SWT.TOP);
		fd_startGkH2.left = new FormAttachment(startH2N, 6);
		startGkH2.setLayoutData(fd_startGkH2);

		Button startGkH3 = new Button(compositeHome, SWT.CHECK);
		startGkH3.setEnabled(false);
		FormData fd_startGkH3 = new FormData();
		fd_startGkH3.top = new FormAttachment(startH3N, 2, SWT.TOP);
		fd_startGkH3.left = new FormAttachment(startH3N, 6);
		startGkH3.setLayoutData(fd_startGkH3);

		Button startGkH4 = new Button(compositeHome, SWT.CHECK);
		startGkH4.setEnabled(false);
		FormData fd_startGkH4 = new FormData();
		fd_startGkH4.top = new FormAttachment(startH4N, 2, SWT.TOP);
		fd_startGkH4.left = new FormAttachment(startH4N, 6);
		startGkH4.setLayoutData(fd_startGkH4);

		Button startGkH5 = new Button(compositeHome, SWT.CHECK);
		startGkH5.setEnabled(false);
		FormData fd_startGkH5 = new FormData();
		fd_startGkH5.top = new FormAttachment(startH5N, 2, SWT.TOP);
		fd_startGkH5.left = new FormAttachment(startH5N, 6);
		startGkH5.setLayoutData(fd_startGkH5);

		Button cpH1Start = new Button(compositeHome, SWT.RADIO);
		cpH1Start.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageModel.setCpH1Start();
				appendTextToLogging(manageModel.getCaptainHome());
			}
		});
		cpH1Start.setSelection(manageModel.getCpH1Start());

		cpH1Start.setLayoutData(new FormData());
		FormData fd_cpH1Start = new FormData();
		fd_cpH1Start.top = new FormAttachment(startH1N, 2, SWT.TOP);
		fd_cpH1Start.left = new FormAttachment(startGkH1, 6);
		cpH1Start.setLayoutData(fd_cpH1Start);

		Button cpH2Start = new Button(compositeHome, SWT.RADIO);
		cpH2Start.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageModel.setCpH2Start();
				appendTextToLogging(manageModel.getCaptainHome());
			}
		});
		cpH2Start.setSelection(manageModel.getCpH2Start());

		cpH2Start.setLayoutData(new FormData());
		FormData fd_cpH2Start = new FormData();
		fd_cpH2Start.top = new FormAttachment(startH2N, 2, SWT.TOP);
		fd_cpH2Start.left = new FormAttachment(startGkH2, 6);
		cpH2Start.setLayoutData(fd_cpH2Start);

		Button cpH3Start = new Button(compositeHome, SWT.RADIO);
		cpH3Start.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageModel.setCpH3Start();
				appendTextToLogging(manageModel.getCaptainHome());
			}
		});
		cpH3Start.setSelection(manageModel.getCpH3Start());

		cpH3Start.setLayoutData(new FormData());
		FormData fd_cpH3Start = new FormData();
		fd_cpH3Start.top = new FormAttachment(startH3N, 2, SWT.TOP);
		fd_cpH3Start.left = new FormAttachment(startGkH3, 6);
		cpH3Start.setLayoutData(fd_cpH3Start);

		Button cpH4Start = new Button(compositeHome, SWT.RADIO);
		cpH4Start.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageModel.setCpH4Start();
				appendTextToLogging(manageModel.getCaptainHome());
			}
		});
		cpH4Start.setSelection(manageModel.getCpH4Start());

		cpH4Start.setLayoutData(new FormData());
		FormData fd_cpH4Start = new FormData();
		fd_cpH4Start.top = new FormAttachment(startH4N, 2, SWT.TOP);
		fd_cpH4Start.left = new FormAttachment(startGkH4, 6);
		cpH4Start.setLayoutData(fd_cpH4Start);

		Button cpH5Start = new Button(compositeHome, SWT.RADIO);
		cpH5Start.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageModel.setCpH5Start();
				appendTextToLogging(manageModel.getCaptainHome());
			}
		});
		cpH5Start.setSelection(manageModel.getCpH5Start());

		FormData fd_cpH5Start = new FormData();
		fd_cpH5Start.top = new FormAttachment(startH5N, 2, SWT.TOP);
		fd_cpH5Start.left = new FormAttachment(startGkH5, 6);
		cpH5Start.setLayoutData(fd_cpH5Start);

		Label lblSubstitutesHome = new Label(compositeHome, SWT.NONE);
		FormData fd_lblSubstitutesHome = new FormData();
		fd_lblSubstitutesHome.top = new FormAttachment(startH5N, 6);
		fd_lblSubstitutesHome.left = new FormAttachment(lblTeamHome, 0,
				SWT.LEFT);
		lblSubstitutesHome.setLayoutData(fd_lblSubstitutesHome);
		lblSubstitutesHome.setText("Substitutes");

		subH1N = new Text(compositeHome, SWT.BORDER);
		FormData fd_subH1N = new FormData();
		fd_subH1N.width = 120;
		fd_subH1N.top = new FormAttachment(lblSubstitutesHome, 6);
		fd_subH1N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		subH1N.setLayoutData(fd_subH1N);

		subH2N = new Text(compositeHome, SWT.BORDER);
		FormData fd_subH2N = new FormData();
		fd_subH2N.width = 120;
		fd_subH2N.top = new FormAttachment(subH1N, 6);
		fd_subH2N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		subH2N.setLayoutData(fd_subH2N);

		subH3N = new Text(compositeHome, SWT.BORDER);
		FormData fd_subH3N = new FormData();
		fd_subH3N.width = 120;
		fd_subH3N.top = new FormAttachment(subH2N, 6);
		fd_subH3N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		subH3N.setLayoutData(fd_subH3N);

		subH4N = new Text(compositeHome, SWT.BORDER);
		FormData fd_subH4N = new FormData();
		fd_subH4N.width = 120;
		fd_subH4N.top = new FormAttachment(subH3N, 6);
		fd_subH4N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		subH4N.setLayoutData(fd_subH4N);

		subH5N = new Text(compositeHome, SWT.BORDER);
		FormData fd_subH5N = new FormData();
		fd_subH5N.width = 120;
		fd_subH5N.top = new FormAttachment(subH4N, 6);
		fd_subH5N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		subH5N.setLayoutData(fd_subH5N);

		subH6N = new Text(compositeHome, SWT.BORDER);
		FormData fd_subH6N = new FormData();
		fd_subH6N.width = 120;
		fd_subH6N.top = new FormAttachment(subH5N, 6);
		fd_subH6N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		subH6N.setLayoutData(fd_subH6N);

		subH7N = new Text(compositeHome, SWT.BORDER);
		FormData fd_subH7N = new FormData();
		fd_subH7N.width = 120;
		fd_subH7N.top = new FormAttachment(subH6N, 6);
		fd_subH7N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		subH7N.setLayoutData(fd_subH7N);

		Button subGkH1 = new Button(compositeHome, SWT.CHECK);
		FormData fd_subGkH1 = new FormData();
		fd_subGkH1.top = new FormAttachment(subH1N, 2, SWT.TOP);
		fd_subGkH1.left = new FormAttachment(startGkH1, 0, SWT.LEFT);
		subGkH1.setLayoutData(fd_subGkH1);

		Button subGkH2 = new Button(compositeHome, SWT.CHECK);
		FormData fd_subGkH2 = new FormData();
		fd_subGkH2.top = new FormAttachment(subH2N, 2, SWT.TOP);
		fd_subGkH2.left = new FormAttachment(startGkH1, 0, SWT.LEFT);
		subGkH2.setLayoutData(fd_subGkH2);

		Button subGkH3 = new Button(compositeHome, SWT.CHECK);
		FormData fd_subGkH3 = new FormData();
		fd_subGkH3.top = new FormAttachment(subH3N, 2, SWT.TOP);
		fd_subGkH3.left = new FormAttachment(startGkH1, 0, SWT.LEFT);
		subGkH3.setLayoutData(fd_subGkH3);

		Button subGkH4 = new Button(compositeHome, SWT.CHECK);
		FormData fd_subGkH4 = new FormData();
		fd_subGkH4.top = new FormAttachment(subH4N, 2, SWT.TOP);
		fd_subGkH4.left = new FormAttachment(startGkH1, 0, SWT.LEFT);
		subGkH4.setLayoutData(fd_subGkH4);

		Button subGkH5 = new Button(compositeHome, SWT.CHECK);
		FormData fd_subGkH5 = new FormData();
		fd_subGkH5.top = new FormAttachment(subH5N, 2, SWT.TOP);
		fd_subGkH5.left = new FormAttachment(startGkH1, 0, SWT.LEFT);
		subGkH5.setLayoutData(fd_subGkH5);

		Button subGkH6 = new Button(compositeHome, SWT.CHECK);
		FormData fd_subGkH6 = new FormData();
		fd_subGkH6.top = new FormAttachment(subH6N, 2, SWT.TOP);
		fd_subGkH6.left = new FormAttachment(startGkH1, 0, SWT.LEFT);
		subGkH6.setLayoutData(fd_subGkH6);

		Button subGkH7 = new Button(compositeHome, SWT.CHECK);
		FormData fd_subGkH7 = new FormData();
		fd_subGkH7.top = new FormAttachment(subH7N, 2, SWT.TOP);
		fd_subGkH7.left = new FormAttachment(startGkH1, 0, SWT.LEFT);
		subGkH7.setLayoutData(fd_subGkH7);

		Button cpH1Sub = new Button(compositeHome, SWT.RADIO);
		FormData fd_cpH1Sub = new FormData();
		fd_cpH1Sub.top = new FormAttachment(subH1N, 2, SWT.TOP);
		fd_cpH1Sub.left = new FormAttachment(subGkH1, 6);
		cpH1Sub.setLayoutData(fd_cpH1Sub);

		Button cpH2Sub = new Button(compositeHome, SWT.RADIO);
		FormData fd_cpH2Sub = new FormData();
		fd_cpH2Sub.top = new FormAttachment(subH2N, 2, SWT.TOP);
		fd_cpH2Sub.left = new FormAttachment(subGkH2, 6);
		cpH2Sub.setLayoutData(fd_cpH2Sub);

		Button cpH3Sub = new Button(compositeHome, SWT.RADIO);
		FormData fd_cpH3Sub = new FormData();
		fd_cpH3Sub.top = new FormAttachment(subH3N, 2, SWT.TOP);
		fd_cpH3Sub.left = new FormAttachment(subGkH3, 6);
		cpH3Sub.setLayoutData(fd_cpH3Sub);

		Button cpH4Sub = new Button(compositeHome, SWT.RADIO);
		FormData fd_cpH4Sub = new FormData();
		fd_cpH4Sub.top = new FormAttachment(subH4N, 2, SWT.TOP);
		fd_cpH4Sub.left = new FormAttachment(subGkH4, 6);
		cpH4Sub.setLayoutData(fd_cpH4Sub);

		Button cpH5Sub = new Button(compositeHome, SWT.RADIO);
		FormData fd_cpH5Sub = new FormData();
		fd_cpH5Sub.top = new FormAttachment(subH5N, 2, SWT.TOP);
		fd_cpH5Sub.left = new FormAttachment(subGkH5, 6);
		cpH5Sub.setLayoutData(fd_cpH5Sub);

		Button cpH6Sub = new Button(compositeHome, SWT.RADIO);
		FormData fd_cpH6Sub = new FormData();
		fd_cpH6Sub.top = new FormAttachment(subH6N, 2, SWT.TOP);
		fd_cpH6Sub.left = new FormAttachment(subGkH6, 6);
		cpH6Sub.setLayoutData(fd_cpH6Sub);

		Button cpH7Sub = new Button(compositeHome, SWT.RADIO);
		FormData fd_cpH7Sub = new FormData();
		fd_cpH7Sub.top = new FormAttachment(subH7N, 2, SWT.TOP);
		fd_cpH7Sub.left = new FormAttachment(subGkH7, 6);
		cpH7Sub.setLayoutData(fd_cpH7Sub);

		idH1Start = new Text(compositeHome, SWT.BORDER);
		idH1Start.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setIdHStartText(0, idH1Start, "TODO: ERROR");
						appendTextToLogging(manageModel.getIdHStartText(0));
					}
				});

			}
		});
		setTextFromModel(idH1Start, manageModel.getIdHStartText(0));

		FormData fd_idH1Start = new FormData();
		fd_idH1Start.width = 34;
		fd_idH1Start.top = new FormAttachment(startH1N, 0, SWT.TOP);
		fd_idH1Start.left = new FormAttachment(cpH1Start, 6);
		idH1Start.setLayoutData(fd_idH1Start);

		idH2Start = new Text(compositeHome, SWT.BORDER);
		idH2Start.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setIdHStartText(1, idH2Start, "TODO:Error");
						appendTextToLogging(manageModel.getIdHStartText(1));
					}
				});

			}
		});
		setTextFromModel(idH2Start, manageModel.getIdHStartText(1));

		FormData fd_idH2Start = new FormData();
		fd_idH2Start.width = 34;
		fd_idH2Start.top = new FormAttachment(startH2N, 0, SWT.TOP);
		fd_idH2Start.left = new FormAttachment(cpH2Start, 6);
		idH2Start.setLayoutData(fd_idH2Start);

		idH3Start = new Text(compositeHome, SWT.BORDER);
		idH3Start.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setIdHStartText(2, idH3Start, "TODO: Error");
						appendTextToLogging(manageModel.getIdHStartText(2));
					}
				});

			}
		});
		setTextFromModel(idH3Start, manageModel.getIdHStartText(2));

		FormData fd_idH3Start = new FormData();
		fd_idH3Start.width = 34;
		fd_idH3Start.top = new FormAttachment(startH3N, 0, SWT.TOP);
		fd_idH3Start.left = new FormAttachment(cpH3Start, 6);
		idH3Start.setLayoutData(fd_idH3Start);

		idH4Start = new Text(compositeHome, SWT.BORDER);
		idH4Start.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setIdHStartText(3, idH4Start, "TODO: ERROR");
						appendTextToLogging(manageModel.getIdHStartText(3));
					}
				});

			}
		});
		setTextFromModel(idH4Start, manageModel.getIdHStartText(3));

		FormData fd_idH4Start = new FormData();
		fd_idH4Start.width = 34;
		fd_idH4Start.top = new FormAttachment(startH4N, 0, SWT.TOP);
		fd_idH4Start.left = new FormAttachment(cpH4Start, 6);
		idH4Start.setLayoutData(fd_idH4Start);

		idH5Start = new Text(compositeHome, SWT.BORDER);
		idH5Start.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setIdHStartText(4, idH5Start, "TODO: ERROR");
						appendTextToLogging(manageModel.getIdHStartText(4));
					}
				});

			}
		});
		setTextFromModel(idH5Start, manageModel.getIdHStartText(4));

		FormData fd_idH5Start = new FormData();
		fd_idH5Start.width = 34;
		fd_idH5Start.top = new FormAttachment(startH5N, 0, SWT.TOP);
		fd_idH5Start.left = new FormAttachment(cpH5Start, 6);
		idH5Start.setLayoutData(fd_idH5Start);

		idH1Sub = new Text(compositeHome, SWT.BORDER);
		FormData fd_idH1Sub = new FormData();
		fd_idH1Sub.width = 34;
		fd_idH1Sub.top = new FormAttachment(subH1N, 0, SWT.TOP);
		fd_idH1Sub.left = new FormAttachment(cpH1Sub, 6);
		idH1Sub.setLayoutData(fd_idH1Sub);

		idH2Sub = new Text(compositeHome, SWT.BORDER);
		FormData fd_idH2Sub = new FormData();
		fd_idH2Sub.width = 34;
		fd_idH2Sub.top = new FormAttachment(subH2N, 0, SWT.TOP);
		fd_idH2Sub.left = new FormAttachment(cpH2Sub, 6);
		idH2Sub.setLayoutData(fd_idH2Sub);

		idH3Sub = new Text(compositeHome, SWT.BORDER);
		FormData fd_idH3Sub = new FormData();
		fd_idH3Sub.width = 34;
		fd_idH3Sub.top = new FormAttachment(subH3N, 0, SWT.TOP);
		fd_idH3Sub.left = new FormAttachment(cpH3Sub, 6);
		idH3Sub.setLayoutData(fd_idH3Sub);

		idH4Sub = new Text(compositeHome, SWT.BORDER);
		FormData fd_idH4Sub = new FormData();
		fd_idH4Sub.width = 34;
		fd_idH4Sub.top = new FormAttachment(subH4N, 0, SWT.TOP);
		fd_idH4Sub.left = new FormAttachment(cpH4Sub, 6);
		idH4Sub.setLayoutData(fd_idH4Sub);

		idH5Sub = new Text(compositeHome, SWT.BORDER);
		FormData fd_idH5Sub = new FormData();
		fd_idH5Sub.width = 34;
		fd_idH5Sub.top = new FormAttachment(subH5N, 0, SWT.TOP);
		fd_idH5Sub.left = new FormAttachment(cpH5Sub, 6);
		idH5Sub.setLayoutData(fd_idH5Sub);

		idH6Sub = new Text(compositeHome, SWT.BORDER);
		FormData fd_idH6Sub = new FormData();
		fd_idH6Sub.width = 34;
		fd_idH6Sub.top = new FormAttachment(subH6N, 0, SWT.TOP);
		fd_idH6Sub.left = new FormAttachment(cpH6Sub, 6);
		idH6Sub.setLayoutData(fd_idH6Sub);

		idH7Sub = new Text(compositeHome, SWT.BORDER);
		FormData fd_idH7Sub = new FormData();
		fd_idH7Sub.width = 34;
		fd_idH7Sub.top = new FormAttachment(subH7N, 0, SWT.TOP);
		fd_idH7Sub.left = new FormAttachment(cpH7Sub, 6);
		idH7Sub.setLayoutData(fd_idH7Sub);

		shirtH1Start = new Text(compositeHome, SWT.BORDER);
		shirtH1Start.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setShirtH1StartText(shirtH1Start, "TODO: ERROR");
						appendTextToLogging(manageModel.getShirtH1StartText());
					}
				});

			}
		});
		setTextFromModel(shirtH1Start, manageModel.getShirtH1StartText());

		FormData fd_shirtH1Start = new FormData();
		fd_shirtH1Start.top = new FormAttachment(startH1N, 0, SWT.TOP);
		fd_shirtH1Start.left = new FormAttachment(idH1Start, 6);
		fd_shirtH1Start.width = 20;
		shirtH1Start.setLayoutData(fd_shirtH1Start);

		shirtH2Start = new Text(compositeHome, SWT.BORDER);
		shirtH2Start.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setShirtH2StartText(shirtH2Start);
						appendTextToLogging(manageModel.getShirtH2StartText());
					}
				});

			}
		});
		setTextFromModel(shirtH2Start, manageModel.getShirtH2StartText());

		FormData fd_shirtH2Start = new FormData();
		fd_shirtH2Start.top = new FormAttachment(startH2N, 0, SWT.TOP);
		fd_shirtH2Start.left = new FormAttachment(idH2Start, 6);
		fd_shirtH2Start.width = 20;
		shirtH2Start.setLayoutData(fd_shirtH2Start);

		shirtH3Start = new Text(compositeHome, SWT.BORDER);
		shirtH3Start.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setShirtH3StartText(shirtH3Start);
						appendTextToLogging(manageModel.getShirtH3StartText());
					}
				});

			}
		});
		setTextFromModel(shirtH3Start, manageModel.getShirtH3StartText());

		FormData fd_shirtH3Start = new FormData();
		fd_shirtH3Start.top = new FormAttachment(startH3N, 0, SWT.TOP);
		fd_shirtH3Start.left = new FormAttachment(idH3Start, 6);
		fd_shirtH3Start.width = 20;
		shirtH3Start.setLayoutData(fd_shirtH3Start);

		shirtH4Start = new Text(compositeHome, SWT.BORDER);
		shirtH4Start.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setShirtH4StartText(shirtH4Start);
						appendTextToLogging(manageModel.getShirtH4StartText());
					}
				});

			}
		});
		setTextFromModel(shirtH4Start, manageModel.getShirtH4StartText());

		FormData fd_shirtH4Start = new FormData();
		fd_shirtH4Start.top = new FormAttachment(startH4N, 0, SWT.TOP);
		fd_shirtH4Start.left = new FormAttachment(idH4Start, 6);
		fd_shirtH4Start.width = 20;
		shirtH4Start.setLayoutData(fd_shirtH4Start);

		shirtH5Start = new Text(compositeHome, SWT.BORDER);
		shirtH5Start.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setShirtH5StartText(shirtH5Start);
						appendTextToLogging(manageModel.getShirtH5StartText());
					}
				});

			}
		});
		setTextFromModel(shirtH5Start, manageModel.getShirtH5StartText());
		FormData fd_shirtH5Start = new FormData();
		fd_shirtH5Start.top = new FormAttachment(startH5N, 0, SWT.TOP);
		fd_shirtH5Start.left = new FormAttachment(idH5Start, 6);
		fd_shirtH5Start.width = 20;
		shirtH5Start.setLayoutData(fd_shirtH5Start);

		shirtH1Sub = new Text(compositeHome, SWT.BORDER);
		FormData fd_shirtH1Sub = new FormData();
		fd_shirtH1Sub.top = new FormAttachment(subH1N, 0, SWT.TOP);
		fd_shirtH1Sub.left = new FormAttachment(idH1Sub, 6);
		fd_shirtH1Sub.width = 20;
		shirtH1Sub.setLayoutData(fd_shirtH1Sub);

		shirtH2Sub = new Text(compositeHome, SWT.BORDER);
		FormData fd_shirtH2Sub = new FormData();
		fd_shirtH2Sub.top = new FormAttachment(subH2N, 0, SWT.TOP);
		fd_shirtH2Sub.left = new FormAttachment(idH2Sub, 6);
		fd_shirtH2Sub.width = 20;
		shirtH2Sub.setLayoutData(fd_shirtH2Sub);

		shirtH3Sub = new Text(compositeHome, SWT.BORDER);
		FormData fd_shirtH3Sub = new FormData();
		fd_shirtH3Sub.top = new FormAttachment(subH3N, 0, SWT.TOP);
		fd_shirtH3Sub.left = new FormAttachment(idH3Sub, 6);
		fd_shirtH3Sub.width = 20;
		shirtH3Sub.setLayoutData(fd_shirtH3Sub);

		shirtH4Sub = new Text(compositeHome, SWT.BORDER);
		FormData fd_shirtH4Sub = new FormData();
		fd_shirtH4Sub.top = new FormAttachment(subH4N, 0, SWT.TOP);
		fd_shirtH4Sub.left = new FormAttachment(idH4Sub, 6);
		fd_shirtH4Sub.width = 20;
		shirtH4Sub.setLayoutData(fd_shirtH4Sub);

		shirtH5Sub = new Text(compositeHome, SWT.BORDER);
		FormData fd_shirtH5Sub = new FormData();
		fd_shirtH5Sub.top = new FormAttachment(subH5N, 0, SWT.TOP);
		fd_shirtH5Sub.left = new FormAttachment(idH5Sub, 6);
		fd_shirtH5Sub.width = 20;
		shirtH5Sub.setLayoutData(fd_shirtH5Sub);

		shirtH6Sub = new Text(compositeHome, SWT.BORDER);
		FormData fd_shirtH6Sub = new FormData();
		fd_shirtH6Sub.top = new FormAttachment(subH6N, 0, SWT.TOP);
		fd_shirtH6Sub.left = new FormAttachment(idH6Sub, 6);
		fd_shirtH6Sub.width = 20;
		shirtH6Sub.setLayoutData(fd_shirtH6Sub);

		shirtH7Sub = new Text(compositeHome, SWT.BORDER);
		FormData fd_shirtH7Sub = new FormData();
		fd_shirtH7Sub.top = new FormAttachment(subH7N, 0, SWT.TOP);
		fd_shirtH7Sub.left = new FormAttachment(idH7Sub, 6);
		fd_shirtH7Sub.width = 20;
		shirtH7Sub.setLayoutData(fd_shirtH7Sub);

		lblStaffHome = new Label(compositeHome, SWT.NONE);
		FormData fd_lblStaffHome = new FormData();
		fd_lblStaffHome.top = new FormAttachment(subH7N, 6);
		fd_lblStaffHome.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		lblStaffHome.setLayoutData(fd_lblStaffHome);
		lblStaffHome.setText("Staff");

		staffH1N = new Text(compositeHome, SWT.BORDER);
		FormData fd_staffH1N = new FormData();
		fd_staffH1N.width = 120;
		fd_staffH1N.top = new FormAttachment(lblStaffHome, 6);
		fd_staffH1N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		staffH1N.setLayoutData(fd_staffH1N);

		staffH2N = new Text(compositeHome, SWT.BORDER);
		FormData fd_staffH2N = new FormData();
		fd_staffH2N.width = 120;
		fd_staffH2N.top = new FormAttachment(staffH1N, 6);
		fd_staffH2N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		staffH2N.setLayoutData(fd_staffH2N);

		staffH3N = new Text(compositeHome, SWT.BORDER);
		FormData fd_staffH3N = new FormData();
		fd_staffH3N.width = 120;
		fd_staffH3N.top = new FormAttachment(staffH2N, 6);
		fd_staffH3N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		staffH3N.setLayoutData(fd_staffH3N);

		staffH4N = new Text(compositeHome, SWT.BORDER);
		FormData fd_staffH4N = new FormData();
		fd_staffH4N.width = 120;
		fd_staffH4N.top = new FormAttachment(staffH3N, 6);
		fd_staffH4N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		staffH4N.setLayoutData(fd_staffH4N);

		staffH5N = new Text(compositeHome, SWT.BORDER);
		FormData fd_staffH5N = new FormData();
		fd_staffH5N.width = 120;
		fd_staffH5N.top = new FormAttachment(staffH4N, 6);
		fd_staffH5N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		staffH5N.setLayoutData(fd_staffH5N);

		staffH6N = new Text(compositeHome, SWT.BORDER);
		FormData fd_staffH6N = new FormData();
		fd_staffH6N.width = 120;
		fd_staffH6N.top = new FormAttachment(staffH5N, 6);
		fd_staffH6N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		staffH6N.setLayoutData(fd_staffH6N);

		staffH7N = new Text(compositeHome, SWT.BORDER);
		FormData fd_staffH7N = new FormData();
		fd_staffH7N.width = 120;
		fd_staffH7N.top = new FormAttachment(staffH6N, 6);
		fd_staffH7N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		staffH7N.setLayoutData(fd_staffH7N);

		staffH8N = new Text(compositeHome, SWT.BORDER);
		FormData fd_staffH8N = new FormData();
		fd_staffH8N.width = 120;
		fd_staffH8N.top = new FormAttachment(staffH7N, 6);
		fd_staffH8N.left = new FormAttachment(lblTeamHome, 0, SWT.LEFT);
		staffH8N.setLayoutData(fd_staffH8N);

		idH1Staff = new Text(compositeHome, SWT.BORDER);
		FormData fd_idH1Staff = new FormData();
		fd_idH1Staff.width = 34;
		fd_idH1Staff.top = new FormAttachment(staffH1N, 0, SWT.TOP);
		fd_idH1Staff.left = new FormAttachment(startGkH1, 0, SWT.LEFT);
		idH1Staff.setLayoutData(fd_idH1Staff);

		idH2Staff = new Text(compositeHome, SWT.BORDER);
		FormData fd_idH2Staff = new FormData();
		fd_idH2Staff.width = 34;
		fd_idH2Staff.top = new FormAttachment(staffH2N, 0, SWT.TOP);
		fd_idH2Staff.left = new FormAttachment(startGkH1, 0, SWT.LEFT);
		idH2Staff.setLayoutData(fd_idH2Staff);

		idH3Staff = new Text(compositeHome, SWT.BORDER);
		FormData fd_idH3Staff = new FormData();
		fd_idH3Staff.width = 34;
		fd_idH3Staff.top = new FormAttachment(staffH3N, 0, SWT.TOP);
		fd_idH3Staff.left = new FormAttachment(startGkH1, 0, SWT.LEFT);
		idH3Staff.setLayoutData(fd_idH3Staff);

		idH4Staff = new Text(compositeHome, SWT.BORDER);
		FormData fd_idH4Staff = new FormData();
		fd_idH4Staff.width = 34;
		fd_idH4Staff.top = new FormAttachment(staffH4N, 0, SWT.TOP);
		fd_idH4Staff.left = new FormAttachment(startGkH1, 0, SWT.LEFT);
		idH4Staff.setLayoutData(fd_idH4Staff);

		idH5Staff = new Text(compositeHome, SWT.BORDER);
		FormData fd_idH5Staff = new FormData();
		fd_idH5Staff.width = 34;
		fd_idH5Staff.top = new FormAttachment(staffH5N, 0, SWT.TOP);
		fd_idH5Staff.left = new FormAttachment(startGkH1, 0, SWT.LEFT);
		idH5Staff.setLayoutData(fd_idH5Staff);

		idH6Staff = new Text(compositeHome, SWT.BORDER);
		FormData fd_idH6Staff = new FormData();
		fd_idH6Staff.width = 34;
		fd_idH6Staff.top = new FormAttachment(staffH6N, 0, SWT.TOP);
		fd_idH6Staff.left = new FormAttachment(startGkH1, 0, SWT.LEFT);
		idH6Staff.setLayoutData(fd_idH6Staff);

		idH7Staff = new Text(compositeHome, SWT.BORDER);
		FormData fd_idH7Staff = new FormData();
		fd_idH7Staff.width = 34;
		fd_idH7Staff.top = new FormAttachment(staffH6N, 6);
		fd_idH7Staff.left = new FormAttachment(startGkH1, 0, SWT.LEFT);
		idH7Staff.setLayoutData(fd_idH7Staff);

		idH8Staff = new Text(compositeHome, SWT.BORDER);
		FormData fd_idH8Staff = new FormData();
		fd_idH8Staff.width = 34;
		fd_idH8Staff.top = new FormAttachment(staffH7N, 6);
		fd_idH8Staff.left = new FormAttachment(startGkH1, 0, SWT.LEFT);
		idH8Staff.setLayoutData(fd_idH8Staff);

		staffT1H = new Combo(compositeHome, SWT.NONE);
		staffT1H.setItems(manageModel.getStaffRoleItems());
		FormData fd_staffT1H = new FormData();
		fd_staffT1H.top = new FormAttachment(staffH1N, 0, SWT.TOP);
		fd_staffT1H.left = new FormAttachment(idH1Staff, 6);
		fd_staffT1H.width = 50;
		staffT1H.setLayoutData(fd_staffT1H);

		staffT2H = new Combo(compositeHome, SWT.NONE);
		staffT2H.setItems(manageModel.getStaffRoleItems());
		FormData fd_staffT2H = new FormData();
		fd_staffT2H.top = new FormAttachment(staffH2N, 0, SWT.TOP);
		fd_staffT2H.left = new FormAttachment(idH2Staff, 6);
		fd_staffT2H.width = 50;
		staffT2H.setLayoutData(fd_staffT2H);

		staffT3H = new Combo(compositeHome, SWT.NONE);
		staffT3H.setItems(manageModel.getStaffRoleItems());
		FormData fd_staffT3H = new FormData();
		fd_staffT3H.top = new FormAttachment(staffH3N, 0, SWT.TOP);
		fd_staffT3H.left = new FormAttachment(idH3Staff, 6);
		fd_staffT3H.width = 50;
		staffT3H.setLayoutData(fd_staffT3H);

		staffT4H = new Combo(compositeHome, SWT.NONE);
		staffT4H.setItems(manageModel.getStaffRoleItems());
		FormData fd_staffT4H = new FormData();
		fd_staffT4H.top = new FormAttachment(staffH4N, 0, SWT.TOP);
		fd_staffT4H.left = new FormAttachment(idH4Staff, 6);
		fd_staffT4H.width = 50;
		staffT4H.setLayoutData(fd_staffT4H);

		staffT5H = new Combo(compositeHome, SWT.NONE);
		staffT5H.setItems(manageModel.getStaffRoleItems());
		FormData fd_staffT5H = new FormData();
		fd_staffT5H.top = new FormAttachment(staffH5N, 0, SWT.TOP);
		fd_staffT5H.left = new FormAttachment(idH5Staff, 6);
		fd_staffT5H.width = 50;
		staffT5H.setLayoutData(fd_staffT5H);

		staffT6H = new Combo(compositeHome, SWT.NONE);
		staffT6H.setItems(manageModel.getStaffRoleItems());
		FormData fd_staffT6H = new FormData();
		fd_staffT6H.top = new FormAttachment(staffH6N, 0, SWT.TOP);
		fd_staffT6H.left = new FormAttachment(idH6Staff, 6);
		fd_staffT6H.width = 50;
		staffT6H.setLayoutData(fd_staffT6H);

		staffT7H = new Combo(compositeHome, SWT.NONE);
		staffT7H.setItems(manageModel.getStaffRoleItems());
		FormData fd_staffT7H = new FormData();
		fd_staffT7H.top = new FormAttachment(staffH7N, 0, SWT.TOP);
		fd_staffT7H.left = new FormAttachment(idH7Staff, 6);
		fd_staffT7H.width = 50;
		staffT7H.setLayoutData(fd_staffT7H);

		staffT8H = new Combo(compositeHome, SWT.NONE);
		staffT8H.setItems(manageModel.getStaffRoleItems());
		FormData fd_staffT8H = new FormData();
		fd_staffT8H.top = new FormAttachment(staffH8N, 0, SWT.TOP);
		fd_staffT8H.left = new FormAttachment(idH8Staff, 6);
		fd_staffT8H.width = 50;
		staffT8H.setLayoutData(fd_staffT8H);

		Button btnLockHome = new Button(compositeHome, SWT.NONE);
		FormData fd_btnLockHome = new FormData();
		fd_btnLockHome.width = 150;
		fd_btnLockHome.bottom = new FormAttachment(100, -10);
		fd_btnLockHome.right = new FormAttachment(teamHome, 0, SWT.RIGHT);
		btnLockHome.setLayoutData(fd_btnLockHome);
		btnLockHome.setText("Lock fields");

		xpndtmHome.setHeight(700);

		expandBarVisitor = new ExpandBar(compositeMiddle, SWT.NONE);
		FormData fd_expandBarVisitor = new FormData();
		fd_expandBarVisitor.top = new FormAttachment(0);
		fd_expandBarVisitor.right = new FormAttachment(100, 0);
		fd_expandBarVisitor.bottom = new FormAttachment(100, 0);
		fd_expandBarVisitor.width = 290;
		expandBarVisitor.setLayoutData(fd_expandBarVisitor);

		ExpandItem xpndtmVisitor = new ExpandItem(expandBarVisitor, SWT.NONE);
		xpndtmVisitor.setExpanded(true);
		xpndtmVisitor.setText("Visitor");

		Composite compositeVisitor = new Composite(expandBarVisitor, SWT.NONE);
		xpndtmVisitor.setControl(compositeVisitor);
		compositeVisitor.setLayout(new FormLayout());

		Label lblTeamVisitor = new Label(compositeVisitor, SWT.NONE);
		FormData fd_lblTeamVisitor = new FormData();
		fd_lblTeamVisitor.right = new FormAttachment(0, 45);
		fd_lblTeamVisitor.top = new FormAttachment(0, 10);
		fd_lblTeamVisitor.left = new FormAttachment(0, 10);
		lblTeamVisitor.setLayoutData(fd_lblTeamVisitor);
		lblTeamVisitor.setText("Team");

		teamVisitor = new Text(compositeVisitor, SWT.BORDER);
		teamVisitor.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				manageModel.setTeamVisitorText(teamVisitor, "TODO: ERROR");
				appendTextToLogging(manageModel.getTeamVisitorText());
			}
		});
		teamVisitor.setText(manageModel.getTeamVisitorText());
		FormData fd_teamVisitor = new FormData();
		fd_teamVisitor.top = new FormAttachment(lblTeamVisitor, -2, SWT.TOP);
		fd_teamVisitor.left = new FormAttachment(lblTeamVisitor, 6);
		fd_teamVisitor.right = new FormAttachment(100, -6);
		teamVisitor.setLayoutData(fd_teamVisitor);

		Label lblStartinglineVisitor = new Label(compositeVisitor, SWT.NONE);
		FormData fd_lblStartingLineVisitor = new FormData();
		fd_lblStartingLineVisitor.top = new FormAttachment(lblTeamVisitor, 6);
		fd_lblStartingLineVisitor.left = new FormAttachment(lblTeamVisitor, 0,
				SWT.LEFT);
		lblStartinglineVisitor.setLayoutData(fd_lblStartingLineVisitor);
		lblStartinglineVisitor.setText("Starting line");

		startV1N = new Text(compositeVisitor, SWT.BORDER);
		startV1N.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setVNText(0, startV1N, "TODO: ERROR");
						appendTextToLogging(manageModel.getVNText(0));
					}
				});

			}
		});
		setTextFromModel(startV1N, manageModel.getVNText(0));
		
		FormData fd_startV1N = new FormData();
		fd_startV1N.width = 120;
		fd_startV1N.top = new FormAttachment(lblStartinglineVisitor, 6);
		fd_startV1N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		startV1N.setLayoutData(fd_startV1N);

		startV2N = new Text(compositeVisitor, SWT.BORDER);
		startV2N.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setVNText(1, startV2N, "TODO: ERROR");
						appendTextToLogging(manageModel.getVNText(1));
					}
				});

			}
		});
		setTextFromModel(startV2N, manageModel.getVNText(1));
		
		FormData fd_startV2N = new FormData();
		fd_startV2N.width = 120;
		fd_startV2N.top = new FormAttachment(startV1N, 6);
		fd_startV2N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		startV2N.setLayoutData(fd_startV2N);

		startV3N = new Text(compositeVisitor, SWT.BORDER);
		startV3N.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setVNText(2, startV3N, "TODO: ERROR");
						appendTextToLogging(manageModel.getVNText(2));
					}
				});

			}
		});
		setTextFromModel(startV3N, manageModel.getVNText(2));
		
		FormData fd_startV3N = new FormData();
		fd_startV3N.width = 120;
		fd_startV3N.top = new FormAttachment(startV2N, 6);
		fd_startV3N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		startV3N.setLayoutData(fd_startV3N);

		startV4N = new Text(compositeVisitor, SWT.BORDER);
		startV4N.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setVNText(3, startV4N, "TODO: ERROR");
						appendTextToLogging(manageModel.getVNText(3));
					}
				});

			}
		});
		setTextFromModel(startV4N, manageModel.getVNText(3));
		
		FormData fd_startV4N = new FormData();
		fd_startV4N.width = 120;
		fd_startV4N.top = new FormAttachment(startV3N, 6);
		fd_startV4N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		startV4N.setLayoutData(fd_startV4N);

		startV5N = new Text(compositeVisitor, SWT.BORDER);
		startV5N.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setVNText(4, startV5N, "TODO: ERROR");
						appendTextToLogging(manageModel.getVNText(4));
					}
				});

			}
		});
		setTextFromModel(startV5N, manageModel.getVNText(4));
		
		FormData fd_startV5N = new FormData();
		fd_startV5N.width = 120;
		fd_startV5N.top = new FormAttachment(startV4N, 6);
		fd_startV5N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		startV5N.setLayoutData(fd_startV5N);

		Button startGkV1 = new Button(compositeVisitor, SWT.CHECK);
		startGkV1.setSelection(true);
		startGkV1.setEnabled(false);
		FormData fd_startGkV1 = new FormData();
		fd_startGkV1.top = new FormAttachment(startV1N, 2, SWT.TOP);
		fd_startGkV1.left = new FormAttachment(startV1N, 6);
		startGkV1.setLayoutData(fd_startGkV1);

		Button startGkV2 = new Button(compositeVisitor, SWT.CHECK);
		startGkV2.setEnabled(false);
		FormData fd_startGkV2 = new FormData();
		fd_startGkV2.top = new FormAttachment(startV2N, 2, SWT.TOP);
		fd_startGkV2.left = new FormAttachment(startV2N, 6);
		startGkV2.setLayoutData(fd_startGkV2);

		Button startGkV3 = new Button(compositeVisitor, SWT.CHECK);
		startGkV3.setEnabled(false);
		FormData fd_startGkV3 = new FormData();
		fd_startGkV3.top = new FormAttachment(startV3N, 2, SWT.TOP);
		fd_startGkV3.left = new FormAttachment(startV3N, 6);
		startGkV3.setLayoutData(fd_startGkV3);

		Button startGkV4 = new Button(compositeVisitor, SWT.CHECK);
		startGkV4.setEnabled(false);
		FormData fd_startGkV4 = new FormData();
		fd_startGkV4.top = new FormAttachment(startV4N, 2, SWT.TOP);
		fd_startGkV4.left = new FormAttachment(startV4N, 6);
		startGkV4.setLayoutData(fd_startGkV4);

		Button startGkV5 = new Button(compositeVisitor, SWT.CHECK);
		startGkV5.setEnabled(false);
		FormData fd_startGkV5 = new FormData();
		fd_startGkV5.top = new FormAttachment(startV5N, 2, SWT.TOP);
		fd_startGkV5.left = new FormAttachment(startV5N, 6);
		startGkV5.setLayoutData(fd_startGkV5);

		Button cpV1Start = new Button(compositeVisitor, SWT.RADIO);
		cpV1Start.setLayoutData(new FormData());
		FormData fd_cpV1Start = new FormData();
		fd_cpV1Start.top = new FormAttachment(startV1N, 2, SWT.TOP);
		fd_cpV1Start.left = new FormAttachment(startGkV1, 6);
		cpV1Start.setLayoutData(fd_cpV1Start);

		Button cpV2Start = new Button(compositeVisitor, SWT.RADIO);
		cpV2Start.setLayoutData(new FormData());
		FormData fd_cpV2Start = new FormData();
		fd_cpV2Start.top = new FormAttachment(startV2N, 2, SWT.TOP);
		fd_cpV2Start.left = new FormAttachment(startGkV2, 6);
		cpV2Start.setLayoutData(fd_cpV2Start);

		Button cpV3Start = new Button(compositeVisitor, SWT.RADIO);
		cpV3Start.setLayoutData(new FormData());
		FormData fd_cpV3Start = new FormData();
		fd_cpV3Start.top = new FormAttachment(startV3N, 2, SWT.TOP);
		fd_cpV3Start.left = new FormAttachment(startGkV3, 6);
		cpV3Start.setLayoutData(fd_cpV3Start);

		Button cpV4Start = new Button(compositeVisitor, SWT.RADIO);
		cpV4Start.setLayoutData(new FormData());
		FormData fd_cpV4Start = new FormData();
		fd_cpV4Start.top = new FormAttachment(startV4N, 2, SWT.TOP);
		fd_cpV4Start.left = new FormAttachment(startGkV4, 6);
		cpV4Start.setLayoutData(fd_cpV4Start);

		Button cpV5Start = new Button(compositeVisitor, SWT.RADIO);
		FormData fd_cpV5Start = new FormData();
		fd_cpV5Start.top = new FormAttachment(startV5N, 2, SWT.TOP);
		fd_cpV5Start.left = new FormAttachment(startGkV5, 6);
		cpV5Start.setLayoutData(fd_cpV5Start);

		Label lblSubstitutesVisitor = new Label(compositeVisitor, SWT.NONE);
		FormData fd_lblSubstitutesVisitor = new FormData();
		fd_lblSubstitutesVisitor.top = new FormAttachment(startV5N, 6);
		fd_lblSubstitutesVisitor.left = new FormAttachment(lblTeamVisitor, 0,
				SWT.LEFT);
		lblSubstitutesVisitor.setLayoutData(fd_lblSubstitutesVisitor);
		lblSubstitutesVisitor.setText("Substitutes");

		subV1N = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_subV1N = new FormData();
		fd_subV1N.width = 120;
		fd_subV1N.top = new FormAttachment(lblSubstitutesVisitor, 6);
		fd_subV1N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		subV1N.setLayoutData(fd_subV1N);

		subV2N = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_subV2N = new FormData();
		fd_subV2N.width = 120;
		fd_subV2N.top = new FormAttachment(subV1N, 6);
		fd_subV2N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		subV2N.setLayoutData(fd_subV2N);

		subV3N = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_subV3N = new FormData();
		fd_subV3N.width = 120;
		fd_subV3N.top = new FormAttachment(subV2N, 6);
		fd_subV3N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		subV3N.setLayoutData(fd_subV3N);

		subV4N = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_subV4N = new FormData();
		fd_subV4N.width = 120;
		fd_subV4N.top = new FormAttachment(subV3N, 6);
		fd_subV4N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		subV4N.setLayoutData(fd_subV4N);

		subV5N = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_subV5N = new FormData();
		fd_subV5N.width = 120;
		fd_subV5N.top = new FormAttachment(subV4N, 6);
		fd_subV5N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		subV5N.setLayoutData(fd_subV5N);

		subV6N = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_subV6N = new FormData();
		fd_subV6N.width = 120;
		fd_subV6N.top = new FormAttachment(subV5N, 6);
		fd_subV6N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		subV6N.setLayoutData(fd_subV6N);

		subV7N = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_subV7N = new FormData();
		fd_subV7N.width = 120;
		fd_subV7N.top = new FormAttachment(subV6N, 6);
		fd_subV7N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		subV7N.setLayoutData(fd_subV7N);

		Button subGkV1 = new Button(compositeVisitor, SWT.CHECK);
		FormData fd_subGkV1 = new FormData();
		fd_subGkV1.top = new FormAttachment(subV1N, 2, SWT.TOP);
		fd_subGkV1.left = new FormAttachment(startGkV1, 0, SWT.LEFT);
		subGkV1.setLayoutData(fd_subGkV1);

		Button subGkV2 = new Button(compositeVisitor, SWT.CHECK);
		FormData fd_subGkV2 = new FormData();
		fd_subGkV2.top = new FormAttachment(subV2N, 2, SWT.TOP);
		fd_subGkV2.left = new FormAttachment(startGkV1, 0, SWT.LEFT);
		subGkV2.setLayoutData(fd_subGkV2);

		Button subGkV3 = new Button(compositeVisitor, SWT.CHECK);
		FormData fd_subGkV3 = new FormData();
		fd_subGkV3.top = new FormAttachment(subV3N, 2, SWT.TOP);
		fd_subGkV3.left = new FormAttachment(startGkV1, 0, SWT.LEFT);
		subGkV3.setLayoutData(fd_subGkV3);

		Button subGkV4 = new Button(compositeVisitor, SWT.CHECK);
		FormData fd_subGkV4 = new FormData();
		fd_subGkV4.top = new FormAttachment(subV4N, 2, SWT.TOP);
		fd_subGkV4.left = new FormAttachment(startGkV1, 0, SWT.LEFT);
		subGkV4.setLayoutData(fd_subGkV4);

		Button subGkV5 = new Button(compositeVisitor, SWT.CHECK);
		FormData fd_subGkV5 = new FormData();
		fd_subGkV5.top = new FormAttachment(subV5N, 2, SWT.TOP);
		fd_subGkV5.left = new FormAttachment(startGkV1, 0, SWT.LEFT);
		subGkV5.setLayoutData(fd_subGkV5);

		Button subGkV6 = new Button(compositeVisitor, SWT.CHECK);
		FormData fd_subGkV6 = new FormData();
		fd_subGkV6.top = new FormAttachment(subV6N, 2, SWT.TOP);
		fd_subGkV6.left = new FormAttachment(startGkV1, 0, SWT.LEFT);
		subGkV6.setLayoutData(fd_subGkV6);

		Button subGkV7 = new Button(compositeVisitor, SWT.CHECK);
		FormData fd_subGkV7 = new FormData();
		fd_subGkV7.top = new FormAttachment(subV7N, 2, SWT.TOP);
		fd_subGkV7.left = new FormAttachment(startGkV1, 0, SWT.LEFT);
		subGkV7.setLayoutData(fd_subGkV7);

		Button cpV1Sub = new Button(compositeVisitor, SWT.RADIO);
		FormData fd_cpV1Sub = new FormData();
		fd_cpV1Sub.top = new FormAttachment(subV1N, 2, SWT.TOP);
		fd_cpV1Sub.left = new FormAttachment(subGkV1, 6);
		cpV1Sub.setLayoutData(fd_cpV1Sub);

		Button cpV2Sub = new Button(compositeVisitor, SWT.RADIO);
		FormData fd_cpV2Sub = new FormData();
		fd_cpV2Sub.top = new FormAttachment(subV2N, 2, SWT.TOP);
		fd_cpV2Sub.left = new FormAttachment(subGkV2, 6);
		cpV2Sub.setLayoutData(fd_cpV2Sub);

		Button cpV3Sub = new Button(compositeVisitor, SWT.RADIO);
		FormData fd_cpV3Sub = new FormData();
		fd_cpV3Sub.top = new FormAttachment(subV3N, 2, SWT.TOP);
		fd_cpV3Sub.left = new FormAttachment(subGkV3, 6);
		cpV3Sub.setLayoutData(fd_cpV3Sub);

		Button cpV4Sub = new Button(compositeVisitor, SWT.RADIO);
		FormData fd_cpV4Sub = new FormData();
		fd_cpV4Sub.top = new FormAttachment(subV4N, 2, SWT.TOP);
		fd_cpV4Sub.left = new FormAttachment(subGkV4, 6);
		cpV4Sub.setLayoutData(fd_cpV4Sub);

		Button cpV5Sub = new Button(compositeVisitor, SWT.RADIO);
		FormData fd_cpV5Sub = new FormData();
		fd_cpV5Sub.top = new FormAttachment(subV5N, 2, SWT.TOP);
		fd_cpV5Sub.left = new FormAttachment(subGkV5, 6);
		cpV5Sub.setLayoutData(fd_cpV5Sub);

		Button cpV6Sub = new Button(compositeVisitor, SWT.RADIO);
		FormData fd_cpV6Sub = new FormData();
		fd_cpV6Sub.top = new FormAttachment(subV6N, 2, SWT.TOP);
		fd_cpV6Sub.left = new FormAttachment(subGkV6, 6);
		cpV6Sub.setLayoutData(fd_cpV6Sub);

		Button cpV7Sub = new Button(compositeVisitor, SWT.RADIO);
		FormData fd_cpV7Sub = new FormData();
		fd_cpV7Sub.top = new FormAttachment(subV7N, 2, SWT.TOP);
		fd_cpV7Sub.left = new FormAttachment(subGkV7, 6);
		cpV7Sub.setLayoutData(fd_cpV7Sub);

		idV1Start = new Text(compositeVisitor, SWT.BORDER);
		
		//TODO
		
		idV1Start.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setVIdText(0, idV1Start, "TODO: ERROR");
						appendTextToLogging(manageModel.getVIdText(0));
					}
				});

			}
		});
		setTextFromModel(idV1Start, manageModel.getVIdText(0));
		
		FormData fd_idV1Start = new FormData();
		fd_idV1Start.width = 34;
		fd_idV1Start.top = new FormAttachment(startV1N, 0, SWT.TOP);
		fd_idV1Start.left = new FormAttachment(cpV1Start, 6);
		idV1Start.setLayoutData(fd_idV1Start);

		idV2Start = new Text(compositeVisitor, SWT.BORDER);
		idV2Start.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setVIdText(0, idV2Start, "TODO: ERROR");
						appendTextToLogging(manageModel.getVIdText(1));
					}
				});

			}
		});
		setTextFromModel(idV2Start, manageModel.getVIdText(1));
		
		FormData fd_idV2Start = new FormData();
		fd_idV2Start.width = 34;
		fd_idV2Start.top = new FormAttachment(startV2N, 0, SWT.TOP);
		fd_idV2Start.left = new FormAttachment(cpV2Start, 6);
		idV2Start.setLayoutData(fd_idV2Start);

		idV3Start = new Text(compositeVisitor, SWT.BORDER);
		idV3Start.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				Display.getDefault().syncExec(new Runnable() {
					public void run() {
						manageModel.setVIdText(0, idV3Start, "TODO: ERROR");
						appendTextToLogging(manageModel.getVIdText(2));
					}
				});

			}
		});
		setTextFromModel(idV3Start, manageModel.getVIdText(2));
		
		FormData fd_idV3Start = new FormData();
		fd_idV3Start.width = 34;
		fd_idV3Start.top = new FormAttachment(startV3N, 0, SWT.TOP);
		fd_idV3Start.left = new FormAttachment(cpV3Start, 6);
		idV3Start.setLayoutData(fd_idV3Start);

		idV4Start = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV4Start = new FormData();
		fd_idV4Start.width = 34;
		fd_idV4Start.top = new FormAttachment(startV4N, 0, SWT.TOP);
		fd_idV4Start.left = new FormAttachment(cpV4Start, 6);
		idV4Start.setLayoutData(fd_idV4Start);

		idV5Start = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV5Start = new FormData();
		fd_idV5Start.width = 34;
		fd_idV5Start.top = new FormAttachment(startV5N, 0, SWT.TOP);
		fd_idV5Start.left = new FormAttachment(cpV5Start, 6);
		idV5Start.setLayoutData(fd_idV5Start);

		idV1Sub = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV1Sub = new FormData();
		fd_idV1Sub.width = 34;
		fd_idV1Sub.top = new FormAttachment(subV1N, 0, SWT.TOP);
		fd_idV1Sub.left = new FormAttachment(cpV1Sub, 6);
		idV1Sub.setLayoutData(fd_idV1Sub);

		idV2Sub = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV2Sub = new FormData();
		fd_idV2Sub.width = 34;
		fd_idV2Sub.top = new FormAttachment(subV2N, 0, SWT.TOP);
		fd_idV2Sub.left = new FormAttachment(cpV2Sub, 6);
		idV2Sub.setLayoutData(fd_idV2Sub);

		idV3Sub = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV3Sub = new FormData();
		fd_idV3Sub.width = 34;
		fd_idV3Sub.top = new FormAttachment(subV3N, 0, SWT.TOP);
		fd_idV3Sub.left = new FormAttachment(cpV3Sub, 6);
		idV3Sub.setLayoutData(fd_idV3Sub);

		idV4Sub = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV4Sub = new FormData();
		fd_idV4Sub.width = 34;
		fd_idV4Sub.top = new FormAttachment(subV4N, 0, SWT.TOP);
		fd_idV4Sub.left = new FormAttachment(cpV4Sub, 6);
		idV4Sub.setLayoutData(fd_idV4Sub);

		idV5Sub = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV5Sub = new FormData();
		fd_idV5Sub.width = 34;
		fd_idV5Sub.top = new FormAttachment(subV5N, 0, SWT.TOP);
		fd_idV5Sub.left = new FormAttachment(cpV5Sub, 6);
		idV5Sub.setLayoutData(fd_idV5Sub);

		idV6Sub = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV6Sub = new FormData();
		fd_idV6Sub.width = 34;
		fd_idV6Sub.top = new FormAttachment(subV6N, 0, SWT.TOP);
		fd_idV6Sub.left = new FormAttachment(cpV6Sub, 6);
		idV6Sub.setLayoutData(fd_idV6Sub);

		idV7Sub = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV7Sub = new FormData();
		fd_idV7Sub.width = 34;
		fd_idV7Sub.top = new FormAttachment(subV7N, 0, SWT.TOP);
		fd_idV7Sub.left = new FormAttachment(cpV7Sub, 6);
		idV7Sub.setLayoutData(fd_idV7Sub);

		shirtV1Start = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_shirtV1Start = new FormData();
		fd_shirtV1Start.top = new FormAttachment(startV1N, 0, SWT.TOP);
		fd_shirtV1Start.left = new FormAttachment(idV1Start, 6);
		fd_shirtV1Start.width = 20;
		shirtV1Start.setLayoutData(fd_shirtV1Start);

		shirtV2Start = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_shirtV2Start = new FormData();
		fd_shirtV2Start.top = new FormAttachment(startV2N, 0, SWT.TOP);
		fd_shirtV2Start.left = new FormAttachment(idV2Start, 6);
		fd_shirtV2Start.width = 20;
		shirtV2Start.setLayoutData(fd_shirtV2Start);

		shirtV3Start = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_shirtV3Start = new FormData();
		fd_shirtV3Start.top = new FormAttachment(startV3N, 0, SWT.TOP);
		fd_shirtV3Start.left = new FormAttachment(idV3Start, 6);
		fd_shirtV3Start.width = 20;
		shirtV3Start.setLayoutData(fd_shirtV3Start);

		shirtV4Start = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_shirtV4Start = new FormData();
		fd_shirtV4Start.top = new FormAttachment(startV4N, 0, SWT.TOP);
		fd_shirtV4Start.left = new FormAttachment(idV4Start, 6);
		fd_shirtV4Start.width = 20;
		shirtV4Start.setLayoutData(fd_shirtV4Start);

		shirtV5Start = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_shirtV5Start = new FormData();
		fd_shirtV5Start.top = new FormAttachment(startV5N, 0, SWT.TOP);
		fd_shirtV5Start.left = new FormAttachment(idV5Start, 6);
		fd_shirtV5Start.width = 20;
		shirtV5Start.setLayoutData(fd_shirtV5Start);

		shirtV1Sub = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_shirtV1Sub = new FormData();
		fd_shirtV1Sub.top = new FormAttachment(subV1N, 0, SWT.TOP);
		fd_shirtV1Sub.left = new FormAttachment(idV1Sub, 6);
		fd_shirtV1Sub.width = 20;
		shirtV1Sub.setLayoutData(fd_shirtV1Sub);

		shirtV2Sub = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_shirtV2Sub = new FormData();
		fd_shirtV2Sub.top = new FormAttachment(subV2N, 0, SWT.TOP);
		fd_shirtV2Sub.left = new FormAttachment(idV2Sub, 6);
		fd_shirtV2Sub.width = 20;
		shirtV2Sub.setLayoutData(fd_shirtV2Sub);

		shirtV3Sub = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_shirtV3Sub = new FormData();
		fd_shirtV3Sub.top = new FormAttachment(subV3N, 0, SWT.TOP);
		fd_shirtV3Sub.left = new FormAttachment(idV3Sub, 6);
		fd_shirtV3Sub.width = 20;
		shirtV3Sub.setLayoutData(fd_shirtV3Sub);

		shirtV4Sub = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_shirtV4Sub = new FormData();
		fd_shirtV4Sub.top = new FormAttachment(subV4N, 0, SWT.TOP);
		fd_shirtV4Sub.left = new FormAttachment(idV4Sub, 6);
		fd_shirtV4Sub.width = 20;
		shirtV4Sub.setLayoutData(fd_shirtV4Sub);

		shirtV5Sub = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_shirtV5Sub = new FormData();
		fd_shirtV5Sub.top = new FormAttachment(subV5N, 0, SWT.TOP);
		fd_shirtV5Sub.left = new FormAttachment(idV5Sub, 6);
		fd_shirtV5Sub.width = 20;
		shirtV5Sub.setLayoutData(fd_shirtV5Sub);

		shirtV6Sub = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_shirtV6Sub = new FormData();
		fd_shirtV6Sub.top = new FormAttachment(subV6N, 0, SWT.TOP);
		fd_shirtV6Sub.left = new FormAttachment(idV6Sub, 6);
		fd_shirtV6Sub.width = 20;
		shirtV6Sub.setLayoutData(fd_shirtV6Sub);

		shirtV7Sub = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_shirtV7Sub = new FormData();
		fd_shirtV7Sub.top = new FormAttachment(subV7N, 0, SWT.TOP);
		fd_shirtV7Sub.left = new FormAttachment(idV7Sub, 6);
		fd_shirtV7Sub.width = 20;
		shirtV7Sub.setLayoutData(fd_shirtV7Sub);

		lblStaffVisitor = new Label(compositeVisitor, SWT.NONE);
		FormData fd_lblStaffVisitor = new FormData();
		fd_lblStaffVisitor.top = new FormAttachment(subV7N, 6);
		fd_lblStaffVisitor.left = new FormAttachment(lblTeamVisitor, 0,
				SWT.LEFT);
		lblStaffVisitor.setLayoutData(fd_lblStaffVisitor);
		lblStaffVisitor.setText("Staff");

		staffV1N = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_staffV1N = new FormData();
		fd_staffV1N.width = 120;
		fd_staffV1N.top = new FormAttachment(lblStaffVisitor, 6);
		fd_staffV1N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		staffV1N.setLayoutData(fd_staffV1N);

		staffV2N = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_staffV2N = new FormData();
		fd_staffV2N.width = 120;
		fd_staffV2N.top = new FormAttachment(staffV1N, 6);
		fd_staffV2N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		staffV2N.setLayoutData(fd_staffV2N);

		staffV3N = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_staffV3N = new FormData();
		fd_staffV3N.width = 120;
		fd_staffV3N.top = new FormAttachment(staffV2N, 6);
		fd_staffV3N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		staffV3N.setLayoutData(fd_staffV3N);

		staffV4N = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_staffV4N = new FormData();
		fd_staffV4N.width = 120;
		fd_staffV4N.top = new FormAttachment(staffV3N, 6);
		fd_staffV4N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		staffV4N.setLayoutData(fd_staffV4N);

		staffV5N = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_staffV5N = new FormData();
		fd_staffV5N.width = 120;
		fd_staffV5N.top = new FormAttachment(staffV4N, 6);
		fd_staffV5N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		staffV5N.setLayoutData(fd_staffV5N);

		staffV6N = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_staffV6N = new FormData();
		fd_staffV6N.width = 120;
		fd_staffV6N.top = new FormAttachment(staffV5N, 6);
		fd_staffV6N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		staffV6N.setLayoutData(fd_staffV6N);

		staffV7N = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_staffV7N = new FormData();
		fd_staffV7N.width = 120;
		fd_staffV7N.top = new FormAttachment(staffV6N, 6);
		fd_staffV7N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		staffV7N.setLayoutData(fd_staffV7N);

		staffV8N = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_staffV8N = new FormData();
		fd_staffV8N.width = 120;
		fd_staffV8N.top = new FormAttachment(staffV7N, 6);
		fd_staffV8N.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		staffV8N.setLayoutData(fd_staffV8N);

		idV1Staff = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV1Staff = new FormData();
		fd_idV1Staff.width = 34;
		fd_idV1Staff.top = new FormAttachment(staffV1N, 0, SWT.TOP);
		fd_idV1Staff.left = new FormAttachment(startGkV1, 0, SWT.LEFT);
		idV1Staff.setLayoutData(fd_idV1Staff);

		idV2Staff = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV2Staff = new FormData();
		fd_idV2Staff.width = 34;
		fd_idV2Staff.top = new FormAttachment(staffV2N, 0, SWT.TOP);
		fd_idV2Staff.left = new FormAttachment(startGkV1, 0, SWT.LEFT);
		idV2Staff.setLayoutData(fd_idV2Staff);

		idV3Staff = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV3Staff = new FormData();
		fd_idV3Staff.width = 34;
		fd_idV3Staff.top = new FormAttachment(staffV3N, 0, SWT.TOP);
		fd_idV3Staff.left = new FormAttachment(startGkV1, 0, SWT.LEFT);
		idV3Staff.setLayoutData(fd_idV3Staff);

		idV4Staff = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV4Staff = new FormData();
		fd_idV4Staff.width = 34;
		fd_idV4Staff.top = new FormAttachment(staffV4N, 0, SWT.TOP);
		fd_idV4Staff.left = new FormAttachment(startGkV1, 0, SWT.LEFT);
		idV4Staff.setLayoutData(fd_idV4Staff);

		idV5Staff = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV5Staff = new FormData();
		fd_idV5Staff.width = 34;
		fd_idV5Staff.top = new FormAttachment(staffV5N, 0, SWT.TOP);
		fd_idV5Staff.left = new FormAttachment(startGkV1, 0, SWT.LEFT);
		idV5Staff.setLayoutData(fd_idV5Staff);

		idV6Staff = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV6Staff = new FormData();
		fd_idV6Staff.width = 34;
		fd_idV6Staff.top = new FormAttachment(staffV6N, 0, SWT.TOP);
		fd_idV6Staff.left = new FormAttachment(startGkV1, 0, SWT.LEFT);
		idV6Staff.setLayoutData(fd_idV6Staff);

		idV7Staff = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV7Staff = new FormData();
		fd_idV7Staff.width = 34;
		fd_idV7Staff.top = new FormAttachment(staffV6N, 6);
		fd_idV7Staff.left = new FormAttachment(startGkV1, 0, SWT.LEFT);
		idV7Staff.setLayoutData(fd_idV7Staff);

		idV8Staff = new Text(compositeVisitor, SWT.BORDER);
		FormData fd_idV8Staff = new FormData();
		fd_idV8Staff.width = 34;
		fd_idV8Staff.top = new FormAttachment(staffV7N, 6);
		fd_idV8Staff.left = new FormAttachment(startGkV1, 0, SWT.LEFT);
		idV8Staff.setLayoutData(fd_idV8Staff);

		staffT1V = new Combo(compositeVisitor, SWT.NONE);
		staffT1V.setItems(manageModel.getStaffRoleItems());
		FormData fd_staffT1V = new FormData();
		fd_staffT1V.top = new FormAttachment(staffV1N, 0, SWT.TOP);
		fd_staffT1V.left = new FormAttachment(idV1Staff, 6);
		fd_staffT1V.width = 50;
		staffT1V.setLayoutData(fd_staffT1V);

		staffT2V = new Combo(compositeVisitor, SWT.NONE);
		staffT2V.setItems(manageModel.getStaffRoleItems());
		FormData fd_staffT2V = new FormData();
		fd_staffT2V.top = new FormAttachment(staffV2N, 0, SWT.TOP);
		fd_staffT2V.left = new FormAttachment(idV2Staff, 6);
		fd_staffT2V.width = 50;
		staffT2V.setLayoutData(fd_staffT2V);

		staffT3V = new Combo(compositeVisitor, SWT.NONE);
		staffT3V.setItems(manageModel.getStaffRoleItems());
		FormData fd_staffT3V = new FormData();
		fd_staffT3V.top = new FormAttachment(staffV3N, 0, SWT.TOP);
		fd_staffT3V.left = new FormAttachment(idV3Staff, 6);
		fd_staffT3V.width = 50;
		staffT3V.setLayoutData(fd_staffT3V);

		staffT4V = new Combo(compositeVisitor, SWT.NONE);
		staffT4V.setItems(manageModel.getStaffRoleItems());
		FormData fd_staffT4V = new FormData();
		fd_staffT4V.top = new FormAttachment(staffV4N, 0, SWT.TOP);
		fd_staffT4V.left = new FormAttachment(idV4Staff, 6);
		fd_staffT4V.width = 50;
		staffT4V.setLayoutData(fd_staffT4V);

		staffT5V = new Combo(compositeVisitor, SWT.NONE);
		staffT5V.setItems(manageModel.getStaffRoleItems());
		FormData fd_staffT5V = new FormData();
		fd_staffT5V.top = new FormAttachment(staffV5N, 0, SWT.TOP);
		fd_staffT5V.left = new FormAttachment(idV5Staff, 6);
		fd_staffT5V.width = 50;
		staffT5V.setLayoutData(fd_staffT5V);

		staffT6V = new Combo(compositeVisitor, SWT.NONE);
		staffT6V.setItems(manageModel.getStaffRoleItems());
		FormData fd_staffT6V = new FormData();
		fd_staffT6V.top = new FormAttachment(staffV6N, 0, SWT.TOP);
		fd_staffT6V.left = new FormAttachment(idV6Staff, 6);
		fd_staffT6V.width = 50;
		staffT6V.setLayoutData(fd_staffT6V);

		staffT7V = new Combo(compositeVisitor, SWT.NONE);
		staffT7V.setItems(manageModel.getStaffRoleItems());
		FormData fd_staffT7V = new FormData();
		fd_staffT7V.top = new FormAttachment(staffV7N, 0, SWT.TOP);
		fd_staffT7V.left = new FormAttachment(idV7Staff, 6);
		fd_staffT7V.width = 50;
		staffT7V.setLayoutData(fd_staffT7V);

		staffT8V = new Combo(compositeVisitor, SWT.NONE);
		staffT8V.setItems(manageModel.getStaffRoleItems());
		
		//TODO
		/*
		staffT8V.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				manageModel.setStaffT8VCombo(staffT8V, "TODO: ERROR");
				appendTextToLogging(manageModel.getStaffT8VCombo());
			}
		});
		staffT8V.select(manageModel.getStaffT8VSelection());
		*/
		
		FormData fd_staffT8V = new FormData();
		fd_staffT8V.top = new FormAttachment(staffV8N, 0, SWT.TOP);
		fd_staffT8V.left = new FormAttachment(idV8Staff, 6);
		fd_staffT8V.width = 50;
		staffT8V.setLayoutData(fd_staffT8V);

		Button btnLockFields = new Button(compositeVisitor, SWT.NONE);
		FormData fd_btnLockFields = new FormData();
		fd_btnLockFields.width = 150;
		fd_btnLockFields.bottom = new FormAttachment(100, -10);
		fd_btnLockFields.left = new FormAttachment(lblTeamVisitor, 0, SWT.LEFT);
		btnLockFields.setLayoutData(fd_btnLockFields);
		btnLockFields.setText("Lock fields");

		xpndtmVisitor.setHeight(700);

		Composite compositeMain = new Composite(compositeMiddle, SWT.NONE);
		compositeMain.setLayout(new FormLayout());
		FormData fd_compositeMain = new FormData();
		fd_compositeMain.top = new FormAttachment(0);
		fd_compositeMain.left = new FormAttachment(expandBarHome, 0);
		fd_compositeMain.bottom = new FormAttachment(100, 0);
		fd_compositeMain.right = new FormAttachment(expandBarVisitor, 0);
		compositeMain.setLayoutData(fd_compositeMain);

		time = new Label(compositeMain, SWT.CENTER);
		time.setAlignment(SWT.CENTER);
		time.setForeground(SWTResourceManager.getColor(205, 133, 63));
		time.setFont(SWTResourceManager.getFont("Score Board", 92, SWT.NORMAL));
		time.setBackground(SWTResourceManager.getColor(0, 0, 0));
		FormData fd_time = new FormData();
		fd_time.top = new FormAttachment(0, 0);
		fd_time.left = new FormAttachment(0, 0);
		fd_time.right = new FormAttachment(100, 0);
		fd_time.height = 130;

		time.setLayoutData(fd_time);
		time.setText("00:00");

		
		score = new Label(compositeMain, SWT.NONE);
		score.setFont(SWTResourceManager.getFont("Score Board", 39, SWT.NORMAL));
		score.setForeground(SWTResourceManager.getColor(205, 133, 63));
		score.setBackground(SWTResourceManager.getColor(0, 0, 0));
		score.setAlignment(SWT.CENTER);
		FormData fd_score = new FormData();
		fd_score.top = new FormAttachment(time, 0);
		fd_score.left = new FormAttachment(0, 0);
		fd_score.right = new FormAttachment(100, 0);
		fd_score.height = 60;
		score.setLayoutData(fd_score);
		score.setText("0:0");

		pHome = new Label(compositeMain, SWT.NONE);
		pHome.setFont(SWTResourceManager.getFont("Score Board", 20, SWT.NORMAL));
		pHome.setForeground(SWTResourceManager.getColor(205, 133, 63));
		pHome.setBackground(SWTResourceManager.getColor(0, 0, 0));
		pHome.setAlignment(SWT.LEFT);
		FormData fd_pHome = new FormData();
		fd_pHome.top = new FormAttachment(score, 0);
		fd_pHome.left = new FormAttachment(0, 0);
		fd_pHome.right = new FormAttachment(50, 0);
		fd_pHome.height = 45;
		pHome.setLayoutData(fd_pHome);
		
		pVisitor = new Label(compositeMain, SWT.NONE);
		pVisitor.setFont(SWTResourceManager.getFont("Score Board", 20, SWT.NORMAL));
		pVisitor.setForeground(SWTResourceManager.getColor(205, 133, 63));
		pVisitor.setBackground(SWTResourceManager.getColor(0, 0, 0));
		pVisitor.setAlignment(SWT.RIGHT);
		FormData fd_pVisitor = new FormData();
		fd_pVisitor.top = new FormAttachment(score, 0);
		fd_pVisitor.left = new FormAttachment(50, 0);
		fd_pVisitor.right = new FormAttachment(100, 0);
		fd_pVisitor.height = 45;
		pVisitor.setLayoutData(fd_pVisitor);
		
		
		manageTimeBtn = new Button(compositeMain, SWT.NONE);
		manageTimeBtn.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageST.manageTime();
			}
		});
		manageTimeBtn.setFont(SWTResourceManager.getFont("Score Board", 16,
				SWT.NORMAL));
		FormData fd_manageTimeBtn = new FormData();
		fd_manageTimeBtn.height = 50;
		fd_manageTimeBtn.top = new FormAttachment(pHome, 6);
		fd_manageTimeBtn.left = new FormAttachment(0, 10);
		fd_manageTimeBtn.right = new FormAttachment(100, -10);
		manageTimeBtn.setLayoutData(fd_manageTimeBtn);
		manageTimeBtn.setText("Test");

		btnFaultHome = new Button(compositeMain, SWT.NONE);
		btnFaultHome.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageST.manageHomeFaults();
			}
		});
		btnFaultHome.setFont(SWTResourceManager.getFont("Segoe UI", 26,
				SWT.BOLD));
		btnFaultHome.setText("0");
		btnFaultHome.setImage(SWTResourceManager.getImage(MainView.class,
				"/icons/whistle.png"));
		FormData fd_btnFaultHome = new FormData();
		fd_btnFaultHome.height = 80;
		fd_btnFaultHome.width = 220;
		fd_btnFaultHome.top = new FormAttachment(manageTimeBtn, 6);
		fd_btnFaultHome.left = new FormAttachment(0, 10);
		btnFaultHome.setLayoutData(fd_btnFaultHome);

		btnFaultVisitor = new Button(compositeMain, SWT.NONE);
		btnFaultVisitor.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageST.manageVisitorFaults();
			}
		});
		btnFaultVisitor.setFont(SWTResourceManager.getFont("Segoe UI", 26,
				SWT.BOLD));
		btnFaultVisitor.setText("0");
		btnFaultVisitor.setImage(SWTResourceManager.getImage(MainView.class,
				"/icons/whistle.png"));
		FormData fd_btnFaultVisitor = new FormData();
		fd_btnFaultVisitor.height = 80;
		fd_btnFaultVisitor.width = 220;
		fd_btnFaultVisitor.top = new FormAttachment(manageTimeBtn, 6);
		fd_btnFaultVisitor.right = new FormAttachment(manageTimeBtn, 0,
				SWT.RIGHT);
		btnFaultVisitor.setLayoutData(fd_btnFaultVisitor);

		btnYellowHome = new Button(compositeMain, SWT.NONE);
		btnYellowHome.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageST.giveHomeYellowCard();
			}
		});
		btnYellowHome.setImage(SWTResourceManager.getImage(MainView.class,
				"/icons/yellow.png"));
		FormData fd_btnYellowHome = new FormData();
		fd_btnYellowHome.height = 80;
		fd_btnYellowHome.width = 108;
		fd_btnYellowHome.top = new FormAttachment(btnFaultHome, 6);
		fd_btnYellowHome.left = new FormAttachment(manageTimeBtn, 0, SWT.LEFT);
		btnYellowHome.setLayoutData(fd_btnYellowHome);

		btnRedHome = new Button(compositeMain, SWT.NONE);
		btnRedHome.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageST.giveHomeRedCard();
			}
		});
		btnRedHome.setImage(SWTResourceManager.getImage(MainView.class,
				"/icons/red.png"));
		FormData fd_btnRedHome = new FormData();
		fd_btnRedHome.height = 80;
		fd_btnRedHome.width = 108;
		fd_btnRedHome.top = new FormAttachment(btnFaultHome, 6);
		fd_btnRedHome.left = new FormAttachment(btnYellowHome, 6);
		btnRedHome.setLayoutData(fd_btnRedHome);

		btnYellowVisitor = new Button(compositeMain, SWT.NONE);
		btnYellowVisitor.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageST.giveVisitorYellowCard();
			}
		});
		btnYellowVisitor.setImage(SWTResourceManager.getImage(MainView.class,
				"/icons/yellow.png"));
		FormData fd_btnYellowVisitor = new FormData();
		fd_btnYellowVisitor.height = 80;
		fd_btnYellowVisitor.width = 108;
		fd_btnYellowVisitor.top = new FormAttachment(btnFaultVisitor, 6);
		fd_btnYellowVisitor.right = new FormAttachment(manageTimeBtn, 0,
				SWT.RIGHT);
		btnYellowVisitor.setLayoutData(fd_btnYellowVisitor);

		btnRedVisitor = new Button(compositeMain, SWT.NONE);
		btnRedVisitor.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageST.giveVisitorRedCard();
			}
		});
		btnRedVisitor.setImage(SWTResourceManager.getImage(MainView.class,
				"/icons/red.png"));
		FormData fd_btnRedVisitor = new FormData();
		fd_btnRedVisitor.height = 80;
		fd_btnRedVisitor.width = 108;
		fd_btnRedVisitor.top = new FormAttachment(btnFaultVisitor, 6);
		fd_btnRedVisitor.right = new FormAttachment(btnYellowVisitor, -6);
		btnRedVisitor.setLayoutData(fd_btnRedVisitor);

		btnGoalVisitor = new Button(compositeMain, SWT.NONE);
		btnGoalVisitor.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageST.giveVisitorGoal();
			}
		});
		btnGoalVisitor.setImage(SWTResourceManager.getImage(MainView.class,
				"/icons/goal.png"));
		FormData fd_btnGoalVisitor = new FormData();
		fd_btnGoalVisitor.height = 80;
		fd_btnGoalVisitor.width = 108;
		fd_btnGoalVisitor.top = new FormAttachment(btnYellowVisitor, 6);
		fd_btnGoalVisitor.right = new FormAttachment(manageTimeBtn, 0,
				SWT.RIGHT);
		btnGoalVisitor.setLayoutData(fd_btnGoalVisitor);

		btnTOVisitor = new Button(compositeMain, SWT.NONE);
		btnTOVisitor.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageST.useVisitorTimeOut();
			}
		});
		btnTOVisitor.setImage(SWTResourceManager.getImage(MainView.class,
				"/icons/to.png"));
		FormData fd_btnTOVisitor = new FormData();
		fd_btnTOVisitor.height = 80;
		fd_btnTOVisitor.width = 108;
		fd_btnTOVisitor.top = new FormAttachment(btnRedVisitor, 6);
		fd_btnTOVisitor.right = new FormAttachment(btnRedVisitor, 0, SWT.RIGHT);
		btnTOVisitor.setLayoutData(fd_btnTOVisitor);

		btnGoalHome = new Button(compositeMain, SWT.NONE);
		btnGoalHome.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageST.giveHomeGoal();
			}
		});
		btnGoalHome.setImage(SWTResourceManager.getImage(MainView.class,
				"/icons/goal.png"));
		FormData fd_btnGoalHome = new FormData();
		fd_btnGoalHome.height = 80;
		fd_btnGoalHome.width = 108;
		fd_btnGoalHome.top = new FormAttachment(btnYellowHome, 6);
		fd_btnGoalHome.left = new FormAttachment(manageTimeBtn, 0, SWT.LEFT);
		btnGoalHome.setLayoutData(fd_btnGoalHome);

		btnTOHome = new Button(compositeMain, SWT.NONE);
		btnTOHome.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				manageST.useHomeTimeOut();
			}
		});
		btnTOHome.setImage(SWTResourceManager.getImage(MainView.class,
				"/icons/to.png"));
		FormData fd_btnTOHome = new FormData();
		fd_btnTOHome.height = 80;
		fd_btnTOHome.width = 108;
		fd_btnTOHome.top = new FormAttachment(btnRedHome, 6);
		fd_btnTOHome.left = new FormAttachment(btnRedHome, 0, SWT.LEFT);
		btnTOHome.setLayoutData(fd_btnTOHome);
		
		// Események táblája:

		table = new Table(compositeMain, SWT.BORDER | SWT.FULL_SELECTION);
		FormData fd_table = new FormData();
		fd_table.top = new FormAttachment(btnGoalHome, 6);
		fd_table.left = new FormAttachment(0, 6);
		fd_table.right = new FormAttachment(100, -6);
		fd_table.bottom = new FormAttachment(100, -6);
		table.setLayoutData(fd_table);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		updateTable();

		compositeMiddle.setSize(compositeMiddle.computeSize(SWT.DEFAULT,
				SWT.DEFAULT));
		sc.addListener(SWT.Resize, new Listener() {

			@Override
			public void handleEvent(Event event) {
				int h = compositeMiddle.getBounds().height;
				int w = sc.getBounds().width;

				compositeMiddle.setSize(w, h);
				if (sc.getVerticalBar().isVisible()) {
					FormData layoutData = (FormData) expandBarVisitor
							.getLayoutData();
					layoutData.right.offset = -sc.getVerticalBar().getSize().x;
				}
			}
		});

		createActions();
		initializeToolBar();
		initializeMenu();

		manageST = new ManageStateChart(this);
		manageModel.getEventsToLogging();
	}

	/**
	 * Create the actions.
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Initialize the toolbar.
	 */
	private void initializeToolBar() {
		// IToolBarManager toolbarManager = getViewSite().getActionBars()
		// .getToolBarManager();
	}

	/**
	 * Initialize the menu.
	 */
	private void initializeMenu() {
		// IMenuManager menuManager = getViewSite().getActionBars()
		// .getMenuManager();
	}

	@Override
	public void setFocus() {
		// Set the focus
	}

	public Match getModel() {
		return manageModel.getMatch();
	}

	public IManageModel getManageModel() {
		return manageModel;
	}

	public void createNew() {
		createPartControl(parent);
		parent.update();
		parent.redraw();
	}

	@Override
	public void partActivated(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partBroughtToTop(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partClosed(IWorkbenchPartReference partRef) {
		IWorkbenchPage page = getSite().getPage();
		try {
			page.showView(ID);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void partDeactivated(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partOpened(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partHidden(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partVisible(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}

	@Override
	public void partInputChanged(IWorkbenchPartReference partRef) {
		// TODO Auto-generated method stub

	}
}