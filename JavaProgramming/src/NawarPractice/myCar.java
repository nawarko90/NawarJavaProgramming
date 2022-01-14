package NawarPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class myCar {
    public static void main(String[] args) {


        Car car1 = new Car();
car1.setInfo("Toyota","blue","RAV4",2021,35000,true,false);

        //System.out.print(car1);

        Car[] myCar={car1};

        ArrayList<Car> carColor= new ArrayList<>(Arrays.asList(myCar));

        System.out.println(carColor);    }
}
