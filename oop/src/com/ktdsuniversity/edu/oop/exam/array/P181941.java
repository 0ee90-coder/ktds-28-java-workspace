package com.ktdsuniversity.edu.oop.exam.array;

//https://school.programmers.co.kr/learn/courses/30/lessons/181941
public class P181941 {

	public static String solution2(String[] arr) {
		String answer = String.join("", arr);
		return answer;
	}
	
	public static String solution(String[] arr) {
		String answer = "";
		for (int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		String answer = solution(new String[] {"a", "b", "c"});
		System.out.println(answer);
		
		answer = solution2(new String[] {"a", "b", "c"});
		System.out.println(answer);
	}

}