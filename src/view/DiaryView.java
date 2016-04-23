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

    public DiaryView(ContactsController contactsController){
        this.contactsController = contactsController;
        this.contactsController.initView(this);
    }

    /*public void initController(ContactsController contactsController){
        this.contactsController=contactsController;
    }*/
    public void showContacts(List<Contact> contacts) {
        System.out.println("\n\nCONTACT LIST:\n");
        for(int i = 0; i<contacts.size();i++){
            System.out.print(contacts.get(i).getName()+" : "+contacts.get(i).getTelf()+"\n");
        }
        System.out.println("\n");

    }
}
