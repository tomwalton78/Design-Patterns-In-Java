package Creational.Prototype.Shapes;

import java.util.ArrayList;
import java.util.List;

public class Application {

  public static void main(String[] args) {
    List<Shape> shapes = new ArrayList<>();

    Circle circle = new Circle(10, 10, "red", 5);
    shapes.add(circle);

    Circle anotherCircle = circle.makeClone();
    shapes.add(anotherCircle);

    Rectangle rectangle = new Rectangle(6, 7, "blue", 10, 20);
    shapes.add(rectangle);

    // Copy all shapes
    List<Prototype> moreShapes = new ArrayList<>();
    for (Shape shape:shapes) {
      moreShapes.add(shape.makeClone());
    }

  }
}
