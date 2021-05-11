//METHOD OVERLOADING
public class MethodOverloading1 {
	public static void main(String[] args) {
		Result2 r1 = new Result2();
		r1.result();
		r1.result("PASS");
		r1.result("RAM","PASSED",95);
	}

}

class Result2{
	public void result() {
		System.out.println("Results..");	
	}
	public void result(String s1) {
		System.out.println(s1);
	}
	public void result(String s1, String s2, int mark) {
		System.out.println(s1+" is "+s2+" with "+mark+"marks");
	}
}
