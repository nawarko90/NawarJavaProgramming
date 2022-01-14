package day16_ForLoopStringPractice;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String result = "";
        System.out.println("Enter a number for 5 times");
        int number = 0;
        for (int i = 0; i <= 4; i++) {
            number = input.nextInt();
        }
        System.out.print("number = " + number);
    }
}
/*
 Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */