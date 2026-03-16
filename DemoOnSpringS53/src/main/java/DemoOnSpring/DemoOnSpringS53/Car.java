package DemoOnSpring.DemoOnSpringS53;

public class Car {
	Engine engineOb;
	
	//create a constructor

	/*public Engine getEngineOb() {
		return engineOb;
	}*/
	

	public void setEngineOb(Engine engineOb) {
		this.engineOb = engineOb;
	}
	
	public Car(Engine engineOb) {
		super();
		this.engineOb = engineOb;
	}
	void displayEngineType()
	{
		System.out.println("Type of Car engine is " +engineOb.getEnginetype());
	}

}
