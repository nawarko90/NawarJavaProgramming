package day23_CustomMethods_Void;

public class CustomMethodWithParameters {

    public static void main(String[] args) {

        evenOrOddNumber(7);
        agePerson(1990);

    }

    //creat a function that can check if a number is odd or even number


    public static void evenOrOddNumber(int number){
        if(number%2==0){
            System.out.println(number +" is even number");
        }
        else {
            System.out.println(number+" is odd number");
        }

    }

    // display the age of a person ===>agePerson

    public static void agePerson(int birthYear){

        int age= 2021 - birthYear;

        System.out.println("your age is "+age);

    }

    public static void printNumbers(int x,int y){


    }

}
