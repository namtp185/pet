package app.view.screens;
import nextapp.echo.app.Button;
import nextapp.echo.app.Column;
import nextapp.echo.app.Grid;
import nextapp.echo.app.layout.GridLayoutData;
import java.util.ResourceBundle;
import app.presenter.veterinarians.ListAllVetsPresenter;
import nextapp.echo.app.Label;
import nextapp.echo.app.list.DefaultListSelectionModel;
import nextapp.echo.app.list.ListSelectionModel;
import nextapp.echo.app.Table;
import app.view.auxiliary.TableHeaderRenderer;
import app.view.auxiliary.TableRenderer;
import app.view.auxiliary.VeterinarianListTableModel;
import nextapp.echo.app.event.ActionEvent;
import nextapp.echo.app.event.WindowPaneEvent;
import nextapp.echo.app.event.ActionListener;
import nextapp.echo.app.event.WindowPaneListener;
import nextapp.echo.app.ContentPane;
import nextapp.echo.app.ResourceImageReference;
import nextapp.echo.app.Alignment;
import app.dto.VeterinarianListItemDTO;
import java.util.List;
import nextapp.echo.app.Extent;
import nextapp.echo.app.Insets;
import nextapp.echo.app.Color;
import nextapp.echo.app.FillImage;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:35
 */
public class VetListScreen extends ContentPane implements ActionListener, WindowPaneListener {

	private Button _closeButton;
	private Column column;
	private Grid grid;
	private GridLayoutData gridLayout;
	private ResourceBundle labels;
	private ListAllVetsPresenter presenter;
	private List<VeterinarianListItemDTO> veterinarianListDTO = null;
	private Label veterinarianListHeaderLabel;
	private DefaultListSelectionModel veterinarianListSelectionModel;
	private Table veterinarianListTable;
	private VeterinarianListTableModel veterinarianListTableModel;

	public VetListScreen(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid8750288471091363292-5347851902605268475-
	 * 5337815883396694945--4105559871350939154redseeds_uid
	 * @param labels    redseeds_uid6196144860109957408-4503117510449842209--
	 * 3948131672797661682-3124063135884614361redseeds_uid
	 */
	public VetListScreen(ListAllVetsPresenter presenter, ResourceBundle labels){
	
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
		veterinarianListDTO = presenter.getVeterinarianListDTO();
		populateControls();
	
	}

	/**
	 * 
	 * @param e    redseeds_uid-1079186870371336050--925243499908133612-
	 * 7931950412047757242--1309305357737741618redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("_closeButton")) {
		    presenter.closeCurrentPageAndFinalizeUseCase();
		}
	
	}

	/**
	 * 
	 * @param e    redseeds_uid-9047352503152658706--2861228120359063944-
	 * 1740660543440128962-2648032145130932695redseeds_uid
	 */
	public void windowPaneClosing(WindowPaneEvent e){

	}

	private void addContent(){
	
		grid = new Grid(2);
		grid.setInsets(new Insets(10, 7));
		grid.setWidth(new Extent(100, Extent.PERCENT));
		grid.setStyleName("Default");
		column.add(grid);
	
		// *** Data view: veterinarian list ***
	
		// Data view header
		veterinarianListHeaderLabel = new Label(labels.getString("VetListScreen.VeterinarianList.Header"));
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		gridLayout.setInsets(new Insets(10));
		gridLayout.setBackground(new Color(105, 89, 205));
		gridLayout.setBackgroundImage(new FillImage(new ResourceImageReference("/resource/image/fill/LightBlueLine.png")));
		veterinarianListHeaderLabel.setLayoutData(gridLayout);
		veterinarianListHeaderLabel.setStyleName("Label.Header");
		grid.add(veterinarianListHeaderLabel);
	
		// Add table
		veterinarianListTableModel = new VeterinarianListTableModel(labels);
		veterinarianListSelectionModel = new DefaultListSelectionModel();
		veterinarianListSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		veterinarianListTable = new Table(veterinarianListTableModel);
		veterinarianListTable.setDefaultHeaderRenderer(new TableHeaderRenderer());
		veterinarianListTable.setDefaultRenderer(Object.class, new TableRenderer());
		veterinarianListTable.setSelectionModel(veterinarianListSelectionModel);
		veterinarianListTable.setSelectionEnabled(true);
		veterinarianListTable.setStyleName("Default");
		veterinarianListTable.setRolloverEnabled(true);
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		veterinarianListTable.setLayoutData(gridLayout);
		grid.add(veterinarianListTable);
	
	}

	private void populateControls(){
	
		if (veterinarianListDTO != null)
		    veterinarianListTableModel.addRows(veterinarianListDTO);
	
	}

	private void populateDTOs(){

	}

}