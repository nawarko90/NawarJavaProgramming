package day16_ForLoopStringPractice;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter the word that you want to reverse");
        String word = scan.next();
        System.out.println("are you sure that you want to reverse that word?");
        String answer = scan.next();
        String result = "";

        if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")) {
            if (answer.equalsIgnoreCase("yes")) {
                for (int i = word.length() - 1; i >= 0; i--) {
                    String ch = "" + word.charAt(i);
                    result += ch;

                }
                System.out.println("the word that you want to reverse is: " + result);

            } else {
                System.out.println("please don't waste my time");
            }


        } else {
            System.err.println("invalid answer baka");
            System.exit(0);
        }
        System.out.println("now we can remove duplicate, please enter a word with many letters");
        String longword=scan.next();
        int frequency=0;
        String duplicate="";
        for (int i = 0; i <longword.length() ; i++) {
            String num=""+longword.charAt(i);
            if(!duplicate.contains(num)){
                duplicate+=num;
            }

        }
        System.out.println("the word without duplicated litters is: "+duplicate);

        System.out.println("now I want you to remove the space between these words: ");
        scan.nextLine();
        String removeSpace=scan.nextLine();

        while(removeSpace.contains("  ")){
          removeSpace=  removeSpace.replaceAll("  "," ");
        }
        System.out.println(removeSpace);
    }
}