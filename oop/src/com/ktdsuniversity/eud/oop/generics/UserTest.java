package com.ktdsuniversity.eud.oop.generics;

public class UserTest {
	
	public static void main(String[] args) {
		User<Integer, String> user01 = new User<>(1, "장민창");
		int id = user01.getId();
		String name = user01.getName();
		
		User<Integer, Long> user02 = new User<>(10, 30L);
		int id2 = user02.getId();
		Long name2 = user02.getName();
		
		System.out.println(id2);
		System.out.println(name2);
	}

}
