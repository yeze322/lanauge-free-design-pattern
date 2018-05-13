#include "singleton_db_client.h"

SingletonDBClient::SingletonDBClient() { }
SingletonDBClient& SingletonDBClient::getInstance() {
  static SingletonDBClient instance;
  return instance;
}