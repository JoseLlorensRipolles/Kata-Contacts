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

    private Diary diary;
    private DiaryView diaryView;

    public ContactsControllerImp(Diary diaryImp){
        this.diary = diaryImp;
    }

    public void addContact(Contact contact){
        diary.addContact(contact);
        diaryView.showContacts(diary.getContacts());
    }

    @Override
    public void initView(DiaryView diaryView) {
        this.diaryView = diaryView;
    }

}
