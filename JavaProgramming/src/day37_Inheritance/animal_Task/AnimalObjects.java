package day37_Inheritance.animal_Task;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1= new Dog("Lucy","Husky","White",'F',2,"Large");
        dog1.bark();

        Cat cat1= new Cat("Fistik","outside cat","red",'M',1,"Small");
cat1.scratch();
        System.out.println(dog1);
        System.out.println(cat1);
    }
}
