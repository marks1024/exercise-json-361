package kz.edu.nu.cs.exercise;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

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
        ContactList st = gson.fromJson(s, ContactList.class);
        return st;
    }
    
    public void addContact(MyContact c) {
        list.add(c);
    }
    
    public void removeFirstContact() {
        list.remove(0);
    }
    
    public MyContact getFirstContact() {

        return list.get(0);
        // complete this method
        // return correct value
    }
    
    public int getSize() {

        // complete this method
        // return correct value

        return list.size();
    }
}
