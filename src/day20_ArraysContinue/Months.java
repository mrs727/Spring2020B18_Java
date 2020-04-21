package day20_ArraysContinue;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {

        int[] n = new int[3];
        n[0]=0;
        n[1]=1;
        n[2]=2;
        // n[3]=3; gives out of bounds error

        String [] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep","Oct", "Nov","Dec", "Jan"};
        /*
        String[] months2 = new String [12];
                  months2 = "Jan";
                  . . .
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        int attempts = 1;
        while(num>12||num<=0){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num = input.nextInt();
            attempts++;
            if(attempts==3 && (num>12||num<=0)){
                System.out.println("Invalid Entry");
                System.exit(0);
            }
        }

        String result = months[num-1]; // index number, ALWAYS starts from 0

        System.out.println(result);






    }
}
