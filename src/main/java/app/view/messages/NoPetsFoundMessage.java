package app.view.messages;
import nextapp.echo.app.Column;
import java.util.ResourceBundle;
import nextapp.echo.app.Label;
import nextapp.echo.app.Button;
import app.presenter.petsAndOwners.FindPetPresenter;
import nextapp.echo.app.Row;
import nextapp.echo.app.event.ActionEvent;
import nextapp.echo.app.event.ActionListener;
import nextapp.echo.app.WindowPane;
import nextapp.echo.app.Extent;
import nextapp.echo.app.Insets;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:32
 */
public class NoPetsFoundMessage extends WindowPane implements ActionListener {

	private Column column;
	private ResourceBundle labels;
	private Label messageText;
	private Button noButton;
	private FindPetPresenter presenter;
	private Row row;
	private Button yesButton;

	public NoPetsFoundMessage(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid6917350402218642097--6339387058187247198--
	 * 6451599472841057625--3843855459568953732redseeds_uid
	 * @param labels    redseeds_uid-6305070349589280120--1901135735467104913--
	 * 3867962664259276913--6601608626837640134redseeds_uid
	 */
	public NoPetsFoundMessage(FindPetPresenter presenter, ResourceBundle labels){
	
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
		messageText = new Label(labels.getString("NoPetsFoundMessage.messageText"));
		column.add(messageText);
	
		// Add row layout
		row = new Row();
		row.setCellSpacing(new Extent(10));
		column.add(row);
	
		// Add buttons:
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
		yesButton = new Button(labels.getString("NoPetsFoundMessage.yesButton"));
		yesButton.setStyleName("Button.Default");
		yesButton.setActionCommand("yesButton");
		yesButton.addActionListener(this);
		row.add(yesButton);
	
		noButton = new Button(labels.getString("NoPetsFoundMessage.noButton"));
		noButton.setStyleName("Button.Default");
		noButton.setActionCommand("noButton");
		noButton.addActionListener(this);
		row.add(noButton);
	
	
	}

	/**
	 * 
	 * @param e    redseeds_uid3431262775688457123-6440294668135980514--
	 * 7030921461046489087-8718151726890059332redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
		if (e.getActionCommand().equals("yesButton")) {
		    userClose();
		    presenter.noPetsFoundMessageYesTriggered();
		}
	
		if (e.getActionCommand().equals("noButton")) {
		    userClose();
		    presenter.noPetsFoundMessageNoTriggered();
		}
	
	}

}