package com.ktdsuniversity.inheritence.animal;

public class LookAnimal {

public static void startEat(Animal animals) {
		
		animals.startEat();
	}
	
	public static void startFly(Animal animals) {
		if( animals instanceof Bird bird) {
			bird.startFly();
		}
	}
	
	public static void startHunt(Animal animals) {
		if ( animals instanceof Eagle eagle) {
			eagle.startHunt();
		}
	}
	
	public static void startSwim(Animal animals) {
		if( animals instanceof Fish fish) {
			fish.startSwim();
		}
	}
	
	public static void main (String[] args) {
		
		Animal[] animals = new Animal[4];
		animals[0] = new Animal("동물");
		animals[0] = new Bird("조류");
		animals[0] = new Eagle("독수리");
		animals[0] = new Fish("물고기");
			
		for(int i = 0; i < animals.length; i++) {
			startEat(animals[i]);
			startFly(animals[i]);
			startHunt(animals[i]);
			startSwim(animals[i]);
		}
	}

}
