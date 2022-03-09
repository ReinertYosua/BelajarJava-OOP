package Abstract;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Database db = new Database(); //konkretx=>abstrac
		//System.out.println(db.getTypeDatabase());
		//MySQLDatabase mysql = new MySQLDatabase("Windows Server");
		
		Database mysql = new MySQLDatabase("Windows Server");
		Database sqlserver = new SQLServerDatabase("Linux Server");
		System.out.println(mysql.getNamaServer());
		System.out.println(mysql.getTypeDatabase());
		
		System.out.println(sqlserver.getNamaServer());
		System.out.println(sqlserver.getTypeDatabase());
		
	}

}
