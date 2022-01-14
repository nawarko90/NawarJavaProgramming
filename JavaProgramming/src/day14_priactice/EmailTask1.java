package day14_priactice;

import java.util.Scanner;

public class EmailTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your email:");
        String email = scan.nextLine();
        String lastname = email.substring(email.indexOf("_") + 1, email.lastIndexOf("@"));
        String firstname = email.substring(0, email.indexOf("_"));
        String emailtype = email.substring(email.indexOf("@"));
        if (email.contains("_")) {
            System.out.println(lastname + "_" + firstname + emailtype);
        } else {
            System.out.println(email);
        }
    }
}

/*
Create a class calledEmailTask1.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that can swap first name with last name in the
email (Seperated by an underscore).
If the email doesn't contain an underscore print the given input
email.
Ex:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com
 */