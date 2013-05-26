package hu.bme.mit.inf.mdsd.one.app.composites;

import hu.bme.mit.inf.mdsd.one.app.management.SearchHelper.SearchViewerFilter;

import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

public class SearchDialog extends Dialog {

	protected Object result;
	protected Shell shell;
	private Text text;
	private TableViewer tableViewer;
	private IStructuredContentProvider content;
	private LabelProvider label;
	private Object input;
	private TableViewerColumn tableViewerColumn;
	private TableViewerColumn tblvwrclmnShirtNo;
	private TableViewerColumn tblvwrclmnNewColumn;
	private TableViewerColumn tblvwrclmnRole;
	private TableViewerColumn tblvwrclmnTeam;
	private SearchViewerFilter filter = new SearchViewerFilter();
	
	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public SearchDialog(Shell parent, int style) {
		super(parent, style);
		setText("Search Dialog");
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shell.open();
		shell.layout();
		Display display = getParent().getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shell = new Shell(getParent(), getStyle());
		shell.setSize(583, 331);
		shell.setText(getText());
		shell.setLayout(new FormLayout());
		
		text = new Text(shell, SWT.BORDER | SWT.SEARCH);
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				updateFilter();
			}
		});
		FormData fd_text = new FormData();
		fd_text.top = new FormAttachment(0, 10);
		fd_text.left = new FormAttachment(0, 10);
		fd_text.right = new FormAttachment(100, -10);
		text.setLayoutData(fd_text);
		
		tableViewer = new TableViewer(shell, SWT.BORDER | SWT.V_SCROLL | SWT.FULL_SELECTION);
		
		Table table = tableViewer.getTable();
		table.setTouchEnabled(true);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		table.setEnabled(true);
		
		FormData fd_table = new FormData();
		fd_table.top = new FormAttachment(text, 6);
		fd_table.left = new FormAttachment(0, 10);
		fd_table.bottom = new FormAttachment(100, -6);
		fd_table.right = new FormAttachment(100, -10);
		table.setLayoutData(fd_table);			
		
		tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tableColumn = tableViewerColumn.getColumn();		
		tableColumn.setText("#");
		tableColumn.setWidth(28);
		
		tblvwrclmnShirtNo = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnShirtNo = tblvwrclmnShirtNo.getColumn();
		tblclmnShirtNo.setResizable(false);
		tblclmnShirtNo.setWidth(33);
		tblclmnShirtNo.setText("No.");
		
		tblvwrclmnNewColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnNewColumn = tblvwrclmnNewColumn.getColumn();
		tblclmnNewColumn.setResizable(false);
		tblclmnNewColumn.setWidth(158);
		tblclmnNewColumn.setText("Name");
		
		tblvwrclmnRole = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnRole = tblvwrclmnRole.getColumn();
		tblclmnRole.setResizable(false);
		tblclmnRole.setWidth(148);
		tblclmnRole.setText("Role");
		
		tblvwrclmnTeam = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnTeam = tblvwrclmnTeam.getColumn();
		tblclmnTeam.setResizable(false);
		tblclmnTeam.setWidth(161);
		tblclmnTeam.setText("Team");
	
		tableViewer.setContentProvider(content);
		tableViewer.setLabelProvider(label);
		tableViewer.setInput(input);
		tableViewer.addFilter(filter);
		
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			private boolean update;

			private ISelection lastSelection;

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
			    if (event.getSelection().isEmpty() && !update) {
			        update = true;
			        tableViewer.setSelection(lastSelection);
			        update = false;
			    } else if (!event.getSelection().isEmpty()) {
			        lastSelection = event.getSelection();
			    }
			}
		});
		
		tableViewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				StructuredSelection selection = (StructuredSelection) tableViewer.getSelection();
				
				if(!selection.isEmpty()) {
					result = selection.getFirstElement();
					shell.dispose();
				}
			}
		});
	}

	protected void updateFilter() {
		filter.setText(text.getText());
		tableViewer.refresh();
	}

	public void setContentProvider(IStructuredContentProvider content) {
		this.content = content;
	}

	public void setLabelProvider(LabelProvider label) {
		this.label = label;
	}

	public void setInput(Object input) {
		this.input = input;
	}
}
