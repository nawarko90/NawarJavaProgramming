package day37_Inheritance.EmployeeTask;

public class Employee extends Person {

    private int id,salary;
    private String jobTitle;

    public Employee(String name, int age, char gender) {
        super(name, age, gender);
    }

    public Employee(String name, int age, char gender, int id, int salary, String jobTitle) {
        super(name, age, gender);
      setId(id);
      setJobTitle(jobTitle);
      setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary<100000){
            System.err.println("Are you kidding me? I didn't study hard to get: "+salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void work(){
        System.out.println(getName()+" is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
