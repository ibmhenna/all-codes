package variablesDemo;

public class Book {
	int a=0; //instance variable
	void m() {
		int a=10; //local variable
		System.out.println(this.a);
		if(a==10) {
			int b = 20; //block level variable
		}
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Book book = new Book();
		book.m();
	}

}
