
public class School {
	public static void main(String[] args) {
//		Teacher teacher = new Teacher("Shyam");
		
		printPattern();
	}

		private static void printPattern() {
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<=i+1;j++)
				{
					System.out.print("*");
				}
				System.out.println("");
			}
		
		int i = 0;
		
//		for(int i=0; i<10; i++) {
//			Teacher teacher = new Teacher("Shyam"+i);
			
//		}
			
		while (i<10) {
			System.out.println(i);
		i++;
		}
		
		
	}
	


	void studentDiscussion() {
	
		System.out.println("Hello");
		Student student = new Student("Ram");
		student.setAge((byte)10);
//		student.setName("");
//		student.name="Ram";
		System.out.println("Name"+student.getName());
		System.out.println(student.getAge());
	}

}
