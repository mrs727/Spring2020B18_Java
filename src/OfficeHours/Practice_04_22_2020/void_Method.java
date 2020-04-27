package OfficeHours.Practice_04_22_2020;

public class void_Method {
    public static void print() {
        System.out.println("Hello Batch 18");
    }

    public static void main(String[] args) {
        print();
        System.out.println("==============");
        boolean USCitizen = true;
        int age = 21;
        Vote(21,true);
        System.out.println("==============");
        EligibleToBuyCig(17);
    }

    // write a function that can identify if a person is eligible to vote
    // MUST know: age, USCitizen

    public static void Vote(int age, boolean USCitizen){

        boolean eligibleToVote = age >=18 && USCitizen == true;
        if(eligibleToVote){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }

    // write a method if a person eligible to smoke
    // MUST know: age

    public static void EligibleToBuyCig(int age){
        if(age>18){
            System.out.println("Eligible to buy");
        }else{
            System.out.println("Not eligible");
        }
    }
}


