package day19_LoopPractices;

import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word to find the frequency of it:");
        String word = scan.next();
        String word2 = "";

        for (int j = 0; j < word.length(); j++) {
            char num = word.charAt(j);
            int result = 0;

            for (int i = 0; i < word.length(); i++) {
                char num2 = word.charAt(i);
                if (num == num2) {
                    result++;
                }
            }
            if (word2.contains("" + num)) {
                continue;
            }
            word2 += num;
            word2 += result;

        }
        System.out.println(word2);
    }
}
