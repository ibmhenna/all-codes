
public class VarargsDemo {
	public static void main(String[] args) {
		int result = add(2,3,4,5);
		System.out.println(result);
		int result1 = add1("ram",2,3,4,5,6);
		System.out.println(result1);
		}
	
//	static int add(int a, int b) {//this is possible only if we have two inputs
//		return a+b;
//	}
	
	static int add(int...numbers) { //varargs
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(numbers[1]);
		return sum;
	}
		
	static int add1(String name, int...numbers) { //string and everything should come before varargs if thereare different datatypes
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(numbers[1]);
		return sum;
	}


}

//A book "has an" author or A book "has " multiple authors
class Book{
	private String genre;
	private Author[] authors;
	
	Book(){
		authors = new Author[3]; //lazy initialization
	}
	
	class Author{
		private String name;
		private String email;
	}
}