
/*Overloading : Ayn� isimdeki 2 fonkisyonun paramete say�s�n� deyi�tirerek fonksiyonu overload yapmak*/
public class Overloading {

	public static int topla(int a, int b) {
		return (a + b);
	}

	public static int topla(int a, int b, int c) {
		return (a + b + c);
	}

	public static void main(String[] args) {
		//ayn� isimde �a��rd�m ama paramaetersi farkl� g�ndererek overloading yapm�� oldum.
		System.out.println(topla(2,3));
		System.out.println(topla(2,3,4));
		
		
	}

}
/*

	public static void main(String[] args) {
		
		
		
		
	}

*/