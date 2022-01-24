package day37_Inheritance.EmployeeTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, int id, int salary, String jobTitle) {
        super(name, age, gender, id, salary, jobTitle);
    }

    public void coding(){
        System.out.println(getName()+" is coding");
    }
}
