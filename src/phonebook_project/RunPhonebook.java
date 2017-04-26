package phonebook_project;

import phonebook_project.model.Address;
import phonebook_project.model.PhoneNumber;

/**
 * Created by mark on 26/04/17.
 */
public class RunPhonebook {
    public static void main(String[] args) {
        Address address = new Address("Mark", new String[]{"99", "Fake Street"}, new PhoneNumber(), "fake@fakeemail.com", "DUB");
        System.out.println("hELLO THERE.");
    }
}
