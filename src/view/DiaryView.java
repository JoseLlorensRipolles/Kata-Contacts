package view;

import controller.ContactsController;
import model.Contact;
import model.Diary;

import java.util.List;
import java.util.Scanner;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public class DiaryView {
    public ContactsController contactsController;

    public DiaryView(){
        contactsController= new ContactsController(this);
    }

    public static void main(String [] args){
        DiaryView diaryView = new DiaryView();
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        String telf = "";
        do{
            System.out.println("Insert contact name:");
            name = keyboard.nextLine();
            System.out.println("Insert contact number");
            telf = keyboard.nextLine();
            diaryView.contactsController.addContact(name,telf);
        }while(name != "/exit");
    }

    public void showContacts(List<Contact> contacts) {
        for(int i = 0; i<contacts.size();i++){
            System.out.print(contacts.get(i).getName()+" : "+contacts.get(i).getTelf()+"\n");
        }
    }
}
