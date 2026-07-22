package com.ktdsuniversity.cafe;

public class ComicsBook {
	/** 만화책 이름 */
	private String Name;
	/** 만화책 대여 상태 */
	private boolean isRented;
	/** 만화책 대여비 */
	private int rentFee;
	
	public ComicsBook(String Name, int rentFee, boolean isRented) {
		this.Name = Name;
		this.rentFee = rentFee;
		this.isRented = isRented;
	}
	
	public String getName() {
		return this.Name;
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
