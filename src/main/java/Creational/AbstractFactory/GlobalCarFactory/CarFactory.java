package Creational.AbstractFactory.GlobalCarFactory;

public class CarFactory {

  private CarFactory() {
    // Prevent instantiation
  }

  public static Car buildCar(CarType model) {
    Car car = null;

    // Read location property somewhere from configuration
    Location location = Location.ASIA;

    // Use location specific car factory
    switch(location) {
      case USA:
        car = USACarFactory.buildCar(model);
        break;

      case ASIA:
        car = AsiaCarFactory.buildCar(model);
        break;

      default:
        car = DefaultCarFactory.buildCar(model);
    }
    return car;
  }

}
