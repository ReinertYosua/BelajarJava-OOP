package Synchronized2;

public class Book {
	static int tickets = 5;
	
	static synchronized void book(int request, String name) {
		if(tickets>=request) {
			System.out.println("User "+name+" request "+request+" ticket");
			tickets = tickets-request;
			System.out.println("Ticket left "+tickets);
		}else {
			System.out.println("Ticket not available");
		}
	}

}
