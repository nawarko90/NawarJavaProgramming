package day15_FoorLoop;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter the first number papi:");
        int first= scan.nextInt();
        System.out.println("enter the second number mami:");
        int second= scan.nextInt();
int number=0;
        for (int i = 0; i < first; i++) {
            number+=i;
        }
        System.out.println(number);




    }
}
