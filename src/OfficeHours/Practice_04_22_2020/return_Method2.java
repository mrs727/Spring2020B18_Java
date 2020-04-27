package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class return_Method2 {
    // write a return method that can return the second maximum number from an int array
    public static void main(String[] args) {

        int arr[] = {100,40,500,50,30,100,-5,-100};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int lastIndex = arr.length-1;
        int secondLastIndex = lastIndex - 1;
        int secondMax = arr[secondLastIndex];
        System.out.println(secondMax);

        int[] arr2 = {1,2,3,4,5,6,7,8};
        int result = SecondMax(arr2);
        System.out.println(result);
    }

    public static int SecondMax(int[] arr){

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int lastIndex = arr.length-1;
        int secondLastIndex = lastIndex - 1;
        int secondMax = arr[secondLastIndex];

        return secondMax;
    }
}
