package day14_priactice;

import java.util.Scanner;

public class apple_banana {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("enter first word");
        String banana= input.nextLine();
        System.out.println("enter second word");
        String apple= input.nextLine();
        String result=banana.replaceFirst("b", " ")+ apple.replaceFirst("a", " ");
        result=result.trim();
        System.out.println(result);


    }
}
/*
Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */