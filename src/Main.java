import controller.ContactsController;
import model.Diary;
import view.DiaryView;

import java.util.Scanner;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public class Main {
    public static void main(String [] args){
        Diary diary = new Diary();
        ContactsController contactsController = new ContactsController(diary);
        DiaryView diaryView = new DiaryView(contactsController);

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
