package day35_Encapsulation.Encapsulation;

public class Employee {
    private String name;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.err.println("Name can't be empty");
            return;
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'F' || gender == 'M')) {
            System.err.println("Gender must be either M OR F: " + gender);
        System.exit(0);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 16 || age > 90) {
            System.err.println("Invalid age: " + age);
            System.exit(0);
        }
            this.age = age;

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            System.err.println("You need to get a job that pays you");
           System.exit(0);
        }
        this.salary = salary;
    }


}