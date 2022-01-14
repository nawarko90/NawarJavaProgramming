package day04_Variables;

public class PremitivesIntro {

    public static void main(String[] args) {

        //age: 38 years old
        byte age = 38;

        // weight: 160 pounds
        // byte weight = 168; // 168 is out of byte range

        short weight = 168;

        //salary: $100000

        //short salary = 100000; // 100000 is out of short range

        int salary = 100_000; // int is the preferred data type for integer numbers
        //we use _ between the number to make it as a comma

        long asset= 3_333_333_333L; // we use L to force the compiler to use the number as not an int.

        //tax = 0.26
        //float tax = 0.26f; // we have to use f at the end to force the decimal to think it is not double
        double tax = 0.26; // double is the perfered charector for decimal numbers
    }


}
