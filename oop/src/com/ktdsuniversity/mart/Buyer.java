package com.ktdsuniversity.mart;

public class Buyer {
	
	// 멤버변수 : 현금, 장바구니
	/** 현금 */
	int cash;
	/** 장바구니 */
	int shoppingCart;      // 1
	
	public Buyer(int cash, int shoppingCart) {
		this.cash = cash;
		this.shoppingCart = shoppingCart; 
	}												// 5
	
	// 기능: 구매
	/**
	 * 구매자가 판매자로부터 상품을 구매한다.
	 * @param orderQuantity	구매 개수
	 * @param seller	판매자
	 * @return	최종 구매 개수
	 */
	public int buy(int orderQuantity, Seller seller) {
		
		// 총 구매 금액이 얼마인가.
		int orderAmount = orderQuantity * seller.unitPrice;
		if (this.cash < orderAmount) {
			return 0;
		}											// 4
		
//		구매자는 현금보다 더 많은 지출을 할 수 없습니다.
//		예를 들어, 구매자가 4,000원을 가지고 있고 판매자로부터 단가 3,000원짜리 상품을 4개 구매하려 한다면 이 구매 행위는 성사될 수 없습니다.
//		따라서 구매자와 판매자는 아무런 변화가 없어야 합니다.
		
		if(orderQuantity > seller.stock ) {	// (orderQuantity > 판매자의 재고 수)
			orderQuantity = seller.stock;	    //  orderQuantity = 판매자의 재고 수   // 3
			
//			- 구매자는 판매자가 가지고 있는 재고 이상의 상품을 구매할 수 없습니다.
//			예를 들어, A 판매자가 4개의 상품 재고를 가지고 있고, 구매자는 5개의 상품을 구매하려 한다면
//			판매자는 4개 전량을 판매하며, 4개 만큼의 매출이 증가합니다.
//			또한, 구매자는 4개의 상품만 구매하게 되며 4개 만큼의 현금을 지출하게 됩니다
		}
		this.cash -= orderQuantity * seller.unitPrice; //판매자의 상품 단가
		this.shoppingCart += orderQuantity;							// 2
		
		seller.sell(orderQuantity); // auction.sell(3);  mart에서 이것을 삭제해주고 넣는것
		
		return orderQuantity;
	}
	
	public void printStatus() {
		System.out.println("구매자의 정보");
		System.out.println("보유 현금:"+this.cash);
		System.out.println("구매 상품 수:"+this.shoppingCart);
	}
}
