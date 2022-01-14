package day16_ForLoopStringPractice;

import java.util.Scanner;

public class unique2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Print the unique word");
        String word=input.next();
String result="";
        for (int i = 0; i <= word.length()-1 ; i++) {
            String ch=""+word.charAt(i);
            if(!result.contains(ch) ){
                result+=ch;
            }
        }
        System.out.println("result = " + result);
    }
}
