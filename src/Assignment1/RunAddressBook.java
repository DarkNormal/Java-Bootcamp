package Assignment1;

import Assignment1.data.FileOperations;

import java.io.*;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Mark on 04/05/2017.
 */
public class RunAddressBook {

    public static void main(String[] args) {

        Address commonAddress = new Address("address 1", "address 2", "address 3", "zipcode");
        Contact contact = new Contact(UUID.randomUUID(),"Mark","0123456789", "mark@email.com", commonAddress);

        FileOperations fileOperations = new FileOperations();

        ArrayList<Contact> contacts = fileOperations.readFromFile();
        System.out.println(contacts.size() + " contacts read");



        System.out.println();
    }

}
