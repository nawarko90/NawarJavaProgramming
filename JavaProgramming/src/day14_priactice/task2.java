package day14_priactice;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("enter a word:");
        String word=scan.next();

        String word2=""+word.charAt(word.length()-2)+word.charAt(word.length()-1);
        if(word2.equals("ly")){
            System.out.println("really?");
        }else {
            System.out.println("never mind");
        }



    }
}
/*
ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"
 */