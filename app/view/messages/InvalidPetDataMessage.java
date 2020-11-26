package app.view.messages;
import nextapp.echo.app.Column;
import java.util.ResourceBundle;
import nextapp.echo.app.Label;
import nextapp.echo.app.Button;
import app.presenter.petsAndOwners.AddNewPetPresenter;
import nextapp.echo.app.Row;
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
public class InvalidPetDataMessage extends WindowPane implements ActionListener {

	private Column column;
	private ResourceBundle labels;
	private Label messageText;
	private Button okButton;
	private AddNewPetPresenter presenter;
	private Row row;

	public InvalidPetDataMessage(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-948912352452401782--3710971342271164925--
	 * 2599212129471432037-958845255793269232redseeds_uid
	 * @param labels    redseeds_uid-967933223793712875-1417313772286088441--
	 * 3036460530786953992--2794819448416992030redseeds_uid
	 */
	public InvalidPetDataMessage(AddNewPetPresenter presenter, ResourceBundle labels){
	
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
		messageText = new Label(labels.getString("InvalidPetDataMessage.messageText"));
		column.add(messageText);
	
		// Add row layout
		row = new Row();
		row.setCellSpacing(new Extent(10));
		column.add(row);
	
		// Add buttons:
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidPetDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
	
	}

	/**
	 * 
	 * @param e    redseeds_uid4538726640448879292-5325662508796122079-
	 * 4043961980845839657-6586350932075675612redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidPetDataMessageOKTriggered();
		}
	
	}

}