package com.ktdsuniversity.edu.oop.exam.string.quiz;

//https://school.programmers.co.kr/learn/courses/30/lessons/181847
public class P181847 {

	public static String solution(String n_str) {
		int num = Integer.parseInt(n_str);
		String answer = num + "";
		return answer;
	}
	
	public static void main(String[] args) {
		String result = solution("0010");
		System.out.println(result);
		
		result = solution("854020");
		System.out.println(result);
	}
}
