package day19_LoopPractices;

public class parac2 {
    public static void main(String[] args) {
        String word = "aaasssddgggrrrbbvcdfgvsfff";
        String result = "";

        for (int j = 0; j < word.length(); j++) {

            char name = word.charAt(j);
            int count = 0;

            for (int i = 0; i < word.length(); i++) {
                char name2 = word.charAt(i);

                if (name == name2) {
                    count++;
                }
                if (!result.contains("" + name2)) {



                    result += name2;
                    result += count;
                }

            }
        }
        System.out.println(result);
    }
}