package kz.edu.nu.cs.exercise;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJson {

    final String s1 = "{\"name\":\"Joe\",\"age\":30,\"number\":\"0-2112\"}";
    final String s2 = "{\"list\":[{\"name\":\"Joe\",\"age\":30,\"number\":\"0-2112\"},{\"name\":\"Mary\",\"age\":30,\"number\":\"1-2249\"}]}";
    final String s3 = "{\"name\":\"Mary\",\"age\":30,\"number\":\"1-2249\"}";

    @Test
    public void test_1() {
        MyContact c = MyContact.MakeMyContact(s1);
        assertEquals("Joe", c.getName());
    }

    @Test
    public void test_2() {
        MyContact c = MyContact.MakeMyContact(s1);
        assertEquals(30, c.getAge());
    }

    @Test
    public void test_3() {
        MyContact c = MyContact.MakeMyContact(s3);
        assertEquals("1-2249", c.getNumber());
    }

    @Test
    public void test_4() {
        ContactList list = ContactList.MakeContactList(s2);
        assertEquals(2, list.getSize());
    }

    @Test
    public void test_5() {
        ContactList list = ContactList.MakeContactList(s2);
        MyContact c = list.getFirstContact();
        assertEquals("0-2112", c.getNumber());
    }

    @Test
    public void test_6() {
        ContactList list = ContactList.MakeContactList(s2);
        list.removeFirstContact();
        MyContact c = list.getFirstContact();
        assertEquals("1-2249", c.getNumber());
    }
}
