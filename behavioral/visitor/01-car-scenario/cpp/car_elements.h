#ifndef CAR_ELEMENT_H
#define CAR_ELEMENT_H

#include <vector>

class CarElementVisitor;


/**
 * Base element.
 */
class CarElement {
public:
  virtual ~CarElement();
  
  const char* Name();

  virtual void Accept(CarElementVisitor&);

protected:
  const char* _name;

  CarElement(const char*);
};


/**
 * Interited Engine type.
 */
class Engine : public CarElement {
public:
  Engine(const char*);

  void Accept(CarElementVisitor&);
};


/**
 * Inherited Wheel type.
 */
class Wheel : public CarElement {
public:
  Wheel(const char*);

  void Accept(CarElementVisitor&);
};


/**
 * Inherited Car type. All other elements' container.
 */
class Car : public CarElement {
public:
  Car(const char*, std::vector<CarElement*>&);

  void Accept(CarElementVisitor&);

protected:
  std::vector<CarElement*> elements;
};

#endif