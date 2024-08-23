/**
 * Represents a shopping cart item with a name and price. Provides methods to get and set the 
 * item's name and price, and to obtain a string representation of the item.
 */
public interface Item {

	/**
	 * Gets the name of the Item
	 * 
	 * @return The Item name
	 */
	public String getName();

	/**
	 * Sets the name of the Item
	 * 
	 */
	public void setName(String name);

	/**
	 * Gets the price of the Item
	 * 
	 * @return The Item price
	 */
	public double getPrice();

	/**
	 * Sets the price of the Item
	 * 
	 */
	public void setPrice(double price);

	/**
	 * Creates a String representation of the Item data
	 * 
	 * @return The String of Item data
	 */
	public String toString();
}
