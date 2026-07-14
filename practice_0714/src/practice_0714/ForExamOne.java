package practice_0714;

public class ForExamOne {

	public static void main(String[]args) {
		
		// 1 부터 100 까지의 합을 구해 출력해보세요.
		int sum = 0;
		for(int i=1; i<101; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 1 부터 100 중 홀수의 합을 구해 출력해보세요.

		int summ = 0;
		for(int i=1; i<101; i+=2) {
			summ += i;
		}
		System.out.println(summ);
		
		// 1 부터 100 중 3, 5, 6의 배수만 출력해보세요.

		for(int i=1; i<101; i++) {
			if(i % 3 == 0 || i % 5 == 0 || i % 6 == 0){
				System.out.println(i);
			}
		}
		
		// 그림 그리기

		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
	
}
