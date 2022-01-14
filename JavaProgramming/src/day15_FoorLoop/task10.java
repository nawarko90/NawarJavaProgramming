package day15_FoorLoop;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("print the word");
        String word = scan.next();

        String num=word.substring(0,2)+word.substring(3);



        System.out.println(num);
    }

}






