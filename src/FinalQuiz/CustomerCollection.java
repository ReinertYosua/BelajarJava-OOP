package FinalQuiz;

import java.util.Comparator;
import java.util.Vector;

public class CustomerCollection extends Thread {
	private Vector<Customer> customers;

    private static final Comparator<Customer> COMPARE_CUSTOMER = new 
        Comparator<Customer>() {
            public int compare(Customer user1, Customer user2) {
                return user1.getCustomerId().compareTo(user2.getCustomerId());
            }
        };

    public CustomerCollection () {
        customers = new Vector<Customer>();
    }

    public int size() {
        return customers.size();
    }

    public Boolean addUser (String id) {
        
        RegulerCustomer newUser = new RegulerCustomer(id, "", "");

        Thread c = new Thread(newUser, id);
        c.start();

        customers.add(newUser);

        return true;
    }

    public void run() {
        
        try {
            String str = "Customer List\nNo\tCustomer ID";
            System.out.println("Sale is now starting..");
            for (int i=1; i<=10; i++) {
                String custId = "C"+System.currentTimeMillis();
                str += "\n" + i + "\t" + custId;
                addUser(custId);

                Thread.sleep(100);
            }
            System.out.println(str);

        } catch (InterruptedException ex) {
            
        }

    }
}
