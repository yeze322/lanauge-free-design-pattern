#ifndef SINGLETON_DB_CLIENT_H
#define SINGLETON_DB_CLIENT_H

class SingletonDBClient {
public:
  static SingletonDBClient& getInstance();

  SingletonDBClient(const SingletonDBClient&) = delete;
  void operator=(const SingletonDBClient&) = delete;
  
protected:
  SingletonDBClient();
};

#endif