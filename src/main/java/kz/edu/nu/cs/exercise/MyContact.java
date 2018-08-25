package kz.edu.nu.cs.exercise;

import com.google.gson.*;

public class MyContact {
    private String name;
    private int age;
    private String number;
    
    public MyContact(String name, int age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }
    
    static Gson gson = new Gson();
    
    public static MyContact MakeMyContact(String s) {
        MyContact contact = gson.fromJson(s, MyContact.class);
        return contact;
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
