package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class test2 {
    public static void main(String[] args) {

        int[] arr1={1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);

        double[] arr2={1.4,1.6,3.7,43.4};

        ArraysUtility.printEachElement(arr2);

        char[] arr3= {'a','b','v','s'};
        ArraysUtility.printEachElement(arr3);

        String []arr4={"nawar","hussein","abbas"};
        ArraysUtility.printEachElement(arr4);
    }
}
