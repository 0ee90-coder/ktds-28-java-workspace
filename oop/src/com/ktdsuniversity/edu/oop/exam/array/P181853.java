package com.ktdsuniversity.edu.oop.exam.array;

import java.util.Arrays;
import java.util.Iterator;

// https://school.programmers.co.kr/learn/courses/30/lessons/181853
public class P181853 {

	public static int[] solution2(int[] num_list) {
		Arrays.sort(num_list);
		int[] answer = new int[5];
		System.arraycopy(num_list, 0, answer, 0, answer.length);
		return answer;
	}
	
	public static int[] solution(int[] num_list) {
		Arrays.sort(num_list);
		int[] answer = new int[5];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = num_list[i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		
		int[] result = solution(num_list);
		PrintUtils.print(result);
		
		result = solution2(num_list);
		PrintUtils.print(result);
	}

}
