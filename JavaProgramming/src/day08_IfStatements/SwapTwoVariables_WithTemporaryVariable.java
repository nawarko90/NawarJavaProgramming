package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {
    /*

     */

    public static void main(String[] args) {
        int a= 10;
        int b= 15;

        //-------------------------------
        int c= b;
        b= a;
        a= c;


        //--------------------------------
        System.out.println("a= " +a);//15
        System.out.println("b= "+c);//10



    }





}
