package day21_ForEachLoop;

public class uni {
    public static void main(String[] args) {


        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};

        for (String elememnt : words) {
            int freq=0;

            for (String each : words) {
                if(elememnt.equals(each)){
                    freq++;
                }

            }
            if (freq==1){
                System.out.println("The Unique words are:"+elememnt);
            }

        }





    }
}