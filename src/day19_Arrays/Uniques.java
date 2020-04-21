package day19_Arrays;
/*
1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
 */
public class Uniques {
    public static void main(String[] args) {

        String str = "AABCCEQAT";
        String result = ""; // BEQT


        for(int j = 0; j <= str.length()-1; j++){
            int count = 0;
            for(int i = 0; i <= str.length()-1; i++){
                if(str.charAt(i)== str.charAt(j)){ // check how many times the characters is occured in the string
                    count++;
                }
            }
            if(count == 1){ // if unique at index j, wi;; be concated to the result
                result += str.charAt(j);
            }
        }


        System.out.println(result);




    }
}
