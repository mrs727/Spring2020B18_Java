package day17_WhileLoops;

import java.util.Scanner;

/*
user: cybertek
pass: cybertek123
 */
public class Credentials {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username:");
        String username = input.next();
        System.out.println("Enter password:");
        String password = input.next();

        boolean valid = username.equals("cybertek") && password.equals("cybertek123");

        int count = 1;

        while(!valid){
            System.out.println("Please re-enter your credentials:");

            System.out.println("Enter username:");
            username = input.next();

            System.out.println("Enter password:");
            password = input.next();

            valid = username.equals("cybertek") && password.equals("cybertek123");

            count++;

            if(count == 3 && !valid){
                System.out.println("Your account is locked");
                break;
            }

        }
        if(valid){
            System.out.println("Logged in");
        }




    }
}
