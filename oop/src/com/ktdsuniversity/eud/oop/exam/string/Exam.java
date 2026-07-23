package com.ktdsuniversity.eud.oop.exam.string;

public class Exam {
	
	public static void main(String[]args) {
	String address = "서울특별시 서초구 효령로 176";
	boolean isSeoul = address.contains("서울");
	System.out.println(isSeoul);

	String address2 = "서울특별시 서초구 효령로 176";
	boolean isSeoul2 = address2.startsWith("서울");
	System.out.println(isSeoul2);

	String address3 = "서울특별시 서초구 효령로 176";
	boolean isSeoul3 = address3.equals("서울");
	System.out.println(isSeoul3);
	
	String name = "ktdsuniversity";
	boolean isEqual = name.equalsIgnoreCase("ktdsUniversity");
	System.out.println(isEqual);
	
	String alphabets = "abcdefg";
	int letterDEFIndex = alphabets.indexOf("DEF");
	System.out.println(letterDEFIndex); //??
	
	
	String str = " ";
	boolean isBlank = str.isBlank();
	System.out.println(isBlank);
	
	String str2 = " ";
	boolean isEmpty = str2.isEmpty();
	System.out.println(isEmpty);
	
	String message = "안녕하세요";
	String name1 = "홍길동님";
	String helloMessage = String.join(",", message, name1);
	System.out.println(helloMessage);
	
	String message2 = "abcdefgaijkb";
	int letterALastIndex = message2.lastIndexOf("a");
	System.out.println(letterALastIndex);
	
	String message3 = "abcdefgaijkb";
	int letterJJLastIndex = message3.lastIndexOf("jj");
	System.out.println(letterJJLastIndex);
	
	String message4 = "abcdefgaijkb";
	int length = message4.length();
	System.out.println(length);
	
	String phone ="01012341234";
	boolean isNumber = phone.matches("^[0-9]+$");
	System.out.println(isNumber);
	
	String message5 = "안녕하세요, 홍길동님, 안녕히 가세요, 홍길동님.";
	message5 = message5.replace("홍길동", "ktds");
	System.out.println(message5);
	
	String phone2 = "010-1234-1234";
	phone2 = phone2.replaceAll("[^0-9]", "");
	System.out.println(phone2);
	
	String phone3 = "010-1234-1234";
	String[] phoneArea = phone3.split("-");
	System.out.println(phoneArea[0]);
	System.out.println(phoneArea[1]);
	System.out.println(phoneArea[2]);
	
	String phone4 = "+82-010-1234-1234";
	boolean isKoreaNum = phone4.startsWith("+32");
	System.out.println(isKoreaNum);
	
	String datetime = "2023-05-02 14:56:13";
	String year = datetime.substring(0, 4);
	System.out.println(year);
	
	//binding 값을 특정 부분에 대입한다.
	int biggestNumber = Integer.MAX_VALUE;
	System.out.println(biggestNumber); //214483647
	
	String numberString = "%,d".formatted(biggestNumber);
	System.out.println(numberString); // 2,147,483,647
	
	//format binding (static method)
//	String messageFormat = "%s에서 교육하는 %s과정, %d시간 %d일 과정, %f(%.2f)진행했습니다.",800,100,8/100d,8/100d);
//	
//			
//	String message2 = messageFormat.formatted(
//			"ktds University", "Java Programming", 800, 100, 8 / 100d, 8 / 100d);
//	System.out.println(message2);
	}
	
	
}
