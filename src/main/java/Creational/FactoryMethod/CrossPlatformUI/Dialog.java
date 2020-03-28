package Creational.FactoryMethod.CrossPlatformUI;

public abstract class Dialog {

  public abstract Button createButton();

  public void render() {
    // Call the factory method to create a product object.
    Button okButton = createButton();
    // Now use the product
    okButton.onClick("closeDialog");
    okButton.render();
  }
}
