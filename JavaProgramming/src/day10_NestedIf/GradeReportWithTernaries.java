package day10_NestedIf;

public class GradeReportWithTernaries {
    public static void main(String[] args) {
        /*
         int grade = 69;
        String Result;

        if (grade <= 100 && grade >= 0) {
            if (grade >= 90) {
                Result = "Excelent";
            } else if (grade >= 80) { //  && grade<=89 is extra
                Result = "Very good";
            } else if (grade >= 70) { //  && grade <=79 is extra
                Result = "Good";
            } else if (grade >= 60) { //  && grade <=69 is extra
                Result = "PASSED";
            } else {
                Result = "failed";
            }

        } else { // if the result is over 100 or less than 0
            Result = "Invalid";
        }

        System.out.println("Result = " + Result);
         */
int grade=110;

String result2;
    //String Result= (grade <= 100 && grade >= 0)? (grade >= 90)?"Great" :(grade >= 80)?"Very Good":(grade >= 70)?"Good":(grade >= 60)?"pass":"failed" :"invalid";

     //   System.out.println("Result = " + Result);


//or
    if (grade <= 100 && grade >= 0){

        result2= (grade >= 90)?"Great" :(grade >= 80)?"Very Good":(grade >= 70)?"Good":(grade >= 60)?"pass":"failed";

    }else{
        result2 ="invalid";
    }

        System.out.println("result2 = " + result2);

    }
}
