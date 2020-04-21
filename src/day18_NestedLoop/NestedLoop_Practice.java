package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoop_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.println("Enter two numbers");
            int num1 = input.nextInt();
            int num2 = input.nextInt();

            System.out.println("Addition of two numbers: " + (num1 + num2));
            System.out.println("Do you want to continue?");
            String answer = input.next();

            while(!(answer.equalsIgnoreCase("Yes")|| answer.equalsIgnoreCase("No"))){
                System.out.println("Invalid Entry, please enter yes or no");
                answer = input.next();
            }

            if(answer.equalsIgnoreCase("No")){
                System.out.println("Thank you for using the calculator");
                break;
            }
        }

        /*
        Assignment:

        write a room program for the room reservation:

                king bed ==> 120$
                queen bed ==> 100$
                single bed ==> 80$
                should ask which bedroom do you want to reserve:
                if user provides invalid entry => please re-enter
                calculate total price
                do you want to reserve another room:
                if yes ==> repeat the previous steps
                if no ==> your total price is: $$$
                in answer either yes or no ==> please re-enter

         */


    }
}
