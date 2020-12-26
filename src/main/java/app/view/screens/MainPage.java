package app.view.screens;
import nextapp.echo.app.Button;
import nextapp.echo.app.Color;
import nextapp.echo.app.Column;

import java.util.ResourceBundle;

import app.presenter.MainPresenter;
import nextapp.echo.app.event.ActionEvent;
import nextapp.echo.app.event.ActionListener;
import nextapp.echo.app.ContentPane;
import nextapp.echo.app.Extent;
import nextapp.echo.app.Insets;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:32
 */
public class MainPage extends ContentPane implements ActionListener {

	private Button addNewPetButton;
	private Column column;
	private ResourceBundle labels;
	private Button findPetButton;
	private Button listAllOwnersButton;
	private Button listAllVetsButton;
	private MainPresenter presenter;

	public MainPage(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-4129243965958872882-8090935467600135735-
	 * 8115570447346902423--2465163488570255752redseeds_uid
	 */
	public MainPage(MainPresenter presenter, ResourceBundle labels){
		super();
	
		// Set presenter
		this.presenter = presenter;
		
		// Set resource bunlde
		this.labels = labels;
	
		// Add column layout
		column = new Column();
		column.setInsets(new Insets(50));
		column.setCellSpacing(new Extent(10));
		add(column);
	
		// Add page content
		addContent();
	}

	/**
	 * 
	 * @param e    redseeds_uid-794186484835549568-6634387718896715662-
	 * 6022504306634300757--5319074113761599642redseeds_uid
	 */
	public void actionPerformed(ActionEvent e){
	
		if (e.getActionCommand().equals("listAllVetsButton")) {
		    presenter.invokeListAllVets();
		}
	
		if (e.getActionCommand().equals("findPetButton")) {
		    presenter.invokeFindPet();
		}
	
		if (e.getActionCommand().equals("addNewPetButton")) {
		    presenter.invokeAddNewPet();
		}
	
		if (e.getActionCommand().equals("listAllOwnersButton")) {
		    presenter.invokeListAllOwners();
		}
	
	}

	private void addContent(){
	
		listAllVetsButton = new Button(labels.getString("MainPage.listAllVetsButton"));
		listAllVetsButton.setStyleName("Button.Default");
		listAllVetsButton.setBackground(Color.GREEN);
		listAllVetsButton.setActionCommand("listAllVetsButton");
		listAllVetsButton.addActionListener(this);
		column.add(listAllVetsButton);
	
		findPetButton = new Button(labels.getString("MainPage.findPetButton"));
		findPetButton.setStyleName("Button.Default");
		findPetButton.setActionCommand("findPetButton");
		findPetButton.addActionListener(this);
		column.add(findPetButton);
	
		addNewPetButton = new Button(labels.getString("MainPage.addNewPetButton"));
		addNewPetButton.setStyleName("Button.Default");
		addNewPetButton.setActionCommand("addNewPetButton");
		addNewPetButton.addActionListener(this);
		column.add(addNewPetButton);
	
		listAllOwnersButton = new Button(labels.getString("MainPage.listAllOwnersButton"));
		listAllOwnersButton.setStyleName("Button.Default");
		listAllOwnersButton.setActionCommand("listAllOwnersButton");
		listAllOwnersButton.addActionListener(this);
		column.add(listAllOwnersButton);
	
	}

}