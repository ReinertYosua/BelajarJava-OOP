package Multithreading;

public class ThreadHelloImplementsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			ThreadHelloImplements im = new ThreadHelloImplements(String.valueOf(i));
			Thread t1 = new Thread(im);
			t1.start();

		}
	}

}
