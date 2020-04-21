package OfficeHours.Practice_04_08_2020;

public class NestedLoop_Practice {
    public static void main(String[] args) {

        /*
            nested loop: loop inside another loop
                         inner loop & outer loop

                        nested loop: we only need them when we need to repeat a loop

                        outer loop repeats the inner loop
         */

        int j = 1;
        while(j<6){

            for(int i = 10; i <= 50; i+=10){
                System.out.print(i+" ");
            }
            System.out.println();

            j++;
        }

        System.out.println("===============================");

        /*
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
         */

        for(int h = 1; h<=15; h++){

            for(int k = 0; k <= 20; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("======================");
        /*
                *
                * *
                * * *
                * * * *
                * * * * *
                * * * * * *
                * * * * * * *
         */

        for(int i = 1; i <8; i++){

            for(int k = 0; k < i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 8; i > 0; i--){

            for(int k = 0; k < i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }



    }

}
