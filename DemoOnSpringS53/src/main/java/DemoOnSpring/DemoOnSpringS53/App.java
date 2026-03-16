package DemoOnSpring.DemoOnSpringS53;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	//to link the app class to xml file
    	ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //get employees bean'
    	Employees e1=(Employees)context.getBean("emp1Bean");
    	e1.displaysEmpDetails();
    	
    	Employees e2=(Employees)context.getBean("emp2Bean");
    	System.out.println(e2);
    }
}
