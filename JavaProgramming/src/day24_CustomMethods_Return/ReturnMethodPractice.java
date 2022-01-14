package day24_CustomMethods_Return;

public class ReturnMethodPractice {
    public static void main(String[] args) {

        //find the max number between 100 & 200

        int result=max(4,8);
        System.out.println("the max number is "+ result);




        //multiply the max number by 2
        System.out.println(result*2);

    }


    public static int max(int a, int b){

        int result = 0;

        if(a>b){
            result=a;
        }else{
            result=b;
        }
        return result;
    }



}
