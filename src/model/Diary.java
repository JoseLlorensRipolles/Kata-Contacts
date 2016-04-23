package model;

import java.util.List;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public interface Diary {
    void addContact(Contact contact);
    List<Contact> getContacts();
}
