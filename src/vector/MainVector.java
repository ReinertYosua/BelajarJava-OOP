package vector;

import java.util.*;

public class MainVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Object> vc1 = new Vector<Object>();
		
		vc1.addElement("A");
		vc1.addElement("B");
		vc1.addElement("C");
		vc1.addElement(900);
		vc1.addElement(4.5);
		vc1.insertElementAt("Agus", 3);
		System.out.print("Total data Vector "+vc1.size());
		
		System.out.println("Tampil data using iterator:");
		Iterator<Object> it = vc1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		System.out.println("Tampil data using for each:");
		vc1.forEach((pa) -> System.out.print(pa+" "));
	}

}
