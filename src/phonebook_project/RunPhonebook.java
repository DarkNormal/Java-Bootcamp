package phonebook_project;

import phonebook_project.model.Address;
import phonebook_project.model.PhoneNumber;

import java.io.*;

/**
 * Created by mark on 26/04/17.
 */
public class RunPhonebook {
    public static void main(String[] args) {
        Address address = new Address("Mark", new String[]{"99", "Fake Street"}, new PhoneNumber(), "fake@fakeemail.com", "DUB");
        System.out.println("hELLO THERE.");

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("src/phonebook_project/phonebook.txt"), "UTF-8"))) {
            writer.write(address.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
