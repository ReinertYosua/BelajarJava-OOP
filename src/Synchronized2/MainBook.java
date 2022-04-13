package Synchronized2;

public class MainBook {
//data racing synchronized
	//book tikect
	//book tiket bus
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book obj1 = new Book();//app
		Book obj2 = new Book();//datang langsung
		MyThreadBook t1 = new MyThreadBook(obj1, 1, "A1");
		MyThreadBook t2 = new MyThreadBook(obj1, 1, "A2");
		MyThreadBook t3 = new MyThreadBook(obj1, 1, "A3");
		MyThreadBook t4 = new MyThreadBook(obj2, 1, "B1");
		MyThreadBook t5 = new MyThreadBook(obj2, 1, "B2");
		MyThreadBook t6 = new MyThreadBook(obj2, 1, "B3");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		//synchro
		//producer and consumer
	}

}
