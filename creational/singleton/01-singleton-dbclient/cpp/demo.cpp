#include <iostream>
#include "singleton_db_client.h"


void simulateSingletonDBClient() {
  std::cout << reinterpret_cast<intptr_t>(&SingletonDBClient::getInstance()) << std::endl;
  std::cout << reinterpret_cast<intptr_t>(&SingletonDBClient::getInstance()) << std::endl;
  std::cout << reinterpret_cast<intptr_t>(&SingletonDBClient::getInstance()) << std::endl;
}

int main() {
  simulateSingletonDBClient();
  return 0;
}