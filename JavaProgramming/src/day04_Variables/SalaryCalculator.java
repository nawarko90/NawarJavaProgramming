package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourly Rate, weekly Hours

        int  HourlyRate = 65;
        int WeeklyHours= 40;
        int numberOfWeeks= 52;

        int salary = HourlyRate * WeeklyHours * numberOfWeeks;

       // System.out.println(salary);
        System.out.println("WeeklyHours = " + WeeklyHours); // we use soutv to print the variable
        System.out.println("salary =$" + salary);
        System.out.println("HourlyRate =$" + HourlyRate);
    }



}
