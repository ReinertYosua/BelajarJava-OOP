package FinalQuiz;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
	public static OrderList database;
    private List<Order> orders;

    public OrderList() {
        orders = new ArrayList<>();
        database = this;
    }

    public synchronized void addOrder(Order o) {
        orders.add(o);
    }
    
    public String getSuccessOrder() {
        String str = "Completed Orders:\nOrder ID\t\t Customer ID\t"+String.format("%-17s","Total Price")+"\tProducts";
        for (Order o : orders) {
            if (o.getStatus() == false) continue;
            str += "\n" + o;
        }
        return str;
    }

    public String getFailedOrder() {
        String str = "Failed Orders:\nOrder ID\t\t Customer ID\t\tProblem";
        for (Order o : orders) {
            if (o.getStatus()) continue;
            str += "\n" + o.problem();
        }
        return str;
    }
}
