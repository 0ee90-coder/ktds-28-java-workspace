package com.ktdsuniversity.edu.oop.exam.array;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/181852
public class P181852 {

	public static int[] solution3(int[] num_list) {
		Arrays.sort(num_list);
		
		int[] answer = new int[5];
		System.arraycopy(num_list, num_list.length - 5, answer, 0, answer.length);
		return answer;
	}
	
	public static int[] solution2(int[] num_list) {
		Arrays.sort(num_list);
		
		int[] answer = new int[5];
		int lastIndexOfNumList = num_list.length - 1;
		for (int i = lastIndexOfNumList; i > lastIndexOfNumList - 5; i--) {
			answer[i - 5] = num_list[i];
		}
		return answer;
	}
	
	public static int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		
		int[] answer = new int[5];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[num_list.length - 5 + i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		int[] result = solution(num_list);
		PrintUtils.print(result);
		
		result = solution2(num_list);
		PrintUtils.print(result);
		
		result = solution3(num_list);
		PrintUtils.print(result);
	}
}
