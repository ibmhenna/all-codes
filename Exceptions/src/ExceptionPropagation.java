
public class ExceptionPropagation {
	public static void main(String[] args) {
		new A().m1();		
	}
}

class A{
	void m1() {
		//handling exception
		try{
			m2();
		}catch (RuntimeException runtimeException) {//prints m2 then m1
			
			runtimeException.printStackTrace(); //prints m2, then throws exception and then prints m1
			}
		catch(Exception exception) {
			System.out.println("handled");
				
			}
		finally {
			System.out.println("Always executed");
		}
		System.out.println("m1");
	}
	void m2() throws Exception {
		System.out.println("m2");
//		throw new RuntimeException();
//		throw new Exception();
	}
}