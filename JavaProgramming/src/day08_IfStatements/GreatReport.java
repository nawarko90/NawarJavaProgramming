package day08_IfStatements;

public class GreatReport {
    public static void main(String[] args) {
/*
        System.out.println(true == !false); // true
        System.out.println( !true != false); // false
        System.out.println(!false == true);// true

        System.out.println(!!false);// false
        System.out.println(!!!true);// false
      */

    int score =50; // 0~ 100

       // boolean a= score >= 90 || score <= 100;
                //     fasle     ||  true
        boolean A= score >=90 && score <= 100;

        boolean B= score >=80 && score <= 89;
//or
     //   boolean B= score >=80 && score !A;
        // it means if score is A, but score is greater than 80
        boolean C= score >= 70 && score <= 79;
        boolean D= score >= 60 && score <=69;
        boolean F= score >=0 && score <= 59;

        if(A){ // if the student made A
            System.out.println("Excellent");
        }
if (B) {
    System.out.println("Very Good");
}
if (C){
    System.out.println("Good");
}
if (D){
    System.out.println("Passed");
}
if (F){
    System.out.println("Fail you loser");
}



    }






}
/*

90 ~ 100 ==> Excellent
80~89 ==> very good
70 ~ 79 ==> Good
60~69 ==> passed
0~ 59==> failed
 */