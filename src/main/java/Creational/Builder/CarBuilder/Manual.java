package Creational.Builder.CarBuilder;

public class Manual {
  private int noSeats;
  private Engine engine;
  private Computer tripComputer;
  private GPS gps;

  public int getNoSeats() {
    return noSeats;
  }

  public void setNoSeats(int noSeats) {
    this.noSeats = noSeats;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public Computer getTripComputer() {
    return tripComputer;
  }

  public void setTripComputer(Computer tripComputer) {
    this.tripComputer = tripComputer;
  }

  public GPS getGps() {
    return gps;
  }

  public void setGps(GPS gps) {
    this.gps = gps;
  }
}
