package app.view.screens;
import nextapp.echo.app.Button;
import nextapp.echo.app.TextField;
import nextapp.echo.app.Label;
import nextapp.echo.app.Column;
import app.view.messages.DateSelectionDialog;
import nextapp.echo.app.TextArea;
import nextapp.echo.app.Grid;
import nextapp.echo.app.layout.ColumnLayoutData;
import nextapp.echo.app.layout.GridLayoutData;
import nextapp.echo.app.CheckBox;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import app.dto.PetDataDTO;
import app.presenter.visits.CreateNewVisitPresenter;
import app.view.messages.VeterinarianSelectionDialog;
import app.dto.VisitDataDTO;
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
import nextapp.echo.app.Row;
import nextapp.echo.app.Alignment;
import app.dto.VeterinarianDTO;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:32
 */
public class NewVisitForm extends ContentPane implements ActionListener, WindowPaneListener {

	private Button _closeButton;
	private TextField _currentDateTextField;
	private Label ageLabel;
	private TextField ageTextField;
	private Label birthDateLabel;
	private TextField birthDateTextField;
	private Label cityLabel;
	private TextField cityTextField;
	private Column column;
	private Button dateButton;
	private Label dateLabel;
	private DateSelectionDialog dateSelectionDialog;
	private TextField dateTextField;
	private Label descriptionLabel;
	private TextArea descriptionTextArea;
	private Label firstNameLabel;
	private TextField firstNameTextField;
	private Grid grid;
	private GridLayoutData gridLayout;
	private CheckBox isFirstVisitCheckBox;
	private Label isFirstVisitLabel;
	private ResourceBundle labels;
	private Label lastNameLabel;
	private TextField lastNameTextField;
	private Label nameLabel;
	private TextField nameTextField;
	private Label ownerFirstNameLabel;
	private TextField ownerFirstNameTextField;
	private Label ownerLabel;
	private Label ownerLastNameLabel;
	private TextField ownerLastNameTextField;
	private PetDataDTO petDataDTO = null;
	private Label petDataHeaderLabel;
	private Label petTypeLabel;
	private CreateNewVisitPresenter presenter;
	private Button saveVisitButton;
	private Label typeNameLabel;
	private TextField typeNameTextField;
	private Label veterinarianLabel;
	private VeterinarianSelectionDialog veterinarianSelectionDialog;
	private VisitDataDTO visitDataDTO = null;
	private Label visitDataHeaderLabel;

	public NewVisitForm(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid6957364963873962269--1607986429913081615-
	 * 248240233001260424-2921437791900453285redseeds_uid
	 * @param labels    redseeds_uid-1154407298049360170-4712213251853740521-
	 * 66787326935734945-3587316494085578936redseeds_uid
	 */
	public NewVisitForm(CreateNewVisitPresenter presenter, ResourceBundle labels){
	
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
		visitDataDTO = new VisitDataDTO();
		petDataDTO = presenter.getPetDataDTO();
		populateControls();
	
	}

	/**
	 * 
	 * @param e    redseeds_uid5770692642211051307--6564400789459378516-
	 * 2334458658015259107-7928862707358671452redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("_closeButton")) {
		    presenter.closeCurrentPageAndFinalizeUseCase();
		}
	
		if (e.getActionCommand().equals("dateButton")) {
		    dateSelectionDialog = new DateSelectionDialog(labels);
		    dateSelectionDialog.addWindowPaneListener(this);
		    this.add(dateSelectionDialog);
		    _currentDateTextField = dateTextField;
		}
	
		if (e.getActionCommand().equals("changeVeterinarianButton")) {
			//TODO: enable this action
//		    List<VeterinarianDTO> list = presenter.getVeterinarianList();
//		    veterinarianSelectionDialog = new VeterinarianSelectionDialog(list, labels);
//		    veterinarianSelectionDialog.addWindowPaneListener(this);
//		    this.add(veterinarianSelectionDialog);
		}
	
		if (e.getActionCommand().equals("saveVisitButton")) {
		    populateDTOs();
		    presenter.setVisitDataDTO(visitDataDTO);
		    presenter.saveVisitTriggered();
		}
	}

	/**
	 * 
	 * @param e    redseeds_uid-7992245471142438891--1703328462037096542--
	 * 9167027521663151833--2041403140703683572redseeds_uid
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
	
		if (e.getSource() instanceof VeterinarianSelectionDialog) {
		    VeterinarianDTO selection = veterinarianSelectionDialog.getSelection();
		    if (selection != null) {
		        visitDataDTO.setVeterinarianID(selection.getVeterinarianID());
		        visitDataDTO.setLastName(selection.getLastName());
		        visitDataDTO.setFirstName(selection.getFirstName());
		        this.lastNameTextField.setText(selection.getLastName());
		        this.firstNameTextField.setText(selection.getFirstName());
	
		    }
		}
	
	}

	private void addContent(){
	
		grid = new Grid(2);
		grid.setInsets(new Insets(10, 7));
		grid.setWidth(new Extent(100, Extent.PERCENT));
		grid.setStyleName("Default");
		column.add(grid);
	
		// *** Data view: visit data ***
	
		// Data view header
		visitDataHeaderLabel = new Label(labels.getString("NewVisitForm.VisitData.Header"));
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		gridLayout.setInsets(new Insets(10));
		gridLayout.setBackground(new Color(105, 89, 205));
		gridLayout.setBackgroundImage(new FillImage(new ResourceImageReference("/resource/image/fill/LightBlueLine.png")));
		visitDataHeaderLabel.setLayoutData(gridLayout);
		visitDataHeaderLabel.setStyleName("Label.Header");
		grid.add(visitDataHeaderLabel);
	
		// Main concept attribute: date
		dateLabel = new Label(labels.getString("NewVisitForm.Label.VisitData.Date "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		dateLabel.setLayoutData(gridLayout);
		grid.add(dateLabel);
	
		Row dateRow = new Row();
		dateRow.setCellSpacing(new Extent(10));
		grid.add(dateRow);
		Column dateCol1 = new Column();
		dateCol1.setCellSpacing(new Extent(10));
		dateRow.add(dateCol1);
	
		Column dateCol2 = new Column();
		dateCol2.setCellSpacing(new Extent(10));
		dateRow.add(dateCol2);
		dateTextField = new TextField();
		dateTextField.setStyleName("Default");
		dateTextField.setWidth(new Extent(300, Extent.PX));
		dateCol1.add(dateTextField);
	
		dateButton = new Button(this.labels.getString("Button.Select"));
		dateButton.setStyleName("Button.Calendar");
		dateButton.setActionCommand("dateButton");
		dateButton.addActionListener(this);
		dateCol2.add(dateButton);
	
		// Main concept attribute: description
		descriptionLabel = new Label(labels.getString("NewVisitForm.Label.VisitData.Description "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		descriptionLabel.setLayoutData(gridLayout);
		grid.add(descriptionLabel);
	
		descriptionTextArea = new TextArea();
		descriptionTextArea.setStyleName("Default");
		descriptionTextArea.setWidth(new Extent(75, Extent.PERCENT));
		descriptionTextArea.setHeight(new Extent(80, Extent.PX));
		grid.add(descriptionTextArea);
	
		// Main concept attribute: is first visit
		isFirstVisitLabel = new Label(labels.getString("NewVisitForm.Label.VisitData.IsFirstVisit "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		isFirstVisitLabel.setLayoutData(gridLayout);
		grid.add(isFirstVisitLabel);
	
		isFirstVisitCheckBox = new CheckBox();
		grid.add(isFirstVisitCheckBox);
	
		// Related concept: veterinarian
	
		veterinarianLabel = new Label(labels.getString("NewVisitForm.Label.VisitData.Veterinarian"));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		veterinarianLabel.setLayoutData(gridLayout);
		grid.add(veterinarianLabel);
	
		Row veterinarianRow = new Row();
		gridLayout = new GridLayoutData();
		gridLayout.setInsets(new Insets(6, 8));
		veterinarianRow.setLayoutData(gridLayout);
		veterinarianRow.setCellSpacing(new Extent(10));
		grid.add(veterinarianRow);
	
		Column veterinarianCol1 = new Column();
		ColumnLayoutData veterinarianCL = new ColumnLayoutData();
		veterinarianCL.setAlignment(Alignment.ALIGN_RIGHT);
		veterinarianCol1.setLayoutData(veterinarianCL);
		veterinarianCol1.setCellSpacing(new Extent(10));
		veterinarianRow.add(veterinarianCol1);
	
		Column veterinarianCol2 = new Column();
		veterinarianCol2.setCellSpacing(new Extent(10));
		veterinarianRow.add(veterinarianCol2);
	
		Column veterinarianCol3 = new Column();
		veterinarianCol3.setCellSpacing(new Extent(10));
		veterinarianRow.add(veterinarianCol3);
	
		// Related concept attribute: last name
		lastNameLabel = new Label(labels.getString("NewVisitForm.Label.VisitData.Veterinarian.LastName "));
		veterinarianCol1.add(lastNameLabel);
		lastNameTextField = new TextField();
		lastNameTextField.setStyleName("Default");
		lastNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		lastNameTextField.setEditable(false);
		veterinarianCol2.add(lastNameTextField);
	
		// Related concept attribute: first name
		firstNameLabel = new Label(labels.getString("NewVisitForm.Label.VisitData.Veterinarian.FirstName "));
		veterinarianCol1.add(firstNameLabel);
		firstNameTextField = new TextField();
		firstNameTextField.setStyleName("Default");
		firstNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		firstNameTextField.setEditable(false);
		veterinarianCol2.add(firstNameTextField);
	
		// Select button
		Button changeVeterinarianButton = new Button(labels.getString("Button.Select"));
		changeVeterinarianButton.setStyleName("Button.Select");
		changeVeterinarianButton.setActionCommand("changeVeterinarianButton");
		changeVeterinarianButton.addActionListener(this);
		veterinarianCol3.add(changeVeterinarianButton);
	
		// *** Data view: pet data ***
	
		// Data view header
		petDataHeaderLabel = new Label(labels.getString("NewVisitForm.PetData.Header"));
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		gridLayout.setInsets(new Insets(10));
		gridLayout.setBackground(new Color(105, 89, 205));
		gridLayout.setBackgroundImage(new FillImage(new ResourceImageReference("/resource/image/fill/LightBlueLine.png")));
		petDataHeaderLabel.setLayoutData(gridLayout);
		petDataHeaderLabel.setStyleName("Label.Header");
		grid.add(petDataHeaderLabel);
	
		// Main concept attribute: name
		nameLabel = new Label(labels.getString("NewVisitForm.Label.PetData.Name "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		nameLabel.setLayoutData(gridLayout);
		grid.add(nameLabel);
	
		nameTextField = new TextField();
		nameTextField.setStyleName("Default");
		nameTextField.setWidth(new Extent(75, Extent.PERCENT));
		nameTextField.setEditable(false);
		grid.add(nameTextField);
	
		// Main concept attribute: birth date
		birthDateLabel = new Label(labels.getString("NewVisitForm.Label.PetData.BirthDate "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		birthDateLabel.setLayoutData(gridLayout);
		grid.add(birthDateLabel);
	
		birthDateTextField = new TextField();
		birthDateTextField.setStyleName("Default");
		birthDateTextField.setWidth(new Extent(300, Extent.PX));
		birthDateTextField.setEditable(false);
		grid.add(birthDateTextField);
	
		// Main concept attribute: age
		ageLabel = new Label(labels.getString("NewVisitForm.Label.PetData.Age "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		ageLabel.setLayoutData(gridLayout);
		grid.add(ageLabel);
	
		ageTextField = new TextField();
		ageTextField.setStyleName("Default");
		ageTextField.setWidth(new Extent(75, Extent.PERCENT));
		ageTextField.setEditable(false);
		grid.add(ageTextField);
	
		// Related concept: pet type
	
		petTypeLabel = new Label(labels.getString("NewVisitForm.Label.PetData.PetType"));
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
	
	
		// Related concept attribute: type name
		typeNameLabel = new Label(labels.getString("NewVisitForm.Label.PetData.PetType.TypeName "));
		petTypeCol1.add(typeNameLabel);
		typeNameTextField = new TextField();
		typeNameTextField.setStyleName("Default");
		typeNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		typeNameTextField.setEditable(false);
		petTypeCol2.add(typeNameTextField);
	
		// Related concept: owner
	
		ownerLabel = new Label(labels.getString("NewVisitForm.Label.PetData.Owner"));
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
	
	
		// Related concept attribute: owner first name
		ownerFirstNameLabel = new Label(labels.getString("NewVisitForm.Label.PetData.Owner.OwnerFirstName "));
		ownerCol1.add(ownerFirstNameLabel);
		ownerFirstNameTextField = new TextField();
		ownerFirstNameTextField.setStyleName("Default");
		ownerFirstNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		ownerFirstNameTextField.setEditable(false);
		ownerCol2.add(ownerFirstNameTextField);
	
		// Related concept attribute: owner last name
		ownerLastNameLabel = new Label(labels.getString("NewVisitForm.Label.PetData.Owner.OwnerLastName "));
		ownerCol1.add(ownerLastNameLabel);
		ownerLastNameTextField = new TextField();
		ownerLastNameTextField.setStyleName("Default");
		ownerLastNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		ownerLastNameTextField.setEditable(false);
		ownerCol2.add(ownerLastNameTextField);
	
		// Related concept attribute: city
		cityLabel = new Label(labels.getString("NewVisitForm.Label.PetData.Owner.City "));
		ownerCol1.add(cityLabel);
		cityTextField = new TextField();
		cityTextField.setStyleName("Default");
		cityTextField.setWidth(new Extent(75, Extent.PERCENT));
		cityTextField.setEditable(false);
		ownerCol2.add(cityTextField);
	
		// *** Action button ***
		saveVisitButton = new Button(labels.getString("NewVisitForm.saveVisitButton"));
		saveVisitButton.setStyleName("Button.Default");
		saveVisitButton.setActionCommand("saveVisitButton");
		saveVisitButton.addActionListener(this);
		column.add(saveVisitButton);
	
	}

	private void populateControls(){
	
		if (petDataDTO.getName() != null)
		    nameTextField.setText(petDataDTO.getName());
	
		if (petDataDTO.getBirthDate() != null) {
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		    birthDateTextField.setText(dateFormat.format(petDataDTO.getBirthDate()));
		}
	
		if (petDataDTO.getAge() != null)
		    ageTextField.setText(petDataDTO.getAge().toString());
	
		if (petDataDTO.getTypeName() != null)
		    typeNameTextField.setText(petDataDTO.getTypeName());
	
		if (petDataDTO.getOwnerFirstName() != null)
		    ownerFirstNameTextField.setText(petDataDTO.getOwnerFirstName());
	
		if (petDataDTO.getOwnerLastName() != null)
		    ownerLastNameTextField.setText(petDataDTO.getOwnerLastName());
	
		if (petDataDTO.getCity() != null)
		    cityTextField.setText(petDataDTO.getCity());
	
	}

	private void populateDTOs(){
	
		if (dateTextField.getText() != null) {
		    Date date = null;
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		    try {
		        date = dateFormat.parse(dateTextField.getText());
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }
		    visitDataDTO.setDate(date);
		}
	
		if (descriptionTextArea.getText() != null)
		    visitDataDTO.setDescription(descriptionTextArea.getText());
	
		visitDataDTO.setIsFirstVisit(isFirstVisitCheckBox.isSelected());
	
	}

}