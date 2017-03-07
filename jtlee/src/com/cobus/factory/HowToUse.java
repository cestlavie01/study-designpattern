package com.cobus.factory;

public class HowToUse {
	public static void main(String []args) {

		PizzaStore store = new PizzaStore();
		
		PizzaFactory newYorkFactory = new NewYorkPizzaFactory();
		PizzaFactory cicagoFactory = new CicagoPizzaFactory();
		
		// ���������� ġ�� ���� �ֹ��� ���Դ�!
		store.setPizzaFactory(newYorkFactory);
		IPizza pizza = store.orderPizza("cheese");
		
		// ��ī�� ������ �Ͽ��̾� ���� �ֹ��� ���Դ�.
		store.setPizzaFactory(cicagoFactory);
		pizza = store.orderPizza("hawaiian");
	}
}
