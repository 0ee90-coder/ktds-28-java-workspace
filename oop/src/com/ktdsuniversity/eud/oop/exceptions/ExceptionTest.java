package com.ktdsuniversity.eud.oop.exceptions;

public class ExceptionTest {
	
	public void main (String[] args) {
		
		String name = null;
		
		// name 이라는 인스턴스의 값이 null 이라면 "이름을 입력해주세요" 를 출력한다.
		// name 이라는 인스턴스의 값이 null 이 아니라면 값을 출력한다.
		if (name == null) {
			System.out.println("이름을 입력해주세요");
		} else {
			System.out.println(name);
		}
		
		
		String job = "";	// "" 대신 null 이 되면 nullpointerEception 뜸
		
		// job 이라는 인스턴스의 값이 "" 이라면 "직업을 입력해주세요"를 출력한다.
		// 아니라면 값을 출력한다.
												// isBlank 대신 trim을 함 그러면 " " 
												// => "" 그다음 length()==0  job.trim().length() == 0
		if (job == null || job.isBlank()) {		// 논리연산자 생각 && false 먼저 , || true 먼저 
			System.out.println("직업을 입력해주세요"); 
		} else {
			System.out.println(job);
		}
		
		
//		String address = "   ";
		
		// address 라는 인스턴스의 값이 공백으로만 이루어져 있다면 "주소를 입력해주세요"를 출력한다.
		// 아니라면 값을 출력한다.
		
//		if (address.isBlank()) {
//			System.out.println("주소를 입력해주세요.");
//		} else {
//			System.out.println(address);
//		}
		
		String address = "    ";
		String message = StringUtils.emptyToDefault(address, "주소를 입력해주세요");
		System.out.println(message);
	}

}
