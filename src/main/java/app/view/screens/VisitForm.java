package app.view.screens;
import nextapp.echo.app.Button;
import nextapp.echo.app.TextField;
import nextapp.echo.app.Column;
import nextapp.echo.app.Label;
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
import app.presenter.visits.EditVisitPresenter;
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
 * @created 25-maj-2015 23:50:36
 */
public class VisitForm extends ContentPane implements ActionListener, WindowPaneListener {

	private Button _closeButton;
	private TextField _currentDateTextField;
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
	private EditVisitPresenter presenter;
	private Button updateVisitButton;
	private Label veterinarianLabel;
	private VeterinarianSelectionDialog veterinarianSelectionDialog;
	private VisitDataDTO visitDataDTO = null;
	private Label visitDataHeaderLabel;

	public VisitForm(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-1901560315130177180--6488867723470972405-
	 * 8016093189991995475--3003707038771494027redseeds_uid
	 * @param labels    redseeds_uid5305940444746631059-5729109781083335819--
	 * 8320661824084842532-4217070595111144801redseeds_uid
	 */
	public VisitForm(EditVisitPresenter presenter, ResourceBundle labels){
	
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
		visitDataDTO = presenter.getVisitDataDTO();
		populateControls();
	
	}

	/**
	 * 
	 * @param e    redseeds_uid-6306827289748750276-1668540201189706334--
	 * 1448307316244868997-3820273126787931653redseeds_uid
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
	
		if (e.getActionCommand().equals("updateVisitButton")) {
		    populateDTOs();
		    presenter.setVisitDataDTO(visitDataDTO);
		    presenter.updateVisitTriggered();
		}
	}

	/**
	 * 
	 * @param e    redseeds_uid65989639030199452--5326175118566518335-
	 * 5946915490029092142--3071749474187794412redseeds_uid
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
		visitDataHeaderLabel = new Label(labels.getString("VisitForm.VisitData.Header"));
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		gridLayout.setInsets(new Insets(10));
		gridLayout.setBackground(new Color(105, 89, 205));
		gridLayout.setBackgroundImage(new FillImage(new ResourceImageReference("/resource/image/fill/LightBlueLine.png")));
		visitDataHeaderLabel.setLayoutData(gridLayout);
		visitDataHeaderLabel.setStyleName("Label.Header");
		grid.add(visitDataHeaderLabel);
	
		// Main concept attribute: date
		dateLabel = new Label(labels.getString("VisitForm.Label.VisitData.Date "));
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
		descriptionLabel = new Label(labels.getString("VisitForm.Label.VisitData.Description "));
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
		isFirstVisitLabel = new Label(labels.getString("VisitForm.Label.VisitData.IsFirstVisit "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		isFirstVisitLabel.setLayoutData(gridLayout);
		grid.add(isFirstVisitLabel);
	
		isFirstVisitCheckBox = new CheckBox();
		grid.add(isFirstVisitCheckBox);
	
		// Related concept: veterinarian
	
		veterinarianLabel = new Label(labels.getString("VisitForm.Label.VisitData.Veterinarian"));
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
		lastNameLabel = new Label(labels.getString("VisitForm.Label.VisitData.Veterinarian.LastName "));
		veterinarianCol1.add(lastNameLabel);
		lastNameTextField = new TextField();
		lastNameTextField.setStyleName("Default");
		lastNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		lastNameTextField.setEditable(false);
		veterinarianCol2.add(lastNameTextField);
	
		// Related concept attribute: first name
		firstNameLabel = new Label(labels.getString("VisitForm.Label.VisitData.Veterinarian.FirstName "));
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
	
		// *** Action button ***
		updateVisitButton = new Button(labels.getString("VisitForm.updateVisitButton"));
		updateVisitButton.setStyleName("Button.Default");
		updateVisitButton.setActionCommand("updateVisitButton");
		updateVisitButton.addActionListener(this);
		column.add(updateVisitButton);
	
	}

	private void populateControls(){
	
		if (visitDataDTO.getDate() != null) {
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		    dateTextField.setText(dateFormat.format(visitDataDTO.getDate()));
		}
	
		if (visitDataDTO.getDescription() != null)
		    descriptionTextArea.setText(visitDataDTO.getDescription());
	
		if (visitDataDTO.getIsFirstVisit() != null)
		    isFirstVisitCheckBox.setSelected(visitDataDTO.getIsFirstVisit());
	
		if (visitDataDTO.getLastName() != null)
		    lastNameTextField.setText(visitDataDTO.getLastName());
	
		if (visitDataDTO.getFirstName() != null)
		    firstNameTextField.setText(visitDataDTO.getFirstName());
	
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