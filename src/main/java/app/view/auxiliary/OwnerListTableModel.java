package app.view.auxiliary;
import java.util.ResourceBundle;
import app.dto.OwnerListItemDTO;
import nextapp.echo.app.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:33
 */
public class OwnerListTableModel extends AbstractTableModel {

	private ResourceBundle labels;
	private List<OwnerListItemDTO> rows = new ArrayList<OwnerListItemDTO>();

	public OwnerListTableModel(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param labels    redseeds_uid-2518559861091184658--4710879620368789490-
	 * 8281987923746811811--8694905576596162388redseeds_uid
	 */
	public OwnerListTableModel(ResourceBundle labels){
		this.labels = labels;
	}

	/**
	 * 
	 * @param rows    redseeds_uid-531514744356849434-7707507977635118951--
	 * 7697380388235816394-8458105322883670289redseeds_uid
	 */
	public void addRows(List<OwnerListItemDTO> rows){
		this.rows = rows;
		fireTableDataChanged();
	}

	/**
	 * 
	 * @param row    redseeds_uid4122545456574834507-8943493881828365872-
	 * 2253965635064895960-3004527760168702163redseeds_uid
	 */
	public void deleteRow(int row){
		rows.remove(row);
		fireTableRowsDeleted(row, row);
	}

	public int getColumnCount(){
		return 5;
	}

	/**
	 * 
	 * @param column    redseeds_uid-3930934090364744412--7831951335201287832--
	 * 1377635743833855857--7685014685015098162redseeds_uid
	 */
	public String getColumnName(int column){
		switch (column) {
		case 0: return labels.getString("IDOwnerListTableModel.ColumnName.Id");
		case 1: return labels.getString("OwnerListTableModel.ColumnName.OwnerFirstName");
		case 2: return labels.getString("OwnerListTableModel.ColumnName.OwnerLastName");
		case 3: return labels.getString("OwnerListTableModel.ColumnName.PhoneNumber");
		case 4: return labels.getString("OwnerListTableModel.ColumnName.Email");
		default: return null;
		}
	}

	/**
	 * 
	 * @param row    redseeds_uid-984237592097848837--5578142229214138568-
	 * 9183259497912398895-4810118434147504604redseeds_uid
	 */
	public OwnerListItemDTO getRow(int row){
		return rows.get(row);
	}

	public int getRowCount(){
		return rows.size();
	}

	public List<OwnerListItemDTO> getRows(){
		return rows;
	}

	/**
	 * 
	 * @param column    redseeds_uid-1905199026409210594-6053819327379526404--
	 * 8670995261891998842--1294627834124809469redseeds_uid
	 * @param row    redseeds_uid388688392634365696-1604368656749474243--
	 * 4007999585817575955--637957917866980726redseeds_uid
	 */
	public Object getValueAt(int column, int row){
		OwnerListItemDTO tableRow = rows.get(row);
		switch (column) {
		case 0: return tableRow.getOwnerID();
		case 1: return tableRow.getOwnerFirstName();
		case 2: return tableRow.getOwnerLastName();
		case 3: return tableRow.getPhoneNumber();
		case 4: return tableRow.getEmail();
		default: return null;
		}
	}

}