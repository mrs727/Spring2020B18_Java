package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        /*
        ask the user to enter yes or no.
        if the user enters something other than yes or no, repeat the previous step
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Yes or No:");
        String word = input.next();

        boolean valid = word.equalsIgnoreCase("Yes")||word.equalsIgnoreCase("No");

        while(!valid ){ // while the input is not yes or no, repeats the question
            System.out.println("Please re-enter:");
            word = input.next();

            if(word.equalsIgnoreCase("Yes")||word.equalsIgnoreCase("No")){
                break;
            }
        }

        if(word.equalsIgnoreCase("Yes")){
            System.out.println("Entered Yes");
        }
        if(word.equalsIgnoreCase("No")){
            System.out.println("Entered No");
        }


    }
}
