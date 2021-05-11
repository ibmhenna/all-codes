public class Order {
	private String orderNo;
	private String itemID;
	private int quantity;
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Order(String orderNo, String itemID, int quantity) {
		super();
		this.orderNo = orderNo;
		this.itemID = itemID;
		this.quantity = quantity;
	}
	public char[] Order() {
		
		return null;
	}
}
