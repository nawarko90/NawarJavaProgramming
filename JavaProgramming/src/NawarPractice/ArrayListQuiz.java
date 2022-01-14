package NawarPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListQuiz {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1, 4, 3, 2, 5, 6, 7));
        for (Integer each : list) {
            if (each % 2 != 0) {
                continue;
            }
            System.out.println(each + "");
            break;
        }
    }
}