package day18_NestedLoop;

import java.util.Scanner;

public class NawarExcercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter your age");
            int age = scan.nextInt();
            while (!(age > 0 && age <= 120)) {
                System.out.println("invalid age");
                age = scan.nextInt();
                System.out.println("you are qualified for the next step");
            }

            System.out.println("enter your gender");
            String gender = scan.next().toLowerCase();
            while (!(gender.equals("male") || gender.equals("female"))) {
                System.out.println("invalid gender, please re enter");
                gender = scan.next().toLowerCase();

            }
            if (gender.equals("male")) {
                System.out.println("this is the right answer, this job is for men only");
            } else if (gender.equals("female")) {
                System.out.println("I am sorry, girls should remain at the kitchen");
                break;
            }
            if (gender.equals("male")) {
                System.out.println("since you are male, is your name Nawar?");
                String name = scan.next().toLowerCase();
                while (!(name.equals("yes") || name.equals("no"))) {
                    System.out.println("invalid answer, please enter yes or no");
                    name = scan.next().toLowerCase();
                }
                if (name.equals("yes")) {
                    System.out.println("I am gald it's you Nawar, you may proceed");
                    System.out.println("enter your salary desire:");
                    int salary = scan.nextInt();
                    while (!(salary >80000)){
                        System.err.println("this bellow than you deserve, enter again");
                        salary = scan.nextInt();
                    }
                    System.out.println("You shall have it then");
                } else if (name.equals("no")) {
                    System.out.println("Sorry, only Nawar is allowed to proceed");
                }

            }
            break;
        }
    }
}






