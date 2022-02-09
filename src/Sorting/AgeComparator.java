package Sorting;

import java.util.Comparator;

public class AgeComparator implements Comparator<Mahasiswa> {

	@Override
	public int compare(Mahasiswa o1, Mahasiswa o2) {
		// TODO Auto-generated method stub
		if(o1.getUmur() == o2.getUmur()) {
			return o1.getNama().compareTo(o2.getNama());
		}else if (o1.getUmur()< o2.getUmur()){
			return 1;
		}else {
			return -1;
		}
	}

}
