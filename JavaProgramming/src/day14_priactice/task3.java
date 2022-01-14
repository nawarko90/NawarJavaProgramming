package day14_priactice;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String word= scan.next();

        if(word.charAt(0)=='x'){
            String newWord=word.substring(1);
            System.out.println(newWord);
        }else{
            System.out.println(word);
        }




    }
}
/*
Ask user to enter a word. If the work starts with x, print the
word without x.
Input:
xcode
Output:
code
 */