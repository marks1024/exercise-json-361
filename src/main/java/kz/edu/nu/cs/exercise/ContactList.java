package kz.edu.nu.cs.exercise;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ContactList {
    private List<MyContact> list;
    
    public ContactList() {
        list = new ArrayList<MyContact>();
    }
    
    public static ContactList MakeContactList(String s) {
    	ContactList ans = new ContactList();
    	Gson gson = new Gson();
/*    	JsonParser parser = new JsonParser();
    	JsonObject jo = (JsonObject)parser.parse(s);
    	JsonArray array = jo.getAsJsonArray("list");
    	
    	while(array.size() > 0) 
    	{
    		MyContact t = gson.fromJson(array.get(0), MyContact.class);
    		ans.addContact(t);
    		array.remove(0);
    	}*/
    	
    	ans = gson.fromJson(s, ContactList.class);
        return ans;
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
