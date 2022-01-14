package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        String name= "Steven";
        int age = 14;
        String citizen= "USA";

        Boolean isEligible= age >=18 && citizen=="USA";

        System.out.println(name +" is eligible to vote: "+ isEligible);

         // 14>= 18 && "USA"== "USA
        // false && true ==> false
        System.out.println("------------------------------------");

        String name2= "Nawar";
        int creditScore= 720;
        int age2= 23;
        int income= 40000;
        boolean isEligibale2= creditScore >=700 && age2>=20 && income >= 60000;
        System.out.println(name2+" is eligiable for the loan: "+isEligibale2);

        System.out.println("--------------------------------------");

        String name3= "Shay";
        int age3= 21;
        char gender= 'F';
        Boolean isEligiable3= age3>=18 & (gender=='M'|| gender=='F' );

        // 21>= && ('f'=='M' || 'F'=='F')
        // true &&  (fase   ||   true)
        // true && true
        // true

        System.out.println(name3 + "is eligiable to register: "+ isEligiable3);
        System.out.println("-----------------------------------");

        String name4= "James";
        String countryOfBirth= "Iraq";

        boolean marriedToUsCitizen= false;
        boolean isEligible4= countryOfBirth=="USA" || marriedToUsCitizen==true;
        //                        false            || false

        System.out.println(name4+ " is eligibale to apply: "+ isEligible4);
        System.out.println("---------------------------------");
        String student="Anna";
        double gpa= 2.5;
        int familyIncome= 40000;

        boolean isEligible5= gpa>=3.5 || familyIncome<=60000;

        System.out.println(student+" is eligiable: "+isEligible5);


    }




}
