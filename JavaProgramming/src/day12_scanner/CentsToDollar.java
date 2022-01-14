package day12_scanner;

import java.util.Scanner;

public class CentsToDollar {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter cents");
            int convert = scan.nextInt();
            int dollar = convert/100;
            int cents = convert % 100;

            System.out.println(convert + " cents equal to: " + dollar + " dollars and " + cents + " cents");

            scan.close();

        }
    }
/*
Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */