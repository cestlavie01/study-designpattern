package com.cobus.singleton;

public class SingletonLazyMoreEffective {
	
	private static volatile SingletonLazyMoreEffective instance = null;
	
	private int someOption = 2;

	private SingletonLazyMoreEffective() {

	}

	/*
	 * ���� instance�� null check�� ���ؼ�, ��ü�� �߰��� ���������� �����Ѵ�.
	 * multi-threadȯ�濡�� ������ ��ü�� �����Ǵ� ���� �����ֱ����� synchronized�� ����Ѵ�.
	 * �̷��� �Ǹ�, lazy1 class���� getInstance()�� ȣ��Ǵ� �Ź� ����ȭ ����� �������� ���� �� �ִ�.
	 * ������, ���ÿ� synchronized�� ������ ���� thread�� ���� �� �ֱ� ������,
	 *  �ٽ��ѹ� instance null check�� ������Ѵ�.
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
