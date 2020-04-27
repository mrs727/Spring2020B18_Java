package OfficeHours.Practice_04_22_2020;

public class return_Method {

    public static void main(String[] args) {
        sum(10,20);
        int num = sum2(10,20);
        System.out.println(num);
        System.out.println("================");

        String str = "Cybertek";

        String result = Reverse(str);
        System.out.println(result);

        System.out.println(str.equals(result)); // true or false, palindrome
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static int sum2(int a, int b){

        return a+b;
    }

    public static String Reverse(String str){
        String result = "";
        for(int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
        }
        return result;
    }
}
