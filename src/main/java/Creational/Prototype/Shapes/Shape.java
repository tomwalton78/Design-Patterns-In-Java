package Creational.Prototype.Shapes;

public abstract class Shape implements Prototype {

  private int x, y;
  private String color;

  public Shape(int x, int y, String color) {
    this.x = x;
    this.y = y;
    this.color = color;
  }

  // Prototype constructor
  public Shape(Shape source) {
    this.x = source.x;
    this.y = source.y;
    this.color = source.color;
  }
}
