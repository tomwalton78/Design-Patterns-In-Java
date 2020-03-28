package Creational.Builder.CarBuilder;

public class Client {

  public static void main(String[] args) {

    CarBuilder builder = new CarBuilder();
    Director.makeSportsCar(builder);
    Car car = builder.getProduct();

    CarManualBuilder manualBuilder = new CarManualBuilder();
    Director.makeSportsCar(manualBuilder);
    Manual manual = manualBuilder.getProduct();
  }
}
