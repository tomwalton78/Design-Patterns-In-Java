package Creational.AbstractFactory.GlobalCarFactory;

import java.security.InvalidParameterException;

import static java.lang.String.format;

public class AsiaCarFactory {

  public static Car buildCar(CarType model) {
    Car car = null;
    switch(model) {
      case SMALL:
        car = new SmallCar(Location.ASIA);
        break;

      case SEDAN:
        car = new SedanCar(Location.ASIA);
        break;

      case LUXURY:
        car = new LuxuryCar(Location.ASIA);
        break;

      default:
        throw new InvalidParameterException(format("Car type '%s' is not supported by AsiaCarFactory", model));
    }

    return car;
  }
}
