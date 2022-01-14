package day17_while_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Python Python";
        int frequency = 0;

        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            frequency++;
        }

        System.out.println(frequency);

        System.out.println("-----------------------------------------------");

        String sentence = "cat cAt cat Cat dog dog CAT dog dog dog caT";
        sentence = sentence.toLowerCase(); // we use this if we want to convert all the sentece to lower case for easier count
        int countCat = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println(countCat);

        System.out.println("-----------------------------------------------");

        String s = "Java Java Java Python Python Python";
        s = s.toLowerCase();
        int countJava = 0;
        int countPython = 0;

        while (s.contains("java") || s.contains("python")) {


            if (s.contains("java")) {
                s = s.replaceFirst("java", "");
                countJava++;
            }
            if (s.contains("python")) {
                s = s.replaceFirst("python", "");
                countPython++;
            }

        }
        System.out.println(countJava);
        System.out.println(countPython);
    }
}
