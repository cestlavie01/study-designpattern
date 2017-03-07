package com.cobus.factory;

public class NewYorkPizzaFactory extends PizzaFactory {

	@Override
	public IPizza createPizza(String type) {
		if (type.equals("hawaiian")) {
			return new HawaiianPizza();
		} else if (type.equals("cheese")) {
			return new CheesePizza();
		} else if (type.equals("pepperoni")) {
			return new PepperoniPizza();
		}

		return null;
	}
}
