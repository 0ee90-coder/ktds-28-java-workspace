package com.ktdsuniversity.edu.fp.lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReference {
	
	public static void main(String[]args) {
		
		//문자를 숫자로 변경해본다.
		// "1234" => 1234
		String numberFormatString = "1234";

		// Lambda
		Function<String, Integer> toNumber = (str) -> Integer.parseInt(str);
		int num = toNumber.apply(numberFormatString);
		System.out.println(num);
		
		// Method Reference
		Function<String, Integer> toNumberRef = Integer::parseInt;  // class or instance :: method 
		int num2 = toNumberRef.apply(numberFormatString);
		System.out.println(num2);
		
		
		//문자를 문자의 길이로 변경해본다.
		// "abc" => 3, "aaaaa" => 5
		
		
		// Lambda
		Function<String, Integer>toLength=(str)-> str.length();
		int len = toLength.apply("abc");
		System.out.println(len);
		
		len = toLength.apply("aaaaa");
		System.out.println(len);
		
		// Method Reference
		String text = "abc";
		Function<String, Integer>toLengthRef = String::length;  // public static int parseInt(String s) , public int indexOf(String str) , public int length()
//		Function<String, Integer>indexOfRef = String::indexOf;
		Function<String, Integer>indexOfRef = text::indexOf; // 클래스가 아니라 인스턴스로 가져가라 
		int len2 = toLengthRef.apply("abc");
		System.out.println(len2);
		
		len2 = toLengthRef.apply("aaaaa");
		System.out.println(len2);
		
		Consumer<String> printer = (str) -> System.out.println(str);
		printer.accept("ㅇㄹㄴㄹㅇㄹㄴㅇ");
		
		Consumer<String> printRef = System.out::println;
		printRef.accept("asdsdsadsadsadsad");
		
	}

}
