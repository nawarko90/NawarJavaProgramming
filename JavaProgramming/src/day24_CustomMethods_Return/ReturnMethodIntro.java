package day24_CustomMethods_Return;

public class ReturnMethodIntro {
    public static void main(String[] args) {
            String word=("nan");

        String result= reverse(word);
        System.out.println(result);

        if(word.equalsIgnoreCase((result))){
            System.out.println(word+" is palindrome");
        }else{
            System.out.println(word+" is not palindrome");
        }

    }

    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            reverse += str.charAt(i);

        }
        return reverse;

    }

}


