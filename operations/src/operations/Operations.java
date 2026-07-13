package operations;

public class Operations {

	public static void main(String[] args) {

		//나누기의 나머지를 구한다.
		int num1 = 10;
		int num2 = 3;
		
		int mod = num1 % num2;
		System.out.println(mod);
		
		int bigNumber = 1_000_000_000;
		int powerResult = bigNumber * bigNumber;
		
		int maxIntValue = Integer.MAX_VALUE;
		int minIntValue = Integer.MIN_VALUE;
		
	//	maxIntValue = maxIntValue + 1;
	//	minIntValue = minIntValue - 1;
	//	maxIntValue += 1;
	//	minIntValue -= 1;
		maxIntValue++;
		minIntValue--;
		System.out.println(maxIntValue);
		
		
//		Screaming Snake Case
		final float subject_Count = 3f; // final 상수 
//		subjectCount = 12f;
		
		int kor = 80;
		int math = 90;
		int sci = 93;
			
		float avg = (kor + math + sci) / 3;
		System.out.println(avg);					// 정수끼리의 값을 더한 것 이기 때문에 정수가 나온것 , 타입은 건들지 않고 3에다가 F하나 붙이면 됨 그럼 정수와 실수의 나눗셈이됨
		
		// 정수 변수 두개 만들어서 다른 정수 변수에 연산의 결과를 저장한 후 출력한다.
		int firstNumber = 10;
		int secondNumber = 30;
		
		// firstNumber + secondNumber
		int addResult = firstNumber + secondNumber;
		System.out.println(addResult);
		
		// subResult , mulResult, divResult
		
		int subResult = firstNumber - secondNumber;
		System.out.println(subResult);
		
		int mulResult = firstNumber * secondNumber;
		System.out.println(mulResult);
		
		int divResult = firstNumber / secondNumber;
		System.out.println(divResult);
		
		float firstFloatNumber = 10.5f;
		float secondFloatNumber = 3.55f;
		float divFloatResult = firstFloatNumber / secondFloatNumber;
		System.out.println(divFloatResult);
		
		// p104
		int num = 10;
		System.out.println(num++);
		System.out.println(++num);
		
	    System.out.println(num--);
	    System.out.println(--num);
	    
	    int num3 = 3;
	    int num4 = 5;
	    
	    int operResult = num++ + num3 * num4; // 후위연산자는 세미콜론 기준으로 그다음에 ++가 진행된다 
	    System.out.println(operResult);
	}
	
	
	
}
