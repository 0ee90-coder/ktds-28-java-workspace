package com.ktdsuniversity.eud.oop.interfaces.market;

public class FrozonFood extends GeneralFood {
	
	private int date;
	
	public FrozonFood(String goodsName, int price, int date) {
		super(goodsName, price);
		this.date = date;
	}
	public int getDate() {
		return this.date;
	}

}
