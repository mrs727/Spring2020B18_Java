package day12_JavaRecap;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SalaryReport {
    /*
            ask the user to enter salary
            ask the user to enter full name
            ask the user to enter company name
            ask the user to enter SSN
            ask the user to enter JobTitle
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter you salary: ");
        double salary = input.nextDouble();

        input.nextLine();

        System.out.println("Enter full name:");
        String fullName = input.nextLine();

        System.out.println("Enter company name:");
        String companyName = input.nextLine();

        System.out.println("Enter your SSN: ");
        long SSN = input.nextLong();

        input.nextLine();

        System.out.println("Enter your job title: ");
        String jobTitle = input.nextLine();

        System.out.println("Full name is: "+fullName);
        System.out.println("Job title is: "+jobTitle);
        System.out.println("Company name: "+companyName);
        System.out.println("SSN: "+SSN);
        System.out.println("Salary is: $"+salary);





    }

}
