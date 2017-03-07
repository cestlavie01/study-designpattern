package com.cobus.builder;

public class Cooker {
	
	PizzaBuilder pizzaBuilder;
	
	public Cooker () {
	}
	
	public void setPizzaBuilder(PizzaBuilder builder) {
		this.pizzaBuilder = builder;
	}
	
	public void makePizza() {
		if (pizzaBuilder == null) {
			System.out.println("could not make pizza. need set pizza builder");
			return;
		}
		
		this.pizzaBuilder.createPizza();
		this.pizzaBuilder.buildDough();
		this.pizzaBuilder.buildSauce();
		this.pizzaBuilder.buildTopping();
	}
	
	public Pizza getPizza() {
		if (pizzaBuilder == null) {
			System.out.println("could not get pizza. need set pizza builder");
			return null;
		}
		
		return this.pizzaBuilder.getPizza();
	}
}
