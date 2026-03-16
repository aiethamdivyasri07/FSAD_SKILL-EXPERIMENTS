package DemoOnSpring.DemoOnSpringS53;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXMLApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("AutowiredXML.xml");
       //get the car bean
		AutowiredXMLCarClass c1 = context.getBean("car",AutowiredXMLCarClass.class);
		c1.drive();
	}

}
