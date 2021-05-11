
public class Address {
	private String houseName;
	private String streetName;
	private String city;
	private String state;
	
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		if(houseName == null | houseName.trim().contentEquals("")) {
			throw new IllegalArgumentException("Housename is mandatory");
		}
		this.houseName = houseName;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		if(streetName == null | streetName.trim().contentEquals("")) {
			throw new IllegalArgumentException("name is mandatory");
		}
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		if(city == null | city.trim().contentEquals("")) {
			throw new IllegalArgumentException("name is mandatory");
		}
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		if(state == null | state.trim().contentEquals("")) {
			throw new IllegalArgumentException("name is mandatory");
		}
		this.state = state;
	}
	public Address(String houseName, String streetName, String city, String state) {
		super();
		this.houseName = houseName;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
	}
	public char[] Address() {
	
		return null;
	}

}
