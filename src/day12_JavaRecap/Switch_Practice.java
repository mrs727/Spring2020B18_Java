package day12_JavaRecap;

public class Switch_Practice {
    public static void main(String[] args) {

        switch(3){
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Invalid Case");
        }
        System.out.println("==================================================");

        int statusCode = 200;
        String result = "";
        switch(statusCode){

            case 200:
                result = "OK";
               // System.out.println("OK");
                break;
            case 201:
                result = "Created";
                // System.out.println("Created");
                break;
            case 202:
                result = "Accepted";
                // System.out.println("Accepted");
                break;
            default:
                result = "Invalid Status Code";
                //System.out.println("Invalid Status Code");
        }

        System.out.println(result);




    }
}
