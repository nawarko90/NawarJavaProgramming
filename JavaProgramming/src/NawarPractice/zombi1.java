package NawarPractice;

import java.util.Scanner;

public class zombi1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int inhabitants = scan.nextInt();
            int day=0;
            int result=0;

            for (int i = inhabitants, j=day; i >= 0; i--, j++) {
if(inhabitants>day){
    inhabitants -=2;
}
                System.out.println(inhabitants);

            }

            }


        }


