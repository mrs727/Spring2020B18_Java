package day22_Arrays_Loops;

import java.util.Arrays;

/*
1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to print out all the even numbers.
                MUst use continue statement
 */
public class EvenNumbers {
    public static void main(String[] args) {

        int[] numbers = new int[100]; // index: 0-99

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i+1;
        }

        for(int each : numbers){
            if(each % 2 != 0){
                continue;
            }
            System.out.println(each + " ");
        }

        System.out.println(Arrays.toString(numbers));
    }
}
