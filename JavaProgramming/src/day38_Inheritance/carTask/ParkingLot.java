package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota= new Toyota("Rav4","BluePrint",2021,33550,1100);

        Tesla tesla= new Tesla("unkonwn model","white",2020,100000,1000);

        BMW BMW=new BMW("r6","Black",2020,70000,2000);
        System.out.println(toyota);
        toyota.reliable();
        tesla.autoPilot();
    }
}
