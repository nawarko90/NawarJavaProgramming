package day17_while_DoWhile;

import java.util.Locale;
import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt(); // valid age : 1~120

        while (!(age >= 1 && age <= 120)) { // while the age is invalid
            System.err.println("Invalid enter, please re-enter");
            System.err.println("Enter your age: ");
            age = scan.nextInt();
        }
        System.out.println("Are you a US citizen? yes/no");
        String answer= scan.next();

        while (!(answer.equals("yes")|| answer.equals("no"))){
            System.err.println("Invalid enter, please re-enter");
            System.err.println("are you a US citizen? yes/no");
          answer= scan.next().toLowerCase();
        }




    }
}