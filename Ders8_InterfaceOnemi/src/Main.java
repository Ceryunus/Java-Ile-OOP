
public class Main {
	public static void main(String[] args) {
	DatabaseManager databaseManager=new DatabaseManager();
	databaseManager.add(new Oracle());
	databaseManager.delete(new MSSql());
	databaseManager.update(new MySql());
		
		
		

	
	
	}
}
