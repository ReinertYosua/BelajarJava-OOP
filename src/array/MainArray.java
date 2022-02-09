package array;

class Hitung{
	
	public int carahitung() {
		int a = 5;
		int b = 6;
		int c = 0;
		c  = a+b;
		
		return c;
	}
}

public class MainArray {
	
	private static final boolean String = false;

	public char[] createArray() {
		char[]s = new char[26];
		for(int i=0; i<26; i++) {
			s[i] = (char)('A'+i);
		}
		return s; //return array
	}

	public static void main(String[] args) {
		
		Mahasiswa mhs = new Mahasiswa();
		System.out.println(mhs.setNama());
		
		Hitung ht = new Hitung();
		System.out.println(ht.carahitung());
		
		char[] hasil = new char[26]; //penampung
		MainArray ar = new MainArray(); //cara membuat objek
		hasil = ar.createArray(); //isi function createArray() dipindahkan ke var hasil
		
		
		for(int i = 0; i< hasil.length; i++) {
			System.out.print(hasil[i]+", ");
		}
			
		
		
		// TODO Auto-generated method stub
		//declaration array 
		//tipedata [] namaVarArray = new classtipedata[10];
		double[] ipk = new double[5];
		//manual initialization
		ipk[0] = 7.8;
		ipk[1] = 8.8;
		ipk[2] = 9.8;
		ipk[3] = 10.8;
		ipk[4] = 11.8;
		
		for(double ip :ipk) { //-> foreach
			System.out.println(ip);
		}
			
		//automatic initialization
		double[] ipk2 = {2.3, 3.4, 4.5, 5.6, 6.7};
		
		for(int i=0; i<5; i++) {
			System.out.print(ipk[i]+ ", ");
		}
		
		char[]nama = {'r','e','i','n','e','r','t'};
		System.out.println(nama);
		
		
		
		String [] mahasiswa = {"andi","budi","bejo"};
		String [] targetmhs = (String[]) mahasiswa.clone();
		
		for(String nm : mahasiswa) {
			System.out.println(nm);
		}
		
		
		for(int k=0; k<mahasiswa.length; k++) {
			System.out.println(targetmhs[k]+" "+mahasiswa[k]);
		}
		
		int[] nilai = {5,3,1,4,1,4};
		for(int a:nilai){
			System.out.println(a);
		}
		
		
		
	}
	
}
