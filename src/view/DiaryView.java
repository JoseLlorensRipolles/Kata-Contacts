package view;

import model.Contact;

import java.util.List;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public interface DiaryView {
    void showContacts(List<Contact> contacts);
    Contact getContact();

    boolean pressedExit();
}
