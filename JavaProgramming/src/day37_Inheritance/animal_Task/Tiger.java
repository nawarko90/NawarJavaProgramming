package day37_Inheritance.animal_Task;

public class Tiger extends Animal{
    public Tiger(String name, String breed, String color, char gender, int age, String size) {
        super(name, breed, color, gender, age, size);

    }
    public void rorar(){
        System.out.println(name+" Is roaring");
    }
}
