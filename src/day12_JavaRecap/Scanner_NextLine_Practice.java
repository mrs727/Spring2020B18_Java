package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_NextLine_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 7925 JonesBranch Dr, McLean VA, 22034
        // fullAddress: Building-number Steet, City, State zipcode

        System.out.println("Enter the building number: ");
        int bNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter the street: ");
        String street = input.nextLine();

        System.out.println("Enter the zip code: ");
        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("Enter the city name and state separated by comma and space: ");
        String cityState = input.nextLine();

        String fullAddress = bNumber+" "+street+", \n"+cityState+" "+zipCode;

        System.out.println(fullAddress);

        input.close(); // closes the scanner




    }
}
