package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class test {

    public static void main(String[] args) {
        String str="Java Programming Language";

      StringUtility.printEachChar(str);

        String num="nawar";

      num=StringUtility.reverse(num);
        System.out.println(num);


       String num1= "nun";
       boolean hi=StringUtility.isPalindrome(num1);
        System.out.println(hi);


        String []  names= {"Anna","Java","Python","racecar","Mom"};
        int count=0;
        for (String each : names) {

            if(StringUtility.isPalindrome(each)){
                count++;

        }

        }
        System.out.println(count);
        System.out.println("____________________________________________");
        System.out.println();

        int[] n1= {1,2,3,4,5,6};
        int max1= ArraysUtility.max(n1);
        System.out.println(max1);

int[] a1={1,2,3,4,5};
        System.out.println("------------------------------------------------");

boolean r1=ArraysUtility.contains(a1,5);
        System.out.println("r1 = " + r1);



    }





}
