package com.cobus.builder;

public class HowToUse {
	public static void main(String []args) {
		Cooker cooker = new Cooker();
		
		cooker.setPizzaBuilder(new HawaiianPizzaBuilder());
		cooker.makePizza();
		Pizza pizza = cooker.getPizza();
		System.out.println(pizza.toString());
		
		cooker.setPizzaBuilder(new PepperoniPizzaBuilder());
		cooker.makePizza();
		pizza = cooker.getPizza();
		System.out.println(pizza.toString());
	}
}
