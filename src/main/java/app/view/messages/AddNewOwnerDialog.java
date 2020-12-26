package app.view.messages;
import nextapp.echo.app.Column;
import java.util.ResourceBundle;
import nextapp.echo.app.Label;
import nextapp.echo.app.Button;
import app.presenter.petsAndOwners.ListAllOwnersPresenter;
import nextapp.echo.app.Row;
import nextapp.echo.app.event.ActionEvent;
import nextapp.echo.app.event.ActionListener;
import nextapp.echo.app.WindowPane;
import nextapp.echo.app.Extent;
import nextapp.echo.app.Insets;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:30
 */
public class AddNewOwnerDialog extends WindowPane implements ActionListener {

	private Column column;
	private ResourceBundle labels;
	private Label messageText;
	private Button noButton;
	private ListAllOwnersPresenter presenter;
	private Row row;
	private Button yesButton;

	public AddNewOwnerDialog(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-8019429483892181059-4278191097920539633-
	 * 4297195069262386670-6568414415891181805redseeds_uid
	 * @param labels    redseeds_uid-7847564164450603775-4056710417315253117--
	 * 2394437173012543053--2986563479280097466redseeds_uid
	 */
	public AddNewOwnerDialog(ListAllOwnersPresenter presenter, ResourceBundle labels){
	
		// Set style
		this.setStyleName("Default");
	
		// Set presenter
		this.presenter = presenter;
	
		// Set labels resource bundle
		this.labels = labels;
	
		// Add column layout
		column = new Column();
		column.setInsets(new Insets(50));
		column.setCellSpacing(new Extent(10));
		add(column);
	
		// Add message content
		setTitle(labels.getString("Message.Title"));
		setModal(true);
		messageText = new Label(labels.getString("AddNewOwnerDialog.messageText"));
		column.add(messageText);
	
		// Add row layout
		row = new Row();
		row.setCellSpacing(new Extent(10));
		column.add(row);
	
		// Add buttons:
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("AddNewOwnerDialog.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("AddNewOwnerDialog.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
	
	}

	/**
	 * 
	 * @param e    redseeds_uid9103313751189318074-8598887448894547650-
	 * 5014863563498587759--7144872817530543113redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.addNewOwnerDialogYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.addNewOwnerDialogNoTriggered();
		}
	
	}

}