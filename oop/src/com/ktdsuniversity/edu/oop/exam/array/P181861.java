package com.ktdsuniversity.edu.oop.exam.array;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/181861
public class P181861 {

	public static int[] solution2(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int[] answer = new int[sum];
		
		int answerIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(answer, answerIndex, arr[i] + answerIndex, arr[i]);
			answerIndex += arr[i];
		}
		return answer;
	}
	
	public static int[] solution(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int[] answer = new int[sum];
		
		int answerIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				answer[answerIndex++] = arr[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] result = solution(new int[] {5, 1, 4});
		PrintUtils.print(result);
		result = solution2(new int[] {5, 1, 4});
		PrintUtils.print(result);
		
		result = solution(new int[] {6, 6});
		PrintUtils.print(result);
		result = solution2(new int[] {6, 6});
		PrintUtils.print(result);
		
		result = solution(new int[] {1});
		PrintUtils.print(result);
		result = solution2(new int[] {1});
		PrintUtils.print(result);
	}

}