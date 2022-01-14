package day18_NestedLoop;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day=0;

        for (int i = 0; i <=0 ; i++) {
            inhabitants=i;
if(day==0){
    System.out.println(inhabitants);
}else if(day>0){
    inhabitants=inhabitants/2;
}


        }
        System.out.println(inhabitants);

    }
}

