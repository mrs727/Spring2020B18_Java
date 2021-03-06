package Resources;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    public static int[] sortDescending(int[] arr){

        Arrays.sort(arr);
        int[] reversedArray = new int[arr.length];

        int j = arr.length-1;
        for(int i = 0; i < arr.length; i++){
            reversedArray[i] = arr[j];
            j--;
        }
        return reversedArray;
    }

    public static String Reverse2(String str){
        String reversed = "";

        for(int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String RemoveDuplicates(String str){

        String result = ""; // AB

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!result.contains(""+ch)){
                result += ch;
            }
        }

        return result;
    }

    public static int Frequency(String str1, String str2){
        int count = 0;
        while(str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst(str2,"");
        }
        return count;
    }

    public static String FrequencyOfChars(String str){
        String NonDup = Library.RemoveDuplicates(str);  // ABC
        String result = ""; // contains frequency of chars
        for(int i = 0; i < NonDup.length(); i++){

            String ch = "" + NonDup.charAt(i); // "A"
            int num = Library.Frequency(str, ch);
            // System.out.print(ch+num);
            result += ch+num;
        }
        return result;
    }

    public static int Frequency(String str, char ch){

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
            int num1 = Frequency(str,str.charAt(i));
            if(num1==1){
                result+=str.charAt(i);
            }
        }
        return result;
    }

    public static int max(ArrayList<Integer> list){

        int maximum = list.get(0);

        for(int i = 0; i < list.size(); i++){
            if(list.get(i)> maximum){
                maximum = list.get(i);
            }
        }
        return maximum;
    }
    // merge two array and return third one
    // max number from array
    // min number from array

}
