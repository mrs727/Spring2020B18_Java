package day26_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading2 {
    /*
    first method: print sum of two int numbers
    second method: print sum of three int numbers
    third method: print sum of four int numbers
     */
    public static void main(String[] args) {
        // 10, 5
        sum2Numbers(10,5);
        // 10, 5, 15
        sum3Numbers(10,5,15);
        // 10, 20, 30, 5
        sum4Numbers(10,20,30,5);

        System.out.println("=========================");
        // 10 , 5
        sum(10,5);
        // 15, 10, 5
        sum(15,10,5);
        // 10, 20, 30, 5
        sum(10,20,30,5);

        int[] arr1 = {3,2,1};
        char[] arr2 = {'z','s','a'};
        double[] arr3 = {7.4, 6.5, 20.6};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

    }
public static void sum2Numbers(int a, int b){
    System.out.println(a+b);
}
public static void sum3Numbers(int a, int b, int c){
    System.out.println(a+b+c);
}
public static void sum4Numbers(int a, int b, int c, int d){
    System.out.println(a+b+c+d);
}

//===============================================
    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    public static void sumOf2(int a, int b){
        System.out.println(a+b);
    }
    public static void sumOf2(double a, double b){
        System.out.println(a+b);
    }
}
