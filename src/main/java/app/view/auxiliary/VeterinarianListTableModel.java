package app.view.auxiliary;
import java.util.ResourceBundle;
import app.dto.VeterinarianListItemDTO;
import nextapp.echo.app.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:35
 */
public class VeterinarianListTableModel extends AbstractTableModel {

	private ResourceBundle labels;
	private List<VeterinarianListItemDTO> rows = new ArrayList<VeterinarianListItemDTO>();

	public VeterinarianListTableModel(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param labels    redseeds_uid1387071759756020585-6758284922730891463-
	 * 2709195104963090343--6950200571964151241redseeds_uid
	 */
	public VeterinarianListTableModel(ResourceBundle labels){
		this.labels = labels;
	}

	/**
	 * 
	 * @param rows    redseeds_uid-130391838060525614--367218354515052328-
	 * 6271876001697273463--3450584499641368934redseeds_uid
	 */
	public void addRows(List<VeterinarianListItemDTO> rows){
		this.rows = rows;
		fireTableDataChanged();
	}

	/**
	 * 
	 * @param row    redseeds_uid-1652848156793120202--3578919669617949140-
	 * 3546700938182707709-6780300425964490007redseeds_uid
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
	 * @param column    redseeds_uid6840642297527639241-268628982461181933--
	 * 3264505453536738543-2949075647922887031redseeds_uid
	 */
	public String getColumnName(int column){
		switch (column) {
		case 0: return labels.getString("IDVeterinarianListTableModel.ColumnName.Id");
		case 1: return labels.getString("VeterinarianListTableModel.ColumnName.FirstName");
		case 2: return labels.getString("VeterinarianListTableModel.ColumnName.LastName");
		case 3: return labels.getString("VeterinarianListTableModel.ColumnName.MobileNumber");
		case 4: return labels.getString("VeterinarianListTableModel.ColumnName.SpecialityName");
		default: return null;
		}
	}

	/**
	 * 
	 * @param row    redseeds_uid-5620237379985013599-6134789842184485896--
	 * 3215437386622751908-1683879116016375147redseeds_uid
	 */
	public VeterinarianListItemDTO getRow(int row){
		return rows.get(row);
	}

	public int getRowCount(){
		return rows.size();
	}

	public List<VeterinarianListItemDTO> getRows(){
		return rows;
	}

	/**
	 * 
	 * @param column    redseeds_uid2705949317006592090-6164120322691149837--
	 * 3937026875879576942-2572761100269030488redseeds_uid
	 * @param row    redseeds_uid8802382754161603775-1340224336483388205--
	 * 8218154847926885956-4165978233537631097redseeds_uid
	 */
	public Object getValueAt(int column, int row){
		VeterinarianListItemDTO tableRow = rows.get(row);
		switch (column) {
		case 0: return tableRow.getVeterinarianID();
		case 1: return tableRow.getFirstName();
		case 2: return tableRow.getLastName();
		case 3: return tableRow.getMobileNumber();
		case 4: return tableRow.getSpecialityNameList();
		default: return null;
		}
	}

}