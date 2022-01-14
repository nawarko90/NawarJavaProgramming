package day14_priactice;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your email:");
        String email= scan.nextLine();

        String firstName=email.substring(0,email.indexOf("_"));
        firstName= (""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
        String lastName=email.substring(email.indexOf("_")+1,email.lastIndexOf("@"));
        lastName=(""+lastName.charAt(0)).toUpperCase()+lastName.substring(1).toLowerCase();
        String domain= email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        domain=(""+domain.charAt(0)).toUpperCase()+domain.substring(1).toLowerCase();
        System.out.println(firstName+"\n"+lastName+"\n"+domain);





    }
}
/*
Create a class called EmailTask2.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that will print out information about user based on
email. Print first name, last name, and domain.
First and Last name should be printed with proper format -
uppercase first letter and remaining lowercase.
 */