package NawarPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class prca1 {
    public static void main(String[] args) {


        ArrayList<String> list= new ArrayList<>();

        list.addAll(Arrays.asList("Nawar", "Waleed","Duraid","Laith"));

        System.out.println(list);

        System.out.println(list.size());

        list.set(2,"Udai");
        System.out.println(list);

        list.remove("Laith");
        System.out.println(list);

        list.removeAll(Arrays.asList("Udai","Waleed"));
        System.out.println(list);


        ArrayList<String> first= new ArrayList<>(list);
        System.out.println(first);
first.add("Waleed");
        System.out.println(first);


    }
}
