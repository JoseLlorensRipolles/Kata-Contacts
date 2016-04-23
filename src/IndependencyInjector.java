import controller.ContactsController;
import model.Diary;
import view.DiaryView;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public class IndependencyInjector {


    public static Diary getDiary(){
        return new Diary();
    }

    public static ContactsController getContactsController(Diary diary) {
        return new ContactsController(diary);
    }

    public static DiaryView getDiaryView(ContactsController contactsController){
        return new DiaryView(contactsController);
    }
}
