package com.cobus.singleton;

public class HowToUse {
	public static void main(String[] args) {
		SingletonSimple instance1 = SingletonSimple.getInstance();
		System.out.println(instance1.getSomeOption());
		
		SingletonLazy instance2 = SingletonLazy.getInstance();
		System.out.println(instance2.getSomeOption());
		
		SingletonLazyMoreEffective instance3 =
				SingletonLazyMoreEffective.getInstance();
		System.out.println(instance3.getSomeOption());
	}
}
