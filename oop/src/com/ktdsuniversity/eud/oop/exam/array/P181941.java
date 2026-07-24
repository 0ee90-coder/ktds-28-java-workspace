package com.ktdsuniversity.eud.oop.exam.array;

public class P181941 {
	
	//문자들이 담겨있는 배열 arr 가 주어집니다. 
	//arr 의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
	//1 ≤ arr 의 길이 ≤ 200 , arr 의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.
	public static void printArray(String[] letters) {
		String result = "";
		for(int i = 0; i < letters.length; i++) {
			result += letters[i];
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		String[] letter = new String[]{"a","b","c"};
		printArray(letter);
	}
}
