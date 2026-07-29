package workflow;

public class Quiz {

	public static void main(String[] args) {
		// Q https://school.programmers.co.kr/learn/courses/30/lessons/120829
		int angle = 179;
		
		if (angle > 0 && angle < 90) {
			// 예각
			System.out.println("1");
		} else if (angle == 90) {
			// 직각
			System.out.println("2");
		} else if (angle > 90 && angle < 180) {
			// 둔각
			System.out.println("3");
		} else if (angle == 180) {
			// 평각
			System.out.println("4");
		}
		
		// or
		
		if ( angle == 180 ) {
			// 평각
			System.out.println("4");
		} else if ( angle > 90 ) {
			// 둔각
			System.out.println("3");
		} else if ( angle == 90 ) {
			// 직각
			System.out.println("2");
		} else if ( angle > 0 ) {
			// 예각
			System.out.println("1");
		}
		
		
		// Q https://school.programmers.co.kr/learn/courses/30/lessons/120830
		final int N_PRICE = 12000;
		final int K_PRICE = 2000;
		// 양꼬치
		int n = 10;
		// 음료수 (서비스 포함)
		int k = 3;
		
		// 총 금액
		int amount = (N_PRICE * n) + (K_PRICE * k);
		// 서비스로 제공받은 음료수 개수
		int serviceK = n / 10;
		
		if ( serviceK > 0 ) {
			// 서비스 음료가 있을 때 가격에서 제외
			amount -= serviceK * K_PRICE;
		}
		
		System.out.println(amount);
	}
	
}