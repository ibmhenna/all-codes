import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.ibm.Book;

public class ListDemo {
	public static void main(String[] args) {
		//demo1();
		bookList();
	}

	
	private static void bookList() {
		List<Book> books = new ArrayList<Book>();
		Book book1 = new Book("learn Java");
		book1.setPrice(20.0f); //f is used to indicate float
		book1.setPublishYear(1995);
		books.add(book1);
		Book book2 = new Book("teach Java");
		book2.setPrice(150.0f); //f is used to indicate float
		book2.setPublishYear(1897);
		books.add(book2);
		Book book3 = new Book("teach Java");
//		book3.setPrice(100.0f); //f is used to indicate float
//		book3.setPublishYear(2001);
//		books.add(book3);
		System.out.println(books);
		
//		books.add(new Book("learn javascript"));
//		System.out.println(books);
		
		//while: iterate with iterator
//		Iterator<Book> it = books.iterator();
//		while (it.hasNext()) {
//			Book book = it.next();
//			if(book.getTitle().contains("learn")) {
//				System.out.println(book);
//			}	
//		}
//		
		
		//sorting?
		//sort the books in ascending order of price
		books.sort(new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return (int) (book1.getPublishYear() - book2.getPublishYear());
			}
			
		});

		System.out.println("after sorting"+books);
	}



private static void demo1() {
		//type list, ctrl+space, select interface list
		List<Integer> list = new ArrayList<Integer>();	//<Integer> indicates that the list should contain integer only
		list.add(1);					//array list can grow upto any size as we add the elemets
		list.add(2);
		list.add(3);
//		list.add("Ram"); //this shows an error as the type is integer
		System.out.println(list);
		
		list.remove(2);					//removes third element
		System.out.println(list);
		
		System.out.println(list.contains(1)); //checks whether there is element in third position
		System.out.println(list.contains(3));
		
//		for :iterate over collection
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
			
		}
					
		}
		
}
