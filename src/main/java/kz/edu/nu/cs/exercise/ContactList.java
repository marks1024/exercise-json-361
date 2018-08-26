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
        ContactList b;
        b = gson.fromJson(s,ContactList.class);

        // Complete this method, use Gson
        return b;
    }

    public void addContact(MyContact c) {
        list.add(c);
    }

    public void removeFirstContact() {
        list.remove(0);
    }

    public MyContact getFirstContact() {
        // complete this method
        // return correct value
        return list.get(0);
    }

    public int getSize() {
        // complete this method
        // return correct value
        return list.size();
    }
}
