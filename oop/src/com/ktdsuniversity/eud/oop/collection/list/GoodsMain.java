package com.ktdsuniversity.eud.oop.collection.list;

public class GoodsMain {
	
	public static void main(String[] args) {
		GoodsHolder holder = new GoodsHolder();
		holder.printGoods();
		
		holder.addGoods("화장품", 70000, true);
		holder.addGoods("샤프", 25000, true);
		holder.addGoods("로션", 7000, true);
		
		
		
	}
}
