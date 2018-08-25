package kz.edu.nu.cs.exercise;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    private List<MyContact> list;

    public ContactList() {
        list = new ArrayList<MyContact>();
    }

    public static ContactList MakeContactList(String s) {
        Gson gson = new Gson();
        return gson.fromJson(s, ContactList.class);
    }

    public void addContact(MyContact c) {
        list.add(c);
    }

    public void removeFirstContact() {
        list.remove(0);
    }

    public MyContact getFirstContact() {
//        if (list.isEmpty())
//            return null;
        return list.get(0);
    }

    public int getSize() {
        return list.size();
    }
}
