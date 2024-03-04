

/**
 * @author hP
 * @version 1.0
 * @created 03-Mar-2024 2:54:40 AM
 */
public class Orders {

	public Customer m_Customer;
	public OrderHistory m_OrderHistory;
	public Payment m_Payment;
	public Product m_Product;
	private String customerID;
	private String deliveryDate;
	private String orderDate;
	private String orderID;
	private String orderStatus;
	private float totalAmount;
	private String vendorID;

	public Orders(){

	}

	public void finalize() throws Throwable {

	}

	public void applyPromoCode(){

	}

	public float displayTotalAmount(){
		return null;
	}

	public void placeOrder(){

	}
}//end Orders