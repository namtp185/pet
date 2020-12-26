package app.view;
import app.presenter.MainPresenter;
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

/**
 * @author Wiktor
 * @version 1.0
 * @created 25-maj-2015 23:50:31
 */
public interface IView {

	public void closeCurrentPage();

	public void closeNewOwnerForm();

	public void closeNewPetForm();

	public void closeNewVisitForm();

	public void closePetSearchForm();

	public void closeVetForm();

	public void closeVisitForm();

	/**
	 * 
	 * @param mainPresenter    redseeds_uid-6675252740922365846--8812321963607145702--
	 * 4458341773454116462--7753117415237539630redseeds_uid
	 */
	public void setMainPresenter(MainPresenter mainPresenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-5022849817836205082-7139802057273186749--
	 * 7365191312620887145--1694372060275953857redseeds_uid
	 */
	public void showAddNewOwnerDialog(ListAllOwnersPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid3812647271259850388-6358948853598350449--
	 * 5739635268890504022-3231454453269639386redseeds_uid
	 */
	public void showDeletePetConfirmationDialog(DeletePetPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-1269341930190859914--4216491607855142425--
	 * 5268620197104984295-7033258745605510740redseeds_uid
	 */
	public void showIncorrectVetDataMessage(EditVetPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid8675576217999692944--899466723925043468-
	 * 2399093269793572801-7426444758316687026redseeds_uid
	 */
	public void showInvalidOwnerDataMessage(AddNewOwnerPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid7631530210856233249-463120275091966896-
	 * 8338891436828825765-9044534819092059057redseeds_uid
	 */
	public void showInvalidPetDataMessage(AddNewPetPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-7997532615884725113-8149283877034232242--
	 * 9012530608097684970-7762776025544147133redseeds_uid
	 */
	public void showInvalidVisitDataMessage(CreateNewVisitPresenter presenter);

	public void showMainPage();

	/**
	 * 
	 * @param presenter    redseeds_uid-2178613981940350218-5840966008539205355--
	 * 8623540907807544256--8456623088047378921redseeds_uid
	 */
	public void showNewOwnerForm(AddNewOwnerPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-2293264432992393417-9095590272432594958--
	 * 6894810531072738143--7160217758954148681redseeds_uid
	 */
	public void showNewPetForm(AddNewPetPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-3845980894981436518--7860066136833919994-
	 * 2943651296785818533--4812066732417266777redseeds_uid
	 */
	public void showNewVisitForm(CreateNewVisitPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-4777940575898007773-2881811727476735324--
	 * 5705473060976254833-6561095064620141482redseeds_uid
	 */
	public void showNoPetsFoundMessage(FindPetPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-9039220106274341356--9160089556415268790-
	 * 4524998444367219647-5627851485944870543redseeds_uid
	 */
	public void showNoVetsFoundMessage(ListAllVetsPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid5153703217441345180--1738449837074085913--
	 * 8105271543163063862--6437638730530141217redseeds_uid
	 */
	public void showNoVisitsFoundMessage(ShowVisitsForPetPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-336152257442185963-8647256497238338694-
	 * 8817023640750616167-7362900738378107767redseeds_uid
	 */
	public void showOwnerAddedMessage(AddNewOwnerPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-1168371748186533921--739246707893834428-
	 * 4064701244472547535--2821776209726577298redseeds_uid
	 */
	public void showOwnerListScreen(ListAllOwnersPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid5641847870492267293--3959783549588244578--
	 * 3626773427343913160--409769742138863089redseeds_uid
	 */
	public void showOwnersPetsScreen(ShowPetsPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-8859233901517584282-2678947979501414208-
	 * 3554458176081854623--7377796197442793222redseeds_uid
	 */
	public void showPetAddedMessage(AddNewPetPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid2411047077766754476--1923342376572152189-
	 * 4517246132351404099--2627176854224716547redseeds_uid
	 */
	public void showPetListScreen(FindPetPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid1587335476709333157-4465679280312812791-
	 * 4424458430039442214--7578138813170210911redseeds_uid
	 */
	public void showPetSearchForm(FindPetPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-6692065880130095918--5054569838336134977--
	 * 9068630356517817408--3126845965940476744redseeds_uid
	 */
	public void showVetForm(EditVetPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-3166786737011392477-6570774807982251170--
	 * 8682086295936175613--7900451111570689155redseeds_uid
	 */
	public void showVetListScreen(ListAllVetsPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid5684818098567887519--5668776567605989549--
	 * 4353085536912463743--8219771045365919358redseeds_uid
	 */
	public void showVetUpdatedMessage(EditVetPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-8831039172101960996--7325878160453944402--
	 * 7769616038983861894-2468900468149709146redseeds_uid
	 */
	public void showVetUpdateFailureMessage(EditVetPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid4980449954825027132-2592423743266316451--
	 * 910353796093508497--1098177970359023900redseeds_uid
	 */
	public void showVisitAddedConfirmation(CreateNewVisitPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid4773376770653574444--5422209304541407382-
	 * 6482924839683031991--3249733778975864633redseeds_uid
	 */
	public void showVisitDetailsScreen(ShowVisitDetailsPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-9187432246297427513--76731761816241627--
	 * 5144314731681232041-8656383692805403814redseeds_uid
	 */
	public void showVisitForm(EditVisitPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid5374431316878037082--2751319003083269472--
	 * 3943394915934894968--3762409776850147493redseeds_uid
	 */
	public void showVisitListScreen(ShowVisitsForPetPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-1567071071977874124-366117473010663995-
	 * 595683258903961541--2657471666807077706redseeds_uid
	 */
	public void showVisitUpdatedMessage(EditVisitPresenter presenter);

	/**
	 * 
	 * @param presenter    redseeds_uid-2129727806190409243--929746206452721340-
	 * 6308996690963608123-518517886084642473redseeds_uid
	 */
	public void showWrongVisitDataMessage(EditVisitPresenter presenter);

}