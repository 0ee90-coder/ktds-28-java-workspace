package com.ktdsuniversity.edu.oop.exam.string.quiz;

//https://school.programmers.co.kr/learn/courses/30/lessons/181878
public class P181878 {

	public static int solution(String myString, String pat) {
		myString = myString.toLowerCase();
		pat = pat.toLowerCase();
		if (myString.contains(pat)) {
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int result = solution("AbCdEfG", "aBc");
		System.out.println(result);
		
		result = solution("aaAA", "aaaaa");
		System.out.println(result);
	}
	
}
