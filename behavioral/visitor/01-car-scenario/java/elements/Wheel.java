package elements;

import visitors.CarElementVisitor;

public class Wheel implements CarElement {
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