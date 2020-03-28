package Creational.Builder.CarBuilder;

public class CarBuilder implements Builder {

  private Car car;

  public CarBuilder() {
    this.reset();
  }

  @Override
  public void reset() {
    this.car = new Car();
  }

  @Override
  public void setSeats(int noSeats) {
    this.car.setNoSeats(noSeats);
  }

  @Override
  public void setEngine(Engine engine) {
    this.car.setEngine(engine);
  }

  @Override
  public void setTripComputer(Computer computer) {
    this.car.setTripComputer(computer);
  }

  @Override
  public void setGPS(GPS gps) {
    this.car.setGps(gps);
  }

  public Car getProduct() {
    Car product = this.car;
    this.reset();
    return product;
  }
}
