package com.ktdsuniversity.eud.oop.exceptions;

public class GoodsHolder {

	private Goods[] goods;
	private int goodsIndex;
	
	public GoodsHolder(int goodsCount) {
		if(goodsCount <= 0) {
			HolderInitiateException hie = 
					new HolderInitiateException("잘못된 인덱스 개수입니다. 0보다 큰 값을 입력하세요.");
			throw hie;
		}
		this.goods = new Goods[goodsCount];
	}
	
	public void addGoods(String name, String price) {
		if(price == null) {
			return;
		}
		
//		//replace 를 했더니 팔천구백원 이것도 공백이 되더라
//		
//		price = price.replaceAll("[^0-9]",""); 
//		if(price.isBlank()) {
//			return;
//		}
//		// int tempPrice = Integer.parseInt(price);  30억 이상 처리 할 때 이거 쓰면 안됨
//		long tempPrice = Long.parseLong(price);
//		if(tempPrice > Integer.MAX_VALUE) {
//			return;
//		} else if(tempPrice < Integer.MIN_VALUE) {
//			return;
//		}
//		int intPrice = (int) tempPrice;
		
		int intPrice = 0;
		try {
			intPrice = Integer.parseInt(price);
		} catch(NumberFormatException nfe) {
			System.out.println("숫자 변환 실패: " + nfe.getMessage());
			return;
		}		// 쓰면 안되는데 현업에서는 쓰는 방법 숫자 변환 쉽게 하는법 
				
		
		
		this.addGoods(name, intPrice);
	}
	
	public void addGoods(String name, int price) {
		if (name == null || name.isBlank()) {
			return;
		}
		
		if (this.goodsIndex < this.goods.length) {				// array 에러일 때
		this.goods[this.goodsIndex++] = new Goods(name, price);
		}
	}
	
	public void removeGoods(int goodsIndex) {
		if(goodsIndex >= 0 && goodsIndex < this.goods.length) {
		this.goods[goodsIndex] = null;
		}
	}
	
	public void printGoodsAt(int index) {
		Goods goods = null;
		if(index >= 0 && index < this.goods.length) {
			goods = this.goods[index];
		}
		
		if(goods != null) {
		String message = "%d. %s(%d)".formatted(index + 1, goods.getName(), goods.getPrice());
		System.out.println(message);
		}
	}
	
	public void printGoods() {
		for (int i = 0; i < this.goods.length; i++) {
			this.printGoodsAt(i);
		}
	}
	
}
