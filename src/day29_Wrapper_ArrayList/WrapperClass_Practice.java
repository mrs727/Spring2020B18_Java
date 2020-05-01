package day29_Wrapper_ArrayList;

import java.util.Arrays;

/*
Given:
	String[] arr = {"1","2.5", "3", "3.5", "4.5"}
	find the maximum and minimum numbers
		NOTE: Do not use sort method
 */
public class WrapperClass_Practice {

    public static void main(String[] args) {

        String[] arr = {"1","2.5", "3", "3.5", "4.5"};

        double max = Double.MIN_VALUE;

        for(String each: arr){
           double num = Double.parseDouble(each);
            if(num > max){
                max = num;
            }
        }
        System.out.println(max);

        System.out.println("=====================");

        String[] arr2 = {"1","2.5", "3", "3.5", "4.5"};

        double[] numbers = new double[arr2.length];

        for(int i = 0; i<arr.length; i++){
            numbers[i] = Double.parseDouble(arr[i]);
        }

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[numbers.length-1]);




    }
}
