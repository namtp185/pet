package app.view.messages;
import nextapp.echo.app.Column;
import nextapp.echo.app.Button;
import app.dto.OwnerDTO;
import nextapp.echo.app.list.DefaultListSelectionModel;
import nextapp.echo.app.Table;
import nextapp.echo.app.table.DefaultTableModel;
import nextapp.echo.app.event.ActionEvent;
import java.util.ResourceBundle;
import nextapp.echo.app.WindowPane;
import nextapp.echo.app.event.ActionListener;
import nextapp.echo.app.Alignment;
import app.view.auxiliary.TableHeaderRenderer;
import app.view.auxiliary.TableRenderer;
import nextapp.echo.app.layout.ColumnLayoutData;
import nextapp.echo.app.list.ListSelectionModel;
import java.util.List;
import nextapp.echo.app.Extent;
import nextapp.echo.app.Insets;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:33
 */
public class OwnerSelectionDialog extends WindowPane implements ActionListener {

	private Column column;
	private ResourceBundle labels;
	private List<OwnerDTO> list = null;
	private Button selectButton;
	private OwnerDTO selection = null;
	private DefaultListSelectionModel selectionModel;
	private Table table;
	private DefaultTableModel tableModel;

	public OwnerSelectionDialog(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param list    redseeds_uid-445250671982486290--8052558238622971369--
	 * 5587473731831630636--1886653937190688853redseeds_uid
	 * @param labels    redseeds_uid-3345710618202220558-7974980169417860256-
	 * 5199287114800629793-8807279076632448498redseeds_uid
	 */
	public OwnerSelectionDialog(List<OwnerDTO> list, ResourceBundle labels){
	
		// Set style
		this.setStyleName("Default");
	
		// Add column layout
		column = new Column();
		column.setInsets(new Insets(10));
		column.setCellSpacing(new Extent(10));
		add(column);
	
		// Add message content
		setTitle(labels.getString("OwnerSelectionDialog.Title"));
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
	 * @param e    redseeds_uid-1872630894485671871--4189326520818916173--
	 * 5351538301465684590--3240124763011867667redseeds_uid
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

	public OwnerDTO getSelection(){
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
	
		tableModel.setColumnCount(7);
		tableModel.setColumnName(0, labels.getString("OwnerSelectionDialog.ColumnName.Id"));
		tableModel.setColumnName(1, labels.getString("OwnerSelectionDialog.ColumnName.OwnerFirstName"));
		tableModel.setColumnName(2, labels.getString("OwnerSelectionDialog.ColumnName.OwnerLastName"));
		tableModel.setColumnName(3, labels.getString("OwnerSelectionDialog.ColumnName.Address"));
		tableModel.setColumnName(4, labels.getString("OwnerSelectionDialog.ColumnName.City"));
		tableModel.setColumnName(5, labels.getString("OwnerSelectionDialog.ColumnName.PhoneNumber"));
		tableModel.setColumnName(6, labels.getString("OwnerSelectionDialog.ColumnName.Email"));
	
		if (list != null) {
		    tableModel.setRowCount(list.size());
		    for (int i =0; i < list.size(); i++) {
		        tableModel.setValueAt(list.get(i).getOwnerID() , 0, i);
		        tableModel.setValueAt(list.get(i).getOwnerFirstName() , 1, i);
		        tableModel.setValueAt(list.get(i).getOwnerLastName() , 2, i);
		        tableModel.setValueAt(list.get(i).getAddress() , 3, i);
		        tableModel.setValueAt(list.get(i).getCity() , 4, i);
		        tableModel.setValueAt(list.get(i).getPhoneNumber() , 5, i);
		        tableModel.setValueAt(list.get(i).getEmail() , 6, i);
		    }
		}
	
	}

}