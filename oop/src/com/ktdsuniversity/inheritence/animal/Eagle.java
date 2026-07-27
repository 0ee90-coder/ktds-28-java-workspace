package com.ktdsuniversity.inheritence.animal;

public class Eagle extends Bird{
	
	public Eagle(String species) {
		super(species);
	}
	
	public void startHunt() {
		System.out.println("[" + super.getSpecies() + "] 사냥 시작");
	}

}
