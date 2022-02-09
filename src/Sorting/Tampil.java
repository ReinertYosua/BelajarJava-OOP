package Sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Tampil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nim = new ArrayList<Integer>();
		nim.add(234);
		nim.add(873);
		nim.add(152);
		
		
		System.out.println("Before Sorting");
		for (int i = 0; i < nim.size(); i++) {
			System.out.println(nim.get(i));
		}
		Collections.sort(nim, Collections.reverseOrder());
		System.out.println("After Sorting ASC");
		for (int j = 0; j < nim.size(); j++) {
			System.out.println(nim.get(j));
		}
		
		ArrayList<Mahasiswa> datamhs = new ArrayList<Mahasiswa>();
		datamhs.add(new Mahasiswa("M002", "Jaki", 20));
		datamhs.add(new Mahasiswa("M003", "Andi", 25));
		datamhs.add(new Mahasiswa("M001", "Sentosa", 19));
		datamhs.add(new Mahasiswa("M005", "Erliana", 19));
		datamhs.add(new Mahasiswa("M004", "Kinta", 21));
		
		
		System.out.println("Before Sorting");
		for(Mahasiswa dta :  datamhs) {
			System.out.println(dta.getNim()+" - "+dta.getNama()+" - "+dta.getUmur());
		}
		Collections.sort(datamhs, new AgeComparator());
		System.out.println("After Sorting ASC");
		for(Mahasiswa dtb :  datamhs) {
			System.out.println(dtb.getNim()+" - "+dtb.getNama()+" - "+dtb.getUmur());
		}
		
		//sorting arraylist object ada 2 cara :
		//-Comparable -> hanya bisa sorting/membanding 1 properties
		//-Comparator -> bisa membanding kan lebih dari 1 properties

	}

}
