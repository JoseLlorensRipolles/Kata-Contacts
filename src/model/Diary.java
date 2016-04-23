package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public class Diary {

    List<Contact> contacts;

    public Diary(){
        contacts = new ArrayList<Contact>();
    }

    public void addContact(String name, String telf){
        contacts.add(new Contact(name,telf));
    }

    public List<Contact> getContacts(){
        return contacts;
    }
}
