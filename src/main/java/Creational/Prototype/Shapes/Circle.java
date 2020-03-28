package Creational.Prototype.Shapes;

public class Circle extends Shape {
  private int radius;

  public Circle(int x, int y, String color, int radius) {
    super(x, y, color);
    this.radius = radius;
  }

  public Circle(Circle source) {
    super(source);
    this.radius = source.radius;
  }

  @Override
  public Circle makeClone() {
    return new Circle(this);
  }
}
