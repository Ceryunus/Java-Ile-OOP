
public class Main {
	public static void main(String[] args) {
		Product urun1 = new Product("Laptop", 10);
		Product urun2 = new Product("Mouse", 25);
		// Burada Product classýndan bir dizi oluþturarak,
		// farklý elemanlarýn referanslarýný tutabiliyorum

		Product[] MyProductList = new Product[] { urun1, urun2 };

		for (int i = 0; i < MyProductList.length; i++) {
			System.out.println(MyProductList[i].getName() + " " + MyProductList[i].getStock());
		}

	}

}
