package com.cobus.prototype;

public class HowToUse {
	public static void main(String []args) {
		PizzaMachine machine = new PizzaMachine();
		
		Pizza pizza = new HawaiianPizza();
		machine.setPrototypePizza(pizza);
		Pizza tempPizza = null;
		for (int i = 0; i < 3; i++) {
			tempPizza = machine.makePizza();
			tempPizza.printName();
		}
		
		
		pizza = new PepperoniPizza();
		machine.setPrototypePizza(pizza);
		for (int i = 0; i < 3; i++) {
			tempPizza = machine.makePizza();
			tempPizza.printName();
		}
		
		int loop = 10000000;
		long start = System.nanoTime();
		for (int i = 0; i < loop; i++) {
			tempPizza = machine.makePizza();
		}
		System.out.println(System.nanoTime() - start);
		
		start = System.nanoTime();
		for (int i = 0; i < loop; i++) {
			tempPizza = new PepperoniPizza();
		}
		System.out.println(System.nanoTime() - start);
	}
}
