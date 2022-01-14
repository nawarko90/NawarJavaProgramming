package day32_Constructors;

public class CarObjects {
    public static void main(String[] args) {

        Car car1= new Car("Toyota");
        Car car2= new Car("Hoonda","Accourd");
        Car car3= new Car("BMW","X6",2021);
        Car car4= new Car("Lexus","tata",2022,65000);
        Car car5= new Car("Tesla","Model 3",2019,70000,"blue");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);


    }
}
