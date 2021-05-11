package dataConversion;

class Student extends Human{
	public Student(String name) {
		name=this.name;
//		this.name=name;
	}
	
	void eat() {
		super.eat();
		System.out.println("student eats");
	}

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

