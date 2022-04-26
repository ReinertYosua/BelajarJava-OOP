package FinalQuiz;

import java.util.*;

public class Cart {
    private List<OrderItem> cartItems;

    private static final Comparator<OrderItem> COMPARE_CARTITEM = new 
        Comparator<OrderItem>() {
            public int compare(OrderItem item1, OrderItem item2) {
                return item1.getProduct().getProductId().compareTo(item2.getProduct().getProductId());
            }
        };

    public Cart() {
        cartItems = new ArrayList<>();
    }

    public List<OrderItem> getCartItems() {
        return cartItems;
    }

    public void addToCart(Product p) {
        addToCart(p, 1);
    }

    public String toString() {
        String str = "Shopping cart:";
        for (OrderItem i : cartItems) {
            str += "\n" + i;
        }
        return str;
    }

    public void addToCart(Product p, int qty) {
        OrderItem item = new OrderItem(p, qty);
        int result = Collections.binarySearch(cartItems, item, COMPARE_CARTITEM);
        if (result < 0) {
            cartItems.add(item);
            cartItems.sort(COMPARE_CARTITEM);
        } else {
            OrderItem existingItem = cartItems.get(result);
            existingItem.setQty(existingItem.getQty() + qty);
            if (existingItem.getQty() == 0) {
                cartItems.remove(result);
            } 
        }
    }

    public void removeFromCart(Product p) {
        OrderItem item = new OrderItem(p, 1);
        int result = Collections.binarySearch(cartItems, item, COMPARE_CARTITEM);
        if (result >= 0) {
            cartItems.remove(result);
        }
    }

    public void emptyCart() {
        cartItems.clear();
    }
}