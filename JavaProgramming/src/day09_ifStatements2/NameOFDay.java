package day09_ifStatements2;

public class NameOFDay {
    public static void main(String[] args) {
        int n = 5; // 1~7

        boolean monday= n==1;
        boolean Tuesday= n==2;
        boolean Wednesday= n==3;
        boolean Thursday= n==4;
        boolean Friday= n==5;
        boolean Saturday= n==6;
        boolean Sunday= n==7;

        if (monday){
            System.out.println("Monday");
        }else if(Tuesday){
            System.out.println("Tuesday");
        }else if (Wednesday){
            System.out.println("Wednesday");
        }else if(Thursday){
            System.out.println("Thursday");
        }else if (Friday){
            System.out.println("Friday");
        } else if(Saturday){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }






    }



}
