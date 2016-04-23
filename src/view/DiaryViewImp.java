package view;

import controller.ContactsController;
import controller.ContactsControllerImp;
import model.Contact;

import java.util.List;
import java.util.Scanner;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public class DiaryViewImp implements DiaryView {
    private ContactsController contactsController;
    private Scanner keyboard ;
    private boolean exit;

    public DiaryViewImp(ContactsController contactsController){
        this.contactsController = contactsController;
        this.contactsController.initView(this);
        keyboard = new Scanner(System.in);
        exit = false;
    }

    public void showContacts(List<Contact> contacts) {
        System.out.println("\n\nCONTACT LIST:\n");
        for(int i = 0; i<contacts.size();i++){
            System.out.print(contacts.get(i).getName()+" : "+contacts.get(i).getTelf()+"\n");
        }
        System.out.println("\n");

    }

    @Override
    public Contact getContact() {
        System.out.print("Insert contact name: ");
        String name = keyboard.nextLine();
        System.out.print("Insert contact number: ");
        String telf = keyboard.nextLine();
        if(name.equals("exit")){
            exit = true;
        }
        return new Contact(name,telf);
    }

    @Override
    public boolean pressedExit() {
        return exit;
    }


}
