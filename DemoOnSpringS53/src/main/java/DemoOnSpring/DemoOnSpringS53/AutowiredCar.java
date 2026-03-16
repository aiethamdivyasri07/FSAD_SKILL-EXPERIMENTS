package DemoOnSpring.DemoOnSpringS53;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //Spring the creates the class Object(Creates the Bean)
public class AutowiredCar {
  @Autowired //implement DI
  AutowiredEngine engine;
  void drive() {
    engine.start();
    System.out.println("Car is running");
  }
  void displayEngineType(String type) {
  engine.typeOfEngine(type);//typeofEngine method is invoked
    System.out.println("Type of engine is " +engine.engineType);
  }
}