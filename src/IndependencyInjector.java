import controller.ContactsController;
import controller.ContactsControllerImp;
import model.Diary;
import model.DiaryImp;
import view.DiaryView;
import view.DiaryViewImp;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public class IndependencyInjector {


    public static DiaryImp getDiary(){
        return new DiaryImp();
    }

    public static ContactsController getContactsController(Diary diaryImp) {
        return new ContactsControllerImp(diaryImp);
    }

    public static DiaryView getDiaryView(ContactsController contactsControllerImp){
        return new DiaryViewImp(contactsControllerImp);
    }
}
