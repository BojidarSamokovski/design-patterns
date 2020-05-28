package decorator_facade;

import java.util.Scanner;

public class Facade {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean order = true;
		String input;
		Payment payment = new Payment();
		while(order)
		{
			System.out.println("Mashala habibi, what burger do you want?");
			input	= sc.nextLine();
			switch (input) {
				case "Burger": {
					System.out.println("added burger.");
					Burger burger = new Burger();
					payment.add(burger);
					 break;
				
				}
				case "CheseBurger": {
					System.out.println("added burger.");
					CheseBurger burger = new CheseBurger();
					payment.add(burger);
					 break;
				}
				case "EggBurger": {
					System.out.println("added burger.");
					EggSuperBurger burger = new EggSuperBurger();
					payment.add(burger);
					 break;
				}
				case "Remove Burger": {
					System.out.println("added burger.");
					Burger burger = new Burger();
					payment.remove(burger);
					 break;
				
				}
				case "Remove CheseBurger": {
					System.out.println("added burger.");
					CheseBurger burger = new CheseBurger();
					payment.remove(burger);
					 break;
				
				}
				case "Remove EggBurger": {
					System.out.println("added burger.");
					EggSuperBurger burger = new EggSuperBurger();
					payment.remove(burger);
					 break;
				
				}
			}
			if (payment.totalPrice<0) {
				order= false;
			}
			
			if(input.equals("end")) {
				
				order = false;
				System.out.println("ok bratanka:"+ payment.price()+"$ habibi.");
			}
		}
	}

}
