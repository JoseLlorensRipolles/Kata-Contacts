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


    public static Diary getDiary(){
        return new DiaryImp();
    }

    public static ContactsController getContactsController(Diary diary) {
        return new ContactsControllerImp(diary);
    }

    public static DiaryView getDiaryView(ContactsController contactsController){
        return new DiaryViewImp(contactsController);
    }
}
