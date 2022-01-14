package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        int n = 300;

        // positve
        if (n > 0) {
            System.out.println(n + " is positive");
        }
        if (n < 0) {
            System.out.println(n + " is negitive");
        }
if (n==0){
    System.out.println(n+" is 0");
}
        System.out.println("-----------------------------------");

        int number = 101;

        /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
         */

        boolean evenNumber = number%2 == 0;
        boolean oddNumber = ! evenNumber; // not even number

        if(evenNumber){ // false
            System.out.println(number+" is even number");
        }

        if(oddNumber){// true
            System.out.println(number+" is odd number");
        }


        System.out.println("--------------------------------");
    }


}
