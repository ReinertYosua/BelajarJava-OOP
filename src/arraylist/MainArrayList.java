package arraylist;

import java.util.*;
//import java.util.Scanner;

public class MainArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		ArrayList<Object> obj1 = new  ArrayList<Object>();
		String nama = inp.next();
		int angka = 5000;
		obj1.add("Agus");
		obj1.add("Budi");
		obj1.add("Ani");
		obj1.add(111);
		obj1.add(3.4);
		obj1.add(' ');
		obj1.add(true);
		obj1.add(2, 900);
		obj1.add(angka);
		obj1.add(nama);
		System.out.println("Size of obj1:" +obj1.size());
		obj1.add(4, "Tono");
		obj1.add(6, 'A');
		System.out.println("Size of obj1:" +obj1.size());
		System.out.println(obj1);
		
		obj1.remove(Double.valueOf(3.4));
		System.out.println("Size of obj1 after delete :" +obj1.size());
		System.out.println(obj1);
		
		obj1.forEach((pa) -> System.out.println(pa));
		
		Collection<Object> obj2 = new ArrayList<Object>();
		obj2.add("Jakarta");
		obj2.add("Bandung");
		obj2.add("Cirebon");
		obj2.add("Agus");
		
		ArrayList<Object> c1 = (ArrayList<Object>)(obj1.clone());
		//System.out.println(c1);
		c1.addAll(obj2);
		System.out.println(c1);
		
		c1 = (ArrayList<Object>)(obj1.clone());
		c1.retainAll(obj2);
		System.out.println("Data yg ada di obj1 dan obj2"+ c1);
		
		Iterator<Object> it = obj1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
	}

}
