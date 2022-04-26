package FinalQuiz;

public class ProductStock {
	private Product product;
    private int qty;

    public ProductStock(Product p, int qty) {
        this.product = p;
        this.qty = qty;
    }

    public synchronized boolean decreaseProductQty(int reduction) {
        reduction = reduction < 0 ? 0 : reduction;
        if (this.qty - reduction < 0) {
            return false;
        } else {
            this.qty -= reduction;
            return true;
        }
    }

    public synchronized void increaseProductQty(int addition) {
        addition = addition < 0 ? 0 : addition;
        this.qty += addition;
    }

    public synchronized boolean isAvailable() {
        return qty > 0;
    }

    public synchronized int getQty() {
        return qty;
    }

    public Product getProduct() {
        return product;
    }

    public String toString() {
        String str = String.format("#%-13s%-30s%5d", product.getProductId(), product.getProductName(), qty);
        return str;
        // return "#" + product.getProductId() + ":" + product.getProductName() + "\t Qty:"+qty;
    }
}
