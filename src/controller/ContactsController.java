package controller;

import model.Contact;
import model.Diary;

import java.util.List;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public class ContactsController {
    private Diary diary;

    public ContactsController(){
        diary = new Diary();
    }
    public void addContact(String name, String telf){
        diary.addContact(name,telf);
    }
    public void getAll(){
        diary.getContacts();
    }
}
