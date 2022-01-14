package day16_ForLoopStringPractice;

import utilities.StringUtility;

public class task4 {
    public static void main(String[] args) {

        String name = "nnnaaawwrtddd";

        String result = "";

        for (int i = 0; i <name.length() ; i++) {

            String num= ""+name.charAt(i);

            if(!result.contains(num)){
                result+=num;
            }

        }
        System.out.println(result);


    }
}