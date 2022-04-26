package FinalQuiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductStockList {
	public static ProductStockList database;

    private List<ProductStock> productStocks;

    private static final Comparator<ProductStock> COMPARE_PRODUCT = new 
        Comparator<ProductStock>() {
            public int compare(ProductStock item1, ProductStock item2) {
                return item1.getProduct().getProductId().compareTo(item2.getProduct().getProductId());
            }
        };

    public ProductStockList() {
        productStocks = new ArrayList<>();
        
        database = this;
    }

    public synchronized void addStock(Product p, int qty) {
        if (qty <= 0) return;

        ProductStock ps = new ProductStock(p, qty);
        int result = Collections.binarySearch(productStocks, ps, COMPARE_PRODUCT);
        if (result < 0) {
            productStocks.add(ps);
            productStocks.sort(COMPARE_PRODUCT);
        } else {
            ProductStock existingStock = productStocks.get(result);
            existingStock.increaseProductQty(qty);
        }
    }

    public synchronized boolean reduceStock(Product p, int qty) {
        if (qty <= 0) return false;  
        
        ProductStock ps = new ProductStock(p, qty);
        int result = Collections.binarySearch(productStocks, ps, COMPARE_PRODUCT);
        if (result >= 0) {
            ProductStock existingStock = productStocks.get(result);
            return existingStock.decreaseProductQty(qty);
        }
        return false;
    }

    public synchronized int getStockQty(Product p) {
        ProductStock ps = new ProductStock(p, 1);
        int result = Collections.binarySearch(productStocks, ps, COMPARE_PRODUCT);
        if (result >= 0) {
            ProductStock existingStock = productStocks.get(result);
            return existingStock.getQty();
        }
        return 0;
    }

    public synchronized Product getProductAt(int index) {
        return productStocks.get(index).getProduct();
    }

    public synchronized int getProductCount() {
        return productStocks.size();
    }

    public synchronized boolean isEmpty() {
        return productStocks.isEmpty();
    }

    public String toString() {
        String str = "Product Stock List:" + String.format("\n%-13s%-30s%5s", "Product ID", "Product Name", "Quantity");

        for (ProductStock ps : productStocks) {
            str += "\n" + ps;
        }
        return str;
    }
}
