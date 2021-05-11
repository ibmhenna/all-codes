
public class StringDemo {
	public static void main(String[] args) {
//		usingStringPool();
	//	withoutStringPool();
//		withStringBuilder();
		dataManipulation();
	}

	
	private static void dataManipulation() {
		String s1 = "IBM";
		System.out.println(s1);
		s1.concat(", Bangalore");
		System.out.println(s1);
	}


	private static void withStringBuilder() {
		StringBuilder s1 = new StringBuilder("IBM"); //string builders are stored in heap area
		StringBuilder s2 = new StringBuilder("IBM");
		System.out.println(s1 == s2);
	}


	private static void withoutStringPool() {
		String s1 = new String("IBM"); //heap
		String s2 = new String("IBM");
		System.out.println(s1 == s2);
		
	}
	private static void usingStringPool() {
		String s1 = "IBM"; //heap
		String s2 = "IBM";
		System.out.println(s1 == s2);
		
	}

}
