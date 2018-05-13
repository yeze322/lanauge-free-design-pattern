package clients;

public class SingletonLazyDBClient {
  private SingletonLazyDBClient() {
    System.out.printf("DBClient(lazy) initialized.\n");
    connect("my:connection:string");
  }

  private void connect(final String connectionString) {}

  private static class LazyHolder {
    private static final SingletonLazyDBClient instance = new SingletonLazyDBClient();
    private LazyHolder() {
      // Won't be triggered.
      System.out.printf("LazyHolder initialized.\n");
    }
  }
  
  public static SingletonLazyDBClient getInstance() {
    return LazyHolder.instance;
  }

  public static String getInfo() {
    // Access this method to trigger class initialization.
    return "SingletonDBClient(lazy)";
  }
}