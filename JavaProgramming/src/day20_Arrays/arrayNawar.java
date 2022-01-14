package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayNawar {
    public static void main(String[] args) {

        String[] nsme = {"nawar", "hussein", "Duraid", "Laith", "Waleed"};

        System.out.print(nsme[2]);

        System.out.println(Arrays.toString(nsme));

        int num[] = {1, 2, 4, 5, 6, 7, 8,};
        System.out.println(num[4]);

        Scanner scan = new Scanner(System.in);
        int num3=0;
        int result=0;

        for (int j = 0; j < 5; j++) {
            System.out.println("enter a number");
            num3 = scan.nextInt();

            for (int i = 0; i < num3; i++) {

                if (num3 %2==0) {
                    result++;
                }
                else{
                    result--;
                }

            }
        }
        System.out.println(result);

    }
}