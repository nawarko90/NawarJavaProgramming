package day37_Inheritance.EmployeeTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, int id, int salary, String jobTitle) {
        super(name, age, gender, id, salary, jobTitle);
    }

    public void meeting(){
        System.out.println(getName()+ " is preparing for meeting");
    }
}
