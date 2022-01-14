package day10_Practice;

public class GradeLevel {
    public static void main(String[] args) {
        /*
        Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
         */
byte grade=19;
String result;

if(grade >=1 && grade<=18){
  if(grade >=1 && grade<=5){
      result="Elementary School";
  }else if(grade>=6&& grade<=8){
      result="Middle school";
  }else if(grade>=9&&grade<=12){
      result="high school";
  }else if(grade>=13 && grade<=16){
      result="college";
  }else{
      result="Grade school";
  }

}else{
    result="Invalid grade level give";
}
        System.out.println("result = " + result);
    }
}
