package day37_Inheritance.animal_Task;

public class Dog extends Animal{

    public Dog(String name, String breed, String color, char gender, int age, String size){
super(name,breed,color,gender,age,size);



    }
    public void bark(){
        System.out.println(name+" is barking");
    }


}
