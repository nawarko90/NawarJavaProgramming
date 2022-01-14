package day12_scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println(" What is the product name? ");
String productName=input.nextLine();
        System.out.println("what is the price?");
        double price=input.nextDouble();
        System.out.println("quantity needed");
        int quantity=input.nextInt();
        System.out.println("Enter your first name");
        String name=input.next();
        System.out.println(name+" has purchased: "+quantity+" of "+ productName+ " at "+ price+ " dollars.");
    }
}
/*
PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */