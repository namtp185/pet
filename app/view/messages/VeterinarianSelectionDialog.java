package app.view.messages;
import nextapp.echo.app.Column;
import nextapp.echo.app.Button;
import app.dto.VeterinarianDTO;
import nextapp.echo.app.list.DefaultListSelectionModel;
import nextapp.echo.app.Table;
import nextapp.echo.app.table.DefaultTableModel;
import nextapp.echo.app.event.ActionEvent;
import java.util.ResourceBundle;
import nextapp.echo.app.WindowPane;
import nextapp.echo.app.event.ActionListener;
import nextapp.echo.app.Extent;
import nextapp.echo.app.Insets;
import nextapp.echo.app.Alignment;
import app.view.auxiliary.TableHeaderRenderer;
import app.view.auxiliary.TableRenderer;
import nextapp.echo.app.layout.ColumnLayoutData;
import nextapp.echo.app.list.ListSelectionModel;
import java.util.List;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:35
 */
public class VeterinarianSelectionDialog extends WindowPane implements ActionListener {

	private Column column;
	private ResourceBundle labels;
	private List<VeterinarianDTO> list = null;
	private Button selectButton;
	private VeterinarianDTO selection = null;
	private DefaultListSelectionModel selectionModel;
	private Table table;
	private DefaultTableModel tableModel;

	public VeterinarianSelectionDialog(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param list    redseeds_uid-4557000731777928443--4053137701599985070--
	 * 5434612270067693541-8073823392297846843redseeds_uid
	 * @param labels    redseeds_uid8083685141134725110-1687620668093947501-
	 * 719653439501714710-8277124421759372141redseeds_uid
	 */
	public VeterinarianSelectionDialog(List<VeterinarianDTO> list, ResourceBundle labels){
	
		// Set style
		this.setStyleName("Default");
	
		// Add column layout
		column = new Column();
		column.setInsets(new Insets(10));
		column.setCellSpacing(new Extent(10));
		add(column);
	
		// Add message content
		setTitle(labels.getString("VeterinarianSelectionDialog.Title"));
		setModal(true);
		addContent();
	
		// Add Select button
		selectButton = new Button(labels.getString("Button.Select"));
		selectButton.setStyleName("Button.Default");
		selectButton.setActionCommand("selectButton");
		selectButton.addActionListener(this);
		ColumnLayoutData clRight = new ColumnLayoutData();
		clRight.setAlignment(Alignment.ALIGN_RIGHT);
		selectButton.setLayoutData(clRight);
		column.add(selectButton);
	
		// Set DTO
		this.list = list;
		populateControls();
	
	}

	/**
	 * 
	 * @param e    redseeds_uid-5540155485465429796--609994448617182112--
	 * 5517361495265217516-1756923449029605691redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("selectButton")) {
	
		    int row = selectionModel.getMinSelectedIndex();
		    if (row != -1) {
		        selection = list.get(row);
		    }
		    userClose();
		}
	
	}

	public VeterinarianDTO getSelection(){
		return selection;
	
	}

	private void addContent(){
	
		// Add table
		tableModel = new DefaultTableModel();
		selectionModel = new DefaultListSelectionModel();
		selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table = new Table(tableModel);
		table.setStyleName("Default");
		table.setSelectionModel(selectionModel);
		table.setSelectionEnabled(true);
		table.setDefaultHeaderRenderer(new TableHeaderRenderer());
		table.setDefaultRenderer(Object.class, new TableRenderer());
		table.setRolloverEnabled(true);
		table.setWidth(new Extent(100, Extent.PERCENT));
		column.add(table);
	
	}

	private void populateControls(){
	
		tableModel.setColumnCount(4);
		tableModel.setColumnName(0, labels.getString("VeterinarianSelectionDialog.ColumnName.Id"));
		tableModel.setColumnName(1, labels.getString("VeterinarianSelectionDialog.ColumnName.LastName"));
		tableModel.setColumnName(2, labels.getString("VeterinarianSelectionDialog.ColumnName.FirstName"));
		tableModel.setColumnName(3, labels.getString("VeterinarianSelectionDialog.ColumnName.MobileNumber"));
	
		if (list != null) {
		    tableModel.setRowCount(list.size());
		    for (int i =0; i < list.size(); i++) {
		        tableModel.setValueAt(list.get(i).getVeterinarianID() , 0, i);
		        tableModel.setValueAt(list.get(i).getLastName() , 1, i);
		        tableModel.setValueAt(list.get(i).getFirstName() , 2, i);
		        tableModel.setValueAt(list.get(i).getMobileNumber() , 3, i);
		    }
		}
	
	}

}