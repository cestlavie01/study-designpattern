package com.cobus.singleton;

public final class SingletonSimple {
	
	// 하나만 유지되는 Singleton 객체.
	// Class가 load될 때 instance가 생성됨.
	private static SingletonSimple instance = new SingletonSimple();
	
	private int someOption = 0;
	
	// 생성자를 private으로만들어, 임의 객체 생성을 막는다.
	private SingletonSimple() {
	}
	
	// Singleton 객체를 사용하기 위해서는 getInstance()를 통해서만 생성할 수 있다.
	public static SingletonSimple getInstance() {
		instance.doSomething();
		return SingletonSimple.instance;
	}
	
	private void doSomething() {
		
	}
	
	public int getSomeOption() {
		return this.someOption;
	}
}
