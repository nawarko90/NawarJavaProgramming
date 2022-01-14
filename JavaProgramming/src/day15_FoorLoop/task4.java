package day15_FoorLoop;

public class task4 {
    public static void main(String[] args) {

        int num=5;
        int num2=1;

        for (int i = num; i >=1; i--) {
            num2*=i;

        }
        System.out.println(num2);



    }
}


/*
 Write a program that can return the factorial number of any given
number
Ex:
input: 5
output: 120
( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */