package NawarPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class pract {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>(Arrays.asList("kiwi","apple","banana"));
        list.add("Strawberry");

        System.out.println(list);

        ArrayList<String> list2= new ArrayList<String>();
        System.out.println(list.removeAll(Arrays.asList("apple","banana")));


    }
}

// creating an ArrayList object

// adding elements => add()

// getting elements => get(index)

// check if items exists in the list  => contain(element) =>returns boolean value

// getting the index of the item by value  => indexOf(element)

// getting the index of the item by value  => lastIndexOf(element)

// checking how many item in the list   =>size()

// check if the list is empty   =>isEmpty()

// setting the value for certain index => set(index, newElement) =>In String we use replace()

// removing item by index  =>remove(index)

// removing item by value  =>remove(object)  =>returns boolean value

// removing all items in the list  => clear()