package day37_Inheritance.EmployeeTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, int salary, String jobTitle) {
        super(name, age, gender, id, salary, jobTitle);
    }

    public void createTicket(){
        System.out.println(getName()+" is creating a ticket");
    }
}
