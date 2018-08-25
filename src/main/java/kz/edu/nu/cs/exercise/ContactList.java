package kz.edu.nu.cs.exercise;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ContactList {
    private List<MyContact> list;
    
    public ContactList() {
        list = new ArrayList<MyContact>();
    }
    
    public static ContactList MakeContactList(String s) {
        // Complete this method, use Gson
        Gson gson = new Gson();
        ContactList clist = gson.fromJson(s, ContactList.class);
        return clist;
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
        MyContact contact = list.get(0);        
        return contact;
    }
    
    public int getSize() {
        // complete this method
        // return correct value
        int size = list.size();
        return size;
    }
}
