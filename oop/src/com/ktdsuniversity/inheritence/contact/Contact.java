package com.ktdsuniversity.inheritence.contact;

public class Contact {
	
	private String name;
	private String phone;
	
//	public Contact(String name, String phone) {
//		this.name = name;
//		this.phone = phone;
//	}

	public Contact() {} // emailcontact에서 명시적으로 호출을 해줘야 오류가 나지 않음
	 
	public Contact(String name, String phone) {
		System.out.println("Contact 인스턴스를 생성합니다.");
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void printContact() {
		System.out.println("name:" + this.name);
		System.out.println("phone:" + this.phone);
	}

}
