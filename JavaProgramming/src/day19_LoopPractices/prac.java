package day19_LoopPractices;

import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word");
        String word = scan.next();
        String freq = "";

        for (int j = 0; j < word.length(); j++) {

            for (int i = 0; i < word.length(); i++) {
                String ch = "" + word.charAt(i);

                if (!freq.contains(ch)) {
                    freq += ch;
                }
            }
            System.out.println(freq);


        }
    }
}
