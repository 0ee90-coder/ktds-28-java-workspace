package com.ktdsuniversity.edu.fp.lambda;

public class LambdaExam {

	public static void main(String[] args) {
		
		// 람다 함수를 사용하려면. . .
		// 조건 1. 반드시 인터페이스가 필요하다.
		// 조건 2. 추상 메소드가 반드시 1개만 있어야 한다.
		
		Computable addComputer = new Computable() {

			@Override
			public int compute(int number1, int number2) {
				return number1 + number2;
			}};
			
		System.out.println(addComputer);	
		int addResult = addComputer.compute(10, 40);
		System.out.println(addResult);
		
		// 추상 메소드가 1개만 있는 Computable 인터페이스를 이용해 함수를 만들기
		// Computable multiplicateComputer = () -> {};
		Computable multiplicateComputer = (int number1, int number2) ->{
			return number1 * number2;
		};
		
		System.out.println(multiplicateComputer);
		int mulResult = multiplicateComputer.compute(3, 8);
		System.out.println(mulResult);
		
		// Computable 인터페이스를 이용해 두 개의 숫자를 뺄셈한 결과를 반환 시키는 함수
		
		Computable subtractComputer = (int number1, int number2) -> {
			return number1 - number2;
		};
		int subResult = subtractComputer.compute(50, 19);
		System.out.println(subResult);
		
		// Computable 인터페이스를 이용해 두 개의 숫자를 나눗셈 몫의 결과를 반환 시키는 함수
		
		Computable divideComputer = (int number1, int number2) -> {
			return number1 / number2;
		};
		int divResult = divideComputer.compute(30, 5);
		System.out.println(divResult);
		
		// Computable 인터페이스를 이용해 두 개의 숫자를 나눗셈 나머지의 결과를 반환 시키는 함수
		
		Computable modComputer = ( number1,  number2) -> 
			 number1 % number2;

		int modResult = modComputer.compute(10, 6);
		System.out.println(modResult);
	}
}
