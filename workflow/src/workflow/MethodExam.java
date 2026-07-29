package workflow;

public class MethodExam {

	//										10           3 ==> 3.33333333333334
	public static double devideTwoNumbers(int number1, int number2) {
		double divResult = number1 / (double) number2;
		return divResult;
	}
	
	public static void printNameAndAge(String name, int age) {
		System.out.println("이름: " + name + ", 나이: " + age);
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
		// 단순하게 출력하는 메소드(함수)를 생성하고 호출해본다.
		print();
		print();
		print();
		print();
		print();
		
		// 파라미터(인자)가 있는 메소드(함수)를 생성하고 호출해본다.
		powerAndPrint(2);
		powerAndPrint(3);
		powerAndPrint(5);
		
		// 파라미터(인자)가 여러 개 있는 메소드(함수)를 생성하고 호출해본다.
		printNameAndAge("장민창1", 42);
		printNameAndAge("장민창2", 43);
		printNameAndAge("장민창3", 44);
		printNameAndAge("장민창4", 45);
		
		// 반환값(결과)있는 메소드(함수)를 생성하고 호출 한 뒤 결과를 출력해본다.
		double div1 = devideTwoNumbers(10, 3);
		System.out.println(div1);
		
		double div2 = devideTwoNumbers(20, 7);
		System.out.println(div2);
	}
	
}