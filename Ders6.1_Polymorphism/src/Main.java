import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		
		BaseDatabase[] MyDatabases=new BaseDatabase[2];
		MyDatabases[0]=new MySql();
		MyDatabases[1]=new Oracle();
		for (int i = 0; i < MyDatabases.length; i++) {
			MyDatabases[i].add();
		}
		

		
		
		
		
		
		
		
	}
	

	
	
	
	
	
}
