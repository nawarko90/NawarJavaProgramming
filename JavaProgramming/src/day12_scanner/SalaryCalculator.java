package day12_scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your hourly rate?");
        double hourlyrate = input.nextDouble();
        System.out.println("how many hours do you work in week?");
        int weeksHours = input.nextInt();
        System.out.println("what is your federal tax rate?");
        double federalTaxRate = input.nextDouble();
        System.out.println("what is your state tax rate?");
        double stateTaxRate = input.nextDouble();
        double salary = hourlyrate * weeksHours;
        System.out.println("Salary= " + salary);
        double state= stateTaxRate*salary;
        System.out.println("State tax=" + state);
        double federal= federalTaxRate*salary;
        System.out.println("Federal tax=" + federal);

        System.out.println("Total tax=" + (federal+state));
        System.out.println("Net income="+(salary-federal-state));
    }
}

/*
SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */