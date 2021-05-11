package com.ibm.map;

import java.util.HashMap;
import java.util.Map;

import com.ibm.Book;

public class MapDemo {
	public static void main(String[] args) {
		createMapofBooks();
		
	}

	private static void createMapofBooks() {
		Map<String, Book> books = new HashMap<String, Book>();
		System.out.println(books.size());
//		Book book1 = new Book("Java");
//		books.put("book1", book1); //put is used in map instead of add
//		System.out.println(books.size());
		
		for (int i = 0; i < 10; i++) {
			Book book1 = new Book("Title");
			books.put("book1"+i, book1);
			}
		
		System.out.println(books.size());
		System.out.println(books);
		
//		books.clear();
//		books.remove("book1");
		books.containsKey(books);
		System.out.println(books.size());
	}
	

}
