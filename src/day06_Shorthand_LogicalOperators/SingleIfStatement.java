package day06_Shorthand_LogicalOperators;

public class SingleIfStatement {
    public static void main(String[] args) {

        boolean coldWeather = true;
        if(coldWeather){
            // true
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");
        }

        boolean coronaDetected = true;
        if(coronaDetected){
            System.out.println("Buy more toilet paper");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more java coding");

        }
        System.out.println("===============================================");

        int a = 201;
        boolean evenNumber = a % 2 == 0; // if a number can be divided by 2 without remainder;
        // boolean oddNumber = a % 2 != 0; // if a number connot be divided by 2 evenly;

        if(evenNumber){
            System.out.println(a+" is even number");
        }
        if(!evenNumber){  // if the number is not even number, it must be odd;
            System.out.println(a+" is odd number");
        }





    }
}
