package com.ktdsuniversity.eud.oop.exam;

public class ArrayExam {
	
	public static void printArraysValue(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + "번째 인덱스의 값 :"+ numbers[i]);
		}
	}

	public static void main(String[] args) {
		
		// 배열을 정의하고 생성하는 3가지 방법
		// 1. 자료형[] 배열이름 = new 자료형[배열길이];
		int[] nums = new int[3];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		
		// 2. 자료형[] 배열이름 = new 자료형[]{각 인덱스에 들어갈 값들}
		//    길이를 정해놓지 않았음 대신에 값들을 맘대로 넣을 수 있음
		//						0	1	2	3	4	5	6	7
		
		int[] num2 = new int[] {60, 30, 60, 10, 20, 55, 7, 88};
		System.out.println(num2.length); // 8
		
//		int [] num2 = new int [] {60, 30, 60, 10, 20, 55, 7, 88};
//		Arrays.sort(num2); // 배열자체를 정령 기본 오름차순
//		System.out.println(num2.length); 
		
		// 3. 자료형[] 배열이름 = {각 인덱스에 들어갈 값들};
		//				0	1	2	3		4	5	6	7
		//    사용하는 방법이 제한적이다.
		int[] num3 = {100, 200, 300, 500, 200, 700, 10, 20};
		System.out.println(num3.length);
		
		
		// O
		printArraysValue(new int[3]);
		
		printArraysValue(new int[] {1,2,3,4,5,6,7,8,9});
		
		// X  임시변수(파라미터)로 보낼 때는 안된다. 지역변수에서만 사용 가능
	//	printArraysValue({1,2,3,4,5,6,7,8,9});
	}
}
