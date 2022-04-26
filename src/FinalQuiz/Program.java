package FinalQuiz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderList orderList = new OrderList();
        CustomerCollection cc = new CustomerCollection();

        ProductStockList stock = new ProductStockList();

        int menu = 0;
        while (menu != 2) {
            System.out.print("Online shop management:\n1. Add product\n2. Start SALE\nChoose: ");
            
            Scanner sc = new Scanner(System.in);
            menu = sc.nextInt();
            switch(menu) {
                case 1:
                    System.out.print("Input product ID: ");
                    String productId = sc.next();
                    System.out.print("Input product name: ");
                    String productName = sc.next();
                    System.out.print("Input product price: ");
                    double productPrice = sc.nextDouble();

                    System.out.print("Input product Stock: ");
                    int qty = sc.nextInt();

                    stock.addStock(new Product(productId, productName, productPrice), qty);
                break;
            }
        }

        
        if (!stock.isEmpty()) {
            System.out.println(stock);
            System.out.println();

            cc.start();
        
            try {
                Thread.sleep(3000);
                System.out.println("\nSALE ENDS.\n");
                System.out.println(stock);
                System.out.println();

                System.out.println(orderList.getSuccessOrder());
                System.out.println();

                System.out.println(orderList.getFailedOrder());
                System.out.println();
            } catch (InterruptedException ex) {

            }
        } else {
            System.out.println("SALE cannot start because there is no product to sale.");
        }
	}

}
