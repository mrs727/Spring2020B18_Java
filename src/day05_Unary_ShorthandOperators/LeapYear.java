package day05_Unary_ShorthandOperators;

public class LeapYear {

    public static void main(String[] args) {

        short year = 2020;
        // leapYear: year % 4 = 0;
                        // if returns true ==> leapYear, if returns false ==> not leapYear;
        boolean leapYear = year % 4 == 0; // if the year can be devided by four without any remainder, then it's leap year;

        // System.out.println( year + "is leap year: " + leapYear );

        String result = year + " is leap year: " + leapYear;
        System.out.println(result);



    }
}
