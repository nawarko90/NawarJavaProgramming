package day14_priactice;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the first word");
        String word1= scan.next();
        System.out.println("enter the second word");
        String word2= scan.next();

   if(word1.charAt(word1.length()-1)==(word2.charAt(0))){
       word2=word2.substring(1);
       System.out.println(word1+word2);
   }else{
       System.out.println(word1+" "+word2);
   }


    }
}
/*
Ask user to enter two words. Then add them together and print.
But if the last letter of the first word and the first letter of the
last letter is the same,
print that character once.
 */