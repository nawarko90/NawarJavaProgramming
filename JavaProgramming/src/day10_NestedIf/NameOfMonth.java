package day10_NestedIf;

public class NameOfMonth {
    public static void main(String[] args) {
        int num=2;

        String month= (num==1)?"Jan" :(num==2)?"Feb" :(num==3)?"March" :(num==4)?"April" :(num==5)? "May" :(num==6)?"Jun"
        :(num==7)?"July" :(num==9)?"Aug" :(num==9)?"Sep" :(num==10)?"Oct":(num==11)?"Nov" :"Dec";

        System.out.println("month = " + month);





    }
}
