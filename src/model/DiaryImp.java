package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public class DiaryImp implements Diary {

    private List<Contact> contacts;

    public DiaryImp(){
        contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }


    public List<Contact> getContacts(){
        return contacts;
    }
}
