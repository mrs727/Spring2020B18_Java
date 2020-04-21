package day17_WhileLoops;

public class PalindromeTest {

    public static void main(String[] args) {

        String str = "Java";
        String reversedStr = ""; // store the reversed version of str

        int index = str.length()-1; // last index number

        while(index >= 0){
             reversedStr += str.charAt(index);
            index--;
        }

        System.out.println(reversedStr);

        boolean palindrome = reversedStr.equalsIgnoreCase(str);

        System.out.println(palindrome);








    }
}
