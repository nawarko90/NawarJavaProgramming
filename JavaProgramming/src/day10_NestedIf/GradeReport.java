package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

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


    }
}