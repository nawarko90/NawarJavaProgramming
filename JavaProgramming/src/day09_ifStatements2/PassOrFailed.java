package day09_ifStatements2;

public class PassOrFailed {
    public static void main(String[] args) {
        int score =70;

        boolean pass= score >=75;
        boolean failed= score <75;

        if(pass){
            System.out.println(score+ " is pass");
        }else{
            System.out.println(score+ " failed");

        }




    }



}
