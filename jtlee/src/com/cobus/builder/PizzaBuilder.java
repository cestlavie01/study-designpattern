package com.cobus.builder;

public abstract class PizzaBuilder {
	protected Pizza pizza;
	
	public PizzaBuilder() {
		
	}
	
	public Pizza getPizza() {
		return this.pizza;
	}
	
	public void createPizza() {
		pizza = new Pizza();
	}
	
	public abstract void buildDough();

	public abstract void buildSauce();

	public abstract void buildTopping();
}
