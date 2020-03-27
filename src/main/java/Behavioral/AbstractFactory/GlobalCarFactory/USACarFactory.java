package Behavioral.AbstractFactory.GlobalCarFactory;

import java.security.InvalidParameterException;

public class USACarFactory {

  public static Car buildCar(CarType model) {
    Car car = null;
    switch(model) {
      case SMALL:
        car = new SmallCar(Location.USA);
        break;

      case SEDAN:
        car = new SedanCar(Location.USA);
        break;

      case LUXURY:
        car = new LuxuryCar(Location.USA);
        break;

      default:
        throw new InvalidParameterException(String.format("Car type '%s' is not supported by USACarFactory", model));
    }

    return car;
  }
}
