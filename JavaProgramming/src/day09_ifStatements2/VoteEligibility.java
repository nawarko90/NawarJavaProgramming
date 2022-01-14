package day09_ifStatements2;

public class VoteEligibility {
    public static void main(String[] args) {

        String name= "Nawar";
        String Country= "Iraq";
        int age= 31;

        boolean eligible= Country=="USA" && age >=18;
        boolean notEligible= Country=="!USA" && age <18;

        if (eligible){
            System.out.println(name+" is eligible");
        }else{
            System.out.println(name+ " is not eligible habibi");
        }



    }
}
/*
        4. Write a program that can check if the person is eligible to vote

 */