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
public class VisitUpdatedMessage extends WindowPane implements ActionListener {

	private Column column;
	private ResourceBundle labels;
	private Label messageText;
	private Button okButton;
	private EditVisitPresenter presenter;
	private Row row;

	public VisitUpdatedMessage(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid882743182702947133--80172359316512907--
	 * 4719862238339677350--7439816194056947441redseeds_uid
	 * @param labels    redseeds_uid1653589464891619210--450968587932371780--
	 * 7706374993237442763--1664857525135531450redseeds_uid
	 */
	public VisitUpdatedMessage(EditVisitPresenter presenter, ResourceBundle labels){
	
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
		messageText = new Label(labels.getString("VisitUpdatedMessage.messageText"));
		column.add(messageText);
	
		// Add row layout
		row = new Row();
		row.setCellSpacing(new Extent(10));
		column.add(row);
	
		// Add buttons:
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
		okButton = new Button(labels.getString("VisitUpdatedMessage.okButton"));
		okButton.setStyleName("Button.Default");
		okButton.setActionCommand("okButton");
		okButton.addActionListener(this);
		row.add(okButton);
	
	
	}

	/**
	 * 
	 * @param e    redseeds_uid3912129843105510237-6517423125562066483-
	 * 2359064418652699067-3737093056269329407redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
		if (e.getActionCommand().equals("okButton")) {
		    userClose();
		    presenter.visitUpdatedMessageOKTriggered();
		}
	
	}

}