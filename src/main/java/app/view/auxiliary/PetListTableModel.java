package app.view.auxiliary;
import java.util.ResourceBundle;
import app.dto.PetListItemDTO;
import nextapp.echo.app.table.AbstractTableModel;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:34
 */
public class PetListTableModel extends AbstractTableModel {

	private ResourceBundle labels;
	private List<PetListItemDTO> rows = new ArrayList<PetListItemDTO>();

	public PetListTableModel(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param labels    redseeds_uid4983541731608406168--3079583384084283312-
	 * 8767836099187451721--4432620425050611940redseeds_uid
	 */
	public PetListTableModel(ResourceBundle labels){
		this.labels = labels;
	}

	/**
	 * 
	 * @param rows    redseeds_uid-1467440406038834146--5564226052702637337--
	 * 6734847195292768537--1753547831009577234redseeds_uid
	 */
	public void addRows(List<PetListItemDTO> rows){
		this.rows = rows;
		fireTableDataChanged();
	}

	/**
	 * 
	 * @param row    redseeds_uid-2797869563411336905-8736341332320836666--
	 * 1381355739049085849--3019101543467663516redseeds_uid
	 */
	public void deleteRow(int row){
		rows.remove(row);
		fireTableRowsDeleted(row, row);
	}

	public int getColumnCount(){
		return 7;
	}

	/**
	 * 
	 * @param column    redseeds_uid-3883748565928085625--4668360551192037837-
	 * 2891113705820487379--4476635805915635452redseeds_uid
	 */
	public String getColumnName(int column){
		switch (column) {
		case 0: return labels.getString("IDPetListTableModel.ColumnName.Id");
		case 1: return labels.getString("PetListTableModel.ColumnName.Name");
		case 2: return labels.getString("PetListTableModel.ColumnName.BirthDate");
		case 3: return labels.getString("PetListTableModel.ColumnName.OwnerFirstName");
		case 4: return labels.getString("PetListTableModel.ColumnName.OwnerLastName");
		case 5: return labels.getString("PetListTableModel.ColumnName.PhoneNumber");
		case 6: return labels.getString("PetListTableModel.ColumnName.TypeName");
		default: return null;
		}
	}

	/**
	 * 
	 * @param row    redseeds_uid437619370683301487--3700590015104773652--
	 * 8378755630922980507--2313090531433836231redseeds_uid
	 */
	public PetListItemDTO getRow(int row){
		return rows.get(row);
	}

	public int getRowCount(){
		return rows.size();
	}

	public List<PetListItemDTO> getRows(){
		return rows;
	}

	/**
	 * 
	 * @param column    redseeds_uid-1017921232227329770-6748188700850540160-
	 * 2873271923617040699-2863261360456056783redseeds_uid
	 * @param row    redseeds_uid3299013993674445745--439070477376496749--
	 * 6861962234335523848--1608939238244736284redseeds_uid
	 */
	public Object getValueAt(int column, int row){
		PetListItemDTO tableRow = rows.get(row);
		switch (column) {
		case 0: return tableRow.getPetID();
		case 1: return tableRow.getName();
		case 2: return tableRow.getBirthDate();
		case 3: return tableRow.getOwnerFirstName();
		case 4: return tableRow.getOwnerLastName();
		case 5: return tableRow.getPhoneNumber();
		case 6: return tableRow.getTypeName();
		default: return null;
		}
	}

}