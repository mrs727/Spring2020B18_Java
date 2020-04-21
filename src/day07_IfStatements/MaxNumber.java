package day07_IfStatements;

/*
2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
 */
public class MaxNumber {
    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 300;

        boolean aGreater = a > b && a > c; // if a is greater than both b and c then a is the maximum number;
        boolean bGreater = b > a && b > c;
        boolean cGreater = c > a && c > b;

        if(aGreater){
            System.out.println(a + " is the maximum number");
        }
        if(bGreater){
            System.out.println(b + " is the maximum number");
        }
        if(cGreater){
            System.out.println(c + " is the maximum number");
        }


    }
}
