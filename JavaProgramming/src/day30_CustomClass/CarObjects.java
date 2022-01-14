package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {

       Car car1= new Car();

       car1.setInfo("Toyota","RAV4","BluePrint",2021,33500);
        System.out.println(car1);

        Car car2= new Car();

        car2.setInfo("BMW","X6","Black",2025,75000);

        System.out.println(car2);

        Car car3=new Car();

        car3.setInfo("Mercedes","Benz","Blue",2025,89000);
        System.out.println(car3);

      //  Car[] cars={car1,car2,car3};

        ArrayList<Car>CarsList= new ArrayList<>();
        CarsList.addAll(Arrays.asList(car1,car2,car3));

        System.out.println(CarsList);

        for (Car each : CarsList) {

            System.out.println(each.brand+" : "+ each.price);

            System.out.println("-------------------------------------------------------");

            /*
            BMW: 2005~2008 eligible for recall
            Toyota: 1995~ 1997 eligible for recall
             */

            CarsList.removeIf(p -> p.brand.equals("BMW")&&p.year >=2005 && p.year <= 2008);

            CarsList.removeIf(p -> p.brand.equals("Toyota")&&p.year >=1995 && p.year <= 1997);

        }

    }
}
