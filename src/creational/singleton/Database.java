package creational.singleton;

public class Database {

  // The field for storing the singleton instance should be declared static.
  private static Database instance;
  public String value;

  /* 
  The singleton's constructor should always be private to prevent direct 
  construction calls with the `new` operator.
   */
  private Database(String value) {
    this.value = value;
  }

  // The static method that controls access to the singleton instance.
  public static Database getInstance(String value) {
    if (Database.instance == null) {
      return Database.instance = new Database(value);
    }
    return instance;
  }
}
