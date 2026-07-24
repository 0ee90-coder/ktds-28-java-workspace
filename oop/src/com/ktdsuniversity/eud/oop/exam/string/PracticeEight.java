package com.ktdsuniversity.eud.oop.exam.string;

public class PracticeEight {
	
	public static void main(String[] args) {
		
//		알파벳으로 이루어진 문자열 myString과 pat 이 주어집니다. 
//		myString의 연속된 부분 문자열 중 pat 이 존재하면 1을 그렇지 않으면 0을 return 하는 
//		solution 함수를 완성해 주세요.
//		단, 알파벳 대문자와 소문자는 구분하지 않습니다.
		
		String Word = "myString";
		String Word2 = "pat";
		
		String newWord = Word.toLowerCase();
		String newWord2 = Word2.toLowerCase();
		
		boolean result = newWord2.contains(newWord);
			if (result == true) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
	}

}
