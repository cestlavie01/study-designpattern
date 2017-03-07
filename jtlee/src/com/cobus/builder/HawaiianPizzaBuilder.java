package com.cobus.builder;

public class HawaiianPizzaBuilder extends PizzaBuilder {

	@Override
	public void buildDough() {
		this.pizza.setDough("thin-crust dough");
	}

	@Override
	public void buildSauce() {
		this.pizza.setSauce("tomato sauce");
	}

	@Override
	public void buildTopping() {
		this.pizza.setTopping("ham + pineapple");
	}
}
