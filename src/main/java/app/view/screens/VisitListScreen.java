package app.view.screens;
import nextapp.echo.app.Button;
import nextapp.echo.app.Label;
import nextapp.echo.app.TextField;
import nextapp.echo.app.Column;
import nextapp.echo.app.Grid;
import nextapp.echo.app.layout.ColumnLayoutData;
import nextapp.echo.app.layout.GridLayoutData;
import java.util.ResourceBundle;
import app.dto.PetDataDTO;
import app.presenter.visits.ShowVisitsForPetPresenter;
import nextapp.echo.app.list.DefaultListSelectionModel;
import nextapp.echo.app.list.ListSelectionModel;
import nextapp.echo.app.Table;
import app.view.auxiliary.TableHeaderRenderer;
import app.view.auxiliary.TableRenderer;
import app.view.auxiliary.VisitListTableModel;
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
import app.dto.VisitListItemDTO;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:36
 */
public class VisitListScreen extends ContentPane implements ActionListener, WindowPaneListener {

	private Button _closeButton;
	private Label ageLabel;
	private TextField ageTextField;
	private Label birthDateLabel;
	private TextField birthDateTextField;
	private Label cityLabel;
	private TextField cityTextField;
	private Column column;
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
	private PetDataDTO petDataDTO = null;
	private Label petDataHeaderLabel;
	private Label petTypeLabel;
	private ShowVisitsForPetPresenter presenter;
	private Label typeNameLabel;
	private TextField typeNameTextField;
	private List<VisitListItemDTO> visitListDTO = null;
	private Label visitListHeaderLabel;
	private DefaultListSelectionModel visitListSelectionModel;
	private Table visitListTable;
	private VisitListTableModel visitListTableModel;

	public VisitListScreen(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-8878984992101760482-1984779949450337498-
	 * 1774870754925501481-4791504372496224498redseeds_uid
	 * @param labels    redseeds_uid-2319505832164115311-6624583517698237587-
	 * 7714035952815157467-7472667072834035356redseeds_uid
	 */
	public VisitListScreen(ShowVisitsForPetPresenter presenter, ResourceBundle labels){
	
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
		petDataDTO = presenter.getPetDataDTO();
		visitListDTO = presenter.getVisitListDTO();
		populateControls();
	
	}

	/**
	 * 
	 * @param e    redseeds_uid-8155543171237923571-1161939443182290541-
	 * 2007670486901726251-4949813343845920522redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("_closeButton")) {
		    presenter.closeCurrentPageAndFinalizeUseCase();
		}
	
	}

	/**
	 * 
	 * @param e    redseeds_uid-4144858929681513668--270335605436163165-
	 * 8748061233114952883--1365819852764132231redseeds_uid
	 */
	public void windowPaneClosing(WindowPaneEvent e){

	}

	private void addContent(){
	
		grid = new Grid(2);
		grid.setInsets(new Insets(10, 7));
		grid.setWidth(new Extent(100, Extent.PERCENT));
		grid.setStyleName("Default");
		column.add(grid);
	
		// *** Data view: pet data ***
	
		// Data view header
		petDataHeaderLabel = new Label(labels.getString("VisitListScreen.PetData.Header"));
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		gridLayout.setInsets(new Insets(10));
		gridLayout.setBackground(new Color(105, 89, 205));
		gridLayout.setBackgroundImage(new FillImage(new ResourceImageReference("/resource/image/fill/LightBlueLine.png")));
		petDataHeaderLabel.setLayoutData(gridLayout);
		petDataHeaderLabel.setStyleName("Label.Header");
		grid.add(petDataHeaderLabel);
	
		// Main concept attribute: name
		nameLabel = new Label(labels.getString("VisitListScreen.Label.PetData.Name "));
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
		birthDateLabel = new Label(labels.getString("VisitListScreen.Label.PetData.BirthDate "));
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
		ageLabel = new Label(labels.getString("VisitListScreen.Label.PetData.Age "));
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
	
		petTypeLabel = new Label(labels.getString("VisitListScreen.Label.PetData.PetType"));
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
		typeNameLabel = new Label(labels.getString("VisitListScreen.Label.PetData.PetType.TypeName "));
		petTypeCol1.add(typeNameLabel);
		typeNameTextField = new TextField();
		typeNameTextField.setStyleName("Default");
		typeNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		typeNameTextField.setEditable(false);
		petTypeCol2.add(typeNameTextField);
	
		// Related concept: owner
	
		ownerLabel = new Label(labels.getString("VisitListScreen.Label.PetData.Owner"));
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
		ownerFirstNameLabel = new Label(labels.getString("VisitListScreen.Label.PetData.Owner.OwnerFirstName "));
		ownerCol1.add(ownerFirstNameLabel);
		ownerFirstNameTextField = new TextField();
		ownerFirstNameTextField.setStyleName("Default");
		ownerFirstNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		ownerFirstNameTextField.setEditable(false);
		ownerCol2.add(ownerFirstNameTextField);
	
		// Related concept attribute: owner last name
		ownerLastNameLabel = new Label(labels.getString("VisitListScreen.Label.PetData.Owner.OwnerLastName "));
		ownerCol1.add(ownerLastNameLabel);
		ownerLastNameTextField = new TextField();
		ownerLastNameTextField.setStyleName("Default");
		ownerLastNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		ownerLastNameTextField.setEditable(false);
		ownerCol2.add(ownerLastNameTextField);
	
		// Related concept attribute: city
		cityLabel = new Label(labels.getString("VisitListScreen.Label.PetData.Owner.City "));
		ownerCol1.add(cityLabel);
		cityTextField = new TextField();
		cityTextField.setStyleName("Default");
		cityTextField.setWidth(new Extent(75, Extent.PERCENT));
		cityTextField.setEditable(false);
		ownerCol2.add(cityTextField);
	
		// *** Data view: visit list ***
	
		// Data view header
		visitListHeaderLabel = new Label(labels.getString("VisitListScreen.VisitList.Header"));
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		gridLayout.setInsets(new Insets(10));
		gridLayout.setBackground(new Color(105, 89, 205));
		gridLayout.setBackgroundImage(new FillImage(new ResourceImageReference("/resource/image/fill/LightBlueLine.png")));
		visitListHeaderLabel.setLayoutData(gridLayout);
		visitListHeaderLabel.setStyleName("Label.Header");
		grid.add(visitListHeaderLabel);
	
		// Add table
		visitListTableModel = new VisitListTableModel(labels);
		visitListSelectionModel = new DefaultListSelectionModel();
		visitListSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		visitListTable = new Table(visitListTableModel);
		visitListTable.setDefaultHeaderRenderer(new TableHeaderRenderer());
		visitListTable.setDefaultRenderer(Object.class, new TableRenderer());
		visitListTable.setSelectionModel(visitListSelectionModel);
		visitListTable.setSelectionEnabled(true);
		visitListTable.setStyleName("Default");
		visitListTable.setRolloverEnabled(true);
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		visitListTable.setLayoutData(gridLayout);
		grid.add(visitListTable);
	
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
	
		if (visitListDTO != null)
		    visitListTableModel.addRows(visitListDTO);
	
	}

	private void populateDTOs(){

	}

}