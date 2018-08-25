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
        // Complete this method, use Gson
        Gson gson = new Gson();
        ContactList g = gson.fromJson(s, ContactList.class);
        return g;
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
