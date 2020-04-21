package day19_Arrays;

public class Arrays_Practice1 {
    public static void main(String[] args) {

        String[] friends = { "Phu", "Emrah", "Fatih", "Sevgin", "Rahman"};
                        //     0        1       2        3         4
        /*
        String f1 = friends[4];
        System.out.println(f1);

        System.out.println(friends[0]);
        */

        for(int i = 0; i <=4; i++){
           String name = friends[i];
            System.out.println(name);
        }

        String[] emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com"};
        // print out all the users who registered with their gmail
        // max: 4

        for(int i = 0; i <= 3; i++){
            String email = emails[i];
            if(email.endsWith("@gmail.com")){
                System.out.println(email);
            }
        }


    }
}
