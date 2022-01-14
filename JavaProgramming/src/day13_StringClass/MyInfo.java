package day13_StringClass;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("inter your age");
        int age= input.nextInt();
        System.out.println("enter your gender");
        String gender= input.next();
        System.out.println("enter your full name");
        input.nextLine();
        String name= input.nextLine();
        System.out.println("enter phone number");
        long number= input.nextLong();
        System.out.println("enter zipcode");
        int zipcode= input.nextInt();
        System.out.println("enter school name");
        input.nextLine();
        String schoolName= input.nextLine();
        System.out.println("City name");
        input.nextLine();
        String city=input.nextLine();
        System.out.println("enter your state");
        String state= input.next();
        System.out.println("enter your building number");
        int building=input.nextInt();
        System.out.println("enter your street name");
        input.nextLine();
        String streetName= input.nextLine();
        input.close();


    }
}
/*
1. Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT
 */