package day14_StringClass;

public class practice {
    public static void main(String[] args) {

        String gmail = "cybertekschool@gmail.com";

        String userinputGmail = "CybertekSchool@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userinputGmail); // true

        if(result){
            System.out.println("Logged in");
        }



        String s1 = "Cybertek School";
        boolean r1 = s1.contains("School"); // true
        System.out.println(r1);

        System.out.println("============================");
        /*
        valid password MUST contain a speacial characters such as(!,_,$)
        valid password should not contain spaces
         */
        String PassWord = "mmasd1235";

        if(PassWord.contains(" ")){
            System.out.println("Password cannot have space it it");
        }else{
            System.out.println("Valid Password");
        }

        System.out.println("=============================");
        /*
        every website has "http" at the beginning of the web address
         */
        String webAddress = "Www.amazon.com";
        webAddress = webAddress.toLowerCase();

        if(webAddress.startsWith("www")){
            System.out.println("valid");
        }

        System.out.println("=============================");
        /*
        every single gmail address ends with @gmail.com
         */

        String email = "CybertekSchool@Yahoo.com";
        if(email.endsWith("@gmail.com")){
            System.out.println("Valid gmail");
        }else{
            System.out.println("Invalid gmail");
        }

        /*
        write a program that can validate if a web address is valid
        valid web address:  MUST start with www.
                            MUST end with .com, or .edu, or .org, or .net, .gov
         */






    }
}
