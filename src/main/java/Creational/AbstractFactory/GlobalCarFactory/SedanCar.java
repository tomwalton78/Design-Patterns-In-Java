package Creational.AbstractFactory.GlobalCarFactory;

public class SedanCar extends Car {
  public SedanCar(Location location) {
    super(CarType.SMALL, location);
    construct();
  }

  @Override
  protected void construct() {
    System.out.println("Building sedan car");
  }
}
