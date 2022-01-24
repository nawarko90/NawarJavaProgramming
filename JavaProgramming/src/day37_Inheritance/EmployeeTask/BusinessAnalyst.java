package day37_Inheritance.EmployeeTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, int id, int salary, String jobTitle) {
        super(name, age, gender, id, salary, jobTitle);
    }

    public void analysing(){
        System.out.println(getName()+ " is analysing");
    }

}
