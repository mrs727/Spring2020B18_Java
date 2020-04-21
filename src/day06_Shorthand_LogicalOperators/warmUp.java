package day06_Shorthand_LogicalOperators;

public class warmUp {
    public static void main(String[] args) {

        double numberOfGallons = 5;
        double GallonsToLiters = numberOfGallons * 3.785;
        String result = numberOfGallons + " gallons is equal to: " + GallonsToLiters  + " liters";
        System.out.println(result);

        System.out.println("==========================================================================");

        double numberOfLiters = 100;
        double litersOfGallons = numberOfLiters / 3.785;
        String result2 = numberOfLiters + " liters equals to " + litersOfGallons + " gallons";
        System.out.println(result2);

        System.out.println("==========================================================================");

        int a = 200; // a = 199
        int b = -a++ + - --a * a-- % 2;
        //  b = -200 + -200 * 200 % 2;
        //  b = -200 + -40000 % 2;
        //  b = -200 + 0;
        //  b = -200;
        System.out.println(b);
        System.out.println(a);

        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        // z = 300 + 400 - 300 * 400 + 300 / 400;
        // z = 300 + 400 - 120000 + 300 / 400;          // 300/400 ==> 0.75;
        // z = 300 + 400 - 120000 + 0
        // z = 700 - 120000 = -119300;

        System.out.println(z);

    }
}
/*
warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragments:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
 */
