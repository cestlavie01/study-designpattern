package com.cobus.factory;

public interface IPizza {

	// �ʿ��� ������ �غ�.
	public void prepare();
	
	// ���� ������ �°� ������ �µ��� �ð���ŭ ��������.
	public void bake();
	
	// ���� ������ ũ�⸸ŭ ���� ���ش�.
	public void cut();
	
	// ���� �������� �ڽ� ������ �ٸ��ٸ�, �װ� �´� ������ �ϵ����Ѵ�.
	public void box();
}
