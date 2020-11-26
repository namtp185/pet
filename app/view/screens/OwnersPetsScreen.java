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
import app.presenter.petsAndOwners.ShowPetsPresenter;
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
 * @created 25-maj-2015 23:50:33
 */
public class OwnersPetsScreen extends ContentPane implements ActionListener, WindowPaneListener {

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
	private ShowPetsPresenter presenter;

	public OwnersPetsScreen(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid3707036870336858261-8534932838620635921-
	 * 3074311065702820844-438718510235775774redseeds_uid
	 * @param labels    redseeds_uid5023693990662179851-6049499106375827058--
	 * 8856872669423600171-1430530181945792536redseeds_uid
	 */
	public OwnersPetsScreen(ShowPetsPresenter presenter, ResourceBundle labels){
	
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
	 * @param e    redseeds_uid-4683470663813503294--5382942440862138315--
	 * 7340490622185110104-5881113489327854654redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("_closeButton")) {
		    presenter.closeCurrentPageAndFinalizeUseCase();
		}
	
	}

	/**
	 * 
	 * @param e    redseeds_uid7519748703540934402-2768070445848943241--
	 * 3339311868638697001-5606158960573946513redseeds_uid
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
		petListHeaderLabel = new Label(labels.getString("OwnersPetsScreen.PetList.Header"));
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