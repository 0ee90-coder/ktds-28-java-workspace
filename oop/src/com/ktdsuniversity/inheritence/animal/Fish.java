package com.ktdsuniversity.inheritence.animal;

public class Fish extends Animal {
	
//	private float weight;
	
	public Fish(String species) {
		super(species);
	}
//	
//	public Fish(String species, float weight) {
//		super(species);
//		this.weight = weight;
//	}

	public void startSwim() {
		System.out.println("[" + super.getSpecies() + "] 헤엄 시작");
	}
}
