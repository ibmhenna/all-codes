import DataWareHouse.STATUS;

public class DataWareHouse {
	public static void main(String[] args) {
		System.out.println("Name : ");
		Customer cust = new Customer("Henna", 6543210);
		System.out.println(cust.Customer());

		System.out.println("Address : ");
		Address a1 = new Address("Love Villa", "MG Road", "Thrissur", "Kerala");
		System.out.println(a1.Address());

		System.out.println("Order : ");
		Order order = new Order("OD15", "153233", 2);
		System.out.println(order.Order());

		System.out.println("Status : ");
		STATUS status1 = STATUS.DELIVERED;
		System.out.println(status1);
	}

}