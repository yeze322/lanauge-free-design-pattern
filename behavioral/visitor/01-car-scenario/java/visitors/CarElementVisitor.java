package visitors;

import elements.*;

public interface CarElementVisitor {
  void visit(Car car);
  void visit(Engine engine);
  void visit(Wheel wheel);
}