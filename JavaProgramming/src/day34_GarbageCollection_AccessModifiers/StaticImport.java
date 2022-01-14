package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;
import static utilities.MathUtility.*;
public class StaticImport {
    public static void main(String[] args) {

        System.out.println(pi);
        System.out.println(name);
        System.out.println(numbers);

        //find the sum of 10,20;

        int r1= sum(10,20);

        int r2= subtract(20,10);

        int r3= max(10,20);

    }
}
