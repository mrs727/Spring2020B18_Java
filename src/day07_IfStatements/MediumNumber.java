package day07_IfStatements;
/*
4. write a java program that accepts three numbers and return the medium number
				(assume that none of them are equal)
 */
public class MediumNumber {
    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 300;

        /*
        a: if (a < b && a > c) or (a > b && a < c)
        b: if (b < c && b > a) or (b > c && b < a)
        c: if (c < b && c > a) or (c > b && c < a)
         */

        boolean aMedium = (a < b && a > c) || (a > b && a < c);
        boolean bMedium = (b < c && b > a) || (b > c && b < a);
        boolean cMedium = (c < b && c > a) || (c > b && c < a);

        if(aMedium){
            System.out.println(a+" is a medium number");
        }
        if(bMedium){
            System.out.println(b+" is a medium number");
        }
        if(cMedium){
            System.out.println(c+" is a medium number");
        }


    }
}
