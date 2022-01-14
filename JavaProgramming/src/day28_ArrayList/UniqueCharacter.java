package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class UniqueCharacter {
    public static void main(String[] args) {
        
        String str= "aaabcccdeeef";

        // if we need to find the unique of a string, we can't convet it to array list, but we can convirt it to an array
        // so from the array we can convert it to array list 

        String [] arr= str.split(""); //we split each charector to make it an array (this become an array)

        ArrayList<String>list=new ArrayList<>(Arrays.asList(arr)); // this is how to convert string to an array list

        System.out.println("list = " + list);

        String unique="";

        for (String each : list) {
          int frequency=  Collections.frequency(list,each);
          if(frequency==1){
              unique+=each; // we use += because string doesn't have add method. the add method only for Intergirs (wrapper class)
          }

        }
        System.out.println("unique = " + unique);
        
        
    }
}
