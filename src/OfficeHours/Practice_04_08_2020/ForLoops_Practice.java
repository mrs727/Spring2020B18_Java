package OfficeHours.Practice_04_08_2020;

public class ForLoops_Practice {
    /*
            for(initialization; condition; iterator){
            }
            iterator: co-related to your condition
     */
    public static void main(String[] args) {

        for(int i = 0; i <= 5; i++){ // i++: 0,1,2,3,4,5
                                    // i+=2: 0,2,4,
            System.out.println("Hello World"+i);
        }
        System.out.println("===================================");

        for(int i = 1; i <=5; ){
            System.out.println(i); //
            i++;
        }


    }

}