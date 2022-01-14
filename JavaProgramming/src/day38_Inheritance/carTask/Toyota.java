package day38_Inheritance.carTask;

public class Toyota extends Car{


    public Toyota(String model, String color, int year, double price, double miles) {
        super("Toyota", model, color, year, price, miles);
    }

    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }
@Override //that's optional to check if the method is over ride or not
     void start(){ // we can use the same access modifier as the parent class when we overwrite it or more visible one
        System.out.println("push the key button "+brand+" "+model);
    }


}
