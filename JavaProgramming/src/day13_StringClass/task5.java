package day13_StringClass;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter a string:");
        String name= scan.nextLine();

        if(name.isEmpty()){
            System.out.println("string is empty");
        }else if(name.length()>3){
            System.out.println("the string has more than three charectors");
        }else{
            System.out.println(name);
        }




    }
}
/*
Write a method that asks user to enter a string.
if the string is empty, print: string is empty
if the string has more than 3 characters, print the last three
characters
if the string has less than or equal 3 characters, print the
string itself
 */