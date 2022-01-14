package day15_FoorLoop;

public class Alphabet {
    public static void main(String[] args) {// I: 65 TO 90 in the asci table
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
        System.out.println("___________________________________________________________");

        for (char i = 'A'; i <= 'Z'; i++) { // i: A, B, C, D.....Z
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------------------");

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("------------------------------------------------------------");
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(char i=1; i<=40000; i++){
            System.out.print(i+" ");
        }


    }
}
/*
print:
A~Z
a~z
Z~A
z~a
 */