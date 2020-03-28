package Creational.FactoryMethod.CrossPlatformUI;

public interface Button {

  void render();

  default void onClick(String action) {
    System.out.println(action);
  }
}
