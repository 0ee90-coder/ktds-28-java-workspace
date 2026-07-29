package com.ktdsuniversity.eud.oop.interfaces.market.customers.goods;

public class FrozonFood extends Goods {

	private String expiredDate;
	private int storageTemperature;
	
	public FrozonFood(String name, int price, String expiredDate, int storageTemperature) {
		super(name, price);
		this.expiredDate = expiredDate;
		this.storageTemperature = storageTemperature;
	}

	public String getExpiredDate() {
		return this.expiredDate;
	}

	public int getStorageTemperature() {
		return this.storageTemperature;
	}

	@Override
	public String toString() {
		return "FrozenFood [expiredDate=" + this.expiredDate + ", storageTemperature=" + this.storageTemperature + ", getName()="
				+ super.getName() + ", getPrice()=" + super.getPrice() + "]";
	}

	
	
	
	
}
