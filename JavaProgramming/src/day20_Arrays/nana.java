package day20_Arrays;

import java.util.Scanner;

public class nana {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String word= scan.next();

        String result="";

        for (int j = 0; j <3 ; j++) {

            System.out.println("Enter your word please:");
            word= scan.next();

            for (int i = 0; i < word.length() ; i++) {

                if(word.contains("  ")){
                    result.substring(0,word.length());
                    result+=word;
                }

            }


        }
        System.out.println(result);
    }
}