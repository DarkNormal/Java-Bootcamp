package obama_speech;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by mark on 24/04/17.
 */
public class RunObama {


    public static void main(String[] args) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        String filename = "/home/mark/IdeaProjects/Java-Bootcamp/src/obama_speech/obama.txt";
        try(Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNextLine()){
                String[] scannedLine = scanner.nextLine().split(" ");
                for(String word : scannedLine){
                    word = word.replaceAll("[^\\w\\s-]", "").toLowerCase();
                    int frequency = 0;
                    if(wordCount.containsKey(word)){
                        frequency = (wordCount.get(word)) +1;
                    }
                    wordCount.put(word, frequency + 1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
