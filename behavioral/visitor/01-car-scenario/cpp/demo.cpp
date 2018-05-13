#include <iostream>
#include <vector>
#include "car_visitors.h"
#include "car_elements.h"

void repairMyCar() {
  std::cout << "Start repairing my car..." << std::endl;

  // Assuming I have a car with 4 wheels and 1 engine.
  std::vector<CarElement*> elements {
    new Engine("1.4 liter 4-cylinder engine"),
    new Wheel("front left"), new Wheel("front right"),
    new Wheel("back left"), new Wheel("back right"),
  };
  Car car = Car("MyCar", elements);

  // I want to delegate the CarRepairVistor to repair it.
  CarRepairVisitor visitor = CarRepairVisitor();

  // Visitors can visit my car only when I give them permission via invoking 'Accept()'.
  car.Accept(visitor);

  std::cout << "Finish repairing." << std::endl;
  for (auto pElement : elements) {
    delete pElement;
  }
}

int main() {
  repairMyCar();
  return 0;
}