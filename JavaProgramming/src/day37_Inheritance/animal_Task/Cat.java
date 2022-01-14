package day37_Inheritance.animal_Task;

public class Cat extends Animal {

    public Cat(String name, String breed, String color, char gender, int age, String size) {
        super(name, breed, color, gender, age, size);
    }

    public void scratch(){
        System.out.println(name+" is scratching");
    }

}
