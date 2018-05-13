import clients.*;

public class Demo {
  public static void main(final String[] args) {
    demoSingleTonNonLazy();
    demoSingleTonLazyEvaluation();
  }

  // Once 'getInfo()' is invoked, singleton instance will be constructed.
  public static void demoSingleTonNonLazy() {
    SingletonDBClient.getInfo();

    System.out.printf("Example1: singleton non-lazy loading...\n");
    SingletonDBClient client1 = SingletonDBClient.getInstance();
    SingletonDBClient client2 = SingletonDBClient.getInstance();
    System.out.printf("Client1 == Client2: %b \n", client1 == client2);
  }

  // Though 'getInfo()' is invoked, singleton instance won't be constructed until the Holder is accessed.
  public static void demoSingleTonLazyEvaluation() {
    SingletonLazyDBClient.getInfo();

    System.out.printf("Example2: singleton lazy loading...\n");
    SingletonLazyDBClient client1 = SingletonLazyDBClient.getInstance();
    SingletonLazyDBClient client2 = SingletonLazyDBClient.getInstance();
    System.out.printf("Client1 == Client2: %b \n", client1 == client2);    
  }
}