package com.ktdsuniversity.edu.oop.exam.string;

public class Exam {

	public static void main(String[] args) {
		
		// binding? 
		//    값을 특정 부분에 대입한다
		int biggestNumber = Integer.MAX_VALUE;
		System.out.println(biggestNumber); // 2147483647
		
		String numberString = "%,d".formatted(biggestNumber);
		System.out.println(numberString); // 2,147,483,647
		
		
		// format binding (static method)
		String messageFormat = "%s에서 교육하는 %s과정, %d시간 %d일 과정, %f (%.2f) 진행했습니다.";
		String message = String.format(messageFormat,
										"ktds University",
										"Java Programming",
										800,
										100,
										8 / 100d,
										8 / 100d);
		System.out.println(message);
		
		// format binding (instance method)
		String message2 = messageFormat.formatted(
								"ktds University",
								"Java Programming",
								800,
								100,
								8 / 100d,
								8 / 100d);
		System.out.println(message2);
	}
	
}
