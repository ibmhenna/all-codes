
public class Student extends Human{

	void study() {
		System.out.println(getName()+" is studying");
	}
		
	Student(){//default constructor
		
	}
	Student(String name){//custom constructor
		setName(name);
	}
}
