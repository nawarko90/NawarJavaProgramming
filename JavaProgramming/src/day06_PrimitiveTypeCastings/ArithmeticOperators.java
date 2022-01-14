package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(10+20);// 30, addition
        System.out.println(100-50); // 50, subtaction
        System.out.println(10*10); // 100, multi

        System.out.println(100/3); // 33
        System.out.println(10.0/4);//2.5  we should make one of the number decimal to get the accurat result
        System.out.println(10/4.0); // same result
        System.out.println(10d/4); // same result


        int a= 100;
        double b = a/6; //16.0

        double c= (double) a/6; //16.6666
        double f= a/6.0;
        System.out.println(f);





    }





}
