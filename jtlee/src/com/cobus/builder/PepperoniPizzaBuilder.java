package com.cobus.builder;

public class PepperoniPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		this.pizza.setDough("thin dough");
	}

	@Override
	public void buildSauce() {
		this.pizza.setSauce("hot tomato sauce");
	}

	@Override
	public void buildTopping() {
		this.pizza.setTopping("a lot of pepperoni");
	}
}
