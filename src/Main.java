import controller.ContactsController;
import model.Diary;
import view.DiaryView;

import java.util.Scanner;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public class Main {
    public static void main(String [] args){
        Diary diary = IndependencyInjector.getDiary();
        ContactsController contactsController = IndependencyInjector.getContactsController(diary);
        DiaryView diaryView = IndependencyInjector.getDiaryView(contactsController);

        Scanner keyboard = new Scanner(System.in);
        String name = "";
        String telf = "";
        do{
            System.out.print("Insert contact name: ");
            name = keyboard.nextLine();
            if(!name.equals("/exit")) {
                System.out.print("Insert contact number: ");
                telf = keyboard.nextLine();
                diaryView.contactsController.addContact(name, telf);
            }
        }while(!name.equals("/exit"));
    }

}
