

/**
 * @author hP
 * @version 1.0
 * @created 01-Mar-2024 1:13:34 PM
 */
public class Customer extends User {

	private String dateofbirth;
	private String name;
	private String orderHistory;
	private String shippingAddress;
	private Order shoppingCart;
	public Rating m_Rating;
	public Product m_Product;
	public Address m_Address;
	public Wishlist m_Wishlist;

	public Customer(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param userid
	 */
	public void displayName(int userid){

	}

	public int getuserid(){
		return 0;
	}

	public void addToCart(){

	}

	public void checkout(){

	}

	/**
	 * 
	 * @param userid
	 */
	public String getDateOfBirth(userid){
		return "";
	}

	public String getName(){
		return "";
	}

	public List<> getOrderHistory(){
		return null;
	}

	public String getShipingAddress(){
		return "";
	}

	public List<Order> getShoppingCart(){
		return null;
	}

	public void removeFromCart(){

	}

	public void setDateOfBirth(){

	}

	public void setName(){

	}

	public void setShipingAddress(){

	}

	public void updateQuantity(){

	}
}//end Customer