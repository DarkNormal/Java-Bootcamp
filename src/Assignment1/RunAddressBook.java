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



    public static void main(String[] args) {

        boolean doMoreOperations = true;
        int userChoice;

        Address commonAddress = new Address("address 1", "address 2", "address 3", "zipcode");
        Contact contact = new Contact(UUID.randomUUID(),"Mark","0123456789", "mark@email.com", commonAddress);

        FileOperations fileOperations = new FileOperations();

        ArrayList<Contact> contacts = fileOperations.readFromFile();
        System.out.println(contacts.size() + " contacts read");
        Scanner input = new Scanner(System.in);


        while(doMoreOperations){
            System.out.println("What would you like to do? \n1: Add a new contact \n2: Edit an existing contact \n3: Remove a contact \n4: Look up contacts \n5: Exit");
            try {
                userChoice = Integer.valueOf(input.nextLine());
                if(userChoice < 1 || userChoice > 5)
                    throw new NumberFormatException();
            } catch (NumberFormatException nfe){
                System.out.println("Invalid input, please enter the corresponding number for your desired action");
                continue;
            }
            calculateChoice(userChoice);



            doMoreOperations = false;
        }
    }

    static void calculateChoice(int choice){
        switch(choice){
            case 1:

        }

    }



}
