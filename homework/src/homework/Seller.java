package homework;

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