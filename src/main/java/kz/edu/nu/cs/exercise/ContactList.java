package kz.edu.nu.cs.exercise;
	
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class ContactList{
    private List<MyContact> list;
    
    public ContactList() {
        list = new ArrayList<MyContact>();
    }
    
    public static ContactList MakeContactList(String s) {
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
        return list.get(0);
    }
    
    public int getSize() {
        return list.size();
    }
}
