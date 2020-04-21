package day05_Unary_ShorthandOperators;

public class PostPre {

    public static void main(String[] args) {
        // Pre: changes the value of the variable immediately

        int a = 100;
        System.out.println(++a); // a = 101
        System.out.println(a); // 101

        int b = 100;
        System.out.println(--b); // 99
        System.out.println(b); // 99

        // Post: first passes the correct value, then eventually changes the variable value

        int A = 100;
        System.out.println(A++); // 100, A's value still 100
        System.out.println(A); // 101

        int B = 100;
        System.out.println(B--); // 100
        System.out.println(B); // 99


        // post & pre examples:

        int z = 10;
        int x = ++z; // x is increased by 1
        System.out.println(x); // 11
        System.out.println(z); // 11

        int s = 10;
        int f = s++; // 10, after line 35, the value of s will be increased by 1
        System.out.println(f); // 10
        System.out.println(s); // 11

        double t1 = 3.5;
        double t2 = t1--; // 3.5, after line 40 t1 will be increased by 1
        System.out.println(t2); // 3.5
        System.out.println(t1); // 2.5


        int num = 35;
        System.out.println(num++); // 35, after line 46 the value of num will be 36
        System.out.println(num--); // 36, after line 47 the value of num will be 35







    }
}
