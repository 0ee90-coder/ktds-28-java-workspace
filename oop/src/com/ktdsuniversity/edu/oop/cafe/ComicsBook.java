package com.ktdsuniversity.edu.oop.cafe;

public class ComicsBook {

	private String name;
	private boolean isRented;
	private int rentFee;

	public ComicsBook(String name, boolean isRented, int rentFee) {
		this.name = name;
		this.isRented = isRented;
		this.rentFee = rentFee;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean getIsRented() {
		return this.isRented;
	}

	public int getRentFee() {
		return this.rentFee;
	}
	
	public void rent() {
		this.isRented = true;
	}
	
	public void returnBook() {
		this.isRented = false;
	}
	
}
