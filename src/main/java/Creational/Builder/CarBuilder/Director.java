package Creational.Builder.CarBuilder;

public class Director {

  public static void makeSUV(Builder builder) {
    builder.reset();
    builder.setEngine(Engine.STRAIGHT);
    builder.setSeats(6);
    builder.setGPS(GPS.GARMIN);
  }

  public static void makeSportsCar(Builder builder) {
    builder.setEngine(Engine.V);
    builder.setTripComputer(Computer.DIGITAL);
    builder.setSeats(2);
    builder.setGPS(GPS.TOMTOM);
  }
}
