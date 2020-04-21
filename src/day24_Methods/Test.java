package day24_Methods;

import java.util.Arrays;
import Resources.Library;

public class Test {

    public static void main(String[] args) {

        String str = "Cybertek";

        String RevStr = Library.Reverse2(str);
        System.out.println(RevStr);

        System.out.println(str.equalsIgnoreCase(RevStr));

        int[] arr = {10000,3000,2000,40000,50000,100000000};

        arr = Library.sortDescending(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String name = "Muhtar";
        String RevStr2 = Library.Reverse2(name);
        System.out.println(RevStr2);

        int[] arr2 = {5,9,10,3,2,-1};
        arr2 = Library.sortDescending(arr2);
        System.out.println(Arrays.toString(arr2));

    }



}
