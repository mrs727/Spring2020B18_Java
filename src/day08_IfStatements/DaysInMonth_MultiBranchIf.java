package day08_IfStatements;
/*
write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
            byte month =  3
            28 days: 2
            30 days: 4,6,9,11
            31 days: 1,3,5,7,8,10,12
            do not use more than one print statement;
 */
public class DaysInMonth_MultiBranchIf {

    public static void main(String[] args) {

        byte month = 5;
        String result = " ";

        if(month == 1){
            result = "January has 31 days";
        } else if(month == 2){
            result = "February has 28 or 29 days";
        } else if(month == 3){
            result = "March has 31 days";
        } else if(month == 4){
            result = "April has 30 days";
        } else if(month == 5){
            result = "May has 31 days";
        } else if(month == 6){
            result = "June has 30 days";
        } else if(month == 7){
            result = "July has 31 days";
        } else if(month == 8){
            result = "August has 31 days";
        } else if(month == 9){
            result = "September has 30 days";
        } else if(month == 10){
            result = "October has 31 days";
        } else if(month == 11){
            result = "November has 30 days";
        } else if(month == 12){
            result = "December has 31 days";
        } else{
            result = "Invalid Entry";
        }
        System.out.println(result);


    }
}
