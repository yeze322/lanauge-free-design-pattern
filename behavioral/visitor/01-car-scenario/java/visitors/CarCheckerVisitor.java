package visitors;

import elements.*;

public class CarCheckerVisitor implements CarElementVisitor {
  public void visit(final Car car) {
    System.out.println("Starting my car...");
  }

  public void visit(final Wheel wheel) {
    System.out.printf("Checking my '%s' wheel\n", wheel.getName());
  }

  public void visit(final Engine engine) {
    System.out.printf("Checking my '%s' engine\n", engine.getName());
  }
}