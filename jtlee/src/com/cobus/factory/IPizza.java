package com.cobus.factory;

public interface IPizza {

	// 필요한 재료들을 준비.
	public void prepare();
	
	// 피자 종류에 맞게 적절한 온도와 시간만큼 구워진다.
	public void bake();
	
	// 피자 고유의 크기만큼 조각 내준다.
	public void cut();
	
	// 피자 종류별로 박스 종류가 다르다면, 그게 맞는 포장을 하도록한다.
	public void box();
}
