
/**
 * ShoppingCartItem is a class that implements the interface Item to represent
 * an item that may be added to a shopping cart. Includes a name and a price for
 * the item.
 *
 */
public class ShoppingCartItem implements Item {

	private String name;
	private double price;

	/**
	 * Default constructor.
	 * 
	 */
	public ShoppingCartItem() {
		setName("");
		setPrice(0.00);
	}

	/**
	 * Preferred constructor.
	 * 
	 */
	public ShoppingCartItem(String name, double price) {
		setName(name);
		setPrice(price);
	}

	@Override
	/**
	 * Gets the name of the Item
	 * 
	 * @return The Item name
	 */
	public String getName() {
		return this.name;
	}

	@Override
	/**
	 * Sets the name of the Item
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	/**
	 * Gets the price of the Item
	 * 
	 * @return The Item price
	 */
	public double getPrice() {
		return this.price;
	}

	@Override
	/**
	 * Sets the price of the Item
	 * 
	 */
	public void setPrice(double price) {
		this.price = price;

	}

	@Override
	/**
	 * Creates a String representation of the Item data
	 * 
	 * @return The String of Item data
	 */
	public String toString() {
		return "ShoppingCartItem: name = " + name + ", price = " + price;
	}

}
