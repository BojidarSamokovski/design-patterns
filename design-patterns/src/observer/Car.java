package observer;

public class Car extends Engine {

	String model;
	
	IComputable engine = new Engine();
	
	public Car(){}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
