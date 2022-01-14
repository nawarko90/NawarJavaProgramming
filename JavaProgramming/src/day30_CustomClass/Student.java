package day30_CustomClass;

public class Student {

    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

//    public void setInfo(String name, char gender, int age, int ID, char grade){
//        this.name=name;
//        this.gender=gender;
//        this.age=age;
//        this.ID=ID;
//        this.grade=grade;
//
//    }

// We generate the set info by clicking right click, and select constructor, then we select all the variables.
    //then we change the return type to void, and change the name to setInfo
    public void setInfo(String name, char gender, int age, int ID, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }

public void code(){
    System.out.println(name+ " is coding");
}
public void sleep(){
    System.out.println(name+ " is sleeping");
}
}
