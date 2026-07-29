package com.ktdsuniversity.edu.oop.exam.string;

import java.util.Scanner;

public class WordRelayGame {

	public static void playGame() {
		// 1. 시작단어 지정 (자전거)
		String startWord = "자전거";
		
		// 2. 시작단어 출력
		System.out.println(startWord);
		
		// 3. 시작단어의 마지막 글자를 저장
		String lastLetter = startWord.substring( startWord.length() - 1 );
		
		int relayCount = 0;
		
		// 4. Scanner 생성
		Scanner keyboard = new Scanner(System.in);
		String nextWord = null;
		while (true) {
			
			// 5. 이전 단어의 마지막 글자로 시작하는 다음단어 입력
			nextWord = keyboard.nextLine();
			nextWord = nextWord.trim();
			
			// 6. 입력 단어가 이전 단어의 마지막 글자로 시작하는가?
			if (nextWord.startsWith(lastLetter)) {
				
				// 7. 입력 단어가 3글자 이상인가?
				if (nextWord.length() >= 3) {
					// 8. 입력 단어 출력
					System.out.println(nextWord);
					// 9. 입력 단어의 끝 글자를 저장
					lastLetter = nextWord.substring( nextWord.length() - 1);
					
					relayCount++;
					
				} else {
					break;
				}
			} else {
				break;
			}
		}
		
		// 이어나간 단어의 수를 출력
		System.out.println("이어나간 단어의 수: " + relayCount);
	}
	
	public static void playGame2() {
		// 1. 시작단어 지정 (자전거)
		String startWord = "자전거";
		
		// 2. 시작단어 출력
		System.out.println(startWord);
		
		// 3. 시작단어의 마지막 글자를 저장
		String lastLetter = startWord.substring( startWord.length() - 1 );
		int relayCount = 0;
		while (true) {
			// 4. Scanner 생성
			Scanner keyboard = new Scanner(System.in);
			
			// 5. 이전 단어의 마지막 글자로 시작하는 다음단어 입력
			String nextWord = keyboard.nextLine();
			
			// 6. 입력 단어가 이전 단어의 마지막 글자로 시작하는가?
			// 7. 입력 단어가 3글자 이상인가?
			if (nextWord.startsWith(lastLetter) && nextWord.length() >= 3) {
				// 8. 입력 단어 출력
				System.out.println(nextWord);
				// 9. 입력 단어의 끝 글자를 저장
				lastLetter = nextWord.substring( nextWord.length() - 1);
				relayCount++;
			} else {
				break;
			}
		}
		
		// 이어나간 단어의 수를 출력
		System.out.println("이어나간 단어의 수: " + relayCount);
	}
	
	public static void main(String[] args) {
		playGame();
	}
	
}