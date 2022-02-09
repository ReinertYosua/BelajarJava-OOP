package Sorting;

import java.util.Comparator;

public class NimComparator implements Comparator<Mahasiswa> {

	@Override
	public int compare(Mahasiswa o1, Mahasiswa o2) {
		// TODO Auto-generated method stub
		return o1.getNim().compareTo(o2.getNim());
	}

}
