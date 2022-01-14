package day13_StringClass;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter name");
        String name=scan.nextLine();

        String initial=""+name.charAt(0)+name.charAt(name.indexOf(" ")+1);
        System.out.println(initial);

        System.out.println("---------------------------------------");

        System.out.println("enter first name");
        String first=scan.next();
        System.out.println("enter second name");
        String second= scan.next();

        first=""+first.charAt(0);
        second=""+second.charAt(0);
        System.out.println(first+"."+second);
    }
}
//write a program that can return the initials of the user