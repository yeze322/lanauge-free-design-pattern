#ifndef CAR_VISITOR_H
#define CAR_VISITOR_H

class Engine;
class Wheel;
class Car;

/**
 * Base class of car elements' visitor.
 */
class CarElementVisitor {
public:
  virtual ~CarElementVisitor();

  virtual void VisitEngine(Engine*);
  virtual void VisitWheel(Wheel*);
  virtual void VisitCar(Car*);

protected:
  CarElementVisitor();
};


/**
 * A customized visitor to visit and then repair car elements.
 */
class CarRepairVisitor : public CarElementVisitor {
public:
  void VisitEngine(Engine*);
  void VisitWheel(Wheel*);
  void VisitCar(Car*);
};

#endif