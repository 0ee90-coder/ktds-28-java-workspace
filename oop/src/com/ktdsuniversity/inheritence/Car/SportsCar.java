package com.ktdsuniversity.inheritence.Car;

public class SportsCar extends Vehicle {

	public SportsCar(String name) {
		super(name);
	}
	
	public void startTurbeEngine() {
		System.out.println("[" + super.getName() + "] 터보 모드를 시작합니다.");
	}
	
}
