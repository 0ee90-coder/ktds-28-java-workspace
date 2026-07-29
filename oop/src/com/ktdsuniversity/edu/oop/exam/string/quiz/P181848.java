package com.ktdsuniversity.edu.oop.exam.string.quiz;

//https://school.programmers.co.kr/learn/courses/30/lessons/181848
public class P181848 {

	public static int solution(String n_str) {
		int answer = Integer.parseInt(n_str);
		return answer;
	}
	
	public static void main(String[] args) {
		int result = solution("10");
		System.out.println(result);
		
		result = solution("8542");
		System.out.println(result);
	}
}
