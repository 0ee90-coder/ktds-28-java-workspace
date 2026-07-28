package com.ktdsuniversity.eud.oop.interfaces.market;

public class GeneralFood {

		private String goodsName;
		private int price;
		
		public GeneralFood() {}
		
		public GeneralFood(String goodsName) {
			this.goodsName = goodsName;
		}
		
		public GeneralFood(int price) {
			this.price = price;
		}
		
		public String getName() {
			return this.goodsName;
		}
		
		public int getPrice() {
			return this.price;
		}
		
		public void printGeneralFood() {
			System.out.println("상품의 이름:" + this.goodsName);
			System.out.println("가격:" + this.price);
		}
	}
