package practice_0715;

public class MethodExam {
	
	//										10          3==> 3.3333333333333
	public static double devideTwoNumbers(int number1, int number2) {  //double 구역과 return값은 일치해야함
		double divResult = number1 / (double) number2;  // int / double 이 되면서 결과는 double 됨 둘 중 하나 잡아서 명시적 변환해줌
		return divResult;
	}
	
	public static void printNameAndAge(String name, int age) {
		System.out.println("이름:" + name + ", 나이:" + age);
	}
	
	public static void powerAndPrint(int number) {
		int powerResult = number * number;
		System.out.println(powerResult);
	}	
	
	public static void print() { 
		System.out.println("Hello");
		System.out.println(3 + 1);
	}

	public static void main(String[] args) {
		
		// 단순하게 출력하는 메소드(함수)를 생성하고 호출해본다. (메소드는 항상 동사로 시작)
		print();
		print();
		print();
		print();
		print();
		/*
	public static void print() { 
		System.out.println("Hello");
		System.out.println(3 + 1);
	}
		 */
		
		// 파라미터(인자)가 있는 메소드(함수)를 생성하고 호출해본다.
		
		powerAndPrint(2);
		powerAndPrint(3);
		powerAndPrint(5);
/*		
	public static void powerAndPrint(int number){
		int powerResult = number * number;
		System.out.println(powerResult);
	}
 
 */
		// 파라미터(인자)가 여러개 있는 메소드(함수)를 생성하고 호출해본다.
		printNameAndAge("가나",20);
		printNameAndAge("다라",30);
		
/*	public static void printNameAndAge(String name, int age) {
		System.out.println("이름:" + name + ", 나이:" + age);
	}
 */
		
		// 반환값(결과)이 있는 메소드(함수)를 생성하고 호출 한 뒤 결과를 출력해본다.
		
		double div1 = devideTwoNumbers(10,3);
		System.out.println(div1);
		
		double div2 = devideTwoNumbers(20,7);
		System.out.println(div2);
		
/*	public static double devideTwoNumbers(int number1, int number2) {  //double 구역과 return값은 일치해야함
		double divResult = number1 / (double) number2;  // int / double 이 되면서 결과는 double 됨 둘 중 하나 잡아서 명시적 변환해줌
		return divResult;
	}		
*/		
	}
}
