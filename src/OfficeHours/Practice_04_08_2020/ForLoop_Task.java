package OfficeHours.Practice_04_08_2020;

public class ForLoop_Task {
    public static void main(String[] args) {

        /*
        print all the numbers between 0~100 that can be divisible by 3 or 5
         */

        for(int i = 0; i <= 100; i++){
            if(i%3==0||i%5==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("===========================");
        //  length     123456
        String name = "Madina";
        //    index    012345
        String result = ""; // anidaM
        int lastIndex = name.length()-1;

        for(int i = lastIndex; i>=0; i-- ){
            //  result += name.charAt(i);
           result = result + name.substring(i, i+1);
                                          // 3,4  a for "Anna"
                                         //  2,3  n
                                         //  1,2  n
                                         //  0,1  A
        }
        System.out.println(result);

        if(name.equalsIgnoreCase(result)){
            System.out.println(name+" is palindrome name");
        }else{
            System.out.println(name+" is not palindrome name");
        }








    }
}
