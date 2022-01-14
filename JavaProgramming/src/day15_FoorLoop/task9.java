package day15_FoorLoop;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter first name:");
        String firstName= scan.nextLine();
        System.out.println("Enter last name:");
        String lastName=scan.next();

       firstName=firstName.toLowerCase();
       String firstlitter=firstName.substring(0,1).toUpperCase();
       String First=firstlitter+firstName.substring(1);

        lastName=lastName.toLowerCase();
        String lastlitter=lastName.substring(0,1).toUpperCase();
        String last=lastlitter+lastName.substring(1);

        System.out.println(First+" "+last);
        


    }
}
/*
3. Write a program that asks user to enter first and last names, and
then prints the full name in regular format (first character in upper
case)
input:
firstName = "cyDEo"
lastName = "SCHOOL";
output:
Cydeo School
 */