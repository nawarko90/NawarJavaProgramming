package NawarPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArraylistAndVisVirsa {
    public static void main(String[] args) {
        String[] arr = {"Tunc", "Yasaman", "Azamat", "Tamerlan"};       //created a String array
        ArrayList<String> names = new ArrayList<>(Arrays.asList(arr));  //Array to ArrayList
        names.add("Yekaterina");

     /*   for (String each : arr) {
            names.add(each);
        }*/
        System.out.println(names);                                      //ArrayList Print

        String[] arrNames = new String[names.size()];                   //created a new String Array

   /*     for (int i = 0; i < arrNames.length; i++) {
            arrNames[i]=names.get(i);
        }*/

        arrNames = names.toArray(arrNames);                             //ArrayList to Array
        System.out.println(Arrays.toString(arrNames));                  //Array Print
    }
}
