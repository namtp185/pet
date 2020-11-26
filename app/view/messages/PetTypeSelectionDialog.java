package app.view.messages;
import nextapp.echo.app.Column;
import nextapp.echo.app.Button;
import app.dto.PetTypeDTO;
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
public class PetTypeSelectionDialog extends WindowPane implements ActionListener {

	private Column column;
	private ResourceBundle labels;
	private List<PetTypeDTO> list = null;
	private Button selectButton;
	private PetTypeDTO selection = null;
	private DefaultListSelectionModel selectionModel;
	private Table table;
	private DefaultTableModel tableModel;

	public PetTypeSelectionDialog(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param list    redseeds_uid8289081173554614377--3023900897754473927-
	 * 2119195912158830133--1071591287850737596redseeds_uid
	 * @param labels    redseeds_uid-1738376051083937443--4306949466191697776-
	 * 8801665245359645014-5912202271778980037redseeds_uid
	 */
	public PetTypeSelectionDialog(List<PetTypeDTO> list, ResourceBundle labels){
	
		// Set style
		this.setStyleName("Default");
	
		// Add column layout
		column = new Column();
		column.setInsets(new Insets(10));
		column.setCellSpacing(new Extent(10));
		add(column);
	
		// Add message content
		setTitle(labels.getString("PetTypeSelectionDialog.Title"));
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
	 * @param e    redseeds_uid8781803666959631431--1145677502703767129--
	 * 2060955768973399930--973611540838025698redseeds_uid
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

	public PetTypeDTO getSelection(){
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
	
		tableModel.setColumnCount(2);
		tableModel.setColumnName(0, labels.getString("PetTypeSelectionDialog.ColumnName.Id"));
		tableModel.setColumnName(1, labels.getString("PetTypeSelectionDialog.ColumnName.TypeName"));
	
		if (list != null) {
		    tableModel.setRowCount(list.size());
		    for (int i =0; i < list.size(); i++) {
		        tableModel.setValueAt(list.get(i).getPetTypeID() , 0, i);
		        tableModel.setValueAt(list.get(i).getTypeName() , 1, i);
		    }
		}
	
	}

}