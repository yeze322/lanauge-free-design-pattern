package clients;

public class SingletonDBClient {
  private static final SingletonDBClient instance = new SingletonDBClient();

  private void connect(final String connectionString) { }

  private SingletonDBClient() {
    System.out.printf("DBClient(non-lazy) initialized.\n");
    connect("my:connection:string");
  }

  public static SingletonDBClient getInstance() {
    return instance;
  }

  public static String getInfo() {
    // Access this method to trigger class initialization.
    return "SingletonDBClient(non-lazy)";
  }
}
