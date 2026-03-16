package DemoOnSpring.DemoOnSpringS53;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class AutowiredXMLCarClass {
	@Autowired
	AutowiredXMLEngineClass engine;

	public AutowiredXMLEngineClass getEngine() {
		return engine;
	}

	public void setEngine(AutowiredXMLEngineClass engine) {
		this.engine = engine;
	}
    void drive() {
    	engine.start();
    	System.out.println("Car is running");
    }
    
}
