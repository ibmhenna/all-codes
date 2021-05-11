
public class AccessModifiers {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.age);
	}

}

class A {
	int ge = 0;
}

class B extends A{

}