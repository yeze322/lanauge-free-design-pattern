import elements.*;
import visitors.*;

public class Demo {
  public static void main(final String[] args) {
     checkMyCar();
  }

  private static void checkMyCar() {
    final Car car = new Car(
      new CarElement[] {
        new Wheel("front left"), new Wheel("front right"),
        new Wheel("back left"), new Wheel("back right"),
        new Engine("four cylinder engine DE")
      }
    );

    System.out.printf("Start checking my car...\n");
    car.accept(new CarCheckerVisitor());
    System.out.printf("Finish checking my car.\n");
  }
}