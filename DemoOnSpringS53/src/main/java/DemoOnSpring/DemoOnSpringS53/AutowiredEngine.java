package DemoOnSpring.DemoOnSpringS53;

import org.springframework.stereotype.Component;

@Component //spring that creates the object(Creates the Bean)
public class AutowiredEngine {
String engineType;
void start() {
 System.out.println("Engine started");

}
void typeOfEngine(String type) {
 this.engineType=type;
}
}