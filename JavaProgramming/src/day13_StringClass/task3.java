package day13_StringClass;

public class task3 {
    public static void main(String[] args) {
        String name = "nawar hussien";
        if (name.charAt(0) == name.charAt(name.length() - 1)) {
            System.out.println("the first and last charecters are the same");
        } else {
            System.out.println("they are not the same");
        }
    }
}
//write a program that can check if the first and last characters of the
//string are same