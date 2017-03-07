package com.cobus.singleton;

public final class SingletonLazy {
	
	// volatile�� ����, �ٸ� thread���� ����� ��ü�� ���� ������
	// �ֽ����� �����ؼ� ȹ���� �� �ְ� ���ش�.
	private static volatile SingletonLazy instance = null;
	
	private int someOption = 1;

	private SingletonLazy() {

	}

	/*
	 * multi-threadȯ�濡�� �����ϰ� singlton ��ü�� ȹ���� �� �ִ�.
	 * ������, �̹� instance�� ������ �������� �׻� ����ȭ ����� �����ؾ��ϱ⶧����
	 * ���ɻ� �ƽ����� �ִ�.
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
