package com.ktdsuniversity.eud.oop.exam.string;

public class PracticeNine {
	//181875
	
	public static void main(String[] args) {
		
//		문자열 배열 strArr가 주어집니다. 모든 원소가 알파벳으로만 이루어져 있을 때, 
//		배열에서 홀수번째 인덱스의 문자열은 모든 문자를 대문자로, 
//		짝수번째 인덱스의 문자열은 모든 문자를 소문자로 바꿔서 반환하는 solution 함수를 완성해 주세요.
		int[] arr = new int[5];
		
		String[] word = new String[4];
		word[0] = "AAA";
		word[1] = "BBB";
		word[2] = "CCC";
		word[3] = "DDD";
		
		for (int i = 0; i < word.length; i++) {  // 배열에서는 무조건 for 부터 튀어나와야함
			if(i % 2 == 0) {
				word[i] = word[i].toLowerCase();
			} else {
				word[i] = word[i].toUpperCase();
			}
		}
		for (int i = 0; i < word.length; i++) {
			if(i % 2 == 0 ) {
				System.out.println(word[i]);
			} else {
				System.out.println(word[i]);
			}
		}
	}
}
