package day15_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {

        /*
        odd numbers between 0~100 in a single like separated by space
                            1 3 5 7 9 ...
         */

        String resultOdd = "";

        for(int number = 1; number <= 100; number += 2 ){
           // System.out.print(number + " ");
           // resultOdd += number + " ";
            resultOdd = resultOdd + number + " ";
        }

        System.out.println(resultOdd);

        /*
        even numbers between 1~100
                           2 4 6 8 10 ...
         */

        String resultEven = "";

        for(int number = 2; number <=100; number += 2 ){
            resultEven += number + " ";
        }

        System.out.println(resultEven);




    }
}
