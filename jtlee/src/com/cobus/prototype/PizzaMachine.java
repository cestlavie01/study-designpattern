package com.cobus.prototype;

public class PizzaMachine {
	
	// ������ ���� ��ü
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
