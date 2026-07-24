package com.ktdsuniversity.eud.oop.exam.array;

import java.util.Arrays;

public class P181853 {
	
//	정수로 이루어진 리스트 num_list가 주어집니다. 
//	num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 return 하도록 
//	solution 함수를 완성해주세요.
	
	
	public static void main(String[] args) {
		int [] num_list = new int [] {12, 4, 15, 46, 38, 1, 14};
		Arrays.sort(num_list);
		for(int i=0; i < 5; i++) {
			System.out.println(num_list[i]);
		}
	}
}
