package Abstract;

public class SQLServerDatabase extends Database {

	
	
	public SQLServerDatabase(String namaServer) {
		super(namaServer);
		// TODO Auto-generated constructor stub
	}

	@Override
	String getTypeDatabase() {
		// TODO Auto-generated method stub
		return "SQL Server";
	}

	@Override
	Integer getJumlahTable() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	

	
}
