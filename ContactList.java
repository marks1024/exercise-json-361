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
        ContactList newOne = gson.fromJson(s, ContactList.class);
        return newOne;
        //return null;
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
        //return null;
    }
    
    public int getSize() {
        // complete this method
        // return correct value
        return list.size();
        //return 0;
    }
}
