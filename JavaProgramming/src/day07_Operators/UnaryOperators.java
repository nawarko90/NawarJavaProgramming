package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int a = 5;
        ++a;// pre increment: increase the value by 1 right away

        System.out.println(a); //6
        --a;// pre decrement drecrese the value by 1 right away

        System.out.println(a);

        int c = 100;
        System.out.println(c++);// post increment: first passes the current calue, then increases the value by 1
        System.out.println(c);// 101
        System.out.println("---------------------------------------------");

        int x= 200;
        System.out.println(--x);// pre decrement operator

        int y= 300;
        System.out.println(y--);// post decrement
        System.out.println(y);

int A= 3;
        System.out.println("A"+0+1);
        System.out.println("5+2=" +3+4);
        System.out.println("5+2=" +(3+4));
        float    asf  =  100.987_6543f;
        System.out.println(asf);

        int asdf = 3,  b = 2;

        long adsghth = (a+b) * 2 / 3 % 2 ;
        System.out.println(adsghth);
        System.out.println (  10/3.0  );
        System.out.println ( 10/3 );
        System.out.println (  10/3.0  );
    }


}
