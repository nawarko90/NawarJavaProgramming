package day15_FoorLoop;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String word= scan.next();

        String num= word.toLowerCase();
        num=num.replace("x","a");

        System.out.println(num);

    }
}
/*
Write a program that asks user to enter a word. and replace all
the x or X with character a
Input:
xcodeX
Output:
acodea
 */