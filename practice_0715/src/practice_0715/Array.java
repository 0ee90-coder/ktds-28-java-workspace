package practice_0715;

public class Array {

	public static void main(String[] args) {
		
		// 여섯 개의 변수를 하나의 변수로 병합한다. ==> 배열
		// 배열을 만드는 방법
		// 자료형[] 변수의이름 = new 자료형[값의 개수];  자료형 부분이 같아야한다. 
		// ex) Scanner keyboard = new Scanner(System.in)
		
		int[] numArray = new int[6]; // 배열
		
		// 배열의 인덱스에 값을 할당한다.
		numArray[0] = 5;
		numArray[1] = 6;
		numArray[2] = 9;
		numArray[3] = 11;
		numArray[4] = 12;
		numArray[5] = 13; // 인덱스가 0부터 5까지 1씩 증가한다.
		
		// numArray를 출력한다.
		System.out.println(numArray); // [I@28a418fc ==> Type@HashData  HashData : 변수를 고유하게 구분할 수 있는 값(메모리값,메모리주소라 부름)
		// numArray에 합쳐진 변수의 개수를 구한다. ==> 인덱스의 길이
		System.out.println(numArray.length); // . 했을 때 나오는 박스 컨텐트 어시스트 , length 인덱스의 길이 
		
		// 배열 내부의 할당된 모든 숫자들을 출력한다.
		// for (int i = 0; i < 6; i++) {   6을 직접 쓰는건 하드코딩 
		for (int i = 0; i < numArray.length; i++) {
			// System.out.println( numArray [ i ] );
			
			boolean isRemainZero = false;
			for (int j = 2; j < numArray[i]; j++) {
				if ( numArray[i] % j == 0) {
					System.out.println(numArray[i] + "은 소수가 아닙니다.");
					isRemainZero = true;
					break; // 2와 3으로 나누면서 결과값이 두번 나오기 때문에 2로 소수가 아닌게 판정되면 더 할 필요없이 바로 브레이크
				}
			}
			if ( ! isRemainZero) {  
				System.out.println(numArray[i] + "은 소수 입니다.");
			}
		}
		/* 위 코드는 아래 내용을 for문 변환
		System.out.println(numArray[0]); 
		System.out.println(numArray[1]);
		System.out.println(numArray[2]);
		*/
		
		//숫자 여러개 주어진다.
		// 5, 6, 9, 11, 12 .....
		// 주어진 숫자들이 소수인지 확인한다.
		
		int num1 = 5;
		int num2 = 6;
		int num3 = 9;
	//	int num4 = 11;
	//	int num5 = 12;
	//  int num6 = 13;  // 1~6 이것이 중복되고 중복되는것을 없애고 싶을 때 배열을 사용한다.
		
		
		// num1이 소수이면 "소수입니다" 를 출력, 아니면 "소수가 아닙니다."를 출력
		for (int i = 2; i < num1; i++) {
			if ( num1 % i == 0) {
				System.out.println(num1 + "은 소수가 아닙니다.");
			}
		}
		
		System.out.println(num1 + "은 소수 입니다.");
		
		// num2가 소수이면 "소수입니다" 를 출력, 아니면 "소수가 아닙니다."를 출력
		boolean isRemainZero = false;
		for (int i = 2; i < num2; i++) {
			if ( num2 % i == 0) {
				System.out.println(num2 + "은 소수가 아닙니다.");
				isRemainZero = true;
				break; // 2와 3으로 나누면서 결과값이 두번 나오기 때문에 2로 소수가 아닌게 판정되면 더 할 필요없이 바로 브레이크
			}
		}
		if (isRemainZero == false ) {
			System.out.println(num2 + "은 소수 입니다.");
		}
		
		// num3이 소수이면 "소수입니다" 를 출력, 아니면 "소수가 아닙니다."를 출력
		isRemainZero = false; // 여기서 boolean 없애는 이유?
		for (int i = 2; i < num3; i++) {
			if ( num3 % i == 0) {
				System.out.println(num3 + "은 소수가 아닙니다.");
				isRemainZero = true;
				break; // 2와 3으로 나누면서 결과값이 두번 나오기 때문에 2로 소수가 아닌게 판정되면 더 할 필요없이 바로 브레이크
			}
		}
		if (isRemainZero == false ) {
			System.out.println(num2 + "은 소수 입니다.");
		}
	}
}





