package app.view.messages;
import nextapp.echo.app.Column;
import nextapp.echo.app.Button;
import app.dto.SpecialityDTO;
import nextapp.echo.app.list.DefaultListSelectionModel;
import nextapp.echo.app.Table;
import nextapp.echo.app.table.DefaultTableModel;
import nextapp.echo.app.event.ActionEvent;
import java.util.ResourceBundle;
import nextapp.echo.app.event.ActionListener;
import nextapp.echo.app.WindowPane;
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
 * @created 25-maj-2015 23:50:34
 */
public class SpecialitySelectionDialog extends WindowPane implements ActionListener {

	private Column column;
	private ResourceBundle labels;
	private List<SpecialityDTO> list = null;
	private Button selectButton;
	private SpecialityDTO selection = null;
	private DefaultListSelectionModel selectionModel;
	private Table table;
	private DefaultTableModel tableModel;

	public SpecialitySelectionDialog(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param list    redseeds_uid4059232973111970318-2419352125805255798--
	 * 8005920955106942426-200015229474322936redseeds_uid
	 * @param labels    redseeds_uid-8554932932778119984--1668322401338111076--
	 * 5562461915011221579--8077328861997354533redseeds_uid
	 */
	public SpecialitySelectionDialog(List<SpecialityDTO> list, ResourceBundle labels){
	
		// Set style
		this.setStyleName("Default");
	
		// Add column layout
		column = new Column();
		column.setInsets(new Insets(10));
		column.setCellSpacing(new Extent(10));
		add(column);
	
		// Add message content
		setTitle(labels.getString("SpecialitySelectionDialog.Title"));
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
	 * @param e    redseeds_uid-6458179631540670753--7197060586560403444--
	 * 1557564958316087033--7014495588935619155redseeds_uid
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

	public SpecialityDTO getSelection(){
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
	
		tableModel.setColumnCount(3);
		tableModel.setColumnName(0, labels.getString("SpecialitySelectionDialog.ColumnName.Id"));
		tableModel.setColumnName(1, labels.getString("SpecialitySelectionDialog.ColumnName.SpecialityName"));
		tableModel.setColumnName(2, labels.getString("SpecialitySelectionDialog.ColumnName.SpecialityCode"));
	
		if (list != null) {
		    tableModel.setRowCount(list.size());
		    for (int i =0; i < list.size(); i++) {
		        tableModel.setValueAt(list.get(i).getSpecialityID() , 0, i);
		        tableModel.setValueAt(list.get(i).getSpecialityName() , 1, i);
		        tableModel.setValueAt(list.get(i).getSpecialityCode() , 2, i);
		    }
		}
	
	}

}