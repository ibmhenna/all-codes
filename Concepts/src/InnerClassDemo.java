//class inside a class
public class InnerClassDemo {
	public static void main(String[] args) {
		//array of 10 account objects
		Account[] accounts = new Account[10];
		}
	}

class Account{
//	private Address address; //define one address
	private Address[] addresses; //defines more than one address
	private int number;
	
	public Account() {
		this.addresses = new Address[3];	 //lazy initialization, array is declared inside the constructor, standard optimization technique	
	}
	
	public Address[] getAddress() {
		return addresses;
	}
	public void setAddress(Address[] address) {
		this.addresses = address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	private class Address{
		private String streetName;
		private String city;
	}
}