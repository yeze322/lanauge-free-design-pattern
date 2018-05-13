package elements;

import visitors.CarElementVisitor;

public interface CarElement {
  void accept(CarElementVisitor visitor);
}