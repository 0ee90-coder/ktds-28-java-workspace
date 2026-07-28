package com.ktdsuniversity.eud.oop.interfaces;

public interface SomeInterface {
	
	/** public static final*/ int PRICE = 300; // 공용상수? public static final 생략가능

	/** public abstract*/ void doSomething1(); // 인터페이스에서 바디를 붙이면 에러남 , public abstract 생략 가능
	void doSomething2(); // 추상 메소드: 메소드의 정의만 존재하고 바디가 없는 형태
	void doSomething3(); 
	int getSomething();
	String getString();
}
