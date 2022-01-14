package day07_Operators;

public class RelationalOperatiors {
    public static void main(String[] args) {
        // >,>=, <, <=

        boolean result1 = 200 > 40;// true

        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150; // true

        System.out.println("result2 = " + result2);
        boolean result3 = 100 >= 100;

        System.out.println("result3 = " + result3);

        boolean result4= 300>= 500;

        System.out.println("result4 = " + result4);

        //credit score of 720

        int score= 745;

        boolean Eligibility= score >= 720;

        System.out.println("Eligibility = " + Eligibility);

        boolean result5 = 100 < 120; // true
        System.out.println("result5 = " + result5);

        boolean result6= 100<80;
        System.out.println("result6 = " + result6);

        int result7= 59;
        boolean passingGrade= result7 <=59;

        System.out.println("passingGrade = " + passingGrade);

        System.out.println("-------------------------------");

        int x=100;
                int y=200;
                boolean eaual = x==y;// false
        System.out.println("eaual = " + eaual);

        boolean result8 = "Nawar"== "bad boy"; // false
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a'; // false
        System.out.println("result9 = " + result9);

        boolean result10= "java"=="java";

        System.out.println("result10 = " + result10);// == mean equal

        System.out.println("-----------------------------");
        boolean result11= 100!=200.5;// true
        System.out.println("result11 = " + result11);

        boolean result12= "java" != "break"; // true
        System.out.println("result12 = " + result12);

        boolean result13= 300 != 300; // false
        System.out.println("result13 = " + result13);
        // != mean does not equal



    }


}
