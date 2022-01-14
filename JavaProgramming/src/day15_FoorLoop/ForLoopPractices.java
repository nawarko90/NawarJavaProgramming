package day15_FoorLoop;

import java.util.Scanner;

public class ForLoopPractices {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a word");
        String result=input.nextLine();
        for(int i=15; i<=45;i++){
            System.out.print(result+" ");
        }
        System.out.println("------------------------");
for(int i=10; i<=45; i++){
    System.out.print(i+" ");
}
for (int i=100; i>=50; i--){ //i: 100 ,99,98...50
    System.out.print(i+" ");
}
        System.out.println();
        System.out.println("________________________________________________________________");


// print all the even numbers between 1~55

        for(int i=1; i<=55; i++){

            if( i % 2 ==0){
                System.out.print(i+" ");
            }
        }
        for(int i= 2; i<= 54; i+=2){ // another solution for the previous example
            System.out.print(i+" ");
        }

    }
}
