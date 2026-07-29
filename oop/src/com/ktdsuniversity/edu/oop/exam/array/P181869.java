package com.ktdsuniversity.edu.oop.exam.array;

//https://school.programmers.co.kr/learn/courses/30/lessons/181869
public class P181869 {

	public static String[] solution(String my_string) {
		return my_string.split(" ");
	}

	public static void main(String[] args) {
		String[] result = solution("i love you");
		PrintUtils.print(result);

		result = solution("programmers");
		PrintUtils.print(result);
	}
}
