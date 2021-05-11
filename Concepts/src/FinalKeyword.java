//final is used to avoid overriding
//final can be used with class, method and variables
//if we don't want a class to be inherited by any other classes we use final
//polymorphism: JVM decides whether parent or child method should be called

public class FinalKeyword {
	public static void main(String[] args) {
		
//		Child child = new Child();
//		child.m1();		//gives "Child" as output if final is not used with method in parent class
		
//		Parent child = new Parent();
//		child.m1();		//gives "Parent" as output
		
		Parent child = new Child();
		child.m1();		//gives "Child" as output
	}
}

class Parent{
	final String name = "Henna";
	void m1() { //if final is used, child class can't override
		System.out.println("Parent");
	}
	
	void m2() {
		
	}
}

class Child extends Parent{
	void m1() { //override
		System.out.println("Child");
	}
	@Override //to make the code more robust
	void m2() {
		
	}
}

