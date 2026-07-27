package com.ktdsuniversity.inheritence.animal;

public class Bird extends Animal {
	public Bird(String species) {
		super(species);
	}
	
	public void startFly() {
		System.out.println("[" + super.getSpecies() + "] 날기 시작합니다.");
		}
	}

