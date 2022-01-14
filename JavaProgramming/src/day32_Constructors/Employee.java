package day32_Constructors;

public class Employee {

    public String name,jobTitle;
    public char gender;
    public int salary;



    public Employee (String name){
        this.name=name;
    }
    public Employee(String name, char gender){
        this(name);
        this.gender=gender;
    }

    public Employee(String name, char gender, String jobTitle){
this(name,gender);
        this.jobTitle=jobTitle;
    }
    public Employee(String name, char gender, String jobTitle, int salary){
        this(name,gender,jobTitle);
        this.salary=salary;
    }


        public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
