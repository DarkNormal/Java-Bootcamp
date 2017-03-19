package week1;

import java.util.Scanner;

/**
 * Created by Mark on 14/02/2017.
 */
public class bootcamp {
    public static void main(String[] args) {

        //Task #1
//        printHelloWorld();
//
//
//        //Task #2
//        printYourName();
//
//
//        //Task 3
//        printAliceOrBob();
//
//        //Task 4
//        sumOf1ToN();
//
//        //Task 5
//        sumOf3Or5Multiples();

        //Task 6
        reverseAString();

    }

    public static void printHelloWorld(){
        System.out.println("Hello world!");
    }

    public static void printYourName(){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String userName = input.nextLine();
        if(userName != null){
            System.out.println("Hello " + userName + "!");
        }
        input.close();
    }

    public static void printAliceOrBob(){
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name for task 3?");
        String userNameTask3 = input.nextLine();
        String[] allowedNames = new String[]{"Alice", "Bob"};
        if(userNameTask3 != null){
            for(String name : allowedNames){
                if(userNameTask3.equalsIgnoreCase(name)){
                    System.out.println("Hello " + userNameTask3 + "!");
                }
            }
        }
        input.close();
    }

    public static void sumOf1ToN(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int outputSum = 0;
        for (int i = 0; i < n; i++) {
            outputSum += i;
        }
        System.out.println("Sum of numbers up to " + n + " is: " + outputSum);
        input.close();
    }

    public static void sumOf3Or5Multiples(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        int outputSum = 0;
        for (int i = 1; i < n; i++) {
            if(i % 3 == 0 || i % 5 == 0){
                outputSum += i;
            }
        }
        System.out.println("Sum of multiples of 3 or 5 up to " + n + " is: " + outputSum);
        input.close();
    }

    public static void reverseAString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to reverse:");
        String sentence = input.nextLine();
        String[] splitSentence = sentence.split(" ");
        String output = "";
        for (int i = splitSentence.length -1; i >= 0 ; i--) {
            output += splitSentence[i] + " ";
        }
        output.trim();
        System.out.println(output);
    }

}
