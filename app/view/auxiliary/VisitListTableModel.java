package app.view.auxiliary;
import java.util.ResourceBundle;
import app.dto.VisitListItemDTO;
import nextapp.echo.app.table.AbstractTableModel;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:36
 */
public class VisitListTableModel extends AbstractTableModel {

	private ResourceBundle labels;
	private List<VisitListItemDTO> rows = new ArrayList<VisitListItemDTO>();

	public VisitListTableModel(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param labels    redseeds_uid1681195643063357448-1535086398948572335-
	 * 2444283169350946499-6696375648062223634redseeds_uid
	 */
	public VisitListTableModel(ResourceBundle labels){
		this.labels = labels;
	}

	/**
	 * 
	 * @param rows    redseeds_uid9127475435971882465-881672003325599681--
	 * 8545239728073931035--4897366461559906837redseeds_uid
	 */
	public void addRows(List<VisitListItemDTO> rows){
		this.rows = rows;
		fireTableDataChanged();
	}

	/**
	 * 
	 * @param row    redseeds_uid-7625096570123365315-3244053034336209068--
	 * 615506948374509677-3502750640758487482redseeds_uid
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
	 * @param column    redseeds_uid8253660431510884179-1943426879524269523--
	 * 3450430775840656673--8066052965120190698redseeds_uid
	 */
	public String getColumnName(int column){
		switch (column) {
		case 0: return labels.getString("IDVisitListTableModel.ColumnName.Id");
		case 1: return labels.getString("VisitListTableModel.ColumnName.Date");
		case 2: return labels.getString("VisitListTableModel.ColumnName.IsFirstVisit");
		case 3: return labels.getString("VisitListTableModel.ColumnName.FirstName");
		case 4: return labels.getString("VisitListTableModel.ColumnName.LastName");
		default: return null;
		}
	}

	/**
	 * 
	 * @param row    redseeds_uid-5763228187367839287--2229196691456611431--
	 * 7625662851271302600-3802073363105036115redseeds_uid
	 */
	public VisitListItemDTO getRow(int row){
		return rows.get(row);
	}

	public int getRowCount(){
		return rows.size();
	}

	public List<VisitListItemDTO> getRows(){
		return rows;
	}

	/**
	 * 
	 * @param column    redseeds_uid-5978128180890913866-1004359635134133640--
	 * 1959634238399532625--5606448504160418436redseeds_uid
	 * @param row    redseeds_uid8655790628102599148-2161173083173026479-
	 * 1958638934154817266-6113134038078629303redseeds_uid
	 */
	public Object getValueAt(int column, int row){
		VisitListItemDTO tableRow = rows.get(row);
		switch (column) {
		case 0: return tableRow.getVisitID();
		case 1: return tableRow.getDate();
		case 2: return tableRow.getIsFirstVisit();
		case 3: return tableRow.getFirstName();
		case 4: return tableRow.getLastName();
		default: return null;
		}
	}

}