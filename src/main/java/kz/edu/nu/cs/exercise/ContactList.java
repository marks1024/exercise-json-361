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
    	Gson gson = new Gson();
    	ContactList json = gson.fromJson(s, ContactList.class);
    	
        // Complete this method, use Gson
        return json;
    }
    
    public void addContact(MyContact c) {
        this.list.add(c);
    }
    
    public void removeFirstContact() {
        this.list.remove(0);
    }
    
    public MyContact getFirstContact() {
        // complete this method
        // return correct value
        return this.list.get(0);
    }
    
    public int getSize() {
        // complete this method
        // return correct value
        return this.list.size();
    }
}
