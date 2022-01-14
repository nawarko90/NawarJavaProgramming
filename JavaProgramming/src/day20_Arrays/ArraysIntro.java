package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
      String[] myGroup = new String[6];// 0~5
        myGroup[0] = "Nawar";
        myGroup[1] = "Waleed";
        myGroup[2] = "Laith";
        myGroup[3] = "Duraid";
        myGroup[4] = "Uday";
        myGroup[5] = "Luaay";

       // System.out.println(myGroup);// hashcode

        System.out.println(Arrays.toString(myGroup));

        System.out.println("----------------------------------------------------");

        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //index            0          1         2            3          4       5          6

        System.out.println(Arrays.toString(days));

        int number= 5;

        if(number<1 || number>7){
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(days[number-1]);

        System.out.println("------------------------------------------");

        String[] months= {"Jan","Feb","March","April","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
        int monthNum=4;
        if(monthNum<0 || monthNum>12){
            System.err.println("Invalid month");
            System.exit(0);
        }
        System.out.println(months[monthNum-1]);
    }
}
//created a variable that's capable enough to contain 5 names