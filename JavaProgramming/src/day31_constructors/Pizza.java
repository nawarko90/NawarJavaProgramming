package day31_constructors;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calculateCost() {

        double StartingPrice = (size == 'S') ? 10 : (size == 'M') ? 12 : 14;

        double totalPrice= StartingPrice+(numberOfCheeseTopping+numberOfPepperoniTopping)*2;

        return totalPrice;

    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price= $" + calculateCost() +

                '}';
    }
}