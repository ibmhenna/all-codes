package com.ibm;

class Book {
	private String title;

	public String getTitle() {
		return title;
	}

//	public void setTitle(String title) {
//		if(title == null) {
//			throw new IllegalArgumentException();//this is unchecked exception,throw exception
//		}
//		this.title = title;
//	}
	
	public void setTitle(String title) throws Exception {
		if(title == null) {
			throw new Exception();
			}
		this.title = title;
	}
	
	
	@Override
	public String toString() {
		return this.title;
	}
}

public class Application {
	public static void main(String[] args) {
//		Book book = new Book();
//		System.out.println(book.toString());//this alone will give hash code in hexa decimals
		
//		Book book1 = new Book();
//		System.out.println(book1.toString());//this give another hash code
	
//		Book book = new Book();
//		book.setTitle("Learning Java");
//		System.out.println(book.toString());
//		Book book1 = new Book();
//		book1.setTitle("learning Java script");
//		System.out.println(book1.toString());
		
		Book book = new Book();
		try {		//every try should have atleast one catch
			book.setTitle("Ram");
		}
		catch(IllegalArgumentException IllegalArgumentException) { //this is more specific than simple exception
		} 
		catch (Exception e) {	//catch block
			e.printStackTrace();
		}
		finally { //optional
			System.out.println("always");
		}
		System.out.println(book.toString());
//		Book book1 = new Book();
//		book1.setTitle("learning Javascript");
//		System.out.println(book1.toString());
		
	}
}


//exceptions are objects in java.
//two problems : errors and exceptions
//errors are not recoverable eg:out of memory
//exceptions are recoverable
//two types: checked and unchecked exceptions
//unchecked also called run time exception
//