
public class StackOverflowDemo {
	public static void main(String[] args) {
		callMe();
		
	}

	private static void callMe() {
		callMe(); //calling same method//this will keep running for several steps till stack is full
		System.out.println("Called");
	}
}
//errors are non recoverable
//exceptions can be handled
//out of memory, stack overflow are errors
