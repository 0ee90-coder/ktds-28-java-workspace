package com.ktdsuniversity.edu.oop.exam.string.quiz;

//https://school.programmers.co.kr/learn/courses/30/lessons/181845
public class P181845 {

	public static String solution(int n) {
		String answer = n + "";
		return answer;
	}
	
	public static void main(String[] args) {
		String result = solution(123);
		System.out.println(result);
		
		result = solution(2573);
		System.out.println(result);
	}

}
