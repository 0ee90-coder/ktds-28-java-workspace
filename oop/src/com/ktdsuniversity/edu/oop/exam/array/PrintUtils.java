package com.ktdsuniversity.edu.oop.exam.array;

public class PrintUtils {

	public static void print(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
	public static void print(String[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\"" + arr[i] + "\"");
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
	
}
