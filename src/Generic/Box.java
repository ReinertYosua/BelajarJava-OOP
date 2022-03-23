package Generic;

public class Box<T, R> {//T stands for Type
	private T namaBox;
	R tipeBox;

	@SuppressWarnings("unchecked")
	public <P> void addBox(P nama, P tipe) {
		this.namaBox = (T)nama;
		this.tipeBox = (R)tipe;
	}
	
	public T getNamaBox() {
		return namaBox;
	}
	
	public R getTipeBox() {
		System.out.println(tipeBox.getClass().getName()); 
		return tipeBox;
	}
	
	public<k> void printArray(k[] listData) {
		for (int i = 0; i < listData.length; i++) {
			System.out.println("Data Array: "+listData[i]);
		}
	}
}

//aturan penamaan type parameter
/*
 *<E> -> Element, biasanya digunakan untuk collection(List, Arraylist)
 *<K> -> Key
 *<N> -> Number
 *<T> -> Type
 *<V> -> Value
*/