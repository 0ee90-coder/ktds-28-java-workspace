package com.ktdsuniversity.eud.oop.interfaces;


// SomeInterface를 구현한 구현 클래스.
// 인터페이스를 구현한 클래스는 인터페이스 내부의 메소드(추상메소드)를 구현할 의무가 있다.

public class SomeClass implements SomeInterface{

	@Override
	public void doSomething1() {				// 부모 클래스에 있는 메소드를 오버라이딩 초록색 세모 , 인터페이스에 있는 메소드를 오버라이딩 흰색 세모
		System.out.println("무언가 합니다.1");
		
	}

	@Override
	public void doSomething2() {
	
		
	}

	@Override
	public void doSomething3() {
		System.out.println("무언가 합니다.3");
		
	}

	@Override
	public int getSomething() {
		return 219038230;
	}

	@Override
	public String getString() {
		return "ㄹㅇㅇㅈㄹ";
	}
	
	

}
