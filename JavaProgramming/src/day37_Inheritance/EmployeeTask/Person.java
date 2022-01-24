package day37_Inheritance.EmployeeTask;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty()||name.isBlank()){
            System.err.println("invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender==('M')||gender==('F'))){
            System.err.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public void eat(){
        System.out.println(getName()+" is eating");
    }

    public void drink(){
        System.out.println(getName()+" is drinking");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
