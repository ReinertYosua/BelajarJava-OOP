package Abstract;

public class MySQLDatabase extends Database {

	
	
	public MySQLDatabase(String namaServer) {
		super(namaServer);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getTypeDatabase() {
		// TODO Auto-generated method stub
		return "MySQL";
	}

	@Override
	Integer getJumlahTable() {
		// TODO Auto-generated method stub
		return 3;
	}
	
	

}
