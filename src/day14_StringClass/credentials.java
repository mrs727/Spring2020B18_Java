package day14_StringClass;

import java.util.Scanner;

/*
        userName: cybertek
        password: cybertekschool

 */
public class credentials {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String validUserName = "cybertek";
        String validPassWord = "cybertekschool";

        System.out.println("Enter username:");
        String inputUserName = input.next();

        System.out.println("Enter password:");
        String inputPassWord = input.next();

        boolean validCredentials = inputUserName.equals(validUserName) && inputPassWord.equals(validPassWord);

        if(validCredentials){

            System.out.println("Log in successfully");

        }else{
            System.out.println("Invalid credentials");
        }




    }
}
