package Creational.Singleton.DatabaseConnection;

public class Application {

  public static void main(String[] args) {
    Database db = Database.getInstance();

    db.query("SELECT * FROM db LIMIT 10;");

    Database otherDb = Database.getInstance();
    otherDb.query("SELECT item FROM db LIMIT 5;");
  }
}
