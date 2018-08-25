package kz.edu.nu.cs.exercise;

public class ContactTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String s1 = "{\"name\":\"Joe\",\"age\":30,\"number\":\"0-2112\"}";
		MyContact c = MyContact.MakeMyContact(s1);
		System.out.println(c.getName());
	}

}
