package day14_StringClass;

import java.util.Scanner;

/*
valid credentials are:
precondition: username and password cannot be empty
                if they are empty ==> please enter the credentials
                        username: cybertek
                        password: cybertekschool
                        if user entered both valid username and password ==> log in
                        if valid password, invalid username ==> username incorrect
                        if valid user name, invalid password ==> password incorrect
                        if both password and username invalid ==> invalid username and password
 */
public class Credentials2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter username:");
        String inputUserName = input.nextLine();

        System.out.println("Enter password:");
        String inputPassWord = input.nextLine();

        boolean logedIn = inputUserName.equals("cybertek")&&inputPassWord.equals("cybertekschool");

        boolean invalidUserName = !inputUserName.equals("cybertek")&&inputPassWord.equals("cybertekschool");

        boolean invalidPassWord = inputUserName.equals("cybertek")&&!inputPassWord.equals("cybertekschool");

        if(!inputUserName.isEmpty() && !inputPassWord.isEmpty()){
            if(logedIn){
                System.out.println("Logged in");
            }else if(invalidUserName){
                System.out.println("Password is correct, username is incorrect");
            }else if(invalidPassWord){
                System.out.println("Password is incorrect, username is correct");
            }else{
                System.out.println("Both username and password is incorrect");
            }
        }else{
            System.out.println("Please enter the credentials");
        }

    }
}
