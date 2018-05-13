package elements;

import visitors.CarElementVisitor;

public class Engine implements CarElement {
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