package com.ktdsuniversity.eud.oop.exam.string;

public class PracticeTwo {
	
	public static void main(String[] args) {
		
//		부분 문자열이란 문자열에서 연속된 일부분에 해당하는 문자열을 의미합니다. 
//		예를 들어, 문자열 "ana", "ban", "anana", "banana", "n"는 모두 문자열 
//		"banana"의 부분 문자열이지만, "aaa", "bnana", "wxyz"는 모두 "banana"의 부분 문자열이 아닙니다.

//		문자열 my_string과 target이 매개변수로 주어질 때, target이 문자열 my_string의 
//		부분 문자열이라면 1을, 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
//		지역변수는 항상 값을 넣어야함 , 멤버변수는 값을 안넣음
		
		String my_string = "";
		String target = "";
		
		boolean result = my_string.contains(target);
		if(result == true) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
