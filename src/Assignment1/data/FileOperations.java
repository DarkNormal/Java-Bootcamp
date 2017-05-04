package Assignment1.data;

import Assignment1.Contact;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Mark on 04/05/2017.
 */
public class FileOperations {

    public ArrayList<Contact> readFromFile(){
        ArrayList<Contact> contacts = new ArrayList<>();
        File file = new File("addressBook.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("file doesn't exist, creating it now");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println("Reading contacts from file");
                String[] details = line.split(",");
                Contact readContact = new Contact(details);
                contacts.add(readContact);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;
    }
}
