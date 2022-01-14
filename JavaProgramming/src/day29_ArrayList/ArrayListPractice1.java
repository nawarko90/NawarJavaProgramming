package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

String [] countries= {"Japan", "Korea", "United States", "Iraq", "United Kingdom", "Canada"};

// converting array to arraylist:

        ArrayList<String> list= new ArrayList<>(Arrays.asList(countries)); // this is how to convert array to array list

        list.removeIf(p -> p.length()>=10);
        //each of the string element represent by p, after -> we put the condition

       countries= list.toArray(new String [0]);// this is how to convert list array to array. We put 0 as a default number, the number will be changed with the size of the new array.

        System.out.println(Arrays.toString(countries));
    }
}
/*
1. create an Array of string called countries
2. write a program that can remove all the country names that have length of 10 or greater
 */