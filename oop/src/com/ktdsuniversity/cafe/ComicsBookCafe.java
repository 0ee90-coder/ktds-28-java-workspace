package com.ktdsuniversity.cafe;



public class ComicsBookCafe {
	
	private int take;
	private ComicsBook[] books;
	
	public ComicsBookCafe(ComicsBook[] books) {
		this.books = books;
	}
	
	// 기능 : 모든 만화책 목록 출력 , 만화책 대여 , 만화책 반납

	public void displayBooks() {  //1번
		System.out.println("==== 만화책 목록 ====");
		for(int i = 0; i<this.books.length; i++) {

			ComicsBook book = this.books[i];
			
			String state = "대여 가능";
			
			if(book.getIsRented()) {
				state = "대여중";
			}
			
			System.out.println("만화책 번호:"+ i);
			System.out.println("만화책 이름:"+ book.getName());
			System.out.println("만화책 대여 상태:" + state);
			System.out.println("만화책 대여비:" + book.getRentFee());
		}
	}
	
	public void takeRentFee(int fee) {
		this.take += fee;
	}
	
	public ComicsBook[] getBooks() {
		return this.books;
	}
}
