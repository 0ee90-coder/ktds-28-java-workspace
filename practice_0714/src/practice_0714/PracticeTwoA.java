package practice_0714;

public class PracticeTwoA {

	public static void main(String []args) {
		final int N_PRICE = 12000;
		final int K_PRICE = 2000;
		
		int n = 10;
		int k = 3;
		
		int amount = (N_PRICE * n) + (K_PRICE * k );
		// 서비스로 제공받은 음료수 개수
		int serviceK = n / 10 ;
		
		if (serviceK > 0) {
			amount -= serviceK * K_PRICE;
			// 서비스 음료가 있을 때 가격에서 제외
		}
		System.out.println(amount);
	}
}
