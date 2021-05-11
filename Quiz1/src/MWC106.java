
public class MWC106 {
	public static void main(String[] args) {
		String s1 = "1", s2="2",s3=s1+s2;
		s1+=s2; s3+=s1;	
		System.out.println(s3);
	}
	
//	static void m1(String s1) {
//		s1=s1.toUpperCase(); System.out.println(s1);
//	}
//	
//	static void m2(String s1) {
//		s1.toLowerCase(); System.out.println(s1);
//	}
}
