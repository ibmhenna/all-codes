//METHOD OVERLOADING

import java.util.logging.Logger;

public class OverLoadingDemo {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.study(2, "MATHS");
		s1.study(2);
		s1.study();
	}
}

//same method name, different number and types of arguments, access could be anything
class Student1{
	public void study(int duration, String subject) {
		System.out.println("Study "+subject+" for "+duration+" hours");
	}
	public void study(int duration) {
		System.out.println("Study for "+duration+" hours");
	}

	public static void study() {
		System.out.println("Study...");
		
	}
}