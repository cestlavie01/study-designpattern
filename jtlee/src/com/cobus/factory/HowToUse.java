package com.cobus.factory;

public class HowToUse {
	public static void main(String []args) {

		PizzaStore store = new PizzaStore();
		
		PizzaFactory newYorkFactory = new NewYorkPizzaFactory();
		PizzaFactory cicagoFactory = new CicagoPizzaFactory();
		
		// 뉴욕지점에 치즈 피자 주문이 들어왔다!
		store.setPizzaFactory(newYorkFactory);
		IPizza pizza = store.orderPizza("cheese");
		
		// 시카고 지점에 하와이안 피자 주문이 들어왔다.
		store.setPizzaFactory(cicagoFactory);
		pizza = store.orderPizza("hawaiian");
	}
}
