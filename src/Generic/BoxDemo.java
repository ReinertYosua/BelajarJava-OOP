package Generic;

import java.util.ArrayList;

public class BoxDemo {
/*
 * 1. object
 * 2. generic
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String, Integer> stringBox = new Box<String, Integer>();
		stringBox.addBox("Nama", 123);//integer angka
		System.out.println(stringBox.getNamaBox());
		System.out.println(stringBox.getTipeBox());
		
		Box<Integer, Double> integerBox = new Box<Integer, Double>();
		integerBox.addBox(123456, 345.323);
		System.out.println(integerBox.getNamaBox());
		System.out.println(integerBox.getTipeBox());
		
		String [] data1 = {"A","B","C","D","E"};
		stringBox.printArray(data1);
		
		Integer[] data2 = {123,234,345,567,789};
		stringBox.printArray(data2);
		
		
		
		//Nested Generic -> arraylist
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Andi");
		ar1.add("Budi");
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Agung");
		ArrayList<ArrayList<String>> arU = new ArrayList<ArrayList<String>>();
		arU.add(ar1);
		arU.add(ar2);
		
		System.out.println(arU.get(1).get(0));
		
	}

}
