package observer;

public class Observer {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setModel("w124");
		Car car2 = new Car();
		car2.setModel("rb26");
		Car car3 = new Car();
		car3.setModel("rb32");
		car1.setType("inline6");
		car2.setType("inline6");
		car3.setType("inline6");
		car1.setId(23123123);
		car2.setId(43233414);
		car3.setId(21341234);
		car1.updateSystem("non working  injection pump.");
		car1.check();
		car2.updateSystem("non working  valve number 4.");
		car2.check();
		car3.updateSystem("non working  electric belt.");
		car3.check();
		car2.setWorking(true);
	}

}
