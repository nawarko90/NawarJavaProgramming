package day17_while_DoWhile;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class WillYouMarryMe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me? yes/no");
        String answer= scan.next().toLowerCase(); // this we we can ignore if the the yes/NO is in upp case or lower case

        while (!(answer.equals("yes") || answer.equals("no"))){
            System.err.println("invalid, please re enter");
            answer= scan.next();
        }
while (answer.equals("yes")){
    System.out.println("congrats");
    answer= scan.next();
}
        while (answer.equals("no")) {
            System.out.println("get lost");
            answer = scan.next();
        }

    }
}

/*
1. Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
 */