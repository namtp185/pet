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
import app.view.auxiliary.OwnerListTableModel;
import app.view.auxiliary.TableHeaderRenderer;
import app.view.auxiliary.TableRenderer;
import app.presenter.petsAndOwners.ListAllOwnersPresenter;
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
import app.dto.OwnerListItemDTO;
import java.util.List;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:33
 */
public class OwnerListScreen extends ContentPane implements ActionListener, WindowPaneListener {

	private Button _closeButton;
	private Button addNewOwnerButton;
	private Column column;
	private Grid grid;
	private GridLayoutData gridLayout;
	private ResourceBundle labels;
	private List<OwnerListItemDTO> ownerListDTO = null;
	private Label ownerListHeaderLabel;
	private DefaultListSelectionModel ownerListSelectionModel;
	private Table ownerListTable;
	private OwnerListTableModel ownerListTableModel;
	private ListAllOwnersPresenter presenter;
	private Button showPetsButton;

	public OwnerListScreen(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid4906741940401991734--4831872824197387120--
	 * 3865343437284460851-7809975428899546070redseeds_uid
	 * @param labels    redseeds_uid6014123908138218478--2560311488273647889-
	 * 6296079496017585494--8000212248043917318redseeds_uid
	 */
	public OwnerListScreen(ListAllOwnersPresenter presenter, ResourceBundle labels){
	
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
		ownerListDTO = presenter.getOwnerListDTO();
		populateControls();
	
	}

	/**
	 * 
	 * @param e    redseeds_uid106884955164087369-2267453827981761878--
	 * 816019783861739893--6626731392033882402redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("_closeButton")) {
		    presenter.closeCurrentPageAndFinalizeUseCase();
		}
	
		if (e.getActionCommand().equals("showPetsButton")) {
		    int row = ownerListSelectionModel.getMinSelectedIndex();
		    if (row != -1) {
		        long ownerID = ownerListTableModel.getRow(row).getOwnerID();
		        presenter.setInvokeOwnerID(ownerID);
		        presenter.invokeShowPets();
		    }
		}
	
		if (e.getActionCommand().equals("addNewOwnerButton")) {
		    presenter.invokeAddNewOwner();
		}
	
	}

	/**
	 * 
	 * @param e    redseeds_uid-5029137339329091477--623546989810480343-
	 * 6035992129929657954-8320217957645900306redseeds_uid
	 */
	public void windowPaneClosing(WindowPaneEvent e){

	}

	private void addContent(){
	
		grid = new Grid(2);
		grid.setInsets(new Insets(10, 7));
		grid.setWidth(new Extent(100, Extent.PERCENT));
		grid.setStyleName("Default");
		column.add(grid);
	
		// *** Data view: owner list ***
	
		// Data view header
		ownerListHeaderLabel = new Label(labels.getString("OwnerListScreen.OwnerList.Header"));
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		gridLayout.setInsets(new Insets(10));
		gridLayout.setBackground(new Color(105, 89, 205));
		gridLayout.setBackgroundImage(new FillImage(new ResourceImageReference("/resource/image/fill/LightBlueLine.png")));
		ownerListHeaderLabel.setLayoutData(gridLayout);
		ownerListHeaderLabel.setStyleName("Label.Header");
		grid.add(ownerListHeaderLabel);
	
		// Add table
		ownerListTableModel = new OwnerListTableModel(labels);
		ownerListSelectionModel = new DefaultListSelectionModel();
		ownerListSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ownerListTable = new Table(ownerListTableModel);
		ownerListTable.setDefaultHeaderRenderer(new TableHeaderRenderer());
		ownerListTable.setDefaultRenderer(Object.class, new TableRenderer());
		ownerListTable.setSelectionModel(ownerListSelectionModel);
		ownerListTable.setSelectionEnabled(true);
		ownerListTable.setStyleName("Default");
		ownerListTable.setRolloverEnabled(true);
		gridLayout = new GridLayoutData();
		gridLayout.setColumnSpan(2);
		ownerListTable.setLayoutData(gridLayout);
		grid.add(ownerListTable);
	
		// *** Invoke button ***
		showPetsButton = new Button(labels.getString("OwnerListScreen.showPetsButton"));
		showPetsButton.setStyleName("Button.Default");
		showPetsButton.setActionCommand("showPetsButton");
		showPetsButton.addActionListener(this);
		column.add(showPetsButton);
	
		// *** Invoke button ***
		addNewOwnerButton = new Button(labels.getString("OwnerListScreen.addNewOwnerButton"));
		addNewOwnerButton.setStyleName("Button.Default");
		addNewOwnerButton.setActionCommand("addNewOwnerButton");
		addNewOwnerButton.addActionListener(this);
		column.add(addNewOwnerButton);
	
	}

	private void populateControls(){
	
		if (ownerListDTO != null)
		    ownerListTableModel.addRows(ownerListDTO);
	
	}

	private void populateDTOs(){

	}

}