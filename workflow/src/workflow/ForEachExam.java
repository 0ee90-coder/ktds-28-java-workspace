package workflow;

import java.util.Arrays;

public class ForEachExam {

	public static void main(String[] args) {
		int[] numbers = new int[50];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * Integer.MAX_VALUE);
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + "번째 숫자: " + numbers[i]);
		}
		
		// 인덱스 번호 없이 출력 할 경우.
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		for (int number : numbers) {
			System.out.println(number);
		}
	}
	
}