package com.ktdsuniversity.edu.oop.exam.array;

//https://school.programmers.co.kr/learn/courses/30/lessons/181854
public class P181854 {

	public static int[] solution(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr.length % 2 == 1 && i % 2 == 0) {
				arr[i] += n;
			}
			else if (arr.length % 2 == 0 && i % 2 == 1) {
				arr[i] += n;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {49, 12, 100, 276, 33};
		int[] result = solution(arr, 27);
		PrintUtils.print(result);
		
		int[] arr2 = {444, 555, 666, 777};
		result = solution(arr2, 27);
		PrintUtils.print(result);
	}

}
