package day12_JavaRecap;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // String str = scan.next();
        // System.out.println(str);
        String fullAddress = "";
        System.out.println("Enter the number of the building:");

        short Bnumber = scan.nextShort();
        fullAddress += Bnumber +" "; // fullAddress = fullAddress+Bnumber+" "

        System.out.println("Enter the street name: ");
        String streetName = scan.next();
        fullAddress += streetName +" ";

        System.out.println("Enter the type of the road: ");
        String roadType = scan.next();
        fullAddress += roadType + ", ";

        System.out.println("Enter your city name, state, zipcode: ");
        String cityName = scan.next();
        fullAddress += cityName + " ";

        String stateName = scan.next();
        fullAddress += stateName+", ";

        int zipCode = scan.nextInt();
        fullAddress += zipCode;

        System.out.println("Address is: " + fullAddress);





    }

}

