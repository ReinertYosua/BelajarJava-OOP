package Synchronized2;

public class MyThreadBook extends Thread {
	Book objBook;
	int tik;
	String name;
	
	public MyThreadBook(Book objBook, int tik, String name) {
		super();
		this.objBook = objBook;
		this.tik = tik;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Book.book(tik, name);
	}
	
	
	
	
	
	
}
