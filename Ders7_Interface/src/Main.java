import java.util.Iterator;

public class Main{
	
	public static void main(String[] args) {
		/*�nterfaceler ayn� iheritance gibi davran�yorlar fark� ise base Interface de olan b�t�n methodlar� kendi i�lerinde kendilerine g�er tan�mlamal�lar	 */
		IDatabase ogrenci = new ogrenciDatabase();
		ogrenci.log();
		
		ogretmenDatabase ogretmen = new ogretmenDatabase();
		ogretmen.log();
		
		
		
		
	}
}
