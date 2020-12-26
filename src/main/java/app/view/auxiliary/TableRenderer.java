package app.view.auxiliary;
import nextapp.echo.app.Component;
import nextapp.echo.app.Table;
import nextapp.echo.app.table.TableCellRenderer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import nextapp.echo.app.CheckBox;
import nextapp.echo.app.Insets;
import nextapp.echo.app.Label;
import nextapp.echo.app.Panel;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:34
 */
public class TableRenderer implements TableCellRenderer {

	public TableRenderer(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param table    redseeds_uid4845038496648953719--4576012897079128877--
	 * 4118453852885825382-4902638870727265984redseeds_uid
	 * @param value    redseeds_uid8453585443732829002--6461455862528065735-
	 * 1996435727998290665-300282731361489226redseeds_uid
	 * @param column    redseeds_uid-1982503203112960986--5181622777998021621--
	 * 6745468494069770211-6519947231874405582redseeds_uid
	 * @param row    redseeds_uid-4609602831508103699-2228022328205676525--
	 * 3556739502795407278--120853224708817359redseeds_uid
	 */
	public Component getTableCellRendererComponent(Table table, Object value, int column, int row){
	
		if (value == null) {
		    return null;
		}
	
		Panel container = new Panel();
		container.setInsets(new Insets(5, 3));
	
		// Set label value
		if (value instanceof Date) {
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		    Label label = new Label(dateFormat.format((Date) value));
		    container.add(label);
		} else if (value instanceof Boolean) {
		    CheckBox checkBox = new CheckBox();
		    checkBox.setSelected((boolean) value);
		    container.add(checkBox);
		} else if (value instanceof List<?>) {
		    StringBuilder str = new StringBuilder();
		    for(Object item : (List<?>) value)
		        str.append(item.toString() + ", ");
		    str.delete(str.lastIndexOf(","), str.lastIndexOf(" "));
		    Label label = new Label(str.toString());
		    container.add(label);
		} else {
		    Label label = new Label(value.toString());
		    container.add(label);
		}
	
		return container;
	
	}

}