package DemoOnSpring.DemoOnSpringS53;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "DemoOnSpring.DemoOnSpringS53")
class Appconfig{
 
}
public class AutowiredMainApp {

 public static void main(String[] args) {
 ApplicationContext context=new AnnotationConfigApplicationContext(Appconfig.class);
  //get the AutowiredCar
 AutowiredCar c1=context.getBean(AutowiredCar.class);
 c1.displayEngineType("Petrol");
 c1.drive();
 }

}