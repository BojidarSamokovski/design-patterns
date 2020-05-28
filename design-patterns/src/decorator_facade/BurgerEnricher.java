package decorator_facade;

public class BurgerEnricher implements BurgerComponents{
	
	protected double price = 0;
	
	protected int salad 	= 0;
	protected int meat 		= 0;
	protected int sause		= 0;
	protected int becon		= 0;
	protected int chicken	= 0;
	protected int chese		= 0;
	protected int egg		= 0;
	
	public void startOrder() {
		this.salad	+= 1;
		this.meat	+= 1;
		this.sause	+= 1;
	}

	public void addSalad() {
		this.salad+=1;
		System.out.println("The burger has "+ this.salad +" salads.");
	}

	public void addMeat() {
		this.meat+=1;
		System.out.println("The burger has "+ this.meat +" meats.");
	}

	public void addSause() {
		this.sause+=1;
		System.out.println("The burger has "+ this.sause +" sause.");
	}

	public void addBecon() {
		this.becon+=1;
		System.out.println("The burger has "+ this.becon +"' becons.");
	}

	public void addChicken() {
		this.chicken+=1;
		System.out.println("The burger has "+ this.chicken +" chickens.");
	}

	public void addChese() {
		this.chese +=1;
		System.out.println("The burger has "+ this.chese +" chese.");
	}

	public void addEgg() {
		this.egg +=1;
		System.out.println("The burger has "+ this.egg +" egg.");
	}
	
	public void endOrder() {
		this.price  = 0.20 * this.salad + 0.20 * this.sause + 0.50 * this.meat
						+ 0.15 * this.becon+ 0.25 * this.chicken+ this.egg*0.25+ this.chese*0.10;
		System.out.println("The price is :"+ this.price + "$.");
	}
}
