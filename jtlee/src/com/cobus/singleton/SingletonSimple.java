package com.cobus.singleton;

public final class SingletonSimple {
	
	// �ϳ��� �����Ǵ� Singleton ��ü.
	// Class�� load�� �� instance�� ������.
	private static SingletonSimple instance = new SingletonSimple();
	
	private int someOption = 0;
	
	// �����ڸ� private���θ����, ���� ��ü ������ ���´�.
	private SingletonSimple() {
	}
	
	// Singleton ��ü�� ����ϱ� ���ؼ��� getInstance()�� ���ؼ��� ������ �� �ִ�.
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
