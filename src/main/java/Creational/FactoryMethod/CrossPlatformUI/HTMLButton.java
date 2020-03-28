package Creational.FactoryMethod.CrossPlatformUI;

public class HTMLButton implements Button {
  @Override
  public void render() {
    System.out.println("Rendering HTML button...");
  }
}
