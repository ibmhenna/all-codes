class RedException extends Exception{}
class BlueException extends Exception{}

class White{
//	void m1() throws ColorException {throw new ColorException();}
	void m1() throws RedException {throw new RedException();}
	public static void main(String[] args) {
		White white = new White();
		int a,b,c,d; a=b=c=d=0;
//		try {white.m1(); a++;} catch (ColorException e) {b++;}
		try {white.m1(); a++;} catch (RedException e) {b++;}
		catch (BlueException e) {c++;}
		finally {d++;}
		System.out.println(a+","+b+","+c+","+d);
	}

}
