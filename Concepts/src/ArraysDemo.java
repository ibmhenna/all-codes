
public class ArraysDemo {
	public static void main(String[] args) {
		int[] scores = new int[10];
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);	//prints 10 0s as the length of the array is 10 and by default the value stored is 0
		}
		int[] numbers = {1,2,3,4};
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);	//prints 1,2,3,4 as the length is 4 and the 4 values are declared			
		}
		
		boolean[] booleans = {true, false};
		for (boolean value : booleans ) { //forEach loop, no need for i
			System.out.println(value);
		}
		
		String[] names = new String[10]; 
		for (String name : names) {
			System.out.println(name); //prints null for length 10
		}
		
		String[] names1 = new String[10]; //not creating string object, but creating array of string objects//Thus no string object is created//Creates an array object with capacity 10
		for (String name : names1) {
			name = new String("Ram"); //goes to heap, 10 objects are created and each compartment refers to each object
			System.out.println(name); //prints null for length 10
		}
		
		String[] names2 = new String[10]; //not creating string object, but creating array of string objects//Thus no string object is created//Creates an array object with capacity 10
		for (String name : names2) {
			name = "Ram"; //goes to string pool, only one object is created and each compartment refers to that particular object
			System.out.println(name); //prints null for length 10
		}
		
		//creating array for 10 students
		Student[] students = new Student[10];
		for (int i = 0; i < students.length; i++) {
			Student student = new Student("Ram"+i);
			students[i]=student;
//			if (i == 5)
	//			break;
			}
		
		System.out.println("length"+students.length); //to find length of array, legth is a property, not a method
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].getName()); //this gives null point exception as there are 10 positions declared and only 5 are filled because of break statement used
		}
		students[10]=new Student("shyam"); //this gives array exception as we are creating a 11th element
	}
}

class Student{
	private String name;
	
	public Student(String name) {
		super();
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}