package controller;

import model.Contact;
import model.Diary;
import model.DiaryImp;
import view.DiaryView;
import view.DiaryViewImp;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public class ContactsControllerImp implements ContactsController {

    private Diary diaryImp;
    private DiaryView diaryViewImp;

    public ContactsControllerImp(Diary diaryImp){
        this.diaryImp = diaryImp;
    }

    public void addContact(Contact contact){
        diaryImp.addContact(contact);
        diaryViewImp.showContacts(diaryImp.getContacts());
    }

    @Override
    public void initView(DiaryView diaryView) {
        this.diaryViewImp = diaryView;
    }

}
