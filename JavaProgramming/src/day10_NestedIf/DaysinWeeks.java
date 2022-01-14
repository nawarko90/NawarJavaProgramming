package day10_NestedIf;

public class DaysinWeeks {
    public static void main(String[] args) {

        int n=5;

      String day=  (n==1)? "monday" :(n==2)?"tuesday" : (n==3)? "Wednesday": (n==4)? "Thursday":(n==5)?"Friday":(n==6)?"Saturday":"sunday";

        System.out.println("day = " + day);


    }
}
