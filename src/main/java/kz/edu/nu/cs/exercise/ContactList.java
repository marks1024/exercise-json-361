package kz.edu.nu.cs.exercise;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.*;

public class ContactList {
    private List<MyContact> list;
    private static Gson gson = new Gson();
    
    public ContactList() {
        list = new ArrayList<MyContact>();
    }
    
    public static ContactList MakeContactList(String s) {
        ContactList lst =  gson.fromJson(s, ContactList.class);
        return lst;
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
        
        return list.size();
    }
}
