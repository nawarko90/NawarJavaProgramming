package day14_priactice;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first word");
        String word1= scan.next();
        System.out.println("enter the second word");
        String word2=scan.next();

        String newWord=word1.substring(0+1)+word2.substring(0+1);
        System.out.println(newWord);



    }
}
/*
Ask user to enter two words. Print first word without its first
character
then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana
 */