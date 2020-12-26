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
import app.dto.PetSearchCriteriaDTO;
import app.view.messages.PetTypeSelectionDialog;
import app.presenter.petsAndOwners.FindPetPresenter;
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
import app.dto.PetTypeDTO;
import app.dto.OwnerDTO;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:34
 */
public class PetSearchForm extends ContentPane implements ActionListener, WindowPaneListener {

	private Button _closeButton;
	private TextField _currentDateTextField;
	private Button birthDateButton;
	private Label birthDateLabel;
	private TextField birthDateTextField;
	private Column column;
	private DateSelectionDialog dateSelectionDialog;
	private Grid grid;
	private GridLayoutData gridLayout;
	private ResourceBundle labels;
	private Label nameLabel;
	private TextField nameTextField;
	private Label ownerLabel;
	private Label ownerLastNameLabel;
	private TextField ownerLastNameTextField;
	private OwnerSelectionDialog ownerSelectionDialog;
	private PetSearchCriteriaDTO petSearchCriteriaDTO = null;
	private Label petSearchCriteriaHeaderLabel;
	private Label petTypeLabel;
	private PetTypeSelectionDialog petTypeSelectionDialog;
	private FindPetPresenter presenter;
	private Button seekPetButton;
	private Label typeNameLabel;
	private TextField typeNameTextField;

	public PetSearchForm(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid3827908827669725311-2945281087453892930-
	 * 7545439544221441801-4119239340291990938redseeds_uid
	 * @param labels    redseeds_uid4019134250755529565--5954934289751337039-
	 * 3992958740642390617-5478073431983255238redseeds_uid
	 */
	public PetSearchForm(FindPetPresenter presenter, ResourceBundle labels){
	
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
		petSearchCriteriaDTO = new PetSearchCriteriaDTO();
		populateControls();
	
	}

	/**
	 * 
	 * @param e    redseeds_uid6470279008948814830-7263925711982170400-
	 * 821511332163196829-5388277734346104939redseeds_uid
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
	
		if (e.getActionCommand().equals("seekPetButton")) {
		    populateDTOs();
		    presenter.setPetSearchCriteriaDTO(petSearchCriteriaDTO);
		    presenter.seekPetTriggered();
		}
	}

	/**
	 * 
	 * @param e    redseeds_uid-2446474503668475436--2847916763790468038--
	 * 1576414072191594367--5513072048594177717redseeds_uid
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
		        petSearchCriteriaDTO.setPetTypeID(selection.getPetTypeID());
		        petSearchCriteriaDTO.setTypeName(selection.getTypeName());
		        this.typeNameTextField.setText(selection.getTypeName());
	
		    }
		}
	
		if (e.getSource() instanceof OwnerSelectionDialog) {
		    OwnerDTO selection = ownerSelectionDialog.getSelection();
		    if (selection != null) {
		        petSearchCriteriaDTO.setOwnerID(selection.getOwnerID());
		        petSearchCriteriaDTO.setOwnerLastName(selection.getOwnerLastName());
		        this.ownerLastNameTextField.setText(selection.getOwnerLastName());
	
		    }
		}
	
	}

	private void addContent(){
	
		grid = new Grid(2);
		grid.setInsets(new Insets(10, 7));
		grid.setWidth(new Extent(100, Extent.PERCENT));
		grid.setStyleName("Default");
		column.add(grid);
	
		// *** Data view: pet search criteria ***
	
		// Data view header
		petSearchCriteriaHeaderLabel = new Label(labels.getString("PetSearchForm.PetSearchCriteria.Header"));
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		gridLayout.setInsets(new Insets(10));
		gridLayout.setBackground(new Color(105, 89, 205));
		gridLayout.setBackgroundImage(new FillImage(new ResourceImageReference("/resource/image/fill/LightBlueLine.png")));
		petSearchCriteriaHeaderLabel.setLayoutData(gridLayout);
		petSearchCriteriaHeaderLabel.setStyleName("Label.Header");
		grid.add(petSearchCriteriaHeaderLabel);
	
		// Main concept attribute: name
		nameLabel = new Label(labels.getString("PetSearchForm.Label.PetSearchCriteria.Name "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		nameLabel.setLayoutData(gridLayout);
		grid.add(nameLabel);
	
		nameTextField = new TextField();
		nameTextField.setStyleName("Default");
		nameTextField.setWidth(new Extent(75, Extent.PERCENT));
		grid.add(nameTextField);
	
		// Main concept attribute: birth date
		birthDateLabel = new Label(labels.getString("PetSearchForm.Label.PetSearchCriteria.BirthDate "));
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
	
		// Related concept: pet type
	
		petTypeLabel = new Label(labels.getString("PetSearchForm.Label.PetSearchCriteria.PetType"));
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
		typeNameLabel = new Label(labels.getString("PetSearchForm.Label.PetSearchCriteria.PetType.TypeName "));
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
	
		ownerLabel = new Label(labels.getString("PetSearchForm.Label.PetSearchCriteria.Owner"));
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
	
		// Related concept attribute: owner last name
		ownerLastNameLabel = new Label(labels.getString("PetSearchForm.Label.PetSearchCriteria.Owner.OwnerLastName "));
		ownerCol1.add(ownerLastNameLabel);
		ownerLastNameTextField = new TextField();
		ownerLastNameTextField.setStyleName("Default");
		ownerLastNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		ownerLastNameTextField.setEditable(false);
		ownerCol2.add(ownerLastNameTextField);
	
		// Select button
		Button changeOwnerButton = new Button(labels.getString("Button.Select"));
		changeOwnerButton.setStyleName("Button.Select");
		changeOwnerButton.setActionCommand("changeOwnerButton");
		changeOwnerButton.addActionListener(this);
		ownerCol3.add(changeOwnerButton);
	
		// *** Action button ***
		seekPetButton = new Button(labels.getString("PetSearchForm.seekPetButton"));
		seekPetButton.setStyleName("Button.Default");
		seekPetButton.setActionCommand("seekPetButton");
		seekPetButton.addActionListener(this);
		column.add(seekPetButton);
	
	}

	private void populateControls(){

	}

	private void populateDTOs(){
	
		if (nameTextField.getText() != null)
		    petSearchCriteriaDTO.setName(nameTextField.getText());
	
		if (birthDateTextField.getText() != null) {
		    Date date = null;
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		    try {
		        date = dateFormat.parse(birthDateTextField.getText());
		    } catch (ParseException e) {
		        e.printStackTrace();
		    }
		    petSearchCriteriaDTO.setBirthDate(date);
		}
	
	}

}