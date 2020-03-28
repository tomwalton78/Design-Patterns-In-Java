package Creational.Prototype.Shapes;

public class Rectangle extends Shape {
  private int width;
  private int height;


  public Rectangle(int x, int y, String color, int width, int height) {
    super(x, y, color);
    this.width = width;
    this.height = height;
  }

  public Rectangle(Rectangle source) {
    super(source);
    this.width = source.width;
    this.height = source.height;
  }

  @Override
  public Rectangle makeClone() {
    return new Rectangle(this);
  }
}
