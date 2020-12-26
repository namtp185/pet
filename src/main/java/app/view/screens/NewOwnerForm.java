package app.view.screens;
import nextapp.echo.app.Button;
import nextapp.echo.app.Label;
import nextapp.echo.app.TextField;
import nextapp.echo.app.Column;
import nextapp.echo.app.Grid;
import nextapp.echo.app.layout.GridLayoutData;
import java.util.ResourceBundle;
import app.dto.OwnerDataDTO;
import app.presenter.petsAndOwners.AddNewOwnerPresenter;
import nextapp.echo.app.event.ActionEvent;
import nextapp.echo.app.event.WindowPaneEvent;
import nextapp.echo.app.event.ActionListener;
import nextapp.echo.app.event.WindowPaneListener;
import nextapp.echo.app.ContentPane;
import nextapp.echo.app.Extent;
import nextapp.echo.app.Insets;
import nextapp.echo.app.Color;
import nextapp.echo.app.FillImage;
import nextapp.echo.app.ResourceImageReference;
import nextapp.echo.app.Alignment;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:32
 */
public class NewOwnerForm extends ContentPane implements ActionListener, WindowPaneListener {

	private Button _closeButton;
	private Label addressLabel;
	private TextField addressTextField;
	private Label cityLabel;
	private TextField cityTextField;
	private Column column;
	private Label emailLabel;
	private TextField emailTextField;
	private Grid grid;
	private GridLayoutData gridLayout;
	private ResourceBundle labels;
	private OwnerDataDTO ownerDataDTO = null;
	private Label ownerDataHeaderLabel;
	private Label ownerFirstNameLabel;
	private TextField ownerFirstNameTextField;
	private Label ownerLastNameLabel;
	private TextField ownerLastNameTextField;
	private Label phoneNumberLabel;
	private TextField phoneNumberTextField;
	private AddNewOwnerPresenter presenter;
	private Button saveOwnerButton;

