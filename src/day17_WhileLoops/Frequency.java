package day17_WhileLoops;

public class Frequency {
    public static void main(String[] args) {

        String str = "EEEeee".toLowerCase();

        int count = 0; // 2

        String word = "E".toLowerCase();

        while(str.contains(word)){
            count++;
            str = str.replaceFirst(word, "");

        }

        System.out.println(count);









    }
}
