package app.view.screens;
import nextapp.echo.app.Button;
import nextapp.echo.app.Column;
import nextapp.echo.app.Label;
import nextapp.echo.app.TextField;
import nextapp.echo.app.Grid;
import nextapp.echo.app.layout.GridLayoutData;
import java.util.ResourceBundle;
import app.presenter.veterinarians.EditVetPresenter;
import nextapp.echo.app.list.DefaultListSelectionModel;
import nextapp.echo.app.Table;
import nextapp.echo.app.table.DefaultTableModel;
import app.view.auxiliary.TableHeaderRenderer;
import app.view.auxiliary.TableRenderer;
import app.view.messages.SpecialitySelectionDialog;
import app.dto.VeterinarianDataDTO;
import nextapp.echo.app.event.ActionEvent;
import nextapp.echo.app.event.WindowPaneEvent;
import nextapp.echo.app.event.ActionListener;
import nextapp.echo.app.event.WindowPaneListener;
import nextapp.echo.app.ContentPane;
import nextapp.echo.app.FillImage;
import nextapp.echo.app.ResourceImageReference;
import nextapp.echo.app.Row;
import nextapp.echo.app.Alignment;
import app.dto.SpecialityDTO;
import nextapp.echo.app.list.ListSelectionModel;
import nextapp.echo.app.Extent;
import nextapp.echo.app.Insets;
import nextapp.echo.app.Color;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:35
 */
public class VetForm extends ContentPane implements ActionListener, WindowPaneListener {

	private Button _closeButton;
	private Column column;
	private Label firstNameLabel;
	private TextField firstNameTextField;
	private Grid grid;
	private GridLayoutData gridLayout;
	private ResourceBundle labels;
	private Label lastNameLabel;
	private TextField lastNameTextField;
	private Label mobileNumberLabel;
	private TextField mobileNumberTextField;
	private EditVetPresenter presenter;
	private Label specialityLabel;
	private DefaultListSelectionModel specialityListSelectionModel;
	private Table specialityListTable;
	private DefaultTableModel specialityListTableModel;
	private SpecialitySelectionDialog specialitySelectionDialog;
	private Button updateVetButton;
	private VeterinarianDataDTO veterinarianDataDTO = null;
	private Label veterinarianDataHeaderLabel;

