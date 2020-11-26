package app.view.messages;
import nextapp.echo.app.Column;
import java.util.ResourceBundle;
import nextapp.echo.app.Label;
import nextapp.echo.app.Button;
import app.presenter.veterinarians.EditVetPresenter;
import nextapp.echo.app.Row;
import nextapp.echo.app.event.ActionEvent;
import nextapp.echo.app.event.ActionListener;
import nextapp.echo.app.WindowPane;
import nextapp.echo.app.Extent;
import nextapp.echo.app.Insets;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:35
 */
public class VetUpdatedMessage extends WindowPane implements ActionListener {

	private Column column;
	private ResourceBundle labels;
	private Label messageText;
	private Button okButton;
	private EditVetPresenter presenter;
	private Row row;

	public VetUpdatedMessage(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid3325804504663988249--5747756149016282593--
	 * 7840642905803979736-442100285861397603redseeds_uid
	 * @param labels    redseeds_uid-5018988263756090066-8069195591121939852--
	 * 1973739953363025002-3509718275654553878redseeds_uid
	 */
	public VetUpdatedMessage(EditVetPresenter presenter, ResourceBundle labels){
	
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
		messageText = new Label(labels.getString("VetUpdatedMessage.messageText"));
		column.add(messageText);
	
		// Add row layout
		row = new Row();
		row.setCellSpacing(new Extent(10));
		column.add(row);
	
		// Add buttons:
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VetUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
	
	}

	/**
	 * 
	 * @param e    redseeds_uid2726323966351596636--8116209201532422528--
	 * 8709776876169839801--1893064058796553015redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.vetUpdatedMessageOKTriggered();
		}
	
	}

}