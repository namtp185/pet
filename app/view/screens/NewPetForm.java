package app.view.screens;
import nextapp.echo.app.Button;
import nextapp.echo.app.TextField;
import nextapp.echo.app.Label;
import nextapp.echo.app.Column;
import app.view.messages.DateSelectionDialog;
import nextapp.echo.app.Grid;
import nextapp.echo.app.layout.ColumnLayoutData;
import nextapp.echo.app.layout.GridLayoutData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import app.view.messages.OwnerSelectionDialog;
import app.dto.PetDataDTO;
import app.view.messages.PetTypeSelectionDialog;
import app.presenter.petsAndOwners.AddNewPetPresenter;
import nextapp.echo.app.event.ActionEvent;
import nextapp.echo.app.event.WindowPaneEvent;
import nextapp.echo.app.event.ActionListener;
import nextapp.echo.app.event.WindowPaneListener;
import nextapp.echo.app.ContentPane;
import nextapp.echo.app.Insets;
import nextapp.echo.app.Color;
import nextapp.echo.app.FillImage;
import nextapp.echo.app.ResourceImageReference;
import nextapp.echo.app.Row;
import nextapp.echo.app.Alignment;
import app.dto.PetTypeDTO;
import nextapp.echo.app.Extent;
import app.dto.OwnerDTO;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:32
 */
public class NewPetForm extends ContentPane implements ActionListener, WindowPaneListener {

	private Button _closeButton;
	private TextField _currentDateTextField;
	private Button addNewOwnerButton;
	private Label ageLabel;
	private TextField ageTextField;
	private Button birthDateButton;
	private Label birthDateLabel;
	private TextField birthDateTextField;
	private Label cityLabel;
	private TextField cityTextField;
	private Column column;
	private DateSelectionDialog dateSelectionDialog;
	private Grid grid;
	private GridLayoutData gridLayout;
	private ResourceBundle labels;
	private Label nameLabel;
	private TextField nameTextField;
	private Label ownerFirstNameLabel;
	private TextField ownerFirstNameTextField;
	private Label ownerLabel;
	private Label ownerLastNameLabel;
	private TextField ownerLastNameTextField;
	private OwnerSelectionDialog ownerSelectionDialog;
	private PetDataDTO petDataDTO = null;
	private Label petDataHeaderLabel;
	private Label petTypeLabel;
	private PetTypeSelectionDialog petTypeSelectionDialog;
	private AddNewPetPresenter presenter;
	private Button savePetButton;
	private Label typeNameLabel;
	private TextField typeNameTextField;

