package day09_ifStatements2;

public class MaxAndMin {
    public static void main(String[] args) {
        int n1=40,
                n2=30;
        boolean n2IsMax= n2>n1;
        boolean n1IsMax= n2<n1;

        if(n2IsMax){
            System.out.println(n2+ " is max and " +n1 + " is min");
        }else{
            System.out.println(n1+ " is max and "+ n2+ " is min");
        }






    }
}
/*
        1. Maximum number between two different numbers
        2. Minimum number between two different numbers
 */