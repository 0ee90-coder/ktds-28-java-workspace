package homework;

//단일 상품을 판매하는 판매자가 있습니다.
//
//판매자는 단일 상품 n개를 m원에 판매하고 판매자의 매출액은 m원 x 상품 판매개수 만큼 증가되며, 재고는 n개 만큼 줄어듭니다. (환불 없음)
//
//판매자가 가지고 있는 재고를 소진했다면 더 이상 판매하지 않습니다.
//
//* 판매자마다 판매하는 상품의 단가와 재고, 매출액는 다릅니다.

public class Seller{
	
	/**
	 * 상품단가
	 */
	int price;
	
	/**
	 * 매출액
	 */
	int revenue;
	/**
	 * 재고
	 */
	int stock;
	
	public Seller(int price, int revenue, int stock) {
		this.price = price;
		this.revenue = revenue;
		this.stock = stock;
	}
	
	
	public int sell() {
		revenue = (price * stock);
	}
	
}