package day26_MethodOverloading;

public class Uniques {

    public static void main(String[] args) {

        String str = "ABBCDB";
        String result = "";

        for(int i = 0; i<str.length(); i++){
            int num1 = frequency(str,str.charAt(i));
            if(num1==1){
                result+=str.charAt(i);
            }
        }
        System.out.println(result);

        String str2 = "Cybertek";
        String result2 = uniques(str2);
        System.out.println(result2);
    }

    public static int frequency(String str, char ch){

        char[] arr = str.toCharArray();
        int count = 0;
        for(char each: arr){
            if(each ==ch){
                count++;
            }
        }
        return count;
    }

    public static String uniques(String str){
        String result = "";

        for(int i = 0; i<str.length(); i++){
            int num1 = frequency(str,str.charAt(i));
            if(num1==1){
                result+=str.charAt(i);
            }
        }
        return result;
    }
}
