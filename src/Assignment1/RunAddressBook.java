package Assignment1;

import Assignment1.data.FileOperations;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

/**
 * Created by Mark on 04/05/2017.
 */
public class RunAddressBook {
    static Scanner input;


    public static void main(String[] args) {

        RunAddressBook runningProgram = new RunAddressBook();

        boolean doMoreOperations = true;
        int userChoice;

        Address commonAddress = new Address("address 1", "address 2", "address 3", "zipcode");
        Contact contact = new Contact(UUID.randomUUID(), "Mark", "0123456789", "mark@email.com", commonAddress);

        FileOperations fileOperations = new FileOperations();

        ArrayList<Contact> contacts = fileOperations.readFromFile();
        System.out.println(contacts.size() + " contacts read");
        input = new Scanner(System.in);


        while (doMoreOperations) {
            System.out.println("What would you like to do? \n1: Add a new contact \n2: Edit an existing contact \n3: Remove a contact \n4: Look up contacts \n5: Exit");
            try {
                userChoice = Integer.valueOf(input.nextLine());
                if (userChoice < 1 || userChoice > 5)
                    throw new NumberFormatException();
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input, please enter the corresponding number for your desired action");
                continue;
            }
            runningProgram.calculateChoice(userChoice);


            doMoreOperations = false;
        }
    }

    void calculateChoice(int choice) {
        switch (choice) {
            case 1:
                addNewContact();
                break;
            case 2:


        }

    }

    Contact addNewContact() {
        System.out.println("Enter your contact's name:");
        String contactName = input.nextLine();
        System.out.println("Enter your contact's phone number:");
        String contactPhone = input.nextLine();
        System.out.println("Enter your contact's email address:");
        String contactEmail = input.nextLine();
        System.out.println("Enter your contact's address, with each section spearated by a comma (max of 4 sections, including post code at the end)");
        String contactAddress = input.nextLine();

        return new Contact(UUID.randomUUID(), contactName, contactPhone, contactEmail, new Address(contactAddress.split(",")));


    }


}
