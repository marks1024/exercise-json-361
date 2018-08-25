package kz.edu.nu.cs.exercise;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class MyContact {
    private String name;
    private int age;
    private String number;
    
    public MyContact(String name, int age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }
    
    public static MyContact MakeMyContact(String s) {
    	JsonElement jelement = new JsonParser().parse(s);
        JsonObject  jobject = jelement.getAsJsonObject();
        String name = jobject.get("name").getAsString();
        int age = jobject.get("age").getAsInt();
        String number = jobject.get("number").getAsString();
        MyContact result = new MyContact(name, age, number);
        return result;
    }

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
