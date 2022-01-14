package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1= new Dog();
        dog1.setInfo("Lucy","Husky","White",'F',2,"Large");
        dog1.eat();
        dog1.drink();
        dog1.sleep();
        dog1.move();
        dog1.bark();

        Cat cat= new Cat();
        cat.setInfo("Fistik","outside cat","red",'M',1,"Small");
        cat.eat();
        cat.sleep();
        cat.drink();
        cat.scratch();
        cat.meow();

        Tiger tiger= new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", "brown", 'M', 4, "Large");
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.roar();
        tiger.hunt();

        System.out.println(dog1);
        System.out.println(cat);
        System.out.println(tiger);

    }
}
