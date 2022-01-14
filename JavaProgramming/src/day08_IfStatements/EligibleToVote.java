package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        String name= "Nawar";
        int age= 31;
        String citizen ="USA";

        boolean isEligible = age >=21 && citizen=="USA";

        //Eligible

        if(isEligible){
            System.out.println(name+" is Eligible to vote");
        }

        //Not Eligible

        if (!isEligible){
            System.out.println(name+" is Not Eligible to vote");
        }




    }






}
