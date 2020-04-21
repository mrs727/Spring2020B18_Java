package day07_IfStatements;
/*
3. write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
 */
public class MinNumber {
    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 300;

        boolean aMinimum = a < b && a < c;
        boolean bMinimum = b < a && b < c;
        boolean cMinimum = c < a && c < b;

        if(aMinimum){
            System.out.println(a+" is the minimum number");
        }
        if(bMinimum){
            System.out.println(b+" is the minimum number");
        }
        if(cMinimum){
            System.out.println(c+" is the minimum number");
        }


    }
}
