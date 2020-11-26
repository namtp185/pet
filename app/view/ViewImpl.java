package app.view;
import nextapp.echo.app.ContentPane;
import app.presenter.MainPresenter;
import java.util.Stack;
import java.util.ResourceBundle;
import nextapp.echo.app.Window;
import app.presenter.petsAndOwners.ListAllOwnersPresenter;
import app.presenter.petsAndOwners.DeletePetPresenter;
import app.presenter.veterinarians.EditVetPresenter;
import app.presenter.petsAndOwners.AddNewOwnerPresenter;
import app.presenter.petsAndOwners.AddNewPetPresenter;
import app.presenter.visits.CreateNewVisitPresenter;
import app.presenter.petsAndOwners.FindPetPresenter;
import app.presenter.veterinarians.ListAllVetsPresenter;
import app.presenter.visits.ShowVisitsForPetPresenter;
import app.presenter.petsAndOwners.ShowPetsPresenter;
import app.presenter.visits.ShowVisitDetailsPresenter;
import app.presenter.visits.EditVisitPresenter;
import nextapp.echo.app.ApplicationInstance;
import nextapp.echo.app.StyleSheet;
import nextapp.echo.app.serial.StyleSheetLoader;
import nextapp.echo.app.serial.SerialException;
import app.view.screens.OwnerListScreen;
import app.view.messages.AddNewOwnerDialog;
import app.view.messages.InvalidOwnerDataMessage;
import app.view.messages.NoPetsFoundMessage;
import app.view.screens.NewPetForm;
import app.view.messages.PetAddedMessage;
import app.view.messages.InvalidPetDataMessage;
import app.view.messages.DeletePetConfirmationDialog;
import app.view.screens.NewVisitForm;
import app.view.messages.VisitAddedConfirmation;
import app.view.messages.InvalidVisitDataMessage;
import app.view.screens.VetListScreen;
import app.view.messages.NoVetsFoundMessage;
import app.view.screens.VetForm;
import app.view.messages.VetUpdatedMessage;
import app.view.messages.IncorrectVetDataMessage;
import app.view.messages.VetUpdateFailureMessage;
import app.view.screens.VisitListScreen;
import app.view.messages.NoVisitsFoundMessage;
import app.view.screens.VisitDetailsScreen;
import app.view.screens.VisitForm;
import app.view.messages.VisitUpdatedMessage;
import app.view.messages.WrongVisitDataMessage;
import app.view.screens.OwnersPetsScreen;
import app.view.screens.PetSearchForm;
import app.view.screens.PetListScreen;
import app.view.screens.MainPage;
import app.view.screens.NewOwnerForm;
import app.view.messages.OwnerAddedMessage;

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:35
 */
public class ViewImpl extends ApplicationInstance implements IView {

	private ContentPane currentPage = null;
	private MainPresenter mainPresenter;
	private Stack pageStack = new Stack();
	private ResourceBundle resourceBundle;
	private Window window;

