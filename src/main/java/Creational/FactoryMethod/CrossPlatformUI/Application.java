package Creational.FactoryMethod.CrossPlatformUI;

import static Creational.FactoryMethod.CrossPlatformUI.OS.WINDOWS;

public class Application {

  public static void main(String[] args) throws IllegalArgumentException {
    OS platform = WINDOWS;

    Dialog dialog;

    switch (platform) {
      case WINDOWS:
        dialog = new WindowsDialog();
        break;
      case WEB:
        dialog = new WebDialog();
        break;
      default:
        throw new IllegalArgumentException("Error! Unknown operating system");
    }

    dialog.render();
  }
}
