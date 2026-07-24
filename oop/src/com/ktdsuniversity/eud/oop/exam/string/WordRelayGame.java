package com.ktdsuniversity.eud.oop.exam.string;

import java.util.Scanner;

public class WordRelayGame {

	public static void main(String[] args) {

		// 시작 단어 지정(자전거)
		String startWord = "자전거";

		// 시작 단어 출력
		System.out.println(startWord);

		// 시작단어의 마지막 글자를 저장
		String lastletter = startWord.substring(startWord.length() - 1);

		int relayCount = 0;

		while (true) {
			// Scanner 생성
			Scanner keyboard = new Scanner(System.in);

			// 이전 단어의 마지막 글자로 시작하는 다음 단어 입력
			String nextWord = keyboard.nextLine();
			nextWord = nextWord.trim();

			// 입력 단어가 이전 단어의 마지막 글자로 시작하는가? startwith
			if (nextWord.startsWith(lastletter)) {

				// 입력 단어가 3글자 이상인가? length
				if (nextWord.length() >= 3) {

					// 입력 단어 출력
					System.out.println(nextWord);

					// 입력 단어의 끝 글자를 저장
					lastletter = nextWord.substring(nextWord.length() - 1);
					relayCount++;
				} else {
					break;
				}
			}
		}
	}
}
