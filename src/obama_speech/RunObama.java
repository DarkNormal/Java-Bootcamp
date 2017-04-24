package obama_speech;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by mark on 24/04/17.
 */
public class RunObama {


    public static void main(String[] args) {
        String filename = "/home/mark/IdeaProjects/Java-Bootcamp/src/obama_speech/obama.txt";
        try(Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
