package day03_VariablesContinue;

public class SalaryCalculator {

    /*
    write a program that can calculate the tax, salary, and salary after tax
    rate = 55;
    stateTaxRate = 0.04;
    federalTaxRate = 0.22;
    weeklytHours = 40;

     */

    public static void main(String[] args) {
        // DataType variableName = Data;

        double hourlyRate = 65;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 45;
        byte totalWeeksInAYear = 48;
        // salary = hourlyRate * weeklyHours * 52
        double salary = hourlyRate * weeklyHours * totalWeeksInAYear;  // salary before tax
        // stateTax = salary * stateTaxRate
        double stateTax = salary * stateTaxRate;
        // federalTax = salary * federalTaxRate
        double federalTax = salary * federalTaxRate;
        // totalTax = stateTax + federalTax;
        double totalTax = stateTax + federalTax;
        // salaryAfterTax = salary - stateTax - federalTax;
        double salaryAfterTax = salary - ( stateTax + federalTax );

        System.out.println("Your salary is: $" + salary ); // concatenation
        System.out.println("State tax is: $" + stateTax );
        System.out.println("Federal tax is: $" + federalTax);
        System.out.println("Total Tax is: $" + (federalTax + stateTax) );
        System.out.println("Salary After Tax is: $" + salaryAfterTax);


    }
}
