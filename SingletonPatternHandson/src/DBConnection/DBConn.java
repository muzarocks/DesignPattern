package DBConnection;

public class DBConn {

	
	private static DBConn instance;
	
	private DBConn(){
		
		//Connection to the required database is done;
		System.out.println("Datbase Connection is done");
	}
	
	public static DBConn getInstance()
	{
		if(instance==null)
		{
			instance=  new DBConn();
		}
		
		return instance;
	}
}
