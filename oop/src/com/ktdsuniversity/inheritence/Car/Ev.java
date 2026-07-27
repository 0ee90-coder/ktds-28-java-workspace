package com.ktdsuniversity.inheritence.Car;

public class Ev extends Vehicle {

	private float battery;
	
	public Ev(String name) {
		this(name, 0f);
	}
	
	public Ev(String name, float battery) {
		super(name);
		this.battery = battery;
	}
	
	public void checkBattery() {
		if (this.battery > 0f) {
			System.out.println("[" + super.getName() + "] 배터리가 충분합니다. (" + this.battery + ")");
		} else {
			System.out.println("[" + super.getName() + "] 배터리가 충분하지 않습니다. (" + this.battery + ")");
		}
	}
}