	public ViewImpl(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public void closeCurrentPage(){
		if (!pageStack.isEmpty()) {
		    currentPage = (ContentPane) pageStack.pop();
		    show(currentPage);
		}
	}

	public void closeNewOwnerForm(){
	
		if (currentPage instanceof NewOwnerForm)
		    closeCurrentPage();
		else
		    for (int i = pageStack.size()-1; i >= 0; i--) {
		        if(pageStack.get(i) instanceof NewOwnerForm) {
		            pageStack.remove(i);
		            break;
		        }
		    }
	}

	public void closeNewPetForm(){
	
		if (currentPage instanceof NewPetForm)
		    closeCurrentPage();
		else
		    for (int i = pageStack.size()-1; i >= 0; i--) {
		        if(pageStack.get(i) instanceof NewPetForm) {
		            pageStack.remove(i);
		            break;
		        }
		    }
	}

	public void closeNewVisitForm(){
	
		if (currentPage instanceof NewVisitForm)
		    closeCurrentPage();
		else
		    for (int i = pageStack.size()-1; i >= 0; i--) {
		        if(pageStack.get(i) instanceof NewVisitForm) {
		            pageStack.remove(i);
		            break;
		        }
		    }
	}

	public void closePetSearchForm(){
	
		if (currentPage instanceof PetSearchForm)
		    closeCurrentPage();
		else
		    for (int i = pageStack.size()-1; i >= 0; i--) {
		        if(pageStack.get(i) instanceof PetSearchForm) {
		            pageStack.remove(i);
		            break;
		        }
		    }
	}

	public void closeVetForm(){
	
		if (currentPage instanceof VetForm)
		    closeCurrentPage();
		else
		    for (int i = pageStack.size()-1; i >= 0; i--) {
		        if(pageStack.get(i) instanceof VetForm) {
		            pageStack.remove(i);
		            break;
		        }
		    }
	}

	public void closeVisitForm(){
	
		if (currentPage instanceof VisitForm)
		    closeCurrentPage();
		else
		    for (int i = pageStack.size()-1; i >= 0; i--) {
		        if(pageStack.get(i) instanceof VisitForm) {
		            pageStack.remove(i);
		            break;
		        }
		    }
	}

	public Window init(){
	
		// Load stylesheet
		StyleSheet styleSheet;
		try {
		    styleSheet = StyleSheetLoader.load("resource/style/Default.stylesheet.xml", Thread.currentThread().getContextClassLoader());
		} catch (SerialException ex) {
		    throw new RuntimeException(ex);
		}
		this.setStyleSheet(styleSheet);
	
		// Get resource bundle
		resourceBundle = ResourceBundle.getBundle("LabelsBundle", ApplicationInstance.getActive().getLocale());
	
		window = new Window();
		showMainPage();
		return window;
	}

	/**
	 * 
	 * @param mainPresenter    redseeds_uid-148594380437920928-1886593208787909745-
	 * 1630681529409933984--2459244336833592142redseeds_uid
	 */
	public void setMainPresenter(MainPresenter mainPresenter){
		this.mainPresenter = mainPresenter;
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-903938981899242397-1394542162236839258-
	 * 7626390778858486426-4298895151586191150redseeds_uid
	 */
	public void showAddNewOwnerDialog(ListAllOwnersPresenter presenter){
	
		AddNewOwnerDialog message = new AddNewOwnerDialog(presenter, resourceBundle);
		currentPage.add(message);
	}

	/**
	 * 
	 * @param presenter    redseeds_uid2501624934330680956--320207489133076011--
	 * 896776553151141678--7730842005564648121redseeds_uid
	 */
	public void showDeletePetConfirmationDialog(DeletePetPresenter presenter){
	
		DeletePetConfirmationDialog message = new DeletePetConfirmationDialog(presenter, resourceBundle);
		currentPage.add(message);
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-7469031406008945694--4071842161508822471-
	 * 6310986959133163519-1189386241984715996redseeds_uid
	 */
	public void showIncorrectVetDataMessage(EditVetPresenter presenter){
	
		IncorrectVetDataMessage message = new IncorrectVetDataMessage(presenter, resourceBundle);
		currentPage.add(message);
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-960451017393697184--5542304891097348381--
	 * 6156617365011358437--7814360154647124737redseeds_uid
	 */
	public void showInvalidOwnerDataMessage(AddNewOwnerPresenter presenter){
	
		InvalidOwnerDataMessage message = new InvalidOwnerDataMessage(presenter, resourceBundle);
		currentPage.add(message);
	}

	/**
	 * 
	 * @param presenter    redseeds_uid5342832624473175262-1302631926223613860-
	 * 6478604714321483971-4589592220274756055redseeds_uid
	 */
	public void showInvalidPetDataMessage(AddNewPetPresenter presenter){
	
		InvalidPetDataMessage message = new InvalidPetDataMessage(presenter, resourceBundle);
		currentPage.add(message);
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-4050807517626491214--5528401639432927692--
	 * 8023576037868217236-5671412523663914848redseeds_uid
	 */
	public void showInvalidVisitDataMessage(CreateNewVisitPresenter presenter){
	
		InvalidVisitDataMessage message = new InvalidVisitDataMessage(presenter, resourceBundle);
		currentPage.add(message);
	}

	public void showMainPage(){
		if (currentPage != null)
		    pageStack.push(currentPage);
		MainPage page = new MainPage(mainPresenter, resourceBundle);
		show(page);
	}

	/**
	 * 
	 * @param presenter    redseeds_uid8296194894002322811-4833436778059769544-
	 * 7684413590693011831-8901096584088271107redseeds_uid
	 */
	public void showNewOwnerForm(AddNewOwnerPresenter presenter){
	
		if (currentPage != null)
		    pageStack.push(currentPage);
		NewOwnerForm page = new NewOwnerForm(presenter, resourceBundle);
		show(page);
	
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-2214667755938139117-8488884806797706948--
	 * 7112423435362868651-3981930302626281264redseeds_uid
	 */
	public void showNewPetForm(AddNewPetPresenter presenter){
	
		if (currentPage != null)
		    pageStack.push(currentPage);
		NewPetForm page = new NewPetForm(presenter, resourceBundle);
		show(page);
	
	}

	/**
	 * 
	 * @param presenter    redseeds_uid1191785219231398861-3244390628954462209--
	 * 8320424000779296902-5206976958484131971redseeds_uid
	 */
	public void showNewVisitForm(CreateNewVisitPresenter presenter){
	
		if (currentPage != null)
		    pageStack.push(currentPage);
		NewVisitForm page = new NewVisitForm(presenter, resourceBundle);
		show(page);
	
	}

	/**
	 * 
	 * @param presenter    redseeds_uid5994491473916551237--2666658971676389082-
	 * 5492399489594009286--8710150018630964432redseeds_uid
	 */
	public void showNoPetsFoundMessage(FindPetPresenter presenter){
	
		NoPetsFoundMessage message = new NoPetsFoundMessage(presenter, resourceBundle);
		currentPage.add(message);
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-7662705634132116521-6872788670099404262-
	 * 8717951449156831426-7095867131867476783redseeds_uid
	 */
	public void showNoVetsFoundMessage(ListAllVetsPresenter presenter){
	
		NoVetsFoundMessage message = new NoVetsFoundMessage(presenter, resourceBundle);
		currentPage.add(message);
	}

	/**
	 * 
	 * @param presenter    redseeds_uid8898565605778993147-7358063859877669561--
	 * 3303482986976802646-1141661179322745627redseeds_uid
	 */
	public void showNoVisitsFoundMessage(ShowVisitsForPetPresenter presenter){
	
		NoVisitsFoundMessage message = new NoVisitsFoundMessage(presenter, resourceBundle);
		currentPage.add(message);
	}

	/**
	 * 
	 * @param presenter    redseeds_uid9214379938757713096--8229910119677892827-
	 * 1959402979732967146--6540534728612572184redseeds_uid
	 */
	public void showOwnerAddedMessage(AddNewOwnerPresenter presenter){
	
		OwnerAddedMessage message = new OwnerAddedMessage(presenter, resourceBundle);
		currentPage.add(message);
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-5505171245007172968--5508017816307709305-
	 * 3558955789475900269-2299902685473447139redseeds_uid
	 */
	public void showOwnerListScreen(ListAllOwnersPresenter presenter){
	
		if (currentPage != null)
		    pageStack.push(currentPage);
		OwnerListScreen page = new OwnerListScreen(presenter, resourceBundle);
		show(page);
	
	}

	/**
	 * 
	 * @param presenter    redseeds_uid5680250843454700985-1529926572996383749--
	 * 2527919509143336865--1270432546452825232redseeds_uid
	 */
	public void showOwnersPetsScreen(ShowPetsPresenter presenter){
	
		if (currentPage != null)
		    pageStack.push(currentPage);
		OwnersPetsScreen page = new OwnersPetsScreen(presenter, resourceBundle);
		show(page);
	
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-2561632228549132324-7486891298869376666-
	 * 2607744054316781068--546393065857182785redseeds_uid
	 */
	public void showPetAddedMessage(AddNewPetPresenter presenter){
	
		PetAddedMessage message = new PetAddedMessage(presenter, resourceBundle);
		currentPage.add(message);
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-7795054835331738774-476015348038907022-
	 * 3278293468192396284--3987041341900673334redseeds_uid
	 */
	public void showPetListScreen(FindPetPresenter presenter){
	
		if (currentPage != null)
		    pageStack.push(currentPage);
		PetListScreen page = new PetListScreen(presenter, resourceBundle);
		show(page);
	
	}

	/**
	 * 
	 * @param presenter    redseeds_uid438784168946559894-3149066774824619360--
	 * 5648584671360757320-4168947234078898589redseeds_uid
	 */
	public void showPetSearchForm(FindPetPresenter presenter){
	
		if (currentPage != null)
		    pageStack.push(currentPage);
		PetSearchForm page = new PetSearchForm(presenter, resourceBundle);
		show(page);
	
	}

	/**
	 * 
	 * @param presenter    redseeds_uid1198306876079087112--1624673699977232898--
	 * 1751209041158154123-4499442235619514290redseeds_uid
	 */
	public void showVetForm(EditVetPresenter presenter){
	
		if (currentPage != null)
		    pageStack.push(currentPage);
		VetForm page = new VetForm(presenter, resourceBundle);
		show(page);
	
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-7947546947661150592--882663119071033992--
	 * 4051694945628508730--2684597527831083361redseeds_uid
	 */
	public void showVetListScreen(ListAllVetsPresenter presenter){
	
		if (currentPage != null)
		    pageStack.push(currentPage);
		VetListScreen page = new VetListScreen(presenter, resourceBundle);
		show(page);
	
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-4945961080710886227-306662360012605665--
	 * 1271162862111617675-8607900664483804176redseeds_uid
	 */
	public void showVetUpdatedMessage(EditVetPresenter presenter){
	
		VetUpdatedMessage message = new VetUpdatedMessage(presenter, resourceBundle);
		currentPage.add(message);
	}

	/**
	 * 
	 * @param presenter    redseeds_uid8948858246511397181-3610326866099715946-
	 * 60230948239842223-4428305940598637757redseeds_uid
	 */
	public void showVetUpdateFailureMessage(EditVetPresenter presenter){
	
		VetUpdateFailureMessage message = new VetUpdateFailureMessage(presenter, resourceBundle);
		currentPage.add(message);
	}

	/**
	 * 
	 * @param presenter    redseeds_uid77461938104244857-8936641251889442227-
	 * 9002437678369314213--7096907963669012602redseeds_uid
	 */
	public void showVisitAddedConfirmation(CreateNewVisitPresenter presenter){
	
		VisitAddedConfirmation message = new VisitAddedConfirmation(presenter, resourceBundle);
		currentPage.add(message);
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-353491416207651263-7943495272656164110--
	 * 5140127439023783149-1551931335181486566redseeds_uid
	 */
	public void showVisitDetailsScreen(ShowVisitDetailsPresenter presenter){
	
		if (currentPage != null)
		    pageStack.push(currentPage);
		VisitDetailsScreen page = new VisitDetailsScreen(presenter, resourceBundle);
		show(page);
	
	}

	/**
	 * 
	 * @param presenter    redseeds_uid-7637247990004989168--7321419358762853392-
	 * 4645106977716827437--7750357209109592188redseeds_uid
	 */
	public void showVisitForm(EditVisitPresenter presenter){
	
		if (currentPage != null)
		    pageStack.push(currentPage);
		VisitForm page = new VisitForm(presenter, resourceBundle);
		show(page);
	
	}

	/**
	 * 
	 * @param presenter    redseeds_uid6828264951322721986--9153401814001461407-
	 * 8818154287678092872--8660343513733957760redseeds_uid
	 */
	public void showVisitListScreen(ShowVisitsForPetPresenter presenter){
	
		if (currentPage != null)
		    pageStack.push(currentPage);
		VisitListScreen page = new VisitListScreen(presenter, resourceBundle);
		show(page);
	
	}

	/**
	 * 
	 * @param presenter    redseeds_uid6958282302903759907--3784784332576614639--
	 * 2496098004645929334-6818955109717352582redseeds_uid
	 */
	public void showVisitUpdatedMessage(EditVisitPresenter presenter){
	
		VisitUpdatedMessage message = new VisitUpdatedMessage(presenter, resourceBundle);
		currentPage.add(message);
	}

	/**
	 * 
	 * @param presenter    redseeds_uid6152281746550966313--7033900281788816111--
	 * 3209945126414227157-1246437740606708407redseeds_uid
	 */
	public void showWrongVisitDataMessage(EditVisitPresenter presenter){
	
		WrongVisitDataMessage message = new WrongVisitDataMessage(presenter, resourceBundle);
		currentPage.add(message);
	}

	/**
	 * 
	 * @param contentPane    redseeds_uid-2790762326021769726-2647142113223744597-
	 * 7764156223868000339-143461766517351839redseeds_uid
	 */
	private void show(ContentPane contentPane){
		window.setContent(contentPane);
		currentPage = contentPane;
	}

}