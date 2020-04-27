package day26_MethodOverloading;
/*
Warmup tasks:
	1. write a return method called frequency that accepts two parameters: string str and char ch,
		the method returns the frequency of the ch from the str as an int
			Ex:
				frequency("AAA", 'A') ==>  3
				frequency("ABAB", 'B') ==> 2
			Note: MUST use Arrays and for each loop
	2. use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
			Ex: uniques("ABBC"); 		==> "AC"
				uniques("Cybertek");  	==> "cybrtk"
 */
public class Frequency {

    public static void main(String[] args) {

        String str = "AAA";
        char ch = 'A';

        char[] arr = str.toCharArray();
        int count = 0;
        for(char each: arr){
            if(each ==ch){
                count++;
            }
        }
        System.out.println(count);

        String str2 = "ABCDEFGABABABABA";
        char ch2 = 'B';
        int count2 = frequency(str2, ch2);
        System.out.println(count2);
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
}
