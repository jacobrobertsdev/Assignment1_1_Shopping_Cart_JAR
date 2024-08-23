public class CartDemo {

	public static void main(String[] args) {

		// Create a new cart with default size
		Cart cart = new Cart();
		System.out.println("Created a new cart.\n");

		// Test countItems method
		System.out.println("Testing countItems method:");
		System.out.println("Total items in cart: " + cart.countItems() + "\n");

		// Test isEmpty method
		System.out.println("Testing isEmpty method:");
		System.out.println("Is cart empty? " + cart.isEmpty() + "\n");

		// Create some items
		Item item1 = new ShoppingCartItem("Apple", 0.99);
		Item item2 = new ShoppingCartItem("Banana", 1.29);
		Item item3 = new ShoppingCartItem("Orange", 1.49);
		Item item4 = new ShoppingCartItem("Milk", 2.49);
		Item item5 = new ShoppingCartItem("Bread", 1.99);

		// Test addItem method
		System.out.println("Testing addItem method:");
		System.out.println("Add Apple: " + cart.addItem(item1));
		System.out.println("Add Banana: " + cart.addItem(item2));
		System.out.println("Add Orange: " + cart.addItem(item3));
		System.out.println("Add Milk: " + cart.addItem(item4));
		System.out.println("Add Bread: " + cart.addItem(item5) + "\n");

		// Test countItems method again after adding items
		System.out.println("Testing countItems method after adding items:");
		System.out.println("Total items in cart: " + cart.countItems() + "\n");

		// Test listItems method
		System.out.println("Testing listItems method:");
		String[] itemsList = cart.listItems();
		for (String item : itemsList) {
			System.out.println(item);
		}
		System.out.println();

		// Test totalPrice method
		System.out.println("Testing totalPrice method:");
		System.out.println("Total price of items in cart: $" + cart.totalPrice() + "\n");

		// Test contains method
		System.out.println("Testing contains method:");
		System.out.println("Contains Apple? " + cart.contains(item1));
		System.out.println("Contains Orange? " + cart.contains(item3));
		System.out.println("Contains Grapes? " + cart.contains(new ShoppingCartItem("Grapes", 2.99)) + "\n");

		// Test itemCount method
		System.out.println("Testing itemCount method:");
		System.out.println("Count of Banana: " + cart.itemCount(item2) + "\n");

		// Test itemPrice method
		System.out.println("Testing itemPrice method:");
		System.out.println("Price of Milk: $" + cart.itemPrice(item4) + "\n");

		// Test removeItem method
		System.out.println("Testing removeItem method:");
		System.out.println("Removed item: " + cart.removeItem() + "\n");

		// Test isEmpty method again after removing an item
		System.out.println("Testing isEmpty method after removing an item:");
		System.out.println("Is cart empty? " + cart.isEmpty() + "\n");

		// Test countItems method again after removing an item
		System.out.println("Testing countItems method after removing an item:");
		System.out.println("Total items in cart: " + cart.countItems() + "\n");

		// Test getItem method
		System.out.println("Testing getItem method:");
		Item retrievedItem = cart.getItem(0);
		System.out.println("Item at index 0: " + retrievedItem + "\n");

		// Test clearItems method
		System.out.println("Testing clearItems method:");
		cart.clearItems();
		System.out.println("Cart cleared.");
		System.out.println("Total items in cart after clearing: " + cart.countItems() + "\n");

		// Re-add items to the cart
		System.out.println("Re-adding some items to the cart:");
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		cart.addItem(item4);
		cart.addItem(item5);
		System.out.println("Items re-added.\n");

		// Test listItems method after re-adding items
		System.out.println("Testing listItems method after re-adding:");
		itemsList = cart.listItems();
		for (String item : itemsList) {
			System.out.println(item);
		}
		System.out.println();

		// Test remove specific item
		System.out.println("Testing remove specific item:");
		System.out.println("Removing Orange: " + cart.removeItem(item3) + "\n");

		// Test listItems method after removing Orange
		System.out.println("Testing listItems method after removing Orange:");
		itemsList = cart.listItems();
		for (String item : itemsList) {
			System.out.println(item);
		}
		System.out.println();

	}
}
