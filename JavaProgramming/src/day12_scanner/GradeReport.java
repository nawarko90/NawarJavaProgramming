package day12_scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner grade= new Scanner(System. in);
        System.out.println("what is your score?");
        int score= grade.nextInt();

       String result="";

       if(score >=0 && score <=100){
          if(score>=90){
              result="A";
          }else if (score >=80){
              result = "B";
          }else if(score >=70){
              result="C";
          }else if (score>=60){
              result="D";
          }else {
              result="F";
          }

       }else{
           result="invalid score";
       }

        System.out.println("Your result is "+result);
    }
}

/*
2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */