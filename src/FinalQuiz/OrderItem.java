package FinalQuiz;

public class OrderItem {
	private Product product;
    private int qty;
    private double subTotal;

    public OrderItem() {}

    public OrderItem(Product p, int qty) {
        this.product = p;
        this.qty = qty;
        calcSubTotal();
    }

    public void setQty(int qty) {
        this.qty = qty;

        if (this.qty < 0) {
            this.qty = 0;
        }
        calcSubTotal();
    }

    private void calcSubTotal() {
        subTotal = this.qty * this.product.getProductPrice();
    }

    public int getQty() {
        return this.qty;
    }

    public Product getProduct() {
        return product;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public String toString() {
        return "#" + product.getProductId() + ":" + product.getProductName() + " Qty:" + qty + " SubTotal:" + subTotal;
    }
}
