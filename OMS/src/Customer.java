public class Customer {
	private String name;
	private int phone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null | name.trim().contentEquals("")) {
			throw new IllegalArgumentException("name is mandatory");
		}
		this.name = name;

	}
	
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public Customer(String name, int phone) {
			super();
			this.name = name;
			this.phone = phone;
	}

	public char[] Customer() {
		// TODO Auto-generated method stub
		return null;
	}

}