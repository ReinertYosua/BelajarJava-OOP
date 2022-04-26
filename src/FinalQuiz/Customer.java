package FinalQuiz;

public abstract class Customer {

    protected String customerId;

    public void setCustomerId (String val) {
        this.customerId = val;
    }
    public String getCustomerId() {
        return customerId;
    }

    public abstract void addToCart(Product product, int qty);
    public abstract void removeFromCart(Product product);
    public abstract void placeOrder();
}
