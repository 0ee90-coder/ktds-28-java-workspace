package com.ktdsuniversity.edu.oop.exam.string.quiz;

//https://school.programmers.co.kr/learn/courses/30/lessons/181843
public class P181843 {

	public static int solution(String myString, String target) {
		if (myString.contains(target)) {
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int result = solution("banana", "ana");
		System.out.println(result);
		
		result = solution("banana", "wxyz");
		System.out.println(result);
	}
}
