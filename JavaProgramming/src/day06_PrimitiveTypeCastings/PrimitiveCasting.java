package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {
    public static void main(String[] args) {

        byte a = 100;
        short b = a;

        // (short) a

        int c = b;

        long d = c;

        float e = d;
        double f = e;

        int x = 55;
        short y = (short) x; // explicit casting
        System.out.println(x + ":" + y);

        long j = 1000000;
        short n = (short) j;
        System.out.println(n);

        double v = 2.5;
        float m = (float) v;
        System.out.println(m + ":" + v);

        double z = 10.8;
        int p = (int) z;

        System.out.println(p);

        double d1 = 20.5;
        short s1 = (short) d1; // click ALT+ ENTER

    }


}
