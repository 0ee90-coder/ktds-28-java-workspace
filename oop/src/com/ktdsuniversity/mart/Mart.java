package com.ktdsuniversity.mart;

public class Mart {
	
	public static void main(String[]args) {
		
		Seller auction = new Seller(10, 1000, 0, 0);
		Seller naverSmartStore = new Seller(20, 1500, 3 * 1500, 3);
		
		Buyer me = new Buyer(7000, 0);
		
		// 내가 auction에서 3개를 구매한다.
		me.buy(3, auction);
		//auction.sell(3);                             //내가 사면 옥션도 팔아야함
		
		me.printStatus();
		auction.printStatus();
		
		// 내가 naverSmartStore에서 2개를 구매한다.
		
		me.buy(2, naverSmartStore);
		
		me.printStatus();
		naverSmartStore.printStatus();
		
		System.out.println("==========================");
		
		// 내가 auction에서 2개를 구매한다.
		// 구매자가 몇 개를 샀냐? 가 필요하다. 구매는 안했는데 판매는 한 경우가 생김  // 기능 구매 부분에서 void > int , return 0; , return orderQuantity;
		int boughtCount = me.buy(2, auction);
		System.out.println(boughtCount + "개 구매완료");
		//auction.sell(boughtCount);
		
		me.printStatus();
		auction.printStatus();
		
		System.out.println("==========================");
		// 내가 auction에서 9개를 더 구매하겠다.
		boughtCount = me.buy(9, auction);
		System.out.println(boughtCount + "개 구매완료");
		//auction.sell(boughtCount);
	}

}
