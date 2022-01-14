package day31_constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        ArrayList<Pizza>firstGroup=new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza firstPizzaType= new Pizza('S',2,3);
            Pizza secondPizzaType= new Pizza('M',4,3);
            Pizza thirdPizzaType= new Pizza('L',5,7);

            firstGroup.addAll(Arrays.asList(firstPizzaType,secondPizzaType,thirdPizzaType));

        }
        System.out.println(firstGroup.size());

        double totalPrice=0;

        for (Pizza pizza : firstGroup) {
totalPrice+=pizza.calculateCost();
        }
        System.out.println(totalPrice);
        }


    }

