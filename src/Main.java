import controller.ContactsController;
import controller.ContactsControllerImp;
import model.Contact;
import model.Diary;
import model.DiaryImp;
import view.DiaryView;
import view.DiaryViewImp;

import java.util.Scanner;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public class Main {
    public static void main(String [] args){
        Diary diaryImp = IndependencyInjector.getDiary();
        ContactsController contactsControllerImp = IndependencyInjector.getContactsController(diaryImp);
        DiaryView diaryViewImp = IndependencyInjector.getDiaryView(contactsControllerImp);

        Scanner keyboard = new Scanner(System.in);
        String name = "";
        String telf = "";
        do{
            Contact aux = diaryViewImp.getContact();
            contactsControllerImp.addContact(aux);

        }while(!diaryViewImp.pressedExit());
    }

}
