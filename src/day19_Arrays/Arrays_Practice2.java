package day19_Arrays;

import java.util.Scanner;

public class Arrays_Practice2 {
    public static void main(String[] args) {

        int[] arr = {10,20,30};

        System.out.println(arr.length); // 3

        int[] arr2 = new int[5];

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        String[] Testers = new String[3]; // {"Reem", "Madina","Osman"}
        //         index:  0 , 1, 2
        Testers[0] = "Reem";
        Testers[2] = "Osman";

        System.out.println(Testers[0]); // Reem
        System.out.println(Testers[1]); // null
        System.out.println(Testers[2]); // Osman

        System.out.println(Testers.length); // 3

        System.out.println("==============================");

        String[] students = new String[10];
        // write a program that asks "enter a name" 10 times, and each store each of the names in the array students

        Scanner scan = new Scanner(System.in);
        String names = "";
        String students2[] = new String [10];
        for(int i = 0; i < 10; i++) {
            System.out.println("Enter a name");
            names = scan.next();
            students2[i] = names+" ";
        }
        System.out.println(names);
        System.out.println(students2[5]);





    }
}
