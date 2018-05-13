#include "car_elements.h"
#include "car_visitors.h"


// Base car element.
CarElement::CarElement(const char* elementName) {
  this->_name = elementName;
}
CarElement::~CarElement() {}
const char* CarElement::Name() { return this->_name; }
void CarElement::Accept(CarElementVisitor&) {}


// Engine.
Engine::Engine(const char* engineName) : CarElement(engineName) { }
void Engine::Accept(CarElementVisitor& visitor) {
  visitor.VisitEngine(this);
}


// Wheel.
Wheel::Wheel(const char* wheelName) : CarElement(wheelName) { }
void Wheel::Accept(CarElementVisitor& visitor) {
  visitor.VisitWheel(this);
}


// Car.
Car::Car(const char* carName, std::vector<CarElement*>& childElements) : CarElement(carName) {
  this->elements = childElements;
}
void Car::Accept(CarElementVisitor& visitor) {
  for (auto elem : this->elements) {
    elem->Accept(visitor);
  }

  visitor.VisitCar(this);
}
