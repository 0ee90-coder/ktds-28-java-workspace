package com.ktdsuniversity.edu.oop.exam.array;

//https://school.programmers.co.kr/learn/courses/30/lessons/181867
public class P181867 {

	/**
	 * 느림
	 * @param myString
	 * @return
	 */
	public static int[] solution2(String myString) {
		if (myString.endsWith("x")) {
			myString += " ";
		}
		String[] arr = myString.split("x");
		
		int[] answer = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			answer[i] = arr[i].trim().length();
		}
		return answer;
	}
	
	public static int[] solution(String myString) {
		String[] arr = myString.split("x");
		
		int answerLength = arr.length;
		if (myString.endsWith("x")) {
			answerLength++;
		}
		
		int[] answer = new int[answerLength];
		
		for (int i = 0; i < arr.length; i++) {
			answer[i] = arr[i].trim().length();
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] result = solution("oxooxoxxox");
		PrintUtils.print(result);
		result = solution2("oxooxoxxox");
		PrintUtils.print(result);
		
		result = solution("xabcxdefxghi");
		PrintUtils.print(result);
		result = solution2("xabcxdefxghi");
		PrintUtils.print(result);
	}

}