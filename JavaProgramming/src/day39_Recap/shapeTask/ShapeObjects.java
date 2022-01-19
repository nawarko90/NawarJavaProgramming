package day39_Recap.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {


        Square square = new Square(10);

        System.out.println(square);


        square.setSide(15);

        System.out.println(square);

        Rectangle rectangle = new Rectangle(10,5);

        System.out.println(rectangle);

        Circle circle= new Circle(10);
        System.out.println(circle);

        circle.setRadius(15.5);
        System.out.println(circle);

        System.out.println(circle.getName());
    }
}