	public NewPetForm(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid7528195854996177619-8219064274275821916--
	 * 416956673056005468-3540296134339870518redseeds_uid
	 * @param labels    redseeds_uid8553844694426406912-5998101067465583988--
	 * 1895737568163481810--6098217132214248858redseeds_uid
	 */
	public NewPetForm(AddNewPetPresenter presenter, ResourceBundle labels){
	
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
		petDataDTO = new PetDataDTO();
		populateControls();
	
	}

	/**
	 * 
	 * @param e    redseeds_uid-3096128521769547390--96414181870217544-
	 * 1979133056924697973--1613987889052489257redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("_closeButton")) {
		    presenter.closeCurrentPageAndFinalizeUseCase();
		}
	
		if (e.getActionCommand().equals("birthDateButton")) {
		    dateSelectionDialog = new DateSelectionDialog(labels);
		    dateSelectionDialog.addWindowPaneListener(this);
		    this.add(dateSelectionDialog);
		    _currentDateTextField = birthDateTextField;
		}
	
		if (e.getActionCommand().equals("changePetTypeButton")) {
			//TODO: enable this action
//		    List<PetTypeDTO> list = presenter.getPetTypeList();
//		    petTypeSelectionDialog = new PetTypeSelectionDialog(list, labels);
//		    petTypeSelectionDialog.addWindowPaneListener(this);
//		    this.add(petTypeSelectionDialog);
		}
	
		if (e.getActionCommand().equals("changeOwnerButton")) {
			//TODO: enable this action
//		    List<OwnerDTO> list = presenter.getOwnerList();
//		    ownerSelectionDialog = new OwnerSelectionDialog(list, labels);
//		    ownerSelectionDialog.addWindowPaneListener(this);
//		    this.add(ownerSelectionDialog);
		}
	
		if (e.getActionCommand().equals("savePetButton")) {
		    populateDTOs();
		    presenter.setPetDataDTO(petDataDTO);
		    presenter.savePetTriggered();
		}
		if (e.getActionCommand().equals("addNewOwnerButton")) {
		    presenter.invokeAddNewOwner();
		}
	
	}

	/**
	 * 
	 * @param e    redseeds_uid-5606007123582165664--1426997347897780563--
	 * 3376625676141684456--4877537035942358733redseeds_uid
	 */
	public void windowPaneClosing(WindowPaneEvent e){
	
		if (e.getSource() instanceof DateSelectionDialog) {
		    Date selection = dateSelectionDialog.getSelection();
		    if (selection != null) {
		        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		        if (_currentDateTextField != null)
		            _currentDateTextField.setText(dateFormat.format(selection));
		    }
		}
	
		if (e.getSource() instanceof PetTypeSelectionDialog) {
		    PetTypeDTO selection = petTypeSelectionDialog.getSelection();
		    if (selection != null) {
		        petDataDTO.setPetTypeID(selection.getPetTypeID());
		        petDataDTO.setTypeName(selection.getTypeName());
		        this.typeNameTextField.setText(selection.getTypeName());
	
		    }
		}
	
		if (e.getSource() instanceof OwnerSelectionDialog) {
		    OwnerDTO selection = ownerSelectionDialog.getSelection();
		    if (selection != null) {
		        petDataDTO.setOwnerID(selection.getOwnerID());
		        petDataDTO.setOwnerFirstName(selection.getOwnerFirstName());
		        petDataDTO.setOwnerLastName(selection.getOwnerLastName());
		        petDataDTO.setCity(selection.getCity());
		        this.ownerFirstNameTextField.setText(selection.getOwnerFirstName());
		        this.ownerLastNameTextField.setText(selection.getOwnerLastName());
		        this.cityTextField.setText(selection.getCity());
	
		    }
		}
	
	}

	private void addContent(){
	
		grid = new Grid(2);
		grid.setInsets(new Insets(10, 7));
		grid.setWidth(new Extent(100, Extent.PERCENT));
		grid.setStyleName("Default");
		column.add(grid);
	
		// *** Data view: pet data ***
	
		// Data view header
		petDataHeaderLabel = new Label(labels.getString("NewPetForm.PetData.Header"));
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		gridLayout.setInsets(new Insets(10));
		gridLayout.setBackground(new Color(105, 89, 205));
		gridLayout.setBackgroundImage(new FillImage(new ResourceImageReference("/resource/image/fill/LightBlueLine.png")));
		petDataHeaderLabel.setLayoutData(gridLayout);
		petDataHeaderLabel.setStyleName("Label.Header");
		grid.add(petDataHeaderLabel);
	
		// Main concept attribute: name
		nameLabel = new Label(labels.getString("NewPetForm.Label.PetData.Name "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		nameLabel.setLayoutData(gridLayout);
		grid.add(nameLabel);
	
		nameTextField = new TextField();
		nameTextField.setStyleName("Default");
		nameTextField.setWidth(new Extent(75, Extent.PERCENT));
		grid.add(nameTextField);
	
		// Main concept attribute: birth date
		birthDateLabel = new Label(labels.getString("NewPetForm.Label.PetData.BirthDate "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		birthDateLabel.setLayoutData(gridLayout);
		grid.add(birthDateLabel);
	
		Row birthDateRow = new Row();
		birthDateRow.setCellSpacing(new Extent(10));
		grid.add(birthDateRow);
		Column birthDateCol1 = new Column();
		birthDateCol1.setCellSpacing(new Extent(10));
		birthDateRow.add(birthDateCol1);
	
		Column birthDateCol2 = new Column();
		birthDateCol2.setCellSpacing(new Extent(10));
		birthDateRow.add(birthDateCol2);
		birthDateTextField = new TextField();
		birthDateTextField.setStyleName("Default");
		birthDateTextField.setWidth(new Extent(300, Extent.PX));
		birthDateCol1.add(birthDateTextField);
	
		birthDateButton = new Button(this.labels.getString("Button.Select"));
		birthDateButton.setStyleName("Button.Calendar");
		birthDateButton.setActionCommand("birthDateButton");
		birthDateButton.addActionListener(this);
		birthDateCol2.add(birthDateButton);
	
		// Main concept attribute: age
		ageLabel = new Label(labels.getString("NewPetForm.Label.PetData.Age "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		ageLabel.setLayoutData(gridLayout);
		grid.add(ageLabel);
	
		ageTextField = new TextField();
		ageTextField.setStyleName("Default");
		ageTextField.setWidth(new Extent(75, Extent.PERCENT));
		grid.add(ageTextField);
	
		// Related concept: pet type
	
		petTypeLabel = new Label(labels.getString("NewPetForm.Label.PetData.PetType"));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		petTypeLabel.setLayoutData(gridLayout);
		grid.add(petTypeLabel);
	
		Row petTypeRow = new Row();
		gridLayout = new GridLayoutData();
		gridLayout.setInsets(new Insets(6, 8));
		petTypeRow.setLayoutData(gridLayout);
		petTypeRow.setCellSpacing(new Extent(10));
		grid.add(petTypeRow);
	
		Column petTypeCol1 = new Column();
		ColumnLayoutData petTypeCL = new ColumnLayoutData();
		petTypeCL.setAlignment(Alignment.ALIGN_RIGHT);
		petTypeCol1.setLayoutData(petTypeCL);
		petTypeCol1.setCellSpacing(new Extent(10));
		petTypeRow.add(petTypeCol1);
	
		Column petTypeCol2 = new Column();
		petTypeCol2.setCellSpacing(new Extent(10));
		petTypeRow.add(petTypeCol2);
	
		Column petTypeCol3 = new Column();
		petTypeCol3.setCellSpacing(new Extent(10));
		petTypeRow.add(petTypeCol3);
	
		// Related concept attribute: type name
		typeNameLabel = new Label(labels.getString("NewPetForm.Label.PetData.PetType.TypeName "));
		petTypeCol1.add(typeNameLabel);
		typeNameTextField = new TextField();
		typeNameTextField.setStyleName("Default");
		typeNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		typeNameTextField.setEditable(false);
		petTypeCol2.add(typeNameTextField);
	
		// Select button
		Button changePetTypeButton = new Button(labels.getString("Button.Select"));
		changePetTypeButton.setStyleName("Button.Select");
		changePetTypeButton.setActionCommand("changePetTypeButton");
		changePetTypeButton.addActionListener(this);
		petTypeCol3.add(changePetTypeButton);
	
		// Related concept: owner
	
		ownerLabel = new Label(labels.getString("NewPetForm.Label.PetData.Owner"));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		ownerLabel.setLayoutData(gridLayout);
		grid.add(ownerLabel);
	
		Row ownerRow = new Row();
		gridLayout = new GridLayoutData();
		gridLayout.setInsets(new Insets(6, 8));
		ownerRow.setLayoutData(gridLayout);
		ownerRow.setCellSpacing(new Extent(10));
		grid.add(ownerRow);
	
		Column ownerCol1 = new Column();
		ColumnLayoutData ownerCL = new ColumnLayoutData();
		ownerCL.setAlignment(Alignment.ALIGN_RIGHT);
		ownerCol1.setLayoutData(ownerCL);
		ownerCol1.setCellSpacing(new Extent(10));
		ownerRow.add(ownerCol1);
	
		Column ownerCol2 = new Column();
		ownerCol2.setCellSpacing(new Extent(10));
		ownerRow.add(ownerCol2);
	
		Column ownerCol3 = new Column();
		ownerCol3.setCellSpacing(new Extent(10));
		ownerRow.add(ownerCol3);
	
		// Related concept attribute: owner first name
		ownerFirstNameLabel = new Label(labels.getString("NewPetForm.Label.PetData.Owner.OwnerFirstName "));
		ownerCol1.add(ownerFirstNameLabel);
		ownerFirstNameTextField = new TextField();
		ownerFirstNameTextField.setStyleName("Default");
		ownerFirstNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		ownerFirstNameTextField.setEditable(false);
		ownerCol2.add(ownerFirstNameTextField);
	
		// Related concept attribute: owner last name
		ownerLastNameLabel = new Label(labels.getString("NewPetForm.Label.PetData.Owner.OwnerLastName "));
		ownerCol1.add(ownerLastNameLabel);
		ownerLastNameTextField = new TextField();
		ownerLastNameTextField.setStyleName("Default");
		ownerLastNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		ownerLastNameTextField.setEditable(false);
		ownerCol2.add(ownerLastNameTextField);
	
		// Related concept attribute: city
		cityLabel = new Label(labels.getString("NewPetForm.Label.PetData.Owner.City "));
		ownerCol1.add(cityLabel);
		cityTextField = new TextField();
		cityTextField.setStyleName("Default");
		cityTextField.setWidth(new Extent(75, Extent.PERCENT));
		cityTextField.setEditable(false);
		ownerCol2.add(cityTextField);
	
		// Select button
		Button changeOwnerButton = new Button(labels.getString("Button.Select"));
		changeOwnerButton.setStyleName("Button.Select");
		changeOwnerButton.setActionCommand("changeOwnerButton");
		changeOwnerButton.addActionListener(this);
		ownerCol3.add(changeOwnerButton);
	
		// *** Action button ***
		savePetButton = new Button(labels.getString("NewPetForm.savePetButton"));
		savePetButton.setStyleName("Button.Default");
		savePetButton.setActionCommand("savePetButton");
		savePetButton.addActionListener(this);
		column.add(savePetButton);
	
		// *** Invoke button ***
		addNewOwnerButton = new Button(labels.getString("NewPetForm.addNewOwnerButton"));
		addNewOwnerButton.setStyleName("Button.Default");
		addNewOwnerButton.setActionCommand("addNewOwnerButton");
		addNewOwnerButton.addActionListener(this);
		column.add(addNewOwnerButton);
	
	}

	private void populateControls(){

	}

	private void populateDTOs(){
	
		if (nameTextField.getText() != null)
		    petDataDTO.setName(nameTextField.getText());
	
		if (birthDateTextField.getText() != null) {
		    Date date = null;
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		    try {
		        date = dateFormat.parse(birthDateTextField.getText());
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }
		    petDataDTO.setBirthDate(date);
		}
	
		if (ageTextField.getText() != null)
		    petDataDTO.setAge(Float.valueOf(ageTextField.getText()));
	
	}

}