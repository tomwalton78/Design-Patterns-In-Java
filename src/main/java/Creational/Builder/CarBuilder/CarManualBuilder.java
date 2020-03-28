package Creational.Builder.CarBuilder;

public class CarManualBuilder implements Builder {

  private Manual manual;

  public CarManualBuilder() {
    this.reset();
  }

  @Override
  public void reset() {
    this.manual = new Manual();
  }

  @Override
  public void setSeats(int noSeats) {
    this.manual.setNoSeats(noSeats);

  }

  @Override
  public void setEngine(Engine engine) {
    this.manual.setEngine(engine);
  }

  @Override
  public void setTripComputer(Computer computer) {
    this.manual.setTripComputer(computer);
  }

  @Override
  public void setGPS(GPS gps) {
    this.manual.setGps(gps);
  }

  public Manual getProduct() {
    Manual product = this.manual;
    this.reset();
    return product;
  }
}
