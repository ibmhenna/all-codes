
public class StringBuilderDemo {
	public static void main(String[] args) {
//		StringBuilder sb = "IBM"; //this will not work for stringbuilder but work with string
		StringBuilder sb = new StringBuilder("IBM"); //string builder won't go to string pool only string goes to string pol
		sb.append(",Bangalore"); //this is overloading
//		System.out.println(sb);
//		System.out.println(sb.charAt(3)); //outputs 4th character
//		System.out.println(sb.indexOf("B")); //outputs the first occurance position of B
		System.out.println(sb.lastIndexOf("B"));
		
//		String str = "IBM,Bangalore";
//		System.out.println(str == sb.toString()); //string object is not string builder,they are different datatype
		//false bcz string and string builder
		
//		String str = new String("IBM,Bangalore");
//		System.out.println(str == sb.toString());
		//false because we are comparing references of two object
		
//		String str = new String("IBM,Bangalore");
//		String str1 = new String("IBM,Bangalore");
//		System.out.println(str == sb.toString());  //outputs false
		
//		String str = new String("IBM,Bangalore");
//		String str1 = str;
//		System.out.println(str == sb.toString());//only one object is created and two references outputs true
		
//		sb.append(str);
//		System.out.println(sb);
		
		System.out.println(sb.substring(3));
		
	}

}
