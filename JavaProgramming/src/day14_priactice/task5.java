package day14_priactice;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String word= scan.next();

        if(word.charAt(0)>='0'&&word.charAt(0)<='9'){
            System.out.println("first character is digit");
        }else if(word.charAt(0)>='a'&&word.charAt(0)<='z'){
            System.out.println("first character is lower case");
        }else if(word.charAt(0)>='A'&&word.charAt(0)<='Z'){
            System.out.println("first character is upper case");
        }else{
            System.out.println("first character is special character");
        }


    }
}
/*
Ask user to enter a word,
if the word starts with digits, print "first character is digit"
if the word starts with uppercase letters, print "first character
is lowercase letter"
if the word starts with lowercase letters, print "first character
is uppercase letter"
if the word starts with special characters, print "first character
is special character"
 */