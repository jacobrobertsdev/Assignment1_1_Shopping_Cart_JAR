package src;

/**
 * Cart is a class that implements the interface ShoppingCart to represent a
 * shopping cart that can hold items. Uses the ResizableArrayBag class to hold a
 * resizable array of items.
 *
 */


public class Cart implements ShoppingCart {

	private ResizableArrayBag<Item> items;

	/**
	 * Default constructor. Sets items length to the default size (25)
	 * 
	 */
	public Cart() {
		items = new ResizableArrayBag<Item>();
	}

	/**
	 * Preferred constructor. Sets items length to the specified size
	 * 
	 */
	public Cart(int size) {
		items = new ResizableArrayBag<Item>(size);
	}

	@Override
	/**
	 * Counts all of the items in the cart
	 * 
	 * @return the total number of items
	 */
	public int countItems() {
		return items.getCurrentSize();
	}

	@Override
	/**
	 * Checks if the cart is empty
	 * 
	 * @return true if the cart is empty, false otherwise
	 */
	public boolean isEmpty() {
		return items.isEmpty();
	}

	@Override
	/**
	 * Adds a new Item to the cart
	 * 
	 * @param newItem the Item to add to the cart
	 * @return true if successful, false if operation failed
	 */
	public boolean addItem(Item newItem) {
		return items.add(newItem);
	}

	@Override
	/**
	 * Removes a random item from the cart
	 * 
	 * @return Item if successful, null if operation failed
	 */
	public Item removeItem() {
		Item removed = (Item) items.remove();
		return removed;
	}

	@Override
	/**
	 * Removes a specific item from the cart
	 * 
	 * @param i the Item to remove
	 * @return true if successful, false if operation failed
	 */
	public boolean removeItem(Item i) {
		return items.remove(i);
	}

	@Override
	/**
	 * Clears all items from the cart
	 */
	public void clearItems() {
		items.clear();
	}

	@Override
	/**
	 * Gets a specific item from the cart
	 * 
	 * @param index of the item to retrieve
	 * @return The specified Item
	 */
	public Item getItem(int index) {
		return items.removeEntry(index);
	}
	
	/**
	 * Checks if the item is present in the cart
	 * 
	 * @param i the Item to look for
	 * @return true if successful, false if operation failed
	 */
	public boolean contains(Item i) {
		return items.contains(i);
	}

	@Override
	/**
	 * Counts the quantity of a specific item in the cart
	 * 
	 * @param i the Item to count
	 * @return The quantity of the item
	 */
	public int itemCount(Item i) {
		return items.getFrequencyOf(i);
	}

	@Override
	/**
	 * Gets the price of a specific item
	 * 
	 * @param i The Item to check the price of
	 * @return The price of the item
	 */
	public double itemPrice(Item i) {
		// TODO Auto-generated method stub
		return i.getPrice();
	}

	@Override
	/**
	 * Calculates the total cost of all items in the cart combined
	 * 
	 * @return The total price
	 */
	public double totalPrice() {
		
		Object[] array = items.toArray();
		double total = 0.0;

		for (Object item : array) {
			Item cartItem = (Item) item;
			
			total += cartItem.getPrice();
		}

		return total;
	}

	@Override
	/**
	 * Adds the string representations of all items to an array
	 * 
	 * @return The array of items
	 */
	public String[] listItems() {
	    // Get the array of items
	    Object[] array = items.toArray();
	    String[] stringArray = new String[array.length];

	    for (int i = 0; i < array.length; i++) {
	    	Item cartItem = (Item) array[i];
	        stringArray[i] = cartItem.toString();
	    }

	    return stringArray;
	}

}
