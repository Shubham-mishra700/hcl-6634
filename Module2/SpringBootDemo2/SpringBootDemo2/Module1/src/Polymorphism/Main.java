package Polymorphism;

import java.util.concurrent.TransferQueue;

public class Main {
  public static void main() {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
     //   Square square = new Square();

        Shapes  square = new Square();
        square.area(); // here it will print "Area is square of square of side" because it override the parent class method

        shape.area();
        circle.area();

    }
}
