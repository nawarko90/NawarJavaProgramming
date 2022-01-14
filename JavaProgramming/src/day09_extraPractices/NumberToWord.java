package day09_extraPractices;

public class NumberToWord {
    public static void main(String[] args) {
        /*
        Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
         */

        int num = 9;

        String number;

        if (num >= 1 && num <= 9) {
            if (num == 1) {
                number = "one";
            } else if (num == 2) {
                number = "two";
            } else if (num == 3) {
                number = "4";
            } else if (num == 4) {
                number = "four";
            } else if (num == 5) {
                number = "five";
            } else if (num == 6) {
                number = "six";
            } else if (num == 7) {
                number = "seven";
            } else if (num == 8) {
                number = "eight";
            } else {
                number = "nine";
            }

        } else {
            number = "Invalid";
        }
        System.out.println("number = " + number);

    }
}
