package com.ktdsuniversity.eud.oop.enums.food;

public class Dishes {
	
	public static void main(String[] args) {
		Food bigmac = new Food("빅맥", 900, FoodType.FASTFOOD);
		System.out.println(bigmac);
		
		Food apple = new Food("사과", 5 , FoodType.FRUIT);		
		System.out.println(apple);
		
		Food mara = new Food("마라샹궈", 1200, FoodType.FISH);
		System.out.println(mara);
	}
		
}
