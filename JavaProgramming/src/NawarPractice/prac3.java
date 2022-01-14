package NawarPractice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class prac3 {
    public static void main(String[] args) {

        String name[] = {"waleed", "nawar"};
        System.out.println(Arrays.toString(name));

        System.out.println(name[0]);

        String name1[] = new String[2];

        name1[0] = "NMNM";
        name1[1] = "kmkm";
        System.out.println(Arrays.toString(name1));

        int num[] = {1, 5, 4, 6, 8, 9};

        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        for (int i = num.length - 1; i >= 0; i--) {

            System.out.print(num[i]);
        }

        ArrayList<Integer> even = new ArrayList<>();
        int odd = 0;
        for (int i = 0; i < num.length; i++) {

        }

    }
}



//Write a program that sort the array of integer in descending
//order