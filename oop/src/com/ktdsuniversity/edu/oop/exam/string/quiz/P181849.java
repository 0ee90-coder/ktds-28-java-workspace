package com.ktdsuniversity.edu.oop.exam.string.quiz;

//https://school.programmers.co.kr/learn/courses/30/lessons/181849
public class P181849 {

	public static int solution(String num_str) {
		String str = num_str.replace("0", "");
		String[] strArr = str.split("");
		int answer = 0;
		for (int i = 0; i < strArr.length; i++) {
			answer += Integer.parseInt(strArr[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int result = solution("123456789");
		System.out.println(result);
		
		result = solution("1000000");
		System.out.println(result);
	}

}
