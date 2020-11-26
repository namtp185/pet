package app.view.messages;
import nextapp.echo.app.Column;
import java.util.ResourceBundle;
import nextapp.echo.app.Label;
import nextapp.echo.app.Button;
import app.presenter.visits.EditVisitPresenter;
import nextapp.echo.app.Row;
import nextapp.echo.app.event.ActionEvent;
import nextapp.echo.app.event.ActionListener;
import nextapp.echo.app.WindowPane;
import nextapp.echo.app.Extent;
import nextapp.echo.app.Insets;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:36
 */
public class WrongVisitDataMessage extends WindowPane implements ActionListener {

	private Column column;
	private ResourceBundle labels;
	private Label messageText;
	private Button okButton;
	private EditVisitPresenter presenter;
	private Row row;

	public WrongVisitDataMessage(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid2886121664855138286-3218320370655358508-
	 * 9120823177480283047-2339895647150629120redseeds_uid
	 * @param labels    redseeds_uid1185493598169359917--7943521376608991322-
	 * 4336912513340714376--1167360633098824817redseeds_uid
	 */
	public WrongVisitDataMessage(EditVisitPresenter presenter, ResourceBundle labels){
	
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
		messageText = new Label(labels.getString("WrongVisitDataMessage.messageText"));
		column.add(messageText);
	
		// Add row layout
		row = new Row();
		row.setCellSpacing(new Extent(10));
		column.add(row);
	
		// Add buttons:
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("WrongVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
	
	}

	/**
	 * 
	 * @param e    redseeds_uid-6927170467823057928--4019446836926167408--
	 * 5861269749533088963--8482717117453776804redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.wrongVisitDataMessageOKTriggered();
		}
	
	}

}