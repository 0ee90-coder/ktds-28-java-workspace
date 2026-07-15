package practice_0715;

public class HomeWork0716 {
	
	//1. 정수 두 개를 받아서 사칙연산(+,-, X, /) 의 결과를 출력하는 메소드를 만들고 호출해보세요.
	public static void Numbers(int number1 , int number2) {
		int plusResult = number1 + number2;
		int minusResult = number1 - number2;
		int multiResult = number1 * number2;
		int devideResult = number1 / number2;
		
		System.out.println(plusResult);
		System.out.println(minusResult);
		System.out.println(multiResult);
		System.out.println(devideResult);
		
	}
	public static void main(String[] args) {
		
		Numbers(2,5);
		Numbers(2,5);
		Numbers(2,5);
		Numbers(2,5);
		
	//2. 정수 한 개를 받아서 짝수라면 true를, 홀수라면 false를 반환하는 메소드를 만들고 호출해보세요.
//	public static boolean Number(int number) {
//		if(number % 2 == 0) {
//			
//		}
//	}	
	
	//3. 정수 세 개를 받아서 가장 큰 수를 출력하는 메소드를 만들고 호출해보세요.

	//4. 정수 한 개를 받아서 소수(prime number)라면 true를 아니라면 false를 반환하는 메소드를 만들고 호출해 보세요.
	
	}
}
