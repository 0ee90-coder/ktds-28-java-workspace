package workflow;

public class ConvStrore {

	public static void main(String [] args) {
		
//		final inT PRICE = 3000;
	//	inT stock = 3;
//		inT wallet = 3_000;
		//inT n = 3;
//		
//		if (PRICE * n <= wallet) {
//			System.out.println(drinkA * count);
//		}
//		else {
//			System.out.println("금액이 부족합니다.");
//			}
//		}
		
		// A 편의점은 한 종류의 음료수만 판매합니다.
		// 음료수 하나의 가격은 3000원 입니다.
		
		// 손님이 가지고 있는 돈, 구매개수 => 변수
		// 5000원을 가지고 있는 손님이 음료수 3개를 구매하려 합니다.
		
		// 구매할 수 있다면 음료수 가격 X 구매개수를 출력하고
		
		// 구매할 수 없다면 "금액이 부족합니다."를 출력한다.
	
		//=================================================
		
		final int PRICE = 4500; // 음료수 당 가격
		int stock = 5; // 음료수 재고 수
		int wallet = 30_000;
		int n = 3;
		
		if (n <= stock && PRICE * n <=wallet) {
			System.out.println(PRICE * n);
		}
		else if( n <= stock && wallet < PRICE * n) {
			System.out.println("금액이 충분하지 않습니다.");
		}
		else if(n > stock){
			System.out.println("재고수가 충분하지 않습니다.");
		}
	}
}

		// inT amount = PRICE * n;
		//if ( n> stock) {
		//	System.out.println("재고수가 충분하지 않습니다");
	//	}
		//else if(wallet > amount){
		// System.out.println(amount);
	//  }
		//else{
		// System.out.println("금액이 충분하지 않습니다.");




		// B편의점은 한 종류의 음료수만 판매합니다.
		// 총 5개의 음료수가 있으며 음료수 하나의 가격은 4500원 입니다. <-- 상수
	
		// 30000원을 가지고 있는 손님이 음료수를 n개 구매하려 합니다.
		// 만약, 손님이 음료수를 5개 이하개를 구매할 수 있으면(금액이 충분하면) 음료수 가격 * 구매개수를 출력합니다.
		// 그러나 5개 이하개를 구매할 수 없으면 (금액이 충분하지 않으면) "금액이 충분하지 않습니다."를 출력합니다.
		// 만약, 손님이 음료수를 6개 구매하려 한다면 "재고수가 충분하지 않습니다." 를 출력합니다.
