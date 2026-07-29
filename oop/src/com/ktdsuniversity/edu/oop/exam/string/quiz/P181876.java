package com.ktdsuniversity.edu.oop.exam.string.quiz;

//https://school.programmers.co.kr/learn/courses/30/lessons/181876
public class P181876 {

	public static String solution(String myString) {
		String answer = myString.toLowerCase();
		return answer;
	}
	
	public static void main(String[] args) {
		String result = solution("aBcDeFg");
		System.out.println(result);
		
		result = solution("aaa");
		System.out.println(result);
	}
}