	public VetForm(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid2100489459234505344--7725701754114858677-
	 * 6767472327199542574-7486354435778219873redseeds_uid
	 * @param labels    redseeds_uid4142791806055016600--4669351302079108837--
	 * 4350429828532757633-3908552844099259771redseeds_uid
	 */
	public VetForm(EditVetPresenter presenter, ResourceBundle labels){
	
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
		veterinarianDataDTO = presenter.getVeterinarianDataDTO();
		populateControls();
	
	}

	/**
	 * 
	 * @param e    redseeds_uid-2418774502500518934-8936364609297740354--
	 * 1953112347660508178-7613338516539523186redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("_closeButton")) {
		    presenter.closeCurrentPageAndFinalizeUseCase();
		}
	
		if (e.getActionCommand().equals("remSpecialityButton")) {
			//TODO: enable this action
//		    int row = specialityListSelectionModel.getMinSelectionIndex();
//		    if (row != -1 && row < specialityListTableModel.getRowCount()) {
//		        veterinarianDataDTO.getSpecialityIDList().remove(row);
//		        veterinarianDataDTO.getSpecialityNameList().remove(row);
//		        veterinarianDataDTO.getSpecialityCodeList().remove(row);
//		        populateControls();
//		    }
		}
	
		if (e.getActionCommand().equals("addSpecialityButton")) {
			//TODO: enable this action
//		    List<SpecialityDTO> list = presenter.getSpecialityList();
//		    specialitySelectionDialog = new SpecialitySelectionDialog(list, labels);
//		    specialitySelectionDialog.addWindowPaneListener(this);
//		    this.add(specialitySelectionDialog);
		}
	
		if (e.getActionCommand().equals("updateVetButton")) {
		    populateDTOs();
		    presenter.setVeterinarianDataDTO(veterinarianDataDTO);
		    presenter.updateVetTriggered();
		}
	}

	/**
	 * 
	 * @param e    redseeds_uid2911283910573217151-3667137367364467224-
	 * 1307952531614302278-2181875459831259624redseeds_uid
	 */
	public void windowPaneClosing(WindowPaneEvent e){
	
		if (e.getSource() instanceof SpecialitySelectionDialog) {
		    SpecialityDTO selection = specialitySelectionDialog.getSelection();
		    if (selection != null) {
		        veterinarianDataDTO.getSpecialityIDList().add(selection.getSpecialityID());
		        veterinarianDataDTO.getSpecialityNameList().add(selection.getSpecialityName());
		        veterinarianDataDTO.getSpecialityCodeList().add(selection.getSpecialityCode());
		        populateControls();
		    }
		}
	
	}

	private void addContent(){
	
		grid = new Grid(2);
		grid.setInsets(new Insets(10, 7));
		grid.setWidth(new Extent(100, Extent.PERCENT));
		grid.setStyleName("Default");
		column.add(grid);
	
		// *** Data view: veterinarian data ***
	
		// Data view header
		veterinarianDataHeaderLabel = new Label(labels.getString("VetForm.VeterinarianData.Header"));
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		gridLayout.setInsets(new Insets(10));
		gridLayout.setBackground(new Color(105, 89, 205));
		gridLayout.setBackgroundImage(new FillImage(new ResourceImageReference("/resource/image/fill/LightBlueLine.png")));
		veterinarianDataHeaderLabel.setLayoutData(gridLayout);
		veterinarianDataHeaderLabel.setStyleName("Label.Header");
		grid.add(veterinarianDataHeaderLabel);
	
		// Main concept attribute: first name
		firstNameLabel = new Label(labels.getString("VetForm.Label.VeterinarianData.FirstName "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		firstNameLabel.setLayoutData(gridLayout);
		grid.add(firstNameLabel);
	
		firstNameTextField = new TextField();
		firstNameTextField.setStyleName("Default");
		firstNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		grid.add(firstNameTextField);
	
		// Main concept attribute: last name
		lastNameLabel = new Label(labels.getString("VetForm.Label.VeterinarianData.LastName "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		lastNameLabel.setLayoutData(gridLayout);
		grid.add(lastNameLabel);
	
		lastNameTextField = new TextField();
		lastNameTextField.setStyleName("Default");
		lastNameTextField.setWidth(new Extent(75, Extent.PERCENT));
		grid.add(lastNameTextField);
	
		// Main concept attribute: mobile number
		mobileNumberLabel = new Label(labels.getString("VetForm.Label.VeterinarianData.MobileNumber "));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		mobileNumberLabel.setLayoutData(gridLayout);
		grid.add(mobileNumberLabel);
	
		mobileNumberTextField = new TextField();
		mobileNumberTextField.setStyleName("Default");
		mobileNumberTextField.setWidth(new Extent(75, Extent.PERCENT));
		grid.add(mobileNumberTextField);
	
		// Related concept: speciality
	
		specialityLabel = new Label(labels.getString("VetForm.Label.VeterinarianData.Speciality"));
		gridLayout = new GridLayoutData();
		gridLayout.setAlignment(Alignment.ALIGN_RIGHT);
		specialityLabel.setLayoutData(gridLayout);
		grid.add(specialityLabel);
	
		Row specialityRow = new Row();
		specialityRow.setCellSpacing(new Extent(10));
		grid.add(specialityRow);
	
		Column specialityCol1 = new Column();
		specialityCol1.setCellSpacing(new Extent(10));
		specialityRow.add(specialityCol1);
	
		Column specialityCol2 = new Column();
		specialityCol2.setCellSpacing(new Extent(10));
		specialityRow.add(specialityCol2);
	
		// Table for related concept
		specialityListTableModel = new DefaultTableModel();
		specialityListSelectionModel = new DefaultListSelectionModel();
		specialityListSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		specialityListTable = new Table(specialityListTableModel);
		specialityListTable.setStyleName("Default");
		specialityListTable.setSelectionModel(specialityListSelectionModel);
		specialityListTable.setSelectionEnabled(true);
		specialityListTable.setDefaultHeaderRenderer(new TableHeaderRenderer());
		specialityListTable.setDefaultRenderer(Object.class, new TableRenderer());
		specialityListTable.setRolloverEnabled(true);
		specialityCol2.add(specialityListTable);
	
		// Add and Remove buttons
		Button addSpecialityButton = new Button(labels.getString("Button.Add"));
		addSpecialityButton.setStyleName("Button.Add");
		addSpecialityButton.setActionCommand("addSpecialityButton");
		addSpecialityButton.setToolTipText("Adds new item to the list");
		addSpecialityButton.addActionListener(this);
		specialityCol2.add(addSpecialityButton);
		Button remSpecialityButton = new Button(labels.getString("Button.Remove"));
		remSpecialityButton.setStyleName("Button.Remove");
		remSpecialityButton.setActionCommand("remSpecialityButton");
		remSpecialityButton.setToolTipText("Removes selected item from the list");
		remSpecialityButton.addActionListener(this);
		specialityCol2.add(remSpecialityButton);
	
		// *** Action button ***
		updateVetButton = new Button(labels.getString("VetForm.updateVetButton"));
		updateVetButton.setStyleName("Button.Default");
		updateVetButton.setActionCommand("updateVetButton");
		updateVetButton.addActionListener(this);
		column.add(updateVetButton);
	
	}

	private void populateControls(){
	
		if (veterinarianDataDTO.getFirstName() != null)
		    firstNameTextField.setText(veterinarianDataDTO.getFirstName());
	
		if (veterinarianDataDTO.getLastName() != null)
		    lastNameTextField.setText(veterinarianDataDTO.getLastName());
	
		if (veterinarianDataDTO.getMobileNumber() != null)
		    mobileNumberTextField.setText(veterinarianDataDTO.getMobileNumber());
	
		specialityListTableModel.setColumnCount(3);
		specialityListTableModel.setColumnName(0, labels.getString("VetForm.Label.VeterinarianData.Speciality.Id"));
		specialityListTableModel.setColumnName(1, labels.getString("VetForm.Label.VeterinarianData.Speciality.SpecialityName"));
		specialityListTableModel.setColumnName(2, labels.getString("VetForm.Label.VeterinarianData.Speciality.SpecialityCode"));
		specialityListTableModel.setRowCount(veterinarianDataDTO.getSpecialityIDList().size());
		for (int i = 0; i < veterinarianDataDTO.getSpecialityIDList().size(); i++) {
		    specialityListTableModel.setValueAt(veterinarianDataDTO.getSpecialityIDList().get(i), 0, i);
		    specialityListTableModel.setValueAt(veterinarianDataDTO.getSpecialityNameList().get(i), 1, i);
		    specialityListTableModel.setValueAt(veterinarianDataDTO.getSpecialityCodeList().get(i), 2, i);
		}
	
	}

	private void populateDTOs(){
	
		if (firstNameTextField.getText() != null)
		    veterinarianDataDTO.setFirstName(firstNameTextField.getText());
	
		if (lastNameTextField.getText() != null)
		    veterinarianDataDTO.setLastName(lastNameTextField.getText());
	
		if (mobileNumberTextField.getText() != null)
		    veterinarianDataDTO.setMobileNumber(mobileNumberTextField.getText());
	
	}

}