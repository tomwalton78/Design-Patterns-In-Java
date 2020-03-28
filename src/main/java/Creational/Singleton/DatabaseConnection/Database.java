package Creational.Singleton.DatabaseConnection;

public class Database {

  // The field for storing the singleton instance should be
  // declared static.
  private static Database instance;

  // The singleton's constructor should always be private to
  // prevent direct construction calls with the `new`
  // operator.
  private Database() {
    // Database initialization code...
  }

  public static Database getInstance() {
    if (Database.instance == null) {
      // Acquire thread lock

      if (Database.instance == null) {
        Database.instance = new Database();
        System.out.println("Created new Database instance");
      }
    }

    return instance;
  }

  // Business logic
  public void query(String sql) {
    System.out.printf("Executing query: %s\n", sql);
  }
}
