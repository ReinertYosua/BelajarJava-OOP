package FinalQuiz;

public class Product {
	private String id, name;
    private double price;

    public Product(String id, String name, double p) {
        this.id = id;
        this.name = name;
        price = p;
    }

    public String getProductId() {
        return id;
    }
    public String getProductName() {
        return name;
    }
    public double getProductPrice () {
        return price;
    }
}
