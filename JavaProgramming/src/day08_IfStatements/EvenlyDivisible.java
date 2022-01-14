package day08_IfStatements;

public class EvenlyDivisible {
    /*
    Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
     */
    public static void main(String[] args) {


        int number = 65;
        boolean divisibleBy2 = number % 2==0;// if the remainder of a number divided by 2 is zero, then it's evenly divisible by 2
        boolean divisableBy3 = number %3==0;
        boolean divisableBy5 = number %5==0;

        System.out.println(number +" is divisiable by 2: "+divisibleBy2 );
        System.out.println(number+ " is divisible by 3: "+ divisableBy3);
        System.out.println(number+" is divisible by 5: "+ divisableBy5);

        System.out.println("----------------------------------------");

        int year= 2000;

        boolean isleapyear= year%4==0;

        System.out.println(year+" is leap year: "+ isleapyear);






    }
}
