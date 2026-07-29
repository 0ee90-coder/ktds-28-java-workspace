package com.ktdsuniversity.edu.oop.exceptions;

public class GoodsMain {

	public static void main(String[] args) {
		GoodsHolder capsuleHolder = new GoodsHolder(10);
		capsuleHolder.addGoods("네스프레소 솔티드 캬라멜 커피", null);
		capsuleHolder.addGoods(null, " ");
		capsuleHolder.addGoods("", "3_000_000_000");
		capsuleHolder.addGoods("    ", "7_800");
		capsuleHolder.addGoods("카누 에스프레소", "asdlkjasdf");
		capsuleHolder.addGoods("일리 에스프레소", "7_900");
		
		capsuleHolder.printGoods();
		
		capsuleHolder.printGoodsAt(-1);
		capsuleHolder.printGoodsAt(0);
		capsuleHolder.printGoodsAt(1);
		capsuleHolder.printGoodsAt(2);
		capsuleHolder.printGoodsAt(3);
		capsuleHolder.printGoodsAt(99);
		
		capsuleHolder.removeGoods(0);
		capsuleHolder.removeGoods(1);
		capsuleHolder.removeGoods(2);
		capsuleHolder.removeGoods(3); 
		capsuleHolder.removeGoods(-1);
		capsuleHolder.removeGoods(99);
		capsuleHolder.printGoods();
	}
	
}
