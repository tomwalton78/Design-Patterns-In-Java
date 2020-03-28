package Creational.FactoryMethod.CrossPlatformUI;

public class WindowsDialog extends Dialog {
  @Override
  public Button createButton() {
    return new WindowsButton();
  }
}
