
public class Main {

	public static void main(String[] args) {
	AbstractDatabase database = new SqlDatabase();
	database.add();
	database.delete();
	database.get();
	database.insert();
	
	System.out.println("\n");
	AbstractDatabase database2 = new OracleDatabase();
	database2.add();
	database2.delete();
	database2.get();
	database2.insert();
	 

 
	}
	
}
