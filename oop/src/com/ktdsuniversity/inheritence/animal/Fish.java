package com.ktdsuniversity.inheritence.animal;

public class Fish extends Animal {
	
	
	public Fish(String species) {
		super(species);
	}


	public void startSwim() {
		System.out.println("[" + super.getSpecies() + "] 헤엄 시작");
	}
}
