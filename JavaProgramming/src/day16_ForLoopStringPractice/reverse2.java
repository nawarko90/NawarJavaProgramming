package day16_ForLoopStringPractice;

import java.util.Scanner;

public class reverse2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your word that you want to reverse");
        String word= input.next();
        String result="";

        for (int i = word.length()-1; i >=0 ; i--) {

            result+=word.charAt(i);
        }
        System.out.println("result = " + result);
    }
}
