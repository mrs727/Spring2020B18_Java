package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/dd");

        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        /*
        create a date called birthDay: MM/Days/year
        ex: 2020 04 23
        Apr/23/20
        // MMMM = month(entire word) ex: December
         */

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE MMM/dd/yy");
        LocalDate date2 = LocalDate.of(1999,12,25);
        String birthday = date2.format(dtf2);
        System.out.println(birthday);

        LocalDate date3 = LocalDate.now();
        System.out.println(date3.format(dtf2));


    }

}
