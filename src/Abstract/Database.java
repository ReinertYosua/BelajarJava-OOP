package Abstract;

public abstract class Database {
	
	String NamaServer;
	
	
	public Database(String namaServer) {
		super();
		NamaServer = namaServer;
	}
	
	public String getNamaServer() {
		return NamaServer;
	}

	abstract String getTypeDatabase();
	abstract Integer getJumlahTable();

}
