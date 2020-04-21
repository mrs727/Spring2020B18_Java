package day19_Arrays;

public class Arrays_Intro {
    public static void main(String[] args) {

       // int scores = 90, 10, 20;  regural variables can only have one data

        /*
        declaration:
                    DataType[] variableName = { data1, data2, data3 };
                                    // index:    0     1       2
                    // 70,75,85,90,95,100

                    the [] can be placed either after the DataType or the variableName
                    each data in the array has its own index number
                    retrieve data:
                                    variableName[index]
         */
        int[] scores = { 70, 75, 85, 90, 95, 100};
               // index   0   1   2   3   4   5

        int num1 = scores[2]; // int

        System.out.println(num1); // 85

        int num2 = scores[5];
        System.out.println(num2);






    }
}
