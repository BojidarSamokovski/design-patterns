package decorator_facade;

public class Payment{
	
	protected double totalPrice = 0;
	
	public void add(BurgerEnricher burger ) {
		burger.endOrder();
		totalPrice += burger.price;
	}
	
	public void remove(BurgerEnricher burger ) {
		totalPrice -= burger.price;
		if(totalPrice<0) {
			System.out.println("Leave habibi you disrespect me!");
		}
	}
	
	public double price() {
		return this.totalPrice;
	}
	
	
	
}