	public NewOwnerForm(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid2014011862287472291-3304428270971879572--
	 * 4618193684920456457--1104064407641838614redseeds_uid
	 * @param labels    redseeds_uid5539006237584559630-7652019145977571832-
	 * 4909359183946370543-8040050279757319561redseeds_uid
	 */
	public NewOwnerForm(AddNewOwnerPresenter presenter, ResourceBundle labels){
	
		// Set presenter
		this.presenter = presenter;
	
		// Set labels resource bundle
		this.labels = labels;
	
		// Add column layout
		column = new Column();
		column.setInsets(new Insets(30, 15));
		column.setCellSpacing(new Extent(10));
		column.setStyleName("Column.ContentPane");
		add(column);
	
		// Add Close button
		_closeButton = new Button(labels.getString("Button.Back"));
		_closeButton.setStyleName("Button.Back");
		_closeButton.setActionCommand("_closeButton");
		_closeButton.addActionListener(this);
		column.add(_closeButton);
	
		// Add page content
		addContent();
	
		// Get or create DTOs
		ownerDataDTO = new OwnerDataDTO();
		populateControls();
	
	}

	/**
	 * 
	 * @param e    redseeds_uid-8061311919983018926--4468960822741102116-
	 * 789193846206601139--5742566895667333106redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("_closeButton")) {
		    presenter.closeCurrentPageAndFinalizeUseCase();
		}
	
		if (e.getActionCommand().equals("saveOwnerButton")) {
		    populateDTOs();
		    presenter.setOwnerDataDTO(ownerDataDTO);
		    presenter.saveOwnerTriggered();
		}
	}

	/**
	 * 
	 * @param e    redseeds_uid1196068983748133543--1992593741139709199-
	 * 1919075602915957521-454779516371504433redseeds_uid
	 */
	public void windowPaneClosing(WindowPaneEvent e){

	}

	private void addContent(){
	
		grid = new Grid(2);
		grid.setInsets(new Insets(10, 7));
		grid.setWidth(new Extent(100, Extent.PERCENT));
		grid.setStyleName("Default");
		column.add(grid);
	
		// *** Data view: owner data ***
	
		// Data view header
		ownerDataHeaderLabel = new Label(labels.getString("NewOwnerForm.OwnerData.Header"));
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		gridLayout.setInsets(new Insets(10));
		gridLayout.setBackground(new Color(105, 89, 205));
		gridLayout.setBackgroundImage(new FillImage(new ResourceImageReference("/resource/image/fill/LightBlueLine.png")));
		ownerDataHeaderLabel.setLayoutData(gridLayout);
		ownerDataHeaderLabel.setStyleName("Label.Header");
		grid.add(ownerDataHeaderLabel);
	
		// Main concept attribute: owner first name
		ownerFirstNameLabel = new Label(labels.getString("NewOwnerForm.Label.OwnerData.OwnerFirstName "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		ownerFirstNameLabel.setLayoutData(gridLayout);
		grid.add(ownerFirstNameLabel);
	
		ownerFirstNameTextField = new TextField();
		ownerFirstNameTextField.setStyleName("Default");
		ownerFirstNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		grid.add(ownerFirstNameTextField);
	
		// Main concept attribute: owner last name
		ownerLastNameLabel = new Label(labels.getString("NewOwnerForm.Label.OwnerData.OwnerLastName "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		ownerLastNameLabel.setLayoutData(gridLayout);
		grid.add(ownerLastNameLabel);
	
		ownerLastNameTextField = new TextField();
		ownerLastNameTextField.setStyleName("Default");
		ownerLastNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		grid.add(ownerLastNameTextField);
	
		// Main concept attribute: address
		addressLabel = new Label(labels.getString("NewOwnerForm.Label.OwnerData.Address "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		addressLabel.setLayoutData(gridLayout);
		grid.add(addressLabel);
	
		addressTextField = new TextField();
		addressTextField.setStyleName("Default");
		addressTextField.setWidth(new Extent(75, Extent.PERCENT));
		grid.add(addressTextField);
	
		// Main concept attribute: city
		cityLabel = new Label(labels.getString("NewOwnerForm.Label.OwnerData.City "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		cityLabel.setLayoutData(gridLayout);
		grid.add(cityLabel);
	
		cityTextField = new TextField();
		cityTextField.setStyleName("Default");
		cityTextField.setWidth(new Extent(75, Extent.PERCENT));
		grid.add(cityTextField);
	
		// Main concept attribute: phone number
		phoneNumberLabel = new Label(labels.getString("NewOwnerForm.Label.OwnerData.PhoneNumber "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		phoneNumberLabel.setLayoutData(gridLayout);
		grid.add(phoneNumberLabel);
	
		phoneNumberTextField = new TextField();
		phoneNumberTextField.setStyleName("Default");
		phoneNumberTextField.setWidth(new Extent(75, Extent.PERCENT));
		grid.add(phoneNumberTextField);
	
		// Main concept attribute: email
		emailLabel = new Label(labels.getString("NewOwnerForm.Label.OwnerData.Email "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		emailLabel.setLayoutData(gridLayout);
		grid.add(emailLabel);
	
		emailTextField = new TextField();
		emailTextField.setStyleName("Default");
		emailTextField.setWidth(new Extent(75, Extent.PERCENT));
		grid.add(emailTextField);
	
		// *** Action button ***
		saveOwnerButton = new Button(labels.getString("NewOwnerForm.saveOwnerButton"));
		saveOwnerButton.setStyleName("Button.Default");
		saveOwnerButton.setActionCommand("saveOwnerButton");
		saveOwnerButton.addActionListener(this);
		column.add(saveOwnerButton);
	
	}

	private void populateControls(){

	}

	private void populateDTOs(){
	
		if (ownerFirstNameTextField.getText() != null)
		    ownerDataDTO.setOwnerFirstName(ownerFirstNameTextField.getText());
	
		if (ownerLastNameTextField.getText() != null)
		    ownerDataDTO.setOwnerLastName(ownerLastNameTextField.getText());
	
		if (addressTextField.getText() != null)
		    ownerDataDTO.setAddress(addressTextField.getText());
	
		if (cityTextField.getText() != null)
		    ownerDataDTO.setCity(cityTextField.getText());
	
		if (phoneNumberTextField.getText() != null)
		    ownerDataDTO.setPhoneNumber(phoneNumberTextField.getText());
	
		if (emailTextField.getText() != null)
		    ownerDataDTO.setEmail(emailTextField.getText());
	
	}

}