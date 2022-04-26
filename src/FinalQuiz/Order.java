package FinalQuiz;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private List<OrderItem> orderItems = new ArrayList<>();
    private double totalPrice;
    private boolean status;
    private Customer customer;
    private String orderId;
    private String problem;

    public Order(Customer customer) {
        this.customer = customer;
        status = true;

        String cid = customer.getCustomerId();

        orderId = System.nanoTime() + "" + cid.charAt(0) + cid.charAt(cid.length()-1);
    }

    public void addItem(Product p, int qty) {
        orderItems.add(new OrderItem(p, qty));
        calculateTotalPrice();
    }

    private void calculateTotalPrice () {
        totalPrice = 0;
        for (OrderItem i : orderItems) {
            totalPrice += i.getSubTotal();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setProblem(String problem) {
        status = false;
        this.problem = problem;
    }

    public boolean getStatus() {
        return status;
    }

    public String toString() {
        String str = "";
        for(OrderItem i : orderItems) {
            str += i.getProduct().getProductName() + "(x"+i.getQty()+") ";
        }

        return orderId + "\t " + customer.getCustomerId() + "\t " + String.format("Rp%15.2f",totalPrice) + "\t " + str;
    }

    public String problem() {

        return orderId + "\t " + customer.getCustomerId() + "\t " + problem;
    }
}
