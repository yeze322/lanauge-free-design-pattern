#include <iostream>
#include "car_visitors.h"
#include "car_elements.h"

CarElementVisitor::CarElementVisitor() {};
CarElementVisitor::~CarElementVisitor() {};
void CarElementVisitor::VisitEngine(Engine*) {};
void CarElementVisitor::VisitWheel(Wheel*) {};
void CarElementVisitor::VisitCar(Car*) {};

// Implementation of a customized visitor.
void CarRepairVisitor::VisitEngine(Engine* engine) {
  std::cout << "Reparing engine: " << engine->Name() << "..." << std::endl;
}
void CarRepairVisitor::VisitWheel(Wheel* wheel) {
  std::cout << "Checking wheel: " << wheel->Name() << "..." << std::endl;
}
void CarRepairVisitor::VisitCar(Car* car) {
  std::cout << "Starting car: " << car->Name() << "..." << std::endl;
}