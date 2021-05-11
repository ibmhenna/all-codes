
public class Human {
	private String name;
	private byte age;	//in years
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name == null | name.trim().contentEquals("")) {
			throw new IllegalArgumentException("name is mandatory");
		}
		this.name = name;
		
	}

	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}


}
