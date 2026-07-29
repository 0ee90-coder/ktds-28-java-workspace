package com.ktdsuniversity.edu.oop.exam.array;

//https://school.programmers.co.kr/learn/courses/30/lessons/181856
public class P181856 {

	public static int solution(int[] arr1, int[] arr2) {
		int arr1Len = arr1.length;
		int arr2Len = arr2.length;
		
		
		
		if (arr1Len > arr2Len) {
			return 1;
		} else if (arr1Len < arr2Len) {
			return -1;
		} 
		
		int arr1Sum = 0;
		int arr2Sum = 0;
		for (int i = 0; i < arr1Len; i++) {
			arr1Sum += arr1[i];
		}
		for (int i = 0; i < arr2Len; i++) {
			arr2Sum += arr2[i];
		}
		if (arr1Sum > arr2Sum) {
			return 1;
		} else if (arr1Sum < arr2Sum) {
			return -1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int result = solution(new int[] {49, 13}, new int[] {70, 11, 2});
		System.out.println(result);
		
		result = solution(new int[] {100, 17, 84, 1}, new int[] {55, 12, 65, 36});
		System.out.println(result);
		
		result = solution(new int[] {1, 2, 3, 4, 5}, new int[] {3, 3, 3, 3, 3});
		System.out.println(result);
	}

}
