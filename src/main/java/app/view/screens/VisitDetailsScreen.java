package app.view.screens;
import nextapp.echo.app.Button;
import nextapp.echo.app.Label;
import nextapp.echo.app.TextField;
import nextapp.echo.app.Column;
import nextapp.echo.app.TextArea;
import nextapp.echo.app.Grid;
import nextapp.echo.app.layout.ColumnLayoutData;
import nextapp.echo.app.layout.GridLayoutData;
import nextapp.echo.app.CheckBox;

import java.text.SimpleDateFormat;
import java.util.ResourceBundle;
import app.presenter.visits.ShowVisitDetailsPresenter;
import app.dto.VisitDetailsDTO;
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

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:36
 */
public class VisitDetailsScreen extends ContentPane implements ActionListener, WindowPaneListener {

	private Button _closeButton;
	private Label birthDateLabel;
	private TextField birthDateTextField;
	private Column column;
	private Label dateLabel;
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
	private Label petLabel;
	private ShowVisitDetailsPresenter presenter;
	private Label veterinarianLabel;
	private VisitDetailsDTO visitDetailsDTO = null;
	private Label visitDetailsHeaderLabel;

	public VisitDetailsScreen(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-1724905811723896083-6843568345405402316--
	 * 8015122993094143752-12321031605822170redseeds_uid
	 * @param labels    redseeds_uid2610717263139180626-96660404188506374-
	 * 8134352767935666973-3116338513278174957redseeds_uid
	 */
	public VisitDetailsScreen(ShowVisitDetailsPresenter presenter, ResourceBundle labels){
	
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
		visitDetailsDTO = presenter.getVisitDetailsDTO();
		populateControls();
	
	}

	/**
	 * 
	 * @param e    redseeds_uid5855882647438369421-6923307059978681415--
	 * 3892461123838277484--5243106430005474061redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("_closeButton")) {
		    presenter.closeCurrentPageAndFinalizeUseCase();
		}
	
	}

	/**
	 * 
	 * @param e    redseeds_uid-7110892322494025995-4685331110980273137--
	 * 7251426823498211850-4091314925655967731redseeds_uid
	 */
	public void windowPaneClosing(WindowPaneEvent e){

	}

	private void addContent(){
	
		grid = new Grid(2);
		grid.setInsets(new Insets(10, 7));
		grid.setWidth(new Extent(100, Extent.PERCENT));
		grid.setStyleName("Default");
		column.add(grid);
	
		// *** Data view: visit details ***
	
		// Data view header
		visitDetailsHeaderLabel = new Label(labels.getString("VisitDetailsScreen.VisitDetails.Header"));
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		gridLayout.setInsets(new Insets(10));
		gridLayout.setBackground(new Color(105, 89, 205));
		gridLayout.setBackgroundImage(new FillImage(new ResourceImageReference("/resource/image/fill/LightBlueLine.png")));
		visitDetailsHeaderLabel.setLayoutData(gridLayout);
		visitDetailsHeaderLabel.setStyleName("Label.Header");
		grid.add(visitDetailsHeaderLabel);
	
		// Main concept attribute: date
		dateLabel = new Label(labels.getString("VisitDetailsScreen.Label.VisitDetails.Date "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		dateLabel.setLayoutData(gridLayout);
		grid.add(dateLabel);
	
		dateTextField = new TextField();
		dateTextField.setStyleName("Default");
		dateTextField.setWidth(new Extent(300, Extent.PX));
		dateTextField.setEditable(false);
		grid.add(dateTextField);
	
		// Main concept attribute: description
		descriptionLabel = new Label(labels.getString("VisitDetailsScreen.Label.VisitDetails.Description "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		descriptionLabel.setLayoutData(gridLayout);
		grid.add(descriptionLabel);
	
		descriptionTextArea = new TextArea();
		descriptionTextArea.setStyleName("Default");
		descriptionTextArea.setWidth(new Extent(75, Extent.PERCENT));
		descriptionTextArea.setHeight(new Extent(80, Extent.PX));
		descriptionTextArea.setEditable(false);
		grid.add(descriptionTextArea);
	
		// Main concept attribute: is first visit
		isFirstVisitLabel = new Label(labels.getString("VisitDetailsScreen.Label.VisitDetails.IsFirstVisit "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		isFirstVisitLabel.setLayoutData(gridLayout);
		grid.add(isFirstVisitLabel);
	
		isFirstVisitCheckBox = new CheckBox();
		grid.add(isFirstVisitCheckBox);
	
		// Related concept: veterinarian
	
		veterinarianLabel = new Label(labels.getString("VisitDetailsScreen.Label.VisitDetails.Veterinarian"));
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
	
	
		// Related concept attribute: last name
		lastNameLabel = new Label(labels.getString("VisitDetailsScreen.Label.VisitDetails.Veterinarian.LastName "));
		veterinarianCol1.add(lastNameLabel);
		lastNameTextField = new TextField();
		lastNameTextField.setStyleName("Default");
		lastNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		lastNameTextField.setEditable(false);
		veterinarianCol2.add(lastNameTextField);
	
		// Related concept attribute: first name
		firstNameLabel = new Label(labels.getString("VisitDetailsScreen.Label.VisitDetails.Veterinarian.FirstName "));
		veterinarianCol1.add(firstNameLabel);
		firstNameTextField = new TextField();
		firstNameTextField.setStyleName("Default");
		firstNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		firstNameTextField.setEditable(false);
		veterinarianCol2.add(firstNameTextField);
	
		// Related concept: pet
	
		petLabel = new Label(labels.getString("VisitDetailsScreen.Label.VisitDetails.Pet"));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		petLabel.setLayoutData(gridLayout);
		grid.add(petLabel);
	
		Row petRow = new Row();
		gridLayout = new GridLayoutData();
		gridLayout.setInsets(new Insets(6, 8));
		petRow.setLayoutData(gridLayout);
		petRow.setCellSpacing(new Extent(10));
		grid.add(petRow);
	
		Column petCol1 = new Column();
		ColumnLayoutData petCL = new ColumnLayoutData();
		petCL.setAlignment(Alignment.ALIGN_RIGHT);
		petCol1.setLayoutData(petCL);
		petCol1.setCellSpacing(new Extent(10));
		petRow.add(petCol1);
	
		Column petCol2 = new Column();
		petCol2.setCellSpacing(new Extent(10));
		petRow.add(petCol2);
	
	
		// Related concept attribute: name
		nameLabel = new Label(labels.getString("VisitDetailsScreen.Label.VisitDetails.Pet.Name "));
		petCol1.add(nameLabel);
		nameTextField = new TextField();
		nameTextField.setStyleName("Default");
		nameTextField.setWidth(new Extent(75, Extent.PERCENT));
		nameTextField.setEditable(false);
		petCol2.add(nameTextField);
	
		// Related concept attribute: birth date
		birthDateLabel = new Label(labels.getString("VisitDetailsScreen.Label.VisitDetails.Pet.BirthDate "));
		petCol1.add(birthDateLabel);
		birthDateTextField = new TextField();
		birthDateTextField.setStyleName("Default");
		birthDateTextField.setWidth(new Extent(75, Extent.PERCENT));
		birthDateTextField.setEditable(false);
		petCol2.add(birthDateTextField);
	
	}

	private void populateControls(){
	
		if (visitDetailsDTO.getDate() != null) {
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		    dateTextField.setText(dateFormat.format(visitDetailsDTO.getDate()));
		}
	
		if (visitDetailsDTO.getDescription() != null)
		    descriptionTextArea.setText(visitDetailsDTO.getDescription());
	
		if (visitDetailsDTO.getIsFirstVisit() != null)
		    isFirstVisitCheckBox.setSelected(visitDetailsDTO.getIsFirstVisit());
	
		if (visitDetailsDTO.getLastName() != null)
		    lastNameTextField.setText(visitDetailsDTO.getLastName());
	
		if (visitDetailsDTO.getFirstName() != null)
		    firstNameTextField.setText(visitDetailsDTO.getFirstName());
	
		if (visitDetailsDTO.getName() != null)
		    nameTextField.setText(visitDetailsDTO.getName());
	
		if (visitDetailsDTO.getBirthDate() != null) {
		    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		    birthDateTextField.setText(dateFormat.format(visitDetailsDTO.getBirthDate()));
		}
	
	}

	private void populateDTOs(){

	}

}