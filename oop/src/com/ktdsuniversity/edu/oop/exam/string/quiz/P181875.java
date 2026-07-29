package com.ktdsuniversity.edu.oop.exam.string.quiz;

public class P181875 {

	public static String[] solution(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			if (i % 2 == 0) {
				strArr[i] = strArr[i].toLowerCase();
			}
			else {
				strArr[i] = strArr[i].toUpperCase();
			}
		}
		return strArr;
	}
	
	public static void main(String[] args) {
		String[] strArr = solution(new String[] {"AAA", "BBB", "CCC", "DDD"});
		for (String str : strArr) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		strArr = solution(new String[] {"aBc", "AbC"});
		for (String str : strArr) {
			System.out.print(str + " ");
		}
	}
	
}
