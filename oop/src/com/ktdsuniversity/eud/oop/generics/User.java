package com.ktdsuniversity.eud.oop.generics;

public class User <I, N> { // I는 String N은 int 주자
	
	private I id;
	private N name;
	
	public User(I id, N name) {
		this.id = id;
		this.name = name;
	}

	public I getId() {
		return this.id;
	}
	
	public N getName() {
		return this.name;
	}
}
