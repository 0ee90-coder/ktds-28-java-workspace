package com.ktdsuniversity.inheritence.animal;

public class Animal {
	
	private String species;
	
	public Animal(String species) {
		this.species = species;
	}
	
	public void startEat() {
		System.out.println("[" + this.species + "] 식사를 합니다.");
	}
	
	public String getSpecies() {
		return this.species;
	}
	
}
