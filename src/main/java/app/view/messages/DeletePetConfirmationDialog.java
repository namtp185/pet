package app.view.messages;
import nextapp.echo.app.Button;
import nextapp.echo.app.Column;
import java.util.ResourceBundle;
import nextapp.echo.app.Label;
import app.presenter.petsAndOwners.DeletePetPresenter;
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
public class DeletePetConfirmationDialog extends WindowPane implements ActionListener {

	private Button cancelButton;
	private Column column;
	private Button deleteButton;
	private ResourceBundle labels;
	private Label messageText;
	private DeletePetPresenter presenter;
	private Row row;

	public DeletePetConfirmationDialog(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-8165528212803706135-2435054211245492392-
	 * 2023737364235698836--306689030953630696redseeds_uid
	 * @param labels    redseeds_uid2053386246511301942-6735252446153630661-
	 * 7274336799452411045-1388632961986819059redseeds_uid
	 */
	public DeletePetConfirmationDialog(DeletePetPresenter presenter, ResourceBundle labels){
	
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
		messageText = new Label(labels.getString("DeletePetConfirmationDialog.messageText"));
		column.add(messageText);
	
		// Add row layout
		row = new Row();
		row.setCellSpacing(new Extent(10));
		column.add(row);
	
		// Add buttons:
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
		deleteButton = new Button(labels.getString("DeletePetConfirmationDialog.deleteButton"));
		deleteButton.setStyleName("Button.Default");
		deleteButton.setActionCommand("deleteButton");
		deleteButton.addActionListener(this);
		row.add(deleteButton);
	
		cancelButton = new Button(labels.getString("DeletePetConfirmationDialog.cancelButton"));
		cancelButton.setStyleName("Button.Default");
		cancelButton.setActionCommand("cancelButton");
		cancelButton.addActionListener(this);
		row.add(cancelButton);
	
	
	}

	/**
	 * 
	 * @param e    redseeds_uid7032298287841396838--2005319011574876156--
	 * 7840178016348697690--5850317263331519478redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
		if (e.getActionCommand().equals("deleteButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogDeleteTriggered();
		}
	
		if (e.getActionCommand().equals("cancelButton")) {
		    userClose();
		    presenter.deletePetConfirmationDialogCancelTriggered();
		}
	
	}

}