package kz.edu.nu.cs.exercise;

/**
 * App is generated as part of the jsonexercise-361 archetype. This
 * archetype generates a maven project with some more up-to-date features
 * compared with the org.apache quickstart archetype.
 * <p>
 * Some of the changes of this archetype
 * <ul>
 * <li>Version 4.12 of JUnit
 * <li>Build with Java 8
 * <li>Failing unit test
 * </ul>
 * <p>
 * If you have obtained this project then you can build and install to your
 * local maven repository. To build the project, go to the project root and run
 * <code>mvn archetype:create-from-project</code>.
 * <p>
 * After building, navigate to <code>target/generated-sources/archetype</code>
 * and run <code>mvn install</code>. This will add the archetype to your local
 * maven repository.
 * <p> 
 * Add <code>.m2/archetype-catalog.xml</code> as a local catalog in eclipse 
 * 
 * @author marks1024
 *
 */
public class App {
    public static void main(String[] args) {
        ContactList list = new ContactList();
        
        list.addContact(new MyContact("Joe", 30, "0-2112"));
        list.addContact(new MyContact("Mary", 30, "1-2249"));
        
        System.out.println(list);
    }
}
