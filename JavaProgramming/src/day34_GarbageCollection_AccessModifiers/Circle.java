package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi=3.14; // if static variable take one step to assign it, then we can directly assign it here
    public static  String name = "Circle";

    public static ArrayList<Integer> numbers= new ArrayList<>();// if static variable needs more steps to assign it, then we need static block


    public Circle (double radius){ // this is a constructor, and it is only for instances, not for statics.

        this.radius= radius;
      //  pi= 3.14; don't do that because we should not repeat static multiple time

    }

    static {// we us static block to set the value for static

        pi = 3.14;
        name= "Circle";

        numbers.add(1);
        numbers.add(2);
    }



}
