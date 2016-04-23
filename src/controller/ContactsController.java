package controller;

import model.Contact;
import model.Diary;
import view.DiaryView;

import java.util.List;

/**
 * Created by JoseManuel on 23/04/2016.
 */
public class ContactsController {

    private Diary diary;
    private DiaryView diaryView;

    public ContactsController(Diary diary){
        this.diary = diary;
    }

    public void initView(DiaryView view){
        this.diaryView = view;
    }

    public void addContact(String name, String telf){
        diary.addContact(name,telf);
        diaryView.showContacts(diary.getContacts());
    }

}
