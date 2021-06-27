import java.util.Iterator;

public class Main{
	
	public static void main(String[] args) {
		/*Ýnterfaceler ayný iheritance gibi davranýyorlar farký ise base Interface de olan bütün methodlarý kendi içlerinde kendilerine göer tanýmlamalýlar	 */
		IDatabase ogrenci = new ogrenciDatabase();
		ogrenci.log();
		
		ogretmenDatabase ogretmen = new ogretmenDatabase();
		ogretmen.log();
		
		
		
		
	}
}
