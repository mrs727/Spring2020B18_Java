package day24_Methods;

public class StringReverse {

    public static void main(String[] args) {
        // String t = Reverse("Cybertek");
        String name = Reverse2("Cybertek");
        System.out.println(name);
    }

    public static void Reverse(String str){
        String reversed = "";

        for(int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
    }

    public static String Reverse2(String str){
        String reversed = "";

        for(int i = str.length()-1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }

}
