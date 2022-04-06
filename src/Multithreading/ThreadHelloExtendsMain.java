package Multithreading;

public class ThreadHelloExtendsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			ThreadHelloExtends t1 =  new ThreadHelloExtends();
			t1.setName("" +i);
			t1.start();
			
		}
	}

}
