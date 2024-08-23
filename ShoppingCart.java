
/**
 * Defines the operations for a shopping cart, including adding, removing, 
 * and querying items, as well as calculating prices.
 */
public interface ShoppingCart {

	/**
	 * Counts all of the items in the cart
	 * 
	 * @return the total number of items
	 */
	public int countItems();

	/**
	 * Checks if the cart is empty
	 * 
	 * @return true if the cart is empty, false otherwise
	 */
	public boolean isEmpty();

	/**
	 * Adds a new Item to the cart
	 * 
	 * @param newItem the Item to add to the cart
	 * @return true if successful, false if operation failed
	 */
	public boolean addItem(Item newItem);

	/**
	 * Removes a random item from the cart
	 * 
	 * @return Item if successful, null if operation failed
	 */
	public Item removeItem();

	/**
	 * Removes a specific item from the cart
	 * 
	 * @param i the Item to remove
	 * @return true if successful, false if operation failed
	 */
	public boolean removeItem(Item i);
	
	/**
	 * Checks if the item is present in the cart
	 * 
	 * @param i the Item to look for
	 * @return true if successful, false if operation failed
	 */
	public boolean contains(Item i);

	/**
	 * Clears all items from the cart
	 */
	public void clearItems();

	/**
	 * Gets a specific item from the cart
	 * 
	 * @param index of the item to retrieve
	 * @return The specified Item
	 */
	public Item getItem(int index);

	/**
	 * Counts the quantity of a specific item in the cart
	 * 
	 * @param i the Item to count
	 * @return The quantity of the item
	 */
	public int itemCount(Item i);

	/**
	 * Gets the price of a specific item
	 * 
	 * @param i The Item to check the price of
	 * @return The price of the item
	 */
	public double itemPrice(Item i);

	/**
	 * Calculates the total cost of all items in the cart combined
	 * 
	 * @return The total price
	 */
	public double totalPrice();

	/**
	 * Adds the string representations of all items to an array
	 * 
	 * @return The array of items
	 */
	public String[] listItems();

}
