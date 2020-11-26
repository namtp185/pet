package app.view.messages;
import nextapp.echo.app.Column;
import java.util.ResourceBundle;
import nextapp.echo.app.Label;
import nextapp.echo.app.Button;
import app.presenter.visits.CreateNewVisitPresenter;
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
public class InvalidVisitDataMessage extends WindowPane implements ActionListener {

	private Column column;
	private ResourceBundle labels;
	private Label messageText;
	private Button okButton;
	private CreateNewVisitPresenter presenter;
	private Row row;

	public InvalidVisitDataMessage(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid6474270936404579344-6074799814803887005-
	 * 2031100051847492705-6190351937116933975redseeds_uid
	 * @param labels    redseeds_uid7302910117455217168--727545651667176811--
	 * 408137921343527386-137824895502491912redseeds_uid
	 */
	public InvalidVisitDataMessage(CreateNewVisitPresenter presenter, ResourceBundle labels){
	
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
		messageText = new Label(labels.getString("InvalidVisitDataMessage.messageText"));
		column.add(messageText);
	
		// Add row layout
		row = new Row();
		row.setCellSpacing(new Extent(10));
		column.add(row);
	
		// Add buttons:
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("InvalidVisitDataMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
	
	}

	/**
	 * 
	 * @param e    redseeds_uid3958319772998430393-115075422995058842-
	 * 982302216242061134--5090782640409796754redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.invalidVisitDataMessageOKTriggered();
		}
	
	}

}