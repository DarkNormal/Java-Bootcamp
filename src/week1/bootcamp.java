package week1;

import java.util.Scanner;

/**
 * Created by Mark on 14/02/2017.
 */
public class bootcamp {
    public static void main(String[] args) {
        //Task #1
        System.out.println("Hello world!");

        //Task #2
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String userName = input.nextLine();
        if(userName != null){
            System.out.println("Hello " + userName + "!");
        }

        //Task 3
        System.out.println("What's your name for task 3?");
        String userNameTask3 = input.nextLine();
        String[] allowedNames = new String[]{"Alice", "Bob"};
        if(userNameTask3 != null){
            for(String name : allowedNames){
                if(userNameTask3.equals(name)){
                    System.out.println("Hello " + userNameTask3 + "!");
                }
            }
        }


    }
}
