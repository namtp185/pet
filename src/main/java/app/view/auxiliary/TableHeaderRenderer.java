package app.view.auxiliary;
import nextapp.echo.app.Component;
import nextapp.echo.app.Table;
import nextapp.echo.app.table.TableCellRenderer;
import java.util.Locale;
import nextapp.echo.app.Insets;
import nextapp.echo.app.Label;
import nextapp.echo.app.Panel;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:34
 */
public class TableHeaderRenderer implements TableCellRenderer {

	public TableHeaderRenderer(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param table    redseeds_uid1880326888378461833-6925435473931106349--
	 * 4923657888533874392--4049681995688762231redseeds_uid
	 * @param value    redseeds_uid687786752068856386--2785282766381617138--
	 * 8551059289016483195-378796941545418482redseeds_uid
	 * @param column    redseeds_uid-5726971826512138415--1178496119161523732--
	 * 1499450113550141303-1686487526178197652redseeds_uid
	 * @param row    redseeds_uid3230176944646879808-2536480172965115078--
	 * 7177762005026833040-5262195966004886426redseeds_uid
	 */
	public Component getTableCellRendererComponent(Table table, Object value, int column, int row){
	
		if (value == null) {
		    return null;
		} else {
		    Panel container = new Panel();
		    container.setStyleName("Default");
		    container.setInsets(new Insets(5, 3));
		    Label label = new Label(value.toString().toUpperCase(Locale.ENGLISH));
		    label.setForeground(container.getForeground());
		    container.add(label);
		    return container;
		}
	
	}

}