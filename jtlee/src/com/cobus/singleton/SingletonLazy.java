package com.cobus.singleton;

public final class SingletonLazy {
	
	// volatile를 통해, 다른 thread에서 변경된 객체내 변수 정보를
	// 최신으로 유지해서 획득할 수 있게 해준다.
	private static volatile SingletonLazy instance = null;
	
	private int someOption = 1;

	private SingletonLazy() {

	}

	/*
	 * multi-thread환경에서 안전하게 singlton 객체를 획득할 수 있다.
	 * 하지만, 이미 instance가 생성된 다음에도 항상 동기화 비용을 지불해야하기때문에
	 * 성능상 아쉬움이 있다.
	 */
	public static synchronized SingletonLazy getInstance() {
		if (instance == null) {
			instance = new SingletonLazy();
			instance.doSomething();
		}
		
		return SingletonLazy.instance;
	}
	
	private void doSomething() {
		// blah~ blah~
	}
	
	public int getSomeOption() {
		return this.someOption;
	}
}
