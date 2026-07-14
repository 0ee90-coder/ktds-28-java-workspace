package practice_0714;

import java.util.Scanner;

public class UpDownGame {

	public static void main(String[]args) {
		
		//키보드에서 값을 받아올 수 있는 변수하나를 생성한다.
		Scanner keyboard = new Scanner(System.in);
		// "업 다운 게임 시작" 출력
		System.out.println("업 다운 게임 시작");
		// 0 ~ 99 사이의 숫자를 임의로 생성
		double randomNumber = Math.random();
		//System.out.println((int)(randomNumber * 100));
		int goal =(int) (randomNumber * 100);
		int value = -1;
		while (goal != value) {// 사용자로부터 값을 입력 받는다
			System.out.println("숫자를 입력하세요.");
			value = keyboard.nextInt();
			System.out.println(value);
			// 임의의 숫자 == 사용자 입력 값
			// "정답"을 출력.
			if (goal == value) {
				System.out.println("정답");
			}
			// 임의의 숫자 > 사용자 입력 값
			// "Up"을 출력.
			else if (goal>value) {
				System.out.println("Up");
			}
			// 임의의 숫자 < 사용자 입력 값
			// "Down"을 출력
			else if (goal < value) {
				System.out.println("Down");
			}}

		keyboard.close(); // 스트림을 열어줬으면 다시 닫아줘야함
	}
}
