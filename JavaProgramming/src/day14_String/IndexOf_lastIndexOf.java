package day14_String;

public class IndexOf_lastIndexOf {
    public static void main(String[] args) {
        String s= "Java Nova Cava Wawa orange";

        int firstA= s.indexOf("a");
        System.out.println("firstA = " + firstA);

        int LastAinJava= s.indexOf("va")+1;
        System.out.println("LastAinJava = " + LastAinJava);

        int lastA= s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);

        int LastAinWawa=s.indexOf("a o");
        System.out.println("LastAinWawa = " + LastAinWawa);
        
        int vInCava=s.lastIndexOf("v");
        System.out.println("vInCava = " + vInCava);

        int vIncava= s.indexOf("va W");
        System.out.println("vIncava = " + vIncava);


    }
}
