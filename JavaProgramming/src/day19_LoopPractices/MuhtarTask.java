package day19_LoopPractices;

import java.util.Scanner;

public class MuhtarTask {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String word= scan.next();
        String result="";
        for (int j = 0; j < word.length(); j++) {
            char num2=word.charAt(j);

        for (int i = 0; i <word.length() ; i++) {
            char num=word.charAt(i);
            

        if (!result.contains(""+num2)){
            result+=num2;

        }
            }


        }
        System.out.println(result);


    }
}
//    1. Write a program that can return the first duplicated character from a string