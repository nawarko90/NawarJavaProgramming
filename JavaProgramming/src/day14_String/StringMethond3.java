package day14_String;

public class StringMethond3 {
    public static void main(String[] args) {
        String word = "Cydeo School is cool";
        //            012345...
        String Brand = word.substring(0 + 4 + 1);
        System.out.println("Brand = " + Brand);

        String str1 = word.substring(6);// when we don't put +, it will print until the end of the sentence
        System.out.println("str1 = " + str1);


        String word2="Nawar Hussein Allatif";

        String s1=word2.substring(0,word2.indexOf(" "));
        System.out.println("s1 = " + s1);

        String s2= word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));
        System.out.println("s2 = " + s2);

        String s3= word2.substring(word2.lastIndexOf(" ")+1);
        //String s3=word2.substring(word2.indexOf("L"), word2.lastIndexOf("e")+1);
        System.out.println("s3 = " + s3);
        System.out.println("---------------------------");

        String email="Nawar_Hussein@yahoo.com";
        email=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("email = " + email);
        
       // String email1=email.substring(0,email.indexOf("@"));//??
        // System.out.println("email1 = " + email1); ?

        String str5="Java is fun, Java is cool";// Java is fun
        String str2=str5.substring(0,str5.indexOf(","));
        System.out.println("str2 = " + str2);
        String str6=str5.substring(str5.lastIndexOf(",")+2);
        System.out.println("str6 = " + str6);
        System.out.println("________________________________");
        
        String nawar=" I love Nawar, he is cool";
        String name=nawar.substring(nawar.indexOf("N"),nawar.indexOf(","));
        String remain=nawar.substring(nawar.indexOf(",")+1);
        System.out.println("remain = " + remain);
        System.out.println("name = " + name);
    }
}
