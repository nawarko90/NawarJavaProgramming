package day15_FoorLoop;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter the word");
        String word= scan.next();

        String letters="";
        String digits="";
        String charecitors="";

        for (int i = 0; i <=word.length()-1 ; i++) {

          char ch=word.charAt(i);
          if(ch >='a'&&ch <='z'){
              letters+=ch;

            }

        }

        System.out.println(letters);

    }
}
/*
write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!
 */