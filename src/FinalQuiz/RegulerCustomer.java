package FinalQuiz;

import java.util.ArrayList;
import java.util.List;

public class RegulerCustomer extends Customer implements Runnable {
		
	private String  firstName,
    lastName;

	private Cart cart;
	
	public RegulerCustomer (String customerId, String firstName, String lastName) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		
		cart = new Cart();
	} 
	
	public void setFullName (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return firstName + " " + lastName;
	}
	
	public void addToCart(Product p, int qty) {
		cart.addToCart(p, qty);
	}
	
	public void removeFromCart(Product product) {
		cart.removeFromCart(product);
	}
	
		public void placeOrder() {
		if (cart.getCartItems().size() == 0)
		return;
		
		Order order = new Order(this);
		
		boolean flagSuccess = true;
		OrderItem problemOrder = new OrderItem();
		
		List<OrderItem> successOrderItems = new ArrayList<>();
		for (OrderItem i : cart.getCartItems()) {
			if (ProductStockList.database.reduceStock(i.getProduct(), i.getQty())) {
				successOrderItems.add(i); 
				order.addItem(i.getProduct(), i.getQty());
			} else {
				problemOrder = i;
				flagSuccess = false;
				break;
			}
		}
		if (flagSuccess) {
			cart.emptyCart();
		} else {
			order.setProblem("Product "+problemOrder.getProduct().getProductName() + 
			" not sufficient stock " + problemOrder.getQty() + " of " + 
			ProductStockList.database.getStockQty(problemOrder.getProduct()));
			returnStock(successOrderItems);
		}
		OrderList.database.addOrder(order);
	}
	
	private void returnStock(List<OrderItem> successOrderItems) {
		for (OrderItem i : successOrderItems) {
			ProductStockList.database.addStock(i.getProduct(), i.getQty());
		}
	}
	
	public void run() {
		try {
			ProductStockList psl = ProductStockList.database;
			int productCount = psl.getProductCount();
			for(int i=1; i<10; i++) {
			
			int randIndex = (int)(Math.random() * productCount);
			int randQty = (int)(Math.random() * 20);
			
			addToCart(psl.getProductAt(randIndex), randQty);
			
			Thread.sleep(100);
				if (i % 3 == 0) {
				    placeOrder();
				}
			}
		} catch (InterruptedException ex) {
		
		}
	}
}
