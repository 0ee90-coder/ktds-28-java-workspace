package com.ktdsuniversity.eud.oop.file;

public class RecursiveCallExam {
	
	public static void explore(int number) {
		
		System.out.println("현재 번호는" + number + "입니다.");
		if(number < 10) {
		explore(number+1);					// 내가 나를 호출 하는 것.
		}
		
		System.out.println("현재 번호는"+ number + "입니다.");
	}
	
	public static void main(String[] args) {
		explore(0);
	}

}
