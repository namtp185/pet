package app.view.screens;
import nextapp.echo.app.Button;
import nextapp.echo.app.Column;
import nextapp.echo.app.Grid;
import nextapp.echo.app.layout.GridLayoutData;
import java.util.ResourceBundle;
import nextapp.echo.app.Label;
import nextapp.echo.app.list.DefaultListSelectionModel;
import nextapp.echo.app.list.ListSelectionModel;
import nextapp.echo.app.Table;
import app.view.auxiliary.PetListTableModel;
import app.view.auxiliary.TableHeaderRenderer;
import app.view.auxiliary.TableRenderer;
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
import nextapp.echo.app.Alignment;
import app.dto.PetListItemDTO;
import java.util.List;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:34
 */
public class PetListScreen extends ContentPane implements ActionListener, WindowPaneListener {

	private Button _closeButton;
	private Column column;
	private Grid grid;
	private GridLayoutData gridLayout;
	private ResourceBundle labels;
	private List<PetListItemDTO> petListDTO = null;
	private Label petListHeaderLabel;
	private DefaultListSelectionModel petListSelectionModel;
	private Table petListTable;
	private PetListTableModel petListTableModel;
	private FindPetPresenter presenter;

	public PetListScreen(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-5301786435575815187-4306810467232850002--
	 * 1233699451687852359--101580461806748273redseeds_uid
	 * @param labels    redseeds_uid2146902844261182564--6686242623344152992-
	 * 215073142414557109--3763362730833280035redseeds_uid
	 */
	public PetListScreen(FindPetPresenter presenter, ResourceBundle labels){
	
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
		petListDTO = presenter.getPetListDTO();
		populateControls();
	
	}

	/**
	 * 
	 * @param e    redseeds_uid6534096868133008986-3341599855589996451--
	 * 7834488417217266423-7687161425360973070redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("_closeButton")) {
		    presenter.closeCurrentPageAndFinalizeUseCase();
		}
	
	}

	/**
	 * 
	 * @param e    redseeds_uid8414336111237673676--3407941472272888409--
	 * 2125380434137656437--3083768953206595406redseeds_uid
	 */
	public void windowPaneClosing(WindowPaneEvent e){

	}

	private void addContent(){
	
		grid = new Grid(2);
		grid.setInsets(new Insets(10, 7));
		grid.setWidth(new Extent(100, Extent.PERCENT));
		grid.setStyleName("Default");
		column.add(grid);
	
		// *** Data view: pet list ***
	
		// Data view header
		petListHeaderLabel = new Label(labels.getString("PetListScreen.PetList.Header"));
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		gridLayout.setInsets(new Insets(10));
		gridLayout.setBackground(new Color(105, 89, 205));
		gridLayout.setBackgroundImage(new FillImage(new ResourceImageReference("/resource/image/fill/LightBlueLine.png")));
		petListHeaderLabel.setLayoutData(gridLayout);
		petListHeaderLabel.setStyleName("Label.Header");
		grid.add(petListHeaderLabel);
	
		// Add table
		petListTableModel = new PetListTableModel(labels);
		petListSelectionModel = new DefaultListSelectionModel();
		petListSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		petListTable = new Table(petListTableModel);
		petListTable.setDefaultHeaderRenderer(new TableHeaderRenderer());
		petListTable.setDefaultRenderer(Object.class, new TableRenderer());
		petListTable.setSelectionModel(petListSelectionModel);
		petListTable.setSelectionEnabled(true);
		petListTable.setStyleName("Default");
		petListTable.setRolloverEnabled(true);
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		petListTable.setLayoutData(gridLayout);
		grid.add(petListTable);
	
	}

	private void populateControls(){
	
		if (petListDTO != null)
		    petListTableModel.addRows(petListDTO);
	
	}

	private void populateDTOs(){

	}

}