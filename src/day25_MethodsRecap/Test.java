package day25_MethodsRecap;
import Resources.Library;
public class Test {

    public static void main(String[] args) {

        String str = "ABCDABABAB";
        String result = Library.RemoveDuplicates(str);
        System.out.println(result);

        String str1 = "AABBCDEB";
        String str2 = "B";
        int num1 = Library.Frequency(str1, str2);
        System.out.println(num1);

        String str3 = "MMMNNNJJJJJIIIIUUUYYYYYYYY";
        String result2 = Library.FrequencyOfChars(str3);
        System.out.println(result2);

    }
}
