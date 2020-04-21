package OfficeHours.Practice_04_08_2020;

public class WhileLoops_Practice {

    public static void main(String[] args) {

        /*
        while(condition){
             statements
        }
        repeated if statements
        execution order:
            1.condition
                    if true: executes statements
                    if false: stops the loop
         */
        int z = 0;
        while(z<5){
            System.out.println("Hello Cybertek");
            z++;
        }

        System.out.println("======================");

        int j = 0;
        while(j<=100){
            if(j%15==0) {
                System.out.print(j + " ");
            }
            j++;
        }




    }

}
