package kz.edu.nu.cs.exercise;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ContactList {
    private List<MyContact> list;
    
    public ContactList() {
        list = new ArrayList<MyContact>();
    }
    
    public static ContactList MakeContactList(String s) {
    	JsonElement jelement = new JsonParser().parse(s);
        JsonObject  jobject = jelement.getAsJsonObject();
        JsonArray arr = jobject.getAsJsonArray("list");
        ContactList ans = new ContactList();
        for (JsonElement it : arr) {
            JsonObject curObj = it.getAsJsonObject();
            String name = curObj.get("name").getAsString();
            int age = curObj.get("age").getAsInt();
            String number = curObj.get("number").getAsString();
            MyContact contact = new MyContact(name, age, number);
            ans.list.add(contact);
        }
        return ans;
    }
    
    public void addContact(MyContact c) {
        list.add(c);
    }
    
    public void removeFirstContact() {
        list.remove(0);
    }
    
    public MyContact getFirstContact() {
        return this.list.get(0);
    }
    
    public int getSize() {
    	return this.list.size();
    }
}
