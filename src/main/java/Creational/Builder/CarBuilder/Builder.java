package Creational.Builder.CarBuilder;

public interface Builder {

  void reset();

  void setSeats(int noSeats);

  void setEngine(Engine engine);

  void setTripComputer(Computer computer);

  void setGPS(GPS gps);
}
