package com.ibm.set;

import java.util.HashSet;
import java.util.Set;

import com.ibm.Book;

public class SetDemo {

	public static void main(String[] args) {
		createBookSet();
	}

	private static void createBookSet() {
		Set<Book> books = new HashSet<Book>(); //ctrl+shift+O
		for (int i = 0; i < 4; i++) {
			Book book = new Book("Title"+i);
			book.setPrice(100 * i);
			book.setPublishYear(i+2000);
			books.add(book);
			books.add(book); //one set is added only once, no matter how many times it is added
		}
		System.out.println(books.size());
//		System.out.println(books);
	}

	
}
