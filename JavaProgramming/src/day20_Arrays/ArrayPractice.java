package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[]numbers={10,20,50,70}; // we use this method if we know the numbers that we are going to use
        System.out.println(Arrays.toString(numbers));

        System.out.println("------------------------------");

        // create variable that can contain 5 scores

        int [] scores = new int[5]; // we use this method if we don't know the numbers yet

        scores[0]= 23;

        scores[1]= 85;
        scores[scores.length-1]= 95; //last index
        scores[3]= 75;
        scores[2]= 34;

        System.out.println(Arrays.toString(scores));

        System.out.println("--------------------------------------------");

        String[] months= {"Jan","Feb","March","April","May","Jun",
                "July","Aug","Sep","Oct","Nov","Dec"}; // 0 ~11 (length -1)

       /* System.out.println(months[0]);//Jan
        System.out.println(months[1]); //feb
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);
        System.out.println(months[5]);
        System.out.println(months[6]);
        System.out.println(months[7]);
        System.out.println(months[8]);
        System.out.println(months[9]);
        System.out.println(months[10]);
        System.out.println(months[11]);

        */

        for (int i = 0; i < months.length ; i++) { // i: represents the index number of array starting from 0

           System.out.println(months[i]);

        }
        System.out.println();
        System.out.println("---------------------------------------------------------");

        for (int i = months.length-1; i >=0 ; i--) {
            System.out.println(months[i]);

        }

    }
}
// store teg elements: 10,20,50,70