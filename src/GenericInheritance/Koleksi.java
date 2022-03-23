package GenericInheritance;

public class Koleksi <T extends Musisi>{
	private T data;
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void nyanyiBersama() {
		if(this.data != null) {
			this.data.nyanyi();
			System.out.println(this.data.nama);
		}
	}
	
}
