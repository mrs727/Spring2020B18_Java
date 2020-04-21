package OfficeHours.Practice_03_25_2020;

public class NestedIf_Practice2 {
    public static void main(String[] args) {

        /*
        for the loan:
        if he/she has a job that pays > $50000 ==> might be eligible
        if he/she has good credit
        if job history more than or equal to 2 ==> then eligible
         */

        int salary = 45000;
        int creditScore = 750;
        byte jobHistory = 1;

        if(salary > 50000){
            if(creditScore > 650){
                if(jobHistory >= 2){
                    System.out.println("You are qualified");
                }else{
                    System.out.println("You do not have enough job history, come back later");
                }
            }else{
                System.out.println("You do not have a good credit score");
            }

        }else{
            System.out.println("You need to have a job that pays $50000");
        }

    }
}
