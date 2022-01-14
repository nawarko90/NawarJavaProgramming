package day15_FoorLoop;

public class task6 {
    public static void main(String[] args) {
        int num=5;
        int even=1;

        for (int i = num; i >=1 ; i--) {
            even*=i;

        }

        System.out.println(even);
    }
}
