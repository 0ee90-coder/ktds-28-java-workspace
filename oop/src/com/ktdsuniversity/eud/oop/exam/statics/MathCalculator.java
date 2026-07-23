package com.ktdsuniversity.eud.oop.exam.statics;

/**
 * 사칙 연산기
 */

public class MathCalculator {
	
	/** 계산하려는 첫 번째 정수 */
	private int firstNumber;
	/** 계산하려는 두 번째 정수 */
	private int secondNumber;
	
	public MathCalculator(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	/**
	 * 숫자 두 개를 연산하여 반환.
	 * @param operator 연산 종류(0:더하기, 1:빼기, 2:곱하기, 3.나누기 몫, 4.나누기 나머지
	 * @see 연산 종류  com.ktdsuniversity.eud.oop.exam.statics.Operators  ,조롱연산
	 * @return operator의 값에 따른 결과
	 */
	public int getComputeResult(int operator) {
		
		if (operator == Operators.ADD) {
			return this.firstNumber + this.secondNumber;
		} else if (operator == Operators.SUB) {
			return this.firstNumber - this.secondNumber;
		} else if (operator == Operators.MUL) {
			return this.firstNumber * this.secondNumber;
		} else if (operator == Operators.DIV) {
			return this.firstNumber / this.secondNumber;
		} else if (operator == Operators.MOD) {
			return this.firstNumber % this.secondNumber;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
		// this.firstNumber = 30; // 클래스 메소드는 this 가 지역변수기 때문에 스택에 들어감 , first number는 힙에 있음 , public static void main(String[] args) { 클래스에 있음
		
		MathCalculator math = new MathCalculator(10,2);
		System.out.println(math.getComputeResult(Operators.ADD));
		//System.out.println(math.getComputeResult(0)); // 더하기
		System.out.println(math.getComputeResult(1)); // 빼기
		System.out.println(math.getComputeResult(2)); // 곱하기
		System.out.println(math.getComputeResult(3)); // 나누기 몫
		System.out.println(math.getComputeResult(4)); // 나누기 나머지
		
	}
}
