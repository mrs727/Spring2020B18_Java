package day22_Arrays_Loops;

public class NestedLoops2 {

    public static void main(String[] args) {

        int[][] numbers = { {9,8,7}, {6}, {5,4,3,2,1,0} };
        //                     0      1          3
        /*               k
                 numbers[0] ==> {9,8,7}          numbers[0][i]  i needs to be repeated 3 times
                 numbers[1] ==> {6}              numbers[1][i]  i needs to be repeated 1 time
                 numbers[2] ==> {5,4,3,2,1,0}    numbers[2][i]   i needs to be repeated 6 times

         */

        for(int k = 0; k < numbers.length; k++){
            for(int i= 0; i < numbers[k].length; i++){
                System.out.print(numbers[k][i]+" ");
            }
            System.out.println();
        }

        // numbers = { {9,8,7}, {6}, {5,4,3,2,1,0} }
        // 7 8 9 6 0 1 2 3 4 5

        for(int k = 0; k <numbers.length; k++){ // k: index num of 1D arrays
            for(int i = numbers[k].length-1; i >= 0; i--) { // i: index num of elements in 1D
                System.out.print(numbers[k] [i] + " ");
            }
        }

        System.out.println(); // break the line after print method

        // numbers = { {9,8,7}, {6}, {5,4,3,2,1,0} }
        // 5 4 3 2 1 0 6 9 8 7

        for(int k = numbers.length-1; k >= 0; k--){ // k: index num of 1D arrays (reversed)
            for(int i = 0; i < numbers[k].length; i++){
                System.out.print(numbers[k][i]+" "); // i: index num of elements in 1D
            }
        }

        System.out.println();// break the line after print method

        // numbers = { {9,8,7}, {6}, {5,4,3,2,1,0} }
        // 0 1 2 3 4 5 6 7 8 9

        for(int k = numbers.length-1; k >= 0; k--){
            for(int i = numbers[k].length-1; i >= 0; i--){
                System.out.print( numbers[k][i]+" ");
            }
        }










    }
}
