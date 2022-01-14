package day18_NestedLoop;

import java.util.Scanner;

public class Waleed {
    public static void main(String[] args) {
        System.out.println("enter a string");
        String str = new Scanner(System.in).next();
        String letters = "", digits = "", special = "";

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch >= '0' &&  ch <= '9'){
                digits += ""+ch;
            }else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                letters += ch;
            }else {
                special += ch;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("special = " + special);

    }
}