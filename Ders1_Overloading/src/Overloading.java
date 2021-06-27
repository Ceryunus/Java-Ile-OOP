
/*Overloading : Ayný isimdeki 2 fonkisyonun paramete sayýsýný deyiþtirerek fonksiyonu overload yapmak*/
public class Overloading {

	public static int topla(int a, int b) {
		return (a + b);
	}

	public static int topla(int a, int b, int c) {
		return (a + b + c);
	}

	public static void main(String[] args) {
		//ayný isimde çaðýrdým ama paramaetersi farklý göndererek overloading yapmýþ oldum.
		System.out.println(topla(2,3));
		System.out.println(topla(2,3,4));
		
		
	}

}
/*

	public static void main(String[] args) {
		
		
		
		
	}

*/