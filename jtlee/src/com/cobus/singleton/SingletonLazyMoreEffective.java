package com.cobus.singleton;

public class SingletonLazyMoreEffective {
	
	private static volatile SingletonLazyMoreEffective instance = null;
	
	private int someOption = 2;

	private SingletonLazyMoreEffective() {

	}

	/*
	 * 최초 instance의 null check를 통해서, 객체를 추가로 생성할지를 결정한다.
	 * multi-thread환경에서 여러번 객체가 생성되는 것을 막아주기위해 synchronized를 사용한다.
	 * 이렇게 되면, lazy1 class에서 getInstance()가 호출되는 매번 동기화 비용을 지불하지 않을 수 있다.
	 * 하지만, 동시에 synchronized에 도착한 여러 thread가 있을 수 있기 때문에,
	 *  다시한번 instance null check를 해줘야한다.
	 */
	public static SingletonLazyMoreEffective getInstance() {
		if (instance == null) {
			synchronized(SingletonLazyMoreEffective.class) {
				if (instance == null) {
					instance = new SingletonLazyMoreEffective();
					instance.doSomething();
				}
			}
		}
		
		return SingletonLazyMoreEffective.instance;
	}
	
	private void doSomething() {
		// blah~ blah~
	}
	
	public int getSomeOption() {
		return this.someOption;
	}
}
