package com.ktdsuniversity.eud.oop.collection.list;

import com.ktdsuniversity.edu.oop.cafe.ComicsBook;

public class ComicsTest {
	
	public static void main(String[] args) {
		ComicsBookCafe cafe = new ComicsBookCafe();
		cafe.addBook(new ComicsBook("만화책1 권", false, 600));
		
		
		cafe.displayBooks();
		
		Visitor v = new Visitor(10000);
		v.rent(cafe, 0);
		v.rent(cafe, 1);
		
	}

}
