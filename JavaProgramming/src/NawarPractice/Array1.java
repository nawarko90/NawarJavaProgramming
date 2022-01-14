package NawarPractice;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

        String [] months= {"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};

       // int numOfMonth=0;

       // if(numOfMonth<1 || numOfMonth>12){
           // System.err.println("Invalid month");
          //  System.exit(0);

    //    System.out.println(months[numOfMonth -1]);

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);

        }
        System.out.println("------------------------------------------------");
        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);
        }


    }
}
