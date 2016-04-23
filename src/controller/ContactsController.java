package controller;

import model.Contact;
import view.DiaryView;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public interface ContactsController {
    void addContact(Contact contact);
    void initView(DiaryView diaryView);
}
