package day04_Variables;
//Create a class named EmployeeInfo. declare the following variables:
//                1. name (String)
//                2. age (int)
//                3. gender (char)
//                4. company (String)
//                5. jobTitle (String)
//                6. yearsOfExperience (double)
//                7. salary (int)
//                8. isFullTime (boolean)
//                9. isMarried (boolean)
//                10. employeeId (String)
//                11. SSN (String)
public class EmployeeInfo {
    public static void main(String[] args) {

        String name="Nawar"; // string we use double qoute
        int age= 31; // no goute for int or double
        char gender='M'; // one quote for char
        String company = "Amazon";
        String jobTile= "SDET";
        double yearsOfExperience= 2.5;
        int salary= 120000;
        boolean isFullTime= true; // no quote for boolean, also use lower case for true and false
        boolean isMarried= false;
        String employeeId= "A101";
        String ssn= "123-56-7596";

        System.out.println("isFullTime = " + isFullTime);
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("isMarried = " + isMarried);
        System.out.println("jobTile = " + jobTile);
        System.out.println("company = " + company);
        System.out.println("employeeId = " + employeeId);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("ssn = " + ssn);
    }
}
