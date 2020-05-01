package day29_Wrapper_ArrayList;
import java.util.ArrayList;
public class List_Intro {

    public static void main(String[] args) {

        // ArrayList<DataType> listName = new ArrayList<DataType>();

        ArrayList<Integer> scores = new ArrayList<Integer>();

        scores.add(10); // autoboxing  size:1
        scores.add(20); // autoboxing  size:2
        scores.add(30); // autoboxing  size:3

        System.out.println(scores);

        Integer a1 = scores.get(2); // object at index 2; none
        int a2 = scores.get(2); // unboxing
        double a3 = scores.get(2); // unboxing

        System.out.println(a1);

       // System.out.println(scores.get(100)); // out of bounds




    }
}
