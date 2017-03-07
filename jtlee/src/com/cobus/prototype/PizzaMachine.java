package com.cobus.prototype;

public class PizzaMachine {
	
	// 복사할 피자 객체
	private Pizza pizza = null;
	
	public PizzaMachine() {
	}
	
	public void setPrototypePizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	public Pizza makePizza() {
		return (Pizza) pizza.clone();
	}
}
