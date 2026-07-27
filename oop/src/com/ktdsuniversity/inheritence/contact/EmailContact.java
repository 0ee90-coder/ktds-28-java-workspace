package com.ktdsuniversity.inheritence.contact;

public class EmailContact extends Contact{
	
	private String email;
	
	public EmailContact(String name, String phone, String email) {
		super(name, phone); // 나의 기본 생성자를 호출해라 this(); > 부모의 생성자를 호출해라 super(); 
		this.email = email; // Contact의 (String name , String phone) 에 들어간다.
	}						// 형태가 다르더라도 부모 클래스의 생성자만 호출되면 아무 문제가 없다.		  
	
	public String getEmail() {
		return this.email;              
	}

}
