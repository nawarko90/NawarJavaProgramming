package day16_ForLoopStringPractice;

import day14_String.StringMethod2;

public class task3 {
    public static void main(String[] args) {
        String str= "   Nawar   ";
        char num= str.charAt(3);
        System.out.println(num);
        String num2= ""+str.charAt(3);
        System.out.println(num2);

        int num3= str.length()-1;
        System.out.println(num3);

        String num4= str.toLowerCase();
        System.out.println(num4);

        String num5= str.toUpperCase();
        System.out.println(num5);

        str=str.trim();
        System.out.println(str );
        String str1= "Nawar Hussein and his sons must leave Iraq in 24 hours";
        int str2= str1.indexOf("ns");
        System.out.println(str2);
        int num6= str1.indexOf("ur");
        System.out.println("num6 = " + num6);
int num7= str1.lastIndexOf("s");
        System.out.println("num7 = " + num7);
        String num8= str1.replace("s", "n");
        System.out.println("num8 = " + num8);
        String num534= str1.replaceFirst("a","e");
        System.out.println("num534 = " + num534);
        String result= str1.substring(str1.indexOf("so"), str1.indexOf("ve")+2);
        System.out.println("result = " + result);
boolean result2=!str1.contains("waleed");
        System.out.println("result2 = " + result2);

    }
}
