package day09_ifStatements2;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 10,
                b = 15,
                c = 12;

        boolean aIsMedian= (a>b && a<c) || (a>c && a<b);
        boolean bIsMedian= (b>a && b<c) || (b<a && b>c);
        boolean cIsMedian= (c>a && c<b) || (c<a && c>b);
//or boolean cIsMedian= !aIsMedian &&!bIsMedian
        if(aIsMedian){
            System.out.println(a+ "is the median number habibi");
        }
        if(bIsMedian){
            System.out.println(b+" is the median number hayati anta");
        }
if(cIsMedian){
    System.out.println(c+ " yeah baby, c is the median number xoxo");
}
    }

}
/*
Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number
 */