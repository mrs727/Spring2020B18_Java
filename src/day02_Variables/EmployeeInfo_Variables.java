package day02_Variables;

public class EmployeeInfo_Variables {

    /*
    create a class called EmployeeInfo_Variables:
            print:
                your companyName
                your employeeName
                your EmployeeId
                your JobTitle
                your Salary
                ssn
     */

    public static void main(String[] args) {
        String employeeName = "Fatih";
        String companyName = "Oracle";
        int employeeId = 9;
        String jobTitle = "SDET";
        double salary = 120000.5;
        int ssn = 123456789;
        // employee name: Andrea

        /* System.out.println("Employee Name: "+employeeName);
        System.out.println("Company Name: "+companyName);
        System.out.println("EmployeeId :"+employeeId);
        System.out.println("Job Title: "+jobTitle);
        System.out.println("Salary: "+salary);
        System.out.println("Social Security Number: "+ssn);

         */
        System.out.println("Employee Name: "+employeeName+"\nCompany Name: "+companyName+"\nEmployee ID: " +
                employeeId+"\nJob Title: "+jobTitle+"\nSalary: "+"\nSocial Security Number: "+ssn);

        System.out.println("========================");

        String firstName = "Hunar";
        String lastName = "Muhammad";
        //Full Name: Zeynep Dere
        System.out.println("Full Name: "+firstName+" "+lastName);

        System.out.println(11+10); //21, addition
        System.out.println("11"+"10"); //1110, concatenation




    }
}
