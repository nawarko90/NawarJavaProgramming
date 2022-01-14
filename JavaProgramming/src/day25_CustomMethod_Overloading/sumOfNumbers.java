package day25_CustomMethod_Overloading;

import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {

        int sum=sumOf2Numbers(10,20);
        System.out.println(sum);
int sum2=sumOfThreeNumbers(5,6,7);
        System.out.println(sum2);
        int sum3=sumOfFourNumbers(4,5,9,70);
        System.out.println(sum3);

    }




    public static int sumOf2Numbers(int num1, int num2){

        return num1+num2;

    }

public static int sumOfThreeNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
}

public static int sumOfFourNumbers(int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
}


}
