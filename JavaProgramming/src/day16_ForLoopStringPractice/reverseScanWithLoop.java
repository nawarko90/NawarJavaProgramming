package day16_ForLoopStringPractice;

import java.util.Scanner;

public class reverseScanWithLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter whatever you want and I will reverse it for you");
        String sentance = input.nextLine();
        System.out.println("Are you sure that you want me to reverse that?");
        String sentence2 = input.next();
        String result = "";

        for (int i = sentance.length() - 1; i >= 0; i--) {
            result += sentance.charAt(i);
        }
        if (sentence2.equals("yes")) {
            System.out.println(result);
        } else {
            System.out.println("Don't waste my time");
        }
        System.out.println("Now we are done with reverse, let's find the unique letters");
        input.nextLine();
        String str = input.next();
        String result2 = "";
        String ch="";
        for (int i = 0; i<= str.length()-1; i++) { //i: represents the all the index numbers of str (start from 0)

            ch = "" + str.charAt(i); // represents each Character of str

            if (!result2.contains(ch)) { // if the character is not contained in the result
                result2 += ch;

            }

        }
        System.out.println(result2);
    }
}