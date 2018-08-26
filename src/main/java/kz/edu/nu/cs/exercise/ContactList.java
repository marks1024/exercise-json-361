package kz.edu.nu.cs.exercise;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class ContactList {
    private List<MyContact> list;
    
    public ContactList() {
        list = new ArrayList<MyContact>();
    }
    
    public static ContactList MakeContactList(String s) {
        // Complete this method, use Gson
    	Gson gson = new Gson();
    	String json = gson.toJson(s);
        return null;
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
    	list.get(0);
        return null;
    }
    
    public int getSize() {
        // complete this method
        // return correct value
    	list.size();
        return 0;
    }
}
