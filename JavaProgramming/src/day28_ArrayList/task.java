package day28_ArrayList;

import java.util.Arrays;

public class task {
    public static void main(String[] args) {

        int num []= {1,2,3,4};
        num [2]=30;
        int num1 []= new int[7];
        num1[0]=23;
        num1[1]=40;
        System.out.println(Arrays.toString(num1));

        System.out.println(num[2]);

        System.out.println(Arrays.toString(num));
        Arrays.sort(num1);
        System.out.println(Arrays.toString(num1));

        char [] arr1={'a','b','c','d'};

        char [] arr2={'d','c','b','a'};

        char [] arr3=Arrays.copyOf(arr1,9);
        arr3[4]= 'r';
        System.out.println(Arrays.toString(arr3));


        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));

        char [] elements= Arrays.copyOfRange(arr3,4,9+1);
        System.out.println(Arrays.toString(elements));
    }
}