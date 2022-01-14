package day21_ForEachLoop;

public class MaxNumber {
    public static void main(String[] args) {

        int[] numbers ={10,5,4,20,1,0};
        int max= numbers[0];
        int min=numbers[0];
        int sum=numbers[0];

        for (int each : numbers) {

            if (each>max){
                max=each;
            }

        }

        for (int lower : numbers) {
            if(lower<min){
                min=lower;
            }
            
        }
        for (int ave : numbers) {

                sum+=ave;


        }
        System.out.println(sum/numbers.length);
        System.out.println(sum);

        System.out.println("min = " + min);
        System.out.println(max);

    }
}
