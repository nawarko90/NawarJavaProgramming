package day16_ForLoopStringPractice;

import java.util.Scanner;

public class repeat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Print your name in reverse if you can do that");
        String nar = input.nextLine();
        String reverse = "";
        for (int i = nar.length()-1; i >= 0; i--) {
            reverse += nar.charAt(i);
        }
        System.out.println("reverse = " + reverse);
    }
}
