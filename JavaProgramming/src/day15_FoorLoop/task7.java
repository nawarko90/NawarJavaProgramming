package day15_FoorLoop;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter word");
        String word= scan.next();

        if(word.startsWith("x")){
          String num=  word.substring(0,1).replace("x","a");
        String name=  num+word.substring(1);
            System.out.println(name);
        }else{
            System.out.println(word);
        }



    }
}
/*
1. Write a program that asks user to enter a word. If the work
starts with x, replace it with a.
Input:
xcodex
Output:
acodex
 */