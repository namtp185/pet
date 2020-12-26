package app.view.messages;
import nextapp.echo.app.Button;
import nextapp.echo.extras.app.CalendarSelect;
import nextapp.echo.app.Column;
import java.util.Date;
import java.util.ResourceBundle;

import nextapp.echo.app.event.ActionEvent;
import nextapp.echo.app.event.ActionListener;
import nextapp.echo.app.WindowPane;
import nextapp.echo.app.Extent;
import nextapp.echo.app.Insets;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:31
 */
public class DateSelectionDialog extends WindowPane implements ActionListener {

	private Button _selectButton;
	private CalendarSelect calendarSelect;
	private Column column;
	private Date selection = null;



	public void finalize() throws Throwable {
		super.finalize();
	}

	public DateSelectionDialog(ResourceBundle labels){
	
		// Set style
		this.setStyleName("Default");
	
		// Add column layout
		column = new Column();
		column.setInsets(new Insets(10));
		column.setCellSpacing(new Extent(10));
		add(column);
	
		// Add message content
		setTitle("Select date...");
		setModal(false);
		setWidth(new Extent(240, Extent.PX));
		setResizable(false);
	
		calendarSelect = new CalendarSelect();
		calendarSelect.setStyleName("Default");
		column.add(calendarSelect);
	
		// Add Select button
		_selectButton = new Button("Select");
		_selectButton.setStyleName("Button.Default");
		_selectButton.setActionCommand("_selectButton");
		_selectButton.addActionListener(this);
		column.add(_selectButton);
	
	}

	/**
	 * 
	 * @param e    redseeds_uid3354506715163069969-6899251451076396505-
	 * 2842207252100946645--5871814020392549980redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
		if (e.getActionCommand().equals("_selectButton")) {
		    selection = calendarSelect.getDate();
		    userClose();
		}
	}

	public Date getSelection(){
		return selection;
	}

}