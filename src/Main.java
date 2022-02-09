import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1+2);
			throw new Exception("Disini ada kesalahan");
		} catch (Exception e) {
			System.out.println("Get Message "+ e.getMessage());
			System.out.println("To String "+ e.toString());
			System.out.println("Print stack ");
			e.printStackTrace();
		}
	}

}
