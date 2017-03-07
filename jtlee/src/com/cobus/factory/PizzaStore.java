package com.cobus.factory;

public class PizzaStore {

	private PizzaFactory factory;

	public PizzaStore() {
	}

	public void setPizzaFactory(PizzaFactory factory) {
		this.factory = factory;
	}

	public IPizza orderPizza(String type) {
		IPizza pizza = factory.createPizza(type);
		if (pizza == null) {
			return null;
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
