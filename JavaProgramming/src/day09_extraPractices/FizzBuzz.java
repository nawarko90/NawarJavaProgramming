package day09_extraPractices;

public class FizzBuzz {
    public static void main(String[] args) {
        /*
        Create a class called FizzBuzz, an integer variable named number is given to you, write a program that prints "Fizz" if the number is divisible by 3, prints "Buzz" if the number is divisible by 5, and prints FizzBuzz if the number is divisible by both 3 and 5.

            Ex:
                number 15

            Output:
                FizzBuzz
         */
        int number= 15;
        String Output;

        if (number%3==0 && number%5==0) {
            Output = "FizzBuzz";
        } else if (number%3==0){
            Output="Fizz";
        }else if (number%5==0){
            Output="Buzz";
        
        }else{
            Output="No FizzBuzz today";
        }
        System.out.println("Output = " + Output);
    }
}
