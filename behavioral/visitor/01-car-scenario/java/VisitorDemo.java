/**
 * Reference: https://en.wikipedia.org/wiki/Visitor_pattern#Java_example
 */

interface CarElement {
  void accept(CarElementVisitor visitor);
}

interface CarElementVisitor {
  void visit(Car car);
  void visit(Engine engine);
  void visit(Wheel wheel);
}

class Car implements CarElement {
  CarElement[] elements;

  public Car(final CarElement[] elements) {
    this.elements = elements;
  }

  public void accept(final CarElementVisitor visitor) {
    for (CarElement elem : elements) {
      elem.accept(visitor);
    }
    visitor.visit(this);
  }
}

class Engine implements CarElement {
  private String name;

  public Engine(String engineName) {
    this.name = engineName;
  }

  public String getName() {
    return this.name;
  }

  public void accept(final CarElementVisitor visitor) {
    visitor.visit(this);
  }
}

class Wheel implements CarElement {
  private String name;

  public Wheel(final String wheelName) {
    this.name = wheelName;
  }

  public String getName() {
    return this.name;
  }

  public void accept(final CarElementVisitor visitor) {
    visitor.visit(this);
  }
}

class CarElementCheckVisitor implements CarElementVisitor {
  public void visit(final Car car) {
    System.out.println("Start my car.");
  }

  public void visit(final Wheel wheel) {
    System.out.printf("Cleaning my '%s' wheel\n", wheel.getName());
  }

  public void visit(final Engine engine) {
    System.out.printf("Checking my '%s' engine\n", engine.getName());
  }
}

public class VisitorDemo {
  public static void main(final String[] args) {
    final Car car = new Car(
      new CarElement[] {
        new Wheel("front left"), new Wheel("front right"),
        new Wheel("back left"), new Wheel("back right"),
        new Engine("four cylinder engine DE")
      }
    );

    // Check my car.
    car.accept(new CarElementCheckVisitor());
  }
}