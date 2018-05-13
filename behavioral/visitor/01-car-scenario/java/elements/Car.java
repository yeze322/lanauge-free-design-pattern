package elements;

import visitors.CarElementVisitor;

public class Car implements CarElement {